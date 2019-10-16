# maxwell源码修改

## 1.背景介绍
>基于mysql binlog实现的采集实时数据的中间件maxwell，进行了源码修改。 实现了自定义返回数据格式和程序默认将mysql转为utf8的乱码问题。
>
> 对1.17.1的版本进行的修改，下方为原始文件下载地址

&rarr; Download:
[https://github.com/zendesk/maxwell/releases/download/v1.17.1/maxwell-1.17.1.tar.gz](https://github.com/zendesk/maxwell/releases/download/v1.17.1/maxwell-1.17.1.tar.gz)
<br/>
&rarr; Source:
[https://github.com/zendesk/maxwell](https://github.com/zendesk/maxwell)

## 2.修改地方

com.zendesk.maxwell.MaxwellConfig
```
1.MaxwellConfig 自定义了接受参数  distid

public static String distid = "";

2.MaxwellConfig.buildOptionParser() 将自定义参数distid加入解析参数OptionParser

protected OptionParser buildOptionParser() {
		final OptionParser parser = new OptionParser();

		parser.accepts("distid").withOptionalArg();
		...
        ...
}

3.根据传入参数设置 MaxwellConfig.distid的值

private void setup(OptionSet options, Properties properties) {
		// 设置distid — ，2019年10月16日 15:19:55
		MaxwellConfig.distid = fetchOption("distid", options, properties, "");
        ...
        ...
}

```

com.zendesk.maxwell.row.RowMap
```
1. binlog 日志数据写入rowmap 进行转码

public void putData(String key, Object value) {
		if (!"".equals(MaxwellConfig.distid)&&value!=null&&value instanceof String){
			if(!this.data.containsKey("distid")){
				this.data.put("distid",MaxwellConfig.distid);
			}
			try {
				// convert to gbk
				String dt = new String(((String)value).getBytes("iso-8859-1"),"GBK");
				this.data.put(key, dt);
			} catch (UnsupportedEncodingException e) {
				this.data.put(key, value);
			}
		}else {
			this.data.put(key, value);
		}
		this.approximateSize += approximateKVSize(key, value);
}

2. 修改输出数据

private String pkToJsonHash() throws IOException {
		JsonGenerator g = resetJsonGenerator();

		g.writeStartObject(); // start of row {

		g.writeStringField(FieldNames.DATABASE, database);
		g.writeStringField(FieldNames.TABLE, table);

		// 增加输出字段
		if(!"".equals(MaxwellConfig.distid)){
			g.writeStringField("distid", MaxwellConfig.distid);
		}
		...
        ...
	}

	private String pkToJsonArray() throws IOException {
		JsonGenerator g = resetJsonGenerator();

		g.writeStartArray();
		g.writeString(database);
		g.writeString(table);

		// 增加输出字段
		if(!"".equals(MaxwellConfig.distid)){
			g.writeString( MaxwellConfig.distid);
		}
		...
        ...
	}

public String toJSON(MaxwellOutputConfig outputConfig) throws Exception {
		JsonGenerator g = resetJsonGenerator();

		g.writeStartObject(); // start of row {

		g.writeStringField(FieldNames.DATABASE, database);
		g.writeStringField(FieldNames.TABLE, this.table);

		// 增加输出字段
		if(!"".equals(MaxwellConfig.distid)){
			g.writeStringField("distid", MaxwellConfig.distid);
		}
        ...
        ...
}
```


