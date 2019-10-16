// Generated from com\zendesk\maxwell\schema\ddl\mysql.g4 by ANTLR 4.5
package com.zendesk.maxwell.schema.ddl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mysqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ACTION=9, 
		ADD=10, AFTER=11, ALGORITHM=12, ALTER=13, ALWAYS=14, ANALYZE=15, AS=16, 
		ASC=17, ASCII=18, AUTO_INCREMENT=19, AVG_ROW_LENGTH=20, BEGIN=21, BIGINT=22, 
		BINARY=23, BIT=24, BLOB=25, BOOL=26, BOOLEAN=27, BTREE=28, BY=29, BYTE=30, 
		CASCADE=31, CHANGE=32, CHAR=33, CHARACTER=34, CHARSET=35, CHECK=36, CHECKSUM=37, 
		COALESCE=38, COLLATE=39, COLUMN=40, COLUMNS=41, COLUMN_FORMAT=42, COMMENT=43, 
		COMPACT=44, COMPRESSED=45, CONNECTION=46, CONSTRAINT=47, CONVERT=48, COPY=49, 
		CREATE=50, CURRENT_TIMESTAMP=51, CURRENT_USER=52, DATA=53, DATABASE=54, 
		DATE=55, DATETIME=56, DECIMAL=57, DEFAULT=58, DEFINER=59, DELAY_KEY_WRITE=60, 
		DELETE=61, DESC=62, DIRECTORY=63, DISABLE=64, DISCARD=65, DISK=66, DOUBLE=67, 
		DROP=68, DYNAMIC=69, ENABLE=70, ENGINE=71, ENUM=72, EXCHANGE=73, EXCLUSIVE=74, 
		EXISTS=75, FALSE=76, FIRST=77, FIXED=78, FLOAT=79, FLOAT4=80, FLOAT8=81, 
		FORCE=82, FOREIGN=83, FULL=84, FULLTEXT=85, GENERATED=86, GEOMETRY=87, 
		GEOMETRYCOLLECTION=88, HASH=89, IF=90, IGNORE=91, IMPORT=92, INDEX=93, 
		INPLACE=94, INSERT_METHOD=95, INT=96, INT1=97, INT2=98, INT3=99, INT4=100, 
		INT8=101, INTEGER=102, INTO=103, INVOKER=104, JSON=105, KEY=106, KEYS=107, 
		KEY_BLOCK_SIZE=108, LAST=109, LIKE=110, LINEAR=111, LINESTRING=112, LIST=113, 
		LOCALTIME=114, LOCALTIMESTAMP=115, LOCK=116, LONG=117, LONGBLOB=118, LONGTEXT=119, 
		MATCH=120, MAX_ROWS=121, MEDIUMBLOB=122, MEDIUMINT=123, MEDIUMTEXT=124, 
		MEMORY=125, MERGE=126, MIDDLEINT=127, MIN_ROWS=128, MODIFY=129, MULTILINESTRING=130, 
		MULTIPOINT=131, MULTIPOLYGON=132, NAME=133, NATIONAL=134, NCHAR=135, NO=136, 
		NONE=137, NOT=138, NOW=139, NULL=140, NUMERIC=141, NVARCHAR=142, OFFLINE=143, 
		ON=144, ONLINE=145, OPTIMIZE=146, OR=147, ORDER=148, PACK_KEYS=149, PARSER=150, 
		PARTIAL=151, PARTITION=152, PARTITIONING=153, PARTITIONS=154, PASSWORD=155, 
		POINT=156, POLYGON=157, PRECISION=158, PRIMARY=159, RANGE=160, REAL=161, 
		REBUILD=162, REDUNDANT=163, REFERENCES=164, REMOVE=165, RENAME=166, REORGANIZE=167, 
		REPAIR=168, REPLACE=169, RESTRICT=170, ROW_FORMAT=171, SCHEMA=172, SECURITY=173, 
		SERIAL=174, SET=175, SHARED=176, SIGNED=177, SIMPLE=178, SMALLINT=179, 
		SPATIAL=180, SQL=181, STATS_AUTO_RECALC=182, STATS_PERSISTENT=183, STATS_SAMPLE_PAGES=184, 
		STORAGE=185, STORED=186, SUBPARTITION=187, SUBPARTITIONS=188, TABLE=189, 
		TABLESPACE=190, TEMPORARY=191, TEMPTABLE=192, TEXT=193, TIME=194, TIMESTAMP=195, 
		TINYBLOB=196, TINYINT=197, TINYTEXT=198, TO=199, TRUE=200, TRUNCATE=201, 
		UNDEFINED=202, UNICODE=203, UNION=204, UNIQUE=205, UNSIGNED=206, UPDATE=207, 
		UPGRADE=208, USING=209, VALIDATION=210, VARBINARY=211, VARCHAR=212, VARYING=213, 
		VIEW=214, VIRTUAL=215, WITH=216, WITHOUT=217, YEAR=218, ZEROFILL=219, 
		SQL_UPGRADE_COMMENT=220, SQL_UPGRADE_ENDCOMMENT=221, MAXWELL_ELIDED_PARSE_ISSUE=222, 
		SQL_COMMENT=223, SQL_LINE_COMMENT=224, STRING_LITERAL=225, DBL_STRING_LITERAL=226, 
		INTEGER_LITERAL=227, IDENT=228, QUOTED_IDENT=229, UNUSED_TOKENS=230, WS=231;
	public static final int
		RULE_parse = 0, RULE_statement = 1, RULE_tokens_available_for_names = 2, 
		RULE_skip_parens = 3, RULE_db_name = 4, RULE_table_name = 5, RULE_user = 6, 
		RULE_user_token = 7, RULE_name = 8, RULE_id = 9, RULE_literal = 10, RULE_float_literal = 11, 
		RULE_integer_literal = 12, RULE_string_literal = 13, RULE_string = 14, 
		RULE_integer = 15, RULE_charset_name = 16, RULE_default_character_set = 17, 
		RULE_default_collation = 18, RULE_charset_token = 19, RULE_collation = 20, 
		RULE_if_not_exists = 21, RULE_alter_table = 22, RULE_alter_table_preamble = 23, 
		RULE_alter_flags = 24, RULE_alter_specifications = 25, RULE_alter_specification = 26, 
		RULE_add_column = 27, RULE_add_column_parens = 28, RULE_change_column = 29, 
		RULE_drop_column = 30, RULE_old_col_name = 31, RULE_modify_column = 32, 
		RULE_drop_key = 33, RULE_drop_primary_key = 34, RULE_alter_rename_table = 35, 
		RULE_convert_to_character_set = 36, RULE_alter_partition_specification = 37, 
		RULE_ignored_alter_specifications = 38, RULE_algorithm_type = 39, RULE_lock_type = 40, 
		RULE_partition_names = 41, RULE_alter_ordering = 42, RULE_alter_ordering_column = 43, 
		RULE_column_definition = 44, RULE_col_position = 45, RULE_data_type = 46, 
		RULE_generic_type = 47, RULE_signed_type = 48, RULE_string_type = 49, 
		RULE_long_flag = 50, RULE_enumerated_type = 51, RULE_column_options = 52, 
		RULE_primary_key = 53, RULE_enumerated_values = 54, RULE_enum_value = 55, 
		RULE_charset_def = 56, RULE_character_set = 57, RULE_nullability = 58, 
		RULE_default_value = 59, RULE_length = 60, RULE_int_flags = 61, RULE_decimal_length = 62, 
		RULE_now_function = 63, RULE_current_timestamp_length = 64, RULE_localtime_function = 65, 
		RULE_partition_by = 66, RULE_partition_by_what = 67, RULE_subpartition_by = 68, 
		RULE_partition_count = 69, RULE_partition_definitions = 70, RULE_skip_parens_inside_partition_definitions = 71, 
		RULE_alter_database = 72, RULE_alter_database_definition = 73, RULE_create_database = 74, 
		RULE_create_table = 75, RULE_create_table_preamble = 76, RULE_create_specifications = 77, 
		RULE_create_specification = 78, RULE_create_like_tbl = 79, RULE_table_creation_option = 80, 
		RULE_creation_engine = 81, RULE_creation_auto_increment = 82, RULE_creation_avg_row_length = 83, 
		RULE_creation_character_set = 84, RULE_creation_checksum = 85, RULE_creation_collation = 86, 
		RULE_creation_comment = 87, RULE_creation_connection = 88, RULE_creation_data_directory = 89, 
		RULE_creation_delay_key_write = 90, RULE_creation_index_directory = 91, 
		RULE_creation_insert_method = 92, RULE_creation_key_block_size = 93, RULE_creation_max_rows = 94, 
		RULE_creation_min_rows = 95, RULE_creation_pack_keys = 96, RULE_creation_password = 97, 
		RULE_creation_row_format = 98, RULE_creation_stats_auto_recalc = 99, RULE_creation_stats_persistent = 100, 
		RULE_creation_stats_sample_pages = 101, RULE_creation_storage_option = 102, 
		RULE_creation_tablespace = 103, RULE_creation_union = 104, RULE_index_definition = 105, 
		RULE_index_type_1 = 106, RULE_index_type_pk = 107, RULE_index_type_3 = 108, 
		RULE_index_type_4 = 109, RULE_index_type_5 = 110, RULE_index_type_check = 111, 
		RULE_index_or_key = 112, RULE_index_constraint = 113, RULE_index_name = 114, 
		RULE_index_type = 115, RULE_index_options = 116, RULE_index_column_list = 117, 
		RULE_index_columns = 118, RULE_index_column = 119, RULE_index_column_partial_def = 120, 
		RULE_index_column_partial_length = 121, RULE_index_column_asc_or_desc = 122, 
		RULE_reference_definition = 123, RULE_reference_definition_match = 124, 
		RULE_reference_definition_on_delete = 125, RULE_reference_definition_on_update = 126, 
		RULE_reference_option = 127, RULE_drop_database = 128, RULE_drop_table = 129, 
		RULE_drop_table_options = 130, RULE_if_exists = 131, RULE_rename_table = 132, 
		RULE_rename_table_spec = 133, RULE_alter_view = 134, RULE_create_view = 135, 
		RULE_drop_view = 136, RULE_view_options = 137;
	public static final String[] ruleNames = {
		"parse", "statement", "tokens_available_for_names", "skip_parens", "db_name", 
		"table_name", "user", "user_token", "name", "id", "literal", "float_literal", 
		"integer_literal", "string_literal", "string", "integer", "charset_name", 
		"default_character_set", "default_collation", "charset_token", "collation", 
		"if_not_exists", "alter_table", "alter_table_preamble", "alter_flags", 
		"alter_specifications", "alter_specification", "add_column", "add_column_parens", 
		"change_column", "drop_column", "old_col_name", "modify_column", "drop_key", 
		"drop_primary_key", "alter_rename_table", "convert_to_character_set", 
		"alter_partition_specification", "ignored_alter_specifications", "algorithm_type", 
		"lock_type", "partition_names", "alter_ordering", "alter_ordering_column", 
		"column_definition", "col_position", "data_type", "generic_type", "signed_type", 
		"string_type", "long_flag", "enumerated_type", "column_options", "primary_key", 
		"enumerated_values", "enum_value", "charset_def", "character_set", "nullability", 
		"default_value", "length", "int_flags", "decimal_length", "now_function", 
		"current_timestamp_length", "localtime_function", "partition_by", "partition_by_what", 
		"subpartition_by", "partition_count", "partition_definitions", "skip_parens_inside_partition_definitions", 
		"alter_database", "alter_database_definition", "create_database", "create_table", 
		"create_table_preamble", "create_specifications", "create_specification", 
		"create_like_tbl", "table_creation_option", "creation_engine", "creation_auto_increment", 
		"creation_avg_row_length", "creation_character_set", "creation_checksum", 
		"creation_collation", "creation_comment", "creation_connection", "creation_data_directory", 
		"creation_delay_key_write", "creation_index_directory", "creation_insert_method", 
		"creation_key_block_size", "creation_max_rows", "creation_min_rows", "creation_pack_keys", 
		"creation_password", "creation_row_format", "creation_stats_auto_recalc", 
		"creation_stats_persistent", "creation_stats_sample_pages", "creation_storage_option", 
		"creation_tablespace", "creation_union", "index_definition", "index_type_1", 
		"index_type_pk", "index_type_3", "index_type_4", "index_type_5", "index_type_check", 
		"index_or_key", "index_constraint", "index_name", "index_type", "index_options", 
		"index_column_list", "index_columns", "index_column", "index_column_partial_def", 
		"index_column_partial_length", "index_column_asc_or_desc", "reference_definition", 
		"reference_definition_match", "reference_definition_on_delete", "reference_definition_on_update", 
		"reference_option", "drop_database", "drop_table", "drop_table_options", 
		"if_exists", "rename_table", "rename_table_spec", "alter_view", "create_view", 
		"drop_view", "view_options"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'.'", "'@'", "'+'", "'-'", "'='", "','", "')'", null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'*/'", "'/__MAXWELL__/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "ACTION", "ADD", 
		"AFTER", "ALGORITHM", "ALTER", "ALWAYS", "ANALYZE", "AS", "ASC", "ASCII", 
		"AUTO_INCREMENT", "AVG_ROW_LENGTH", "BEGIN", "BIGINT", "BINARY", "BIT", 
		"BLOB", "BOOL", "BOOLEAN", "BTREE", "BY", "BYTE", "CASCADE", "CHANGE", 
		"CHAR", "CHARACTER", "CHARSET", "CHECK", "CHECKSUM", "COALESCE", "COLLATE", 
		"COLUMN", "COLUMNS", "COLUMN_FORMAT", "COMMENT", "COMPACT", "COMPRESSED", 
		"CONNECTION", "CONSTRAINT", "CONVERT", "COPY", "CREATE", "CURRENT_TIMESTAMP", 
		"CURRENT_USER", "DATA", "DATABASE", "DATE", "DATETIME", "DECIMAL", "DEFAULT", 
		"DEFINER", "DELAY_KEY_WRITE", "DELETE", "DESC", "DIRECTORY", "DISABLE", 
		"DISCARD", "DISK", "DOUBLE", "DROP", "DYNAMIC", "ENABLE", "ENGINE", "ENUM", 
		"EXCHANGE", "EXCLUSIVE", "EXISTS", "FALSE", "FIRST", "FIXED", "FLOAT", 
		"FLOAT4", "FLOAT8", "FORCE", "FOREIGN", "FULL", "FULLTEXT", "GENERATED", 
		"GEOMETRY", "GEOMETRYCOLLECTION", "HASH", "IF", "IGNORE", "IMPORT", "INDEX", 
		"INPLACE", "INSERT_METHOD", "INT", "INT1", "INT2", "INT3", "INT4", "INT8", 
		"INTEGER", "INTO", "INVOKER", "JSON", "KEY", "KEYS", "KEY_BLOCK_SIZE", 
		"LAST", "LIKE", "LINEAR", "LINESTRING", "LIST", "LOCALTIME", "LOCALTIMESTAMP", 
		"LOCK", "LONG", "LONGBLOB", "LONGTEXT", "MATCH", "MAX_ROWS", "MEDIUMBLOB", 
		"MEDIUMINT", "MEDIUMTEXT", "MEMORY", "MERGE", "MIDDLEINT", "MIN_ROWS", 
		"MODIFY", "MULTILINESTRING", "MULTIPOINT", "MULTIPOLYGON", "NAME", "NATIONAL", 
		"NCHAR", "NO", "NONE", "NOT", "NOW", "NULL", "NUMERIC", "NVARCHAR", "OFFLINE", 
		"ON", "ONLINE", "OPTIMIZE", "OR", "ORDER", "PACK_KEYS", "PARSER", "PARTIAL", 
		"PARTITION", "PARTITIONING", "PARTITIONS", "PASSWORD", "POINT", "POLYGON", 
		"PRECISION", "PRIMARY", "RANGE", "REAL", "REBUILD", "REDUNDANT", "REFERENCES", 
		"REMOVE", "RENAME", "REORGANIZE", "REPAIR", "REPLACE", "RESTRICT", "ROW_FORMAT", 
		"SCHEMA", "SECURITY", "SERIAL", "SET", "SHARED", "SIGNED", "SIMPLE", "SMALLINT", 
		"SPATIAL", "SQL", "STATS_AUTO_RECALC", "STATS_PERSISTENT", "STATS_SAMPLE_PAGES", 
		"STORAGE", "STORED", "SUBPARTITION", "SUBPARTITIONS", "TABLE", "TABLESPACE", 
		"TEMPORARY", "TEMPTABLE", "TEXT", "TIME", "TIMESTAMP", "TINYBLOB", "TINYINT", 
		"TINYTEXT", "TO", "TRUE", "TRUNCATE", "UNDEFINED", "UNICODE", "UNION", 
		"UNIQUE", "UNSIGNED", "UPDATE", "UPGRADE", "USING", "VALIDATION", "VARBINARY", 
		"VARCHAR", "VARYING", "VIEW", "VIRTUAL", "WITH", "WITHOUT", "YEAR", "ZEROFILL", 
		"SQL_UPGRADE_COMMENT", "SQL_UPGRADE_ENDCOMMENT", "MAXWELL_ELIDED_PARSE_ISSUE", 
		"SQL_COMMENT", "SQL_LINE_COMMENT", "STRING_LITERAL", "DBL_STRING_LITERAL", 
		"INTEGER_LITERAL", "IDENT", "QUOTED_IDENT", "UNUSED_TOKENS", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "mysql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mysqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mysqlParser.EOF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if (((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (ALTER - 13)) | (1L << (BEGIN - 13)) | (1L << (CREATE - 13)) | (1L << (DROP - 13)))) != 0) || _la==RENAME) {
				{
				setState(276);
				statement();
				}
			}

			setState(279);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Alter_tableContext alter_table() {
			return getRuleContext(Alter_tableContext.class,0);
		}
		public Alter_viewContext alter_view() {
			return getRuleContext(Alter_viewContext.class,0);
		}
		public Alter_databaseContext alter_database() {
			return getRuleContext(Alter_databaseContext.class,0);
		}
		public Create_databaseContext create_database() {
			return getRuleContext(Create_databaseContext.class,0);
		}
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Create_viewContext create_view() {
			return getRuleContext(Create_viewContext.class,0);
		}
		public Drop_databaseContext drop_database() {
			return getRuleContext(Drop_databaseContext.class,0);
		}
		public Drop_tableContext drop_table() {
			return getRuleContext(Drop_tableContext.class,0);
		}
		public Drop_viewContext drop_view() {
			return getRuleContext(Drop_viewContext.class,0);
		}
		public Rename_tableContext rename_table() {
			return getRuleContext(Rename_tableContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(mysqlParser.BEGIN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				alter_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				alter_view();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				alter_database();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				create_database();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				create_table();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				create_view();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(287);
				drop_database();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(288);
				drop_table();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(289);
				drop_view();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(290);
				rename_table();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(291);
				match(BEGIN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tokens_available_for_namesContext extends ParserRuleContext {
		public TerminalNode ACTION() { return getToken(mysqlParser.ACTION, 0); }
		public TerminalNode AFTER() { return getToken(mysqlParser.AFTER, 0); }
		public TerminalNode ALGORITHM() { return getToken(mysqlParser.ALGORITHM, 0); }
		public TerminalNode ALWAYS() { return getToken(mysqlParser.ALWAYS, 0); }
		public TerminalNode ASCII() { return getToken(mysqlParser.ASCII, 0); }
		public TerminalNode AUTO_INCREMENT() { return getToken(mysqlParser.AUTO_INCREMENT, 0); }
		public TerminalNode AVG_ROW_LENGTH() { return getToken(mysqlParser.AVG_ROW_LENGTH, 0); }
		public TerminalNode BEGIN() { return getToken(mysqlParser.BEGIN, 0); }
		public TerminalNode BIT() { return getToken(mysqlParser.BIT, 0); }
		public TerminalNode BOOL() { return getToken(mysqlParser.BOOL, 0); }
		public TerminalNode BOOLEAN() { return getToken(mysqlParser.BOOLEAN, 0); }
		public TerminalNode BTREE() { return getToken(mysqlParser.BTREE, 0); }
		public TerminalNode BYTE() { return getToken(mysqlParser.BYTE, 0); }
		public TerminalNode CHARSET() { return getToken(mysqlParser.CHARSET, 0); }
		public TerminalNode CHECKSUM() { return getToken(mysqlParser.CHECKSUM, 0); }
		public TerminalNode COALESCE() { return getToken(mysqlParser.COALESCE, 0); }
		public TerminalNode COLUMNS() { return getToken(mysqlParser.COLUMNS, 0); }
		public TerminalNode COLUMN_FORMAT() { return getToken(mysqlParser.COLUMN_FORMAT, 0); }
		public TerminalNode COMMENT() { return getToken(mysqlParser.COMMENT, 0); }
		public TerminalNode COMPACT() { return getToken(mysqlParser.COMPACT, 0); }
		public TerminalNode COMPRESSED() { return getToken(mysqlParser.COMPRESSED, 0); }
		public TerminalNode CONNECTION() { return getToken(mysqlParser.CONNECTION, 0); }
		public TerminalNode COPY() { return getToken(mysqlParser.COPY, 0); }
		public TerminalNode DATA() { return getToken(mysqlParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(mysqlParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(mysqlParser.DATETIME, 0); }
		public TerminalNode DEFINER() { return getToken(mysqlParser.DEFINER, 0); }
		public TerminalNode DELAY_KEY_WRITE() { return getToken(mysqlParser.DELAY_KEY_WRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(mysqlParser.DIRECTORY, 0); }
		public TerminalNode DISABLE() { return getToken(mysqlParser.DISABLE, 0); }
		public TerminalNode DISCARD() { return getToken(mysqlParser.DISCARD, 0); }
		public TerminalNode DISK() { return getToken(mysqlParser.DISK, 0); }
		public TerminalNode DYNAMIC() { return getToken(mysqlParser.DYNAMIC, 0); }
		public TerminalNode ENABLE() { return getToken(mysqlParser.ENABLE, 0); }
		public TerminalNode ENGINE() { return getToken(mysqlParser.ENGINE, 0); }
		public TerminalNode ENUM() { return getToken(mysqlParser.ENUM, 0); }
		public TerminalNode EXCHANGE() { return getToken(mysqlParser.EXCHANGE, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(mysqlParser.EXCLUSIVE, 0); }
		public TerminalNode FIRST() { return getToken(mysqlParser.FIRST, 0); }
		public TerminalNode FIXED() { return getToken(mysqlParser.FIXED, 0); }
		public TerminalNode FULL() { return getToken(mysqlParser.FULL, 0); }
		public TerminalNode GEOMETRY() { return getToken(mysqlParser.GEOMETRY, 0); }
		public TerminalNode GEOMETRYCOLLECTION() { return getToken(mysqlParser.GEOMETRYCOLLECTION, 0); }
		public TerminalNode HASH() { return getToken(mysqlParser.HASH, 0); }
		public TerminalNode IMPORT() { return getToken(mysqlParser.IMPORT, 0); }
		public TerminalNode INPLACE() { return getToken(mysqlParser.INPLACE, 0); }
		public TerminalNode INSERT_METHOD() { return getToken(mysqlParser.INSERT_METHOD, 0); }
		public TerminalNode INVOKER() { return getToken(mysqlParser.INVOKER, 0); }
		public TerminalNode JSON() { return getToken(mysqlParser.JSON, 0); }
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(mysqlParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode LAST() { return getToken(mysqlParser.LAST, 0); }
		public TerminalNode LINESTRING() { return getToken(mysqlParser.LINESTRING, 0); }
		public TerminalNode LIST() { return getToken(mysqlParser.LIST, 0); }
		public TerminalNode MAX_ROWS() { return getToken(mysqlParser.MAX_ROWS, 0); }
		public TerminalNode MEMORY() { return getToken(mysqlParser.MEMORY, 0); }
		public TerminalNode MERGE() { return getToken(mysqlParser.MERGE, 0); }
		public TerminalNode MIN_ROWS() { return getToken(mysqlParser.MIN_ROWS, 0); }
		public TerminalNode MODIFY() { return getToken(mysqlParser.MODIFY, 0); }
		public TerminalNode MULTILINESTRING() { return getToken(mysqlParser.MULTILINESTRING, 0); }
		public TerminalNode MULTIPOINT() { return getToken(mysqlParser.MULTIPOINT, 0); }
		public TerminalNode MULTIPOLYGON() { return getToken(mysqlParser.MULTIPOLYGON, 0); }
		public TerminalNode NAME() { return getToken(mysqlParser.NAME, 0); }
		public TerminalNode NATIONAL() { return getToken(mysqlParser.NATIONAL, 0); }
		public TerminalNode NCHAR() { return getToken(mysqlParser.NCHAR, 0); }
		public TerminalNode NO() { return getToken(mysqlParser.NO, 0); }
		public TerminalNode NONE() { return getToken(mysqlParser.NONE, 0); }
		public TerminalNode NOW() { return getToken(mysqlParser.NOW, 0); }
		public TerminalNode NVARCHAR() { return getToken(mysqlParser.NVARCHAR, 0); }
		public TerminalNode OFFLINE() { return getToken(mysqlParser.OFFLINE, 0); }
		public TerminalNode ONLINE() { return getToken(mysqlParser.ONLINE, 0); }
		public TerminalNode PACK_KEYS() { return getToken(mysqlParser.PACK_KEYS, 0); }
		public TerminalNode PARSER() { return getToken(mysqlParser.PARSER, 0); }
		public TerminalNode PARTIAL() { return getToken(mysqlParser.PARTIAL, 0); }
		public TerminalNode PARTITIONING() { return getToken(mysqlParser.PARTITIONING, 0); }
		public TerminalNode PARTITIONS() { return getToken(mysqlParser.PARTITIONS, 0); }
		public TerminalNode PASSWORD() { return getToken(mysqlParser.PASSWORD, 0); }
		public TerminalNode POINT() { return getToken(mysqlParser.POINT, 0); }
		public TerminalNode POLYGON() { return getToken(mysqlParser.POLYGON, 0); }
		public TerminalNode REBUILD() { return getToken(mysqlParser.REBUILD, 0); }
		public TerminalNode REDUNDANT() { return getToken(mysqlParser.REDUNDANT, 0); }
		public TerminalNode REMOVE() { return getToken(mysqlParser.REMOVE, 0); }
		public TerminalNode REORGANIZE() { return getToken(mysqlParser.REORGANIZE, 0); }
		public TerminalNode REPAIR() { return getToken(mysqlParser.REPAIR, 0); }
		public TerminalNode ROW_FORMAT() { return getToken(mysqlParser.ROW_FORMAT, 0); }
		public TerminalNode SECURITY() { return getToken(mysqlParser.SECURITY, 0); }
		public TerminalNode SERIAL() { return getToken(mysqlParser.SERIAL, 0); }
		public TerminalNode SHARED() { return getToken(mysqlParser.SHARED, 0); }
		public TerminalNode SIGNED() { return getToken(mysqlParser.SIGNED, 0); }
		public TerminalNode SIMPLE() { return getToken(mysqlParser.SIMPLE, 0); }
		public TerminalNode STATS_AUTO_RECALC() { return getToken(mysqlParser.STATS_AUTO_RECALC, 0); }
		public TerminalNode STATS_PERSISTENT() { return getToken(mysqlParser.STATS_PERSISTENT, 0); }
		public TerminalNode STATS_SAMPLE_PAGES() { return getToken(mysqlParser.STATS_SAMPLE_PAGES, 0); }
		public TerminalNode STORAGE() { return getToken(mysqlParser.STORAGE, 0); }
		public TerminalNode SUBPARTITION() { return getToken(mysqlParser.SUBPARTITION, 0); }
		public TerminalNode SUBPARTITIONS() { return getToken(mysqlParser.SUBPARTITIONS, 0); }
		public TerminalNode TABLESPACE() { return getToken(mysqlParser.TABLESPACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(mysqlParser.TEMPORARY, 0); }
		public TerminalNode TEMPTABLE() { return getToken(mysqlParser.TEMPTABLE, 0); }
		public TerminalNode TEXT() { return getToken(mysqlParser.TEXT, 0); }
		public TerminalNode TIME() { return getToken(mysqlParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(mysqlParser.TIMESTAMP, 0); }
		public TerminalNode TRUNCATE() { return getToken(mysqlParser.TRUNCATE, 0); }
		public TerminalNode UNDEFINED() { return getToken(mysqlParser.UNDEFINED, 0); }
		public TerminalNode UNICODE() { return getToken(mysqlParser.UNICODE, 0); }
		public TerminalNode UPGRADE() { return getToken(mysqlParser.UPGRADE, 0); }
		public TerminalNode VALIDATION() { return getToken(mysqlParser.VALIDATION, 0); }
		public TerminalNode VIEW() { return getToken(mysqlParser.VIEW, 0); }
		public TerminalNode WITHOUT() { return getToken(mysqlParser.WITHOUT, 0); }
		public TerminalNode YEAR() { return getToken(mysqlParser.YEAR, 0); }
		public Tokens_available_for_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokens_available_for_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterTokens_available_for_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitTokens_available_for_names(this);
		}
	}

	public final Tokens_available_for_namesContext tokens_available_for_names() throws RecognitionException {
		Tokens_available_for_namesContext _localctx = new Tokens_available_for_namesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tokens_available_for_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << AFTER) | (1L << ALGORITHM) | (1L << ALWAYS) | (1L << ASCII) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << BEGIN) | (1L << BIT) | (1L << BOOL) | (1L << BOOLEAN) | (1L << BTREE) | (1L << BYTE) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLUMNS) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << COMPACT) | (1L << COMPRESSED) | (1L << CONNECTION) | (1L << COPY) | (1L << DATA) | (1L << DATE) | (1L << DATETIME) | (1L << DEFINER) | (1L << DELAY_KEY_WRITE) | (1L << DIRECTORY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DISABLE - 64)) | (1L << (DISCARD - 64)) | (1L << (DISK - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENABLE - 64)) | (1L << (ENGINE - 64)) | (1L << (ENUM - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (FIRST - 64)) | (1L << (FIXED - 64)) | (1L << (FULL - 64)) | (1L << (GEOMETRY - 64)) | (1L << (GEOMETRYCOLLECTION - 64)) | (1L << (HASH - 64)) | (1L << (IMPORT - 64)) | (1L << (INPLACE - 64)) | (1L << (INSERT_METHOD - 64)) | (1L << (INVOKER - 64)) | (1L << (JSON - 64)) | (1L << (KEY_BLOCK_SIZE - 64)) | (1L << (LAST - 64)) | (1L << (LINESTRING - 64)) | (1L << (LIST - 64)) | (1L << (MAX_ROWS - 64)) | (1L << (MEMORY - 64)) | (1L << (MERGE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MIN_ROWS - 128)) | (1L << (MODIFY - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (NAME - 128)) | (1L << (NATIONAL - 128)) | (1L << (NCHAR - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOW - 128)) | (1L << (NVARCHAR - 128)) | (1L << (OFFLINE - 128)) | (1L << (ONLINE - 128)) | (1L << (PACK_KEYS - 128)) | (1L << (PARSER - 128)) | (1L << (PARTIAL - 128)) | (1L << (PARTITIONING - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PASSWORD - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (REBUILD - 128)) | (1L << (REDUNDANT - 128)) | (1L << (REMOVE - 128)) | (1L << (REORGANIZE - 128)) | (1L << (REPAIR - 128)) | (1L << (ROW_FORMAT - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIAL - 128)) | (1L << (SHARED - 128)) | (1L << (SIGNED - 128)) | (1L << (SIMPLE - 128)) | (1L << (STATS_AUTO_RECALC - 128)) | (1L << (STATS_PERSISTENT - 128)) | (1L << (STATS_SAMPLE_PAGES - 128)) | (1L << (STORAGE - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUBPARTITIONS - 128)) | (1L << (TABLESPACE - 128)) | (1L << (TEMPORARY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TEMPTABLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNDEFINED - 192)) | (1L << (UNICODE - 192)) | (1L << (UPGRADE - 192)) | (1L << (VALIDATION - 192)) | (1L << (VIEW - 192)) | (1L << (WITHOUT - 192)) | (1L << (YEAR - 192)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Skip_parensContext extends ParserRuleContext {
		public TerminalNode MAXWELL_ELIDED_PARSE_ISSUE() { return getToken(mysqlParser.MAXWELL_ELIDED_PARSE_ISSUE, 0); }
		public Skip_parensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip_parens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterSkip_parens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitSkip_parens(this);
		}
	}

	public final Skip_parensContext skip_parens() throws RecognitionException {
		Skip_parensContext _localctx = new Skip_parensContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_skip_parens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==MAXWELL_ELIDED_PARSE_ISSUE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Db_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Db_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDb_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDb_name(this);
		}
	}

	public final Db_nameContext db_name() throws RecognitionException {
		Db_nameContext _localctx = new Db_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_db_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Db_nameContext db_name() {
			return getRuleContext(Db_nameContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_table_name);
		try {
			setState(307);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(300);
				db_name();
				setState(301);
				match(T__1);
				setState(302);
				name();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(T__1);
				setState(305);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserContext extends ParserRuleContext {
		public List<User_tokenContext> user_token() {
			return getRuleContexts(User_tokenContext.class);
		}
		public User_tokenContext user_token(int i) {
			return getRuleContext(User_tokenContext.class,i);
		}
		public UserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitUser(this);
		}
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_user);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			user_token();
			setState(312);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(310);
				match(T__2);
				setState(311);
				user_token();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class User_tokenContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(mysqlParser.IDENT, 0); }
		public TerminalNode QUOTED_IDENT() { return getToken(mysqlParser.QUOTED_IDENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public User_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterUser_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitUser_token(this);
		}
	}

	public final User_tokenContext user_token() throws RecognitionException {
		User_tokenContext _localctx = new User_tokenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_user_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(314);
				match(IDENT);
				}
				break;
			case QUOTED_IDENT:
				{
				setState(315);
				match(QUOTED_IDENT);
				}
				break;
			case STRING_LITERAL:
			case DBL_STRING_LITERAL:
				{
				setState(316);
				string_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Tokens_available_for_namesContext tokens_available_for_names() {
			return getRuleContext(Tokens_available_for_namesContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public TerminalNode DBL_STRING_LITERAL() { return getToken(mysqlParser.DBL_STRING_LITERAL, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			switch (_input.LA(1)) {
			case IDENT:
			case QUOTED_IDENT:
				{
				setState(319);
				id();
				}
				break;
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case ALWAYS:
			case ASCII:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BIT:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BYTE:
			case CHARSET:
			case CHECKSUM:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case CONNECTION:
			case COPY:
			case DATA:
			case DATE:
			case DATETIME:
			case DEFINER:
			case DELAY_KEY_WRITE:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DYNAMIC:
			case ENABLE:
			case ENGINE:
			case ENUM:
			case EXCHANGE:
			case EXCLUSIVE:
			case FIRST:
			case FIXED:
			case FULL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case HASH:
			case IMPORT:
			case INPLACE:
			case INSERT_METHOD:
			case INVOKER:
			case JSON:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LINESTRING:
			case LIST:
			case MAX_ROWS:
			case MEMORY:
			case MERGE:
			case MIN_ROWS:
			case MODIFY:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case NAME:
			case NATIONAL:
			case NCHAR:
			case NO:
			case NONE:
			case NOW:
			case NVARCHAR:
			case OFFLINE:
			case ONLINE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case POINT:
			case POLYGON:
			case REBUILD:
			case REDUNDANT:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case ROW_FORMAT:
			case SECURITY:
			case SERIAL:
			case SHARED:
			case SIGNED:
			case SIMPLE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case TABLESPACE:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TRUNCATE:
			case UNDEFINED:
			case UNICODE:
			case UPGRADE:
			case VALIDATION:
			case VIEW:
			case WITHOUT:
			case YEAR:
				{
				setState(320);
				tokens_available_for_names();
				}
				break;
			case INTEGER_LITERAL:
				{
				setState(321);
				match(INTEGER_LITERAL);
				}
				break;
			case DBL_STRING_LITERAL:
				{
				setState(322);
				match(DBL_STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(mysqlParser.IDENT, 0); }
		public TerminalNode QUOTED_IDENT() { return getToken(mysqlParser.QUOTED_IDENT, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !(_la==IDENT || _la==QUOTED_IDENT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Float_literalContext float_literal() {
			return getRuleContext(Float_literalContext.class,0);
		}
		public Integer_literalContext integer_literal() {
			return getRuleContext(Integer_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode NULL() { return getToken(mysqlParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(mysqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(mysqlParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(327);
				float_literal();
				}
				break;
			case 2:
				{
				setState(328);
				integer_literal();
				}
				break;
			case 3:
				{
				setState(329);
				string_literal();
				}
				break;
			case 4:
				{
				setState(330);
				match(NULL);
				}
				break;
			case 5:
				{
				setState(331);
				match(TRUE);
				}
				break;
			case 6:
				{
				setState(332);
				match(FALSE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_literalContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(mysqlParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(mysqlParser.INTEGER_LITERAL, i);
		}
		public Float_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterFloat_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitFloat_literal(this);
		}
	}

	public final Float_literalContext float_literal() throws RecognitionException {
		Float_literalContext _localctx = new Float_literalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_float_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(335);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(339);
			_la = _input.LA(1);
			if (_la==INTEGER_LITERAL) {
				{
				setState(338);
				match(INTEGER_LITERAL);
				}
			}

			setState(341);
			match(T__1);
			setState(342);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Integer_literalContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public Integer_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterInteger_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitInteger_literal(this);
		}
	}

	public final Integer_literalContext integer_literal() throws RecognitionException {
		Integer_literalContext _localctx = new Integer_literalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_integer_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(344);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(347);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(mysqlParser.STRING_LITERAL, 0); }
		public TerminalNode DBL_STRING_LITERAL() { return getToken(mysqlParser.DBL_STRING_LITERAL, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitString_literal(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==DBL_STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(mysqlParser.IDENT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(mysqlParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Charset_nameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(mysqlParser.IDENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode QUOTED_IDENT() { return getToken(mysqlParser.QUOTED_IDENT, 0); }
		public TerminalNode BINARY() { return getToken(mysqlParser.BINARY, 0); }
		public TerminalNode ASCII() { return getToken(mysqlParser.ASCII, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public Charset_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCharset_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCharset_name(this);
		}
	}

	public final Charset_nameContext charset_name() throws RecognitionException {
		Charset_nameContext _localctx = new Charset_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_charset_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(355);
				match(IDENT);
				}
				break;
			case STRING_LITERAL:
			case DBL_STRING_LITERAL:
				{
				setState(356);
				string_literal();
				}
				break;
			case QUOTED_IDENT:
				{
				setState(357);
				match(QUOTED_IDENT);
				}
				break;
			case BINARY:
				{
				setState(358);
				match(BINARY);
				}
				break;
			case ASCII:
				{
				setState(359);
				match(ASCII);
				}
				break;
			case DEFAULT:
				{
				setState(360);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_character_setContext extends ParserRuleContext {
		public Charset_tokenContext charset_token() {
			return getRuleContext(Charset_tokenContext.class,0);
		}
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public CollationContext collation() {
			return getRuleContext(CollationContext.class,0);
		}
		public Default_character_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_character_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDefault_character_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDefault_character_set(this);
		}
	}

	public final Default_character_setContext default_character_set() throws RecognitionException {
		Default_character_setContext _localctx = new Default_character_setContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_default_character_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(363);
				match(DEFAULT);
				}
			}

			setState(366);
			charset_token();
			setState(368);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(367);
				match(T__5);
				}
			}

			setState(370);
			charset_name();
			setState(372);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(371);
				collation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_collationContext extends ParserRuleContext {
		public CollationContext collation() {
			return getRuleContext(CollationContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public Default_collationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_collation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDefault_collation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDefault_collation(this);
		}
	}

	public final Default_collationContext default_collation() throws RecognitionException {
		Default_collationContext _localctx = new Default_collationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_default_collation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(374);
				match(DEFAULT);
				}
			}

			setState(377);
			collation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Charset_tokenContext extends ParserRuleContext {
		public TerminalNode CHARSET() { return getToken(mysqlParser.CHARSET, 0); }
		public TerminalNode CHARACTER() { return getToken(mysqlParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(mysqlParser.SET, 0); }
		public TerminalNode CHAR() { return getToken(mysqlParser.CHAR, 0); }
		public Charset_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCharset_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCharset_token(this);
		}
	}

	public final Charset_tokenContext charset_token() throws RecognitionException {
		Charset_tokenContext _localctx = new Charset_tokenContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_charset_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			switch (_input.LA(1)) {
			case CHARSET:
				{
				setState(379);
				match(CHARSET);
				}
				break;
			case CHARACTER:
				{
				{
				setState(380);
				match(CHARACTER);
				setState(381);
				match(SET);
				}
				}
				break;
			case CHAR:
				{
				{
				setState(382);
				match(CHAR);
				setState(383);
				match(SET);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollationContext extends ParserRuleContext {
		public TerminalNode COLLATE() { return getToken(mysqlParser.COLLATE, 0); }
		public TerminalNode IDENT() { return getToken(mysqlParser.IDENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode QUOTED_IDENT() { return getToken(mysqlParser.QUOTED_IDENT, 0); }
		public CollationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCollation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCollation(this);
		}
	}

	public final CollationContext collation() throws RecognitionException {
		CollationContext _localctx = new CollationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_collation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(COLLATE);
			setState(388);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(387);
				match(T__5);
				}
			}

			setState(393);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(390);
				match(IDENT);
				}
				break;
			case STRING_LITERAL:
			case DBL_STRING_LITERAL:
				{
				setState(391);
				string_literal();
				}
				break;
			case QUOTED_IDENT:
				{
				setState(392);
				match(QUOTED_IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_not_existsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(mysqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(mysqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(mysqlParser.EXISTS, 0); }
		public If_not_existsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_not_exists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIf_not_exists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIf_not_exists(this);
		}
	}

	public final If_not_existsContext if_not_exists() throws RecognitionException {
		If_not_existsContext _localctx = new If_not_existsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if_not_exists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(IF);
			setState(396);
			match(NOT);
			setState(397);
			match(EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_tableContext extends ParserRuleContext {
		public Alter_table_preambleContext alter_table_preamble() {
			return getRuleContext(Alter_table_preambleContext.class,0);
		}
		public Alter_specificationsContext alter_specifications() {
			return getRuleContext(Alter_specificationsContext.class,0);
		}
		public Alter_partition_specificationContext alter_partition_specification() {
			return getRuleContext(Alter_partition_specificationContext.class,0);
		}
		public Alter_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_table(this);
		}
	}

	public final Alter_tableContext alter_table() throws RecognitionException {
		Alter_tableContext _localctx = new Alter_tableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_alter_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			alter_table_preamble();
			setState(400);
			alter_specifications();
			setState(402);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ANALYZE) | (1L << CHECK) | (1L << COALESCE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DISCARD - 65)) | (1L << (DROP - 65)) | (1L << (EXCHANGE - 65)) | (1L << (IMPORT - 65)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (OPTIMIZE - 146)) | (1L << (PARTITION - 146)) | (1L << (REBUILD - 146)) | (1L << (REMOVE - 146)) | (1L << (REORGANIZE - 146)) | (1L << (REPAIR - 146)) | (1L << (TRUNCATE - 146)) | (1L << (UPGRADE - 146)))) != 0)) {
				{
				setState(401);
				alter_partition_specification();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_preambleContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(mysqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(mysqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Alter_flagsContext alter_flags() {
			return getRuleContext(Alter_flagsContext.class,0);
		}
		public Alter_table_preambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_preamble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_table_preamble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_table_preamble(this);
		}
	}

	public final Alter_table_preambleContext alter_table_preamble() throws RecognitionException {
		Alter_table_preambleContext _localctx = new Alter_table_preambleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_alter_table_preamble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(ALTER);
			setState(406);
			_la = _input.LA(1);
			if (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (IGNORE - 91)) | (1L << (OFFLINE - 91)) | (1L << (ONLINE - 91)))) != 0)) {
				{
				setState(405);
				alter_flags();
				}
			}

			setState(408);
			match(TABLE);
			setState(409);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_flagsContext extends ParserRuleContext {
		public TerminalNode ONLINE() { return getToken(mysqlParser.ONLINE, 0); }
		public TerminalNode OFFLINE() { return getToken(mysqlParser.OFFLINE, 0); }
		public TerminalNode IGNORE() { return getToken(mysqlParser.IGNORE, 0); }
		public Alter_flagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_flags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_flags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_flags(this);
		}
	}

	public final Alter_flagsContext alter_flags() throws RecognitionException {
		Alter_flagsContext _localctx = new Alter_flagsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_alter_flags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (IGNORE - 91)) | (1L << (OFFLINE - 91)) | (1L << (ONLINE - 91)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_specificationsContext extends ParserRuleContext {
		public List<Alter_specificationContext> alter_specification() {
			return getRuleContexts(Alter_specificationContext.class);
		}
		public Alter_specificationContext alter_specification(int i) {
			return getRuleContext(Alter_specificationContext.class,i);
		}
		public Alter_specificationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_specifications; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_specifications(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_specifications(this);
		}
	}

	public final Alter_specificationsContext alter_specifications() throws RecognitionException {
		Alter_specificationsContext _localctx = new Alter_specificationsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_alter_specifications);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			alter_specification();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(414);
				match(T__6);
				setState(415);
				alter_specification();
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_specificationContext extends ParserRuleContext {
		public Add_columnContext add_column() {
			return getRuleContext(Add_columnContext.class,0);
		}
		public Add_column_parensContext add_column_parens() {
			return getRuleContext(Add_column_parensContext.class,0);
		}
		public Change_columnContext change_column() {
			return getRuleContext(Change_columnContext.class,0);
		}
		public Drop_columnContext drop_column() {
			return getRuleContext(Drop_columnContext.class,0);
		}
		public Modify_columnContext modify_column() {
			return getRuleContext(Modify_columnContext.class,0);
		}
		public Drop_keyContext drop_key() {
			return getRuleContext(Drop_keyContext.class,0);
		}
		public Drop_primary_keyContext drop_primary_key() {
			return getRuleContext(Drop_primary_keyContext.class,0);
		}
		public Alter_rename_tableContext alter_rename_table() {
			return getRuleContext(Alter_rename_tableContext.class,0);
		}
		public Convert_to_character_setContext convert_to_character_set() {
			return getRuleContext(Convert_to_character_setContext.class,0);
		}
		public Default_character_setContext default_character_set() {
			return getRuleContext(Default_character_setContext.class,0);
		}
		public List<Table_creation_optionContext> table_creation_option() {
			return getRuleContexts(Table_creation_optionContext.class);
		}
		public Table_creation_optionContext table_creation_option(int i) {
			return getRuleContext(Table_creation_optionContext.class,i);
		}
		public Ignored_alter_specificationsContext ignored_alter_specifications() {
			return getRuleContext(Ignored_alter_specificationsContext.class,0);
		}
		public Alter_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_specification(this);
		}
	}

	public final Alter_specificationContext alter_specification() throws RecognitionException {
		Alter_specificationContext _localctx = new Alter_specificationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_alter_specification);
		try {
			int _alt;
			setState(437);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				add_column();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				add_column_parens();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				change_column();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				drop_column();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(425);
				modify_column();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(426);
				drop_key();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(427);
				drop_primary_key();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(428);
				alter_rename_table();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(429);
				convert_to_character_set();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(430);
				default_character_set();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(432); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(431);
						table_creation_option();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(434); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(436);
				ignored_alter_specifications();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_columnContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(mysqlParser.ADD, 0); }
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(mysqlParser.COLUMN, 0); }
		public Col_positionContext col_position() {
			return getRuleContext(Col_positionContext.class,0);
		}
		public Add_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAdd_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAdd_column(this);
		}
	}

	public final Add_columnContext add_column() throws RecognitionException {
		Add_columnContext _localctx = new Add_columnContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_add_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(ADD);
			setState(441);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(440);
				match(COLUMN);
				}
			}

			setState(443);
			column_definition();
			setState(445);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(444);
				col_position();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_column_parensContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(mysqlParser.ADD, 0); }
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public List<Index_definitionContext> index_definition() {
			return getRuleContexts(Index_definitionContext.class);
		}
		public Index_definitionContext index_definition(int i) {
			return getRuleContext(Index_definitionContext.class,i);
		}
		public TerminalNode COLUMN() { return getToken(mysqlParser.COLUMN, 0); }
		public Add_column_parensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_column_parens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAdd_column_parens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAdd_column_parens(this);
		}
	}

	public final Add_column_parensContext add_column_parens() throws RecognitionException {
		Add_column_parensContext _localctx = new Add_column_parensContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_add_column_parens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(ADD);
			setState(449);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(448);
				match(COLUMN);
				}
			}

			setState(451);
			match(T__0);
			setState(454);
			switch (_input.LA(1)) {
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case ALWAYS:
			case ASCII:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BIT:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BYTE:
			case CHARSET:
			case CHECKSUM:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case CONNECTION:
			case COPY:
			case DATA:
			case DATE:
			case DATETIME:
			case DEFINER:
			case DELAY_KEY_WRITE:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DYNAMIC:
			case ENABLE:
			case ENGINE:
			case ENUM:
			case EXCHANGE:
			case EXCLUSIVE:
			case FIRST:
			case FIXED:
			case FULL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case HASH:
			case IMPORT:
			case INPLACE:
			case INSERT_METHOD:
			case INVOKER:
			case JSON:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LINESTRING:
			case LIST:
			case MAX_ROWS:
			case MEMORY:
			case MERGE:
			case MIN_ROWS:
			case MODIFY:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case NAME:
			case NATIONAL:
			case NCHAR:
			case NO:
			case NONE:
			case NOW:
			case NVARCHAR:
			case OFFLINE:
			case ONLINE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case POINT:
			case POLYGON:
			case REBUILD:
			case REDUNDANT:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case ROW_FORMAT:
			case SECURITY:
			case SERIAL:
			case SHARED:
			case SIGNED:
			case SIMPLE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case TABLESPACE:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TRUNCATE:
			case UNDEFINED:
			case UNICODE:
			case UPGRADE:
			case VALIDATION:
			case VIEW:
			case WITHOUT:
			case YEAR:
			case DBL_STRING_LITERAL:
			case INTEGER_LITERAL:
			case IDENT:
			case QUOTED_IDENT:
				{
				setState(452);
				column_definition();
				}
				break;
			case CHECK:
			case CONSTRAINT:
			case FOREIGN:
			case FULLTEXT:
			case INDEX:
			case KEY:
			case PRIMARY:
			case SPATIAL:
			case UNIQUE:
				{
				setState(453);
				index_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(456);
				match(T__6);
				setState(459);
				switch (_input.LA(1)) {
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case ALWAYS:
				case ASCII:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BIT:
				case BOOL:
				case BOOLEAN:
				case BTREE:
				case BYTE:
				case CHARSET:
				case CHECKSUM:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case CONNECTION:
				case COPY:
				case DATA:
				case DATE:
				case DATETIME:
				case DEFINER:
				case DELAY_KEY_WRITE:
				case DIRECTORY:
				case DISABLE:
				case DISCARD:
				case DISK:
				case DYNAMIC:
				case ENABLE:
				case ENGINE:
				case ENUM:
				case EXCHANGE:
				case EXCLUSIVE:
				case FIRST:
				case FIXED:
				case FULL:
				case GEOMETRY:
				case GEOMETRYCOLLECTION:
				case HASH:
				case IMPORT:
				case INPLACE:
				case INSERT_METHOD:
				case INVOKER:
				case JSON:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LINESTRING:
				case LIST:
				case MAX_ROWS:
				case MEMORY:
				case MERGE:
				case MIN_ROWS:
				case MODIFY:
				case MULTILINESTRING:
				case MULTIPOINT:
				case MULTIPOLYGON:
				case NAME:
				case NATIONAL:
				case NCHAR:
				case NO:
				case NONE:
				case NOW:
				case NVARCHAR:
				case OFFLINE:
				case ONLINE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PARTITIONS:
				case PASSWORD:
				case POINT:
				case POLYGON:
				case REBUILD:
				case REDUNDANT:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case ROW_FORMAT:
				case SECURITY:
				case SERIAL:
				case SHARED:
				case SIGNED:
				case SIMPLE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUBPARTITIONS:
				case TABLESPACE:
				case TEMPORARY:
				case TEMPTABLE:
				case TEXT:
				case TIME:
				case TIMESTAMP:
				case TRUNCATE:
				case UNDEFINED:
				case UNICODE:
				case UPGRADE:
				case VALIDATION:
				case VIEW:
				case WITHOUT:
				case YEAR:
				case DBL_STRING_LITERAL:
				case INTEGER_LITERAL:
				case IDENT:
				case QUOTED_IDENT:
					{
					setState(457);
					column_definition();
					}
					break;
				case CHECK:
				case CONSTRAINT:
				case FOREIGN:
				case FULLTEXT:
				case INDEX:
				case KEY:
				case PRIMARY:
				case SPATIAL:
				case UNIQUE:
					{
					setState(458);
					index_definition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Change_columnContext extends ParserRuleContext {
		public TerminalNode CHANGE() { return getToken(mysqlParser.CHANGE, 0); }
		public Old_col_nameContext old_col_name() {
			return getRuleContext(Old_col_nameContext.class,0);
		}
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(mysqlParser.COLUMN, 0); }
		public Col_positionContext col_position() {
			return getRuleContext(Col_positionContext.class,0);
		}
		public Change_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterChange_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitChange_column(this);
		}
	}

	public final Change_columnContext change_column() throws RecognitionException {
		Change_columnContext _localctx = new Change_columnContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_change_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(CHANGE);
			setState(470);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(469);
				match(COLUMN);
				}
			}

			setState(472);
			old_col_name();
			setState(473);
			column_definition();
			setState(475);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(474);
				col_position();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_columnContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public Old_col_nameContext old_col_name() {
			return getRuleContext(Old_col_nameContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(mysqlParser.COLUMN, 0); }
		public TerminalNode CASCADE() { return getToken(mysqlParser.CASCADE, 0); }
		public Drop_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDrop_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDrop_column(this);
		}
	}

	public final Drop_columnContext drop_column() throws RecognitionException {
		Drop_columnContext _localctx = new Drop_columnContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_drop_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(DROP);
			setState(479);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(478);
				match(COLUMN);
				}
			}

			setState(481);
			old_col_name();
			setState(483);
			_la = _input.LA(1);
			if (_la==CASCADE) {
				{
				setState(482);
				match(CASCADE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Old_col_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Old_col_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_old_col_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterOld_col_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitOld_col_name(this);
		}
	}

	public final Old_col_nameContext old_col_name() throws RecognitionException {
		Old_col_nameContext _localctx = new Old_col_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_old_col_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Modify_columnContext extends ParserRuleContext {
		public TerminalNode MODIFY() { return getToken(mysqlParser.MODIFY, 0); }
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(mysqlParser.COLUMN, 0); }
		public Col_positionContext col_position() {
			return getRuleContext(Col_positionContext.class,0);
		}
		public Modify_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modify_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterModify_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitModify_column(this);
		}
	}

	public final Modify_columnContext modify_column() throws RecognitionException {
		Modify_columnContext _localctx = new Modify_columnContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_modify_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(MODIFY);
			setState(489);
			_la = _input.LA(1);
			if (_la==COLUMN) {
				{
				setState(488);
				match(COLUMN);
				}
			}

			setState(491);
			column_definition();
			setState(493);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(492);
				col_position();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_keyContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(mysqlParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public TerminalNode FOREIGN() { return getToken(mysqlParser.FOREIGN, 0); }
		public Drop_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDrop_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDrop_key(this);
		}
	}

	public final Drop_keyContext drop_key() throws RecognitionException {
		Drop_keyContext _localctx = new Drop_keyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_drop_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(DROP);
			setState(497);
			_la = _input.LA(1);
			if (_la==FOREIGN) {
				{
				setState(496);
				match(FOREIGN);
				}
			}

			setState(499);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(500);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_primary_keyContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public TerminalNode PRIMARY() { return getToken(mysqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public Drop_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDrop_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDrop_primary_key(this);
		}
	}

	public final Drop_primary_keyContext drop_primary_key() throws RecognitionException {
		Drop_primary_keyContext _localctx = new Drop_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_drop_primary_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			match(DROP);
			setState(503);
			match(PRIMARY);
			setState(504);
			match(KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_rename_tableContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(mysqlParser.RENAME, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TO() { return getToken(mysqlParser.TO, 0); }
		public TerminalNode AS() { return getToken(mysqlParser.AS, 0); }
		public Alter_rename_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_rename_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_rename_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_rename_table(this);
		}
	}

	public final Alter_rename_tableContext alter_rename_table() throws RecognitionException {
		Alter_rename_tableContext _localctx = new Alter_rename_tableContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alter_rename_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(RENAME);
			setState(508);
			_la = _input.LA(1);
			if (_la==AS || _la==TO) {
				{
				setState(507);
				_la = _input.LA(1);
				if ( !(_la==AS || _la==TO) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(510);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Convert_to_character_setContext extends ParserRuleContext {
		public TerminalNode CONVERT() { return getToken(mysqlParser.CONVERT, 0); }
		public TerminalNode TO() { return getToken(mysqlParser.TO, 0); }
		public Charset_tokenContext charset_token() {
			return getRuleContext(Charset_tokenContext.class,0);
		}
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public CollationContext collation() {
			return getRuleContext(CollationContext.class,0);
		}
		public Convert_to_character_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convert_to_character_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterConvert_to_character_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitConvert_to_character_set(this);
		}
	}

	public final Convert_to_character_setContext convert_to_character_set() throws RecognitionException {
		Convert_to_character_setContext _localctx = new Convert_to_character_setContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_convert_to_character_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(CONVERT);
			setState(513);
			match(TO);
			setState(514);
			charset_token();
			setState(515);
			charset_name();
			setState(517);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(516);
				collation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_partition_specificationContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(mysqlParser.ADD, 0); }
		public TerminalNode PARTITION() { return getToken(mysqlParser.PARTITION, 0); }
		public Skip_parensContext skip_parens() {
			return getRuleContext(Skip_parensContext.class,0);
		}
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public Partition_namesContext partition_names() {
			return getRuleContext(Partition_namesContext.class,0);
		}
		public TerminalNode TRUNCATE() { return getToken(mysqlParser.TRUNCATE, 0); }
		public TerminalNode DISCARD() { return getToken(mysqlParser.DISCARD, 0); }
		public TerminalNode TABLESPACE() { return getToken(mysqlParser.TABLESPACE, 0); }
		public TerminalNode IMPORT() { return getToken(mysqlParser.IMPORT, 0); }
		public TerminalNode COALESCE() { return getToken(mysqlParser.COALESCE, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public TerminalNode REORGANIZE() { return getToken(mysqlParser.REORGANIZE, 0); }
		public TerminalNode INTO() { return getToken(mysqlParser.INTO, 0); }
		public TerminalNode EXCHANGE() { return getToken(mysqlParser.EXCHANGE, 0); }
		public TerminalNode IDENT() { return getToken(mysqlParser.IDENT, 0); }
		public List<TerminalNode> WITH() { return getTokens(mysqlParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(mysqlParser.WITH, i);
		}
		public TerminalNode TABLE() { return getToken(mysqlParser.TABLE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode VALIDATION() { return getToken(mysqlParser.VALIDATION, 0); }
		public TerminalNode WITHOUT() { return getToken(mysqlParser.WITHOUT, 0); }
		public TerminalNode ANALYZE() { return getToken(mysqlParser.ANALYZE, 0); }
		public TerminalNode CHECK() { return getToken(mysqlParser.CHECK, 0); }
		public TerminalNode OPTIMIZE() { return getToken(mysqlParser.OPTIMIZE, 0); }
		public TerminalNode REBUILD() { return getToken(mysqlParser.REBUILD, 0); }
		public TerminalNode REPAIR() { return getToken(mysqlParser.REPAIR, 0); }
		public TerminalNode REMOVE() { return getToken(mysqlParser.REMOVE, 0); }
		public TerminalNode PARTITIONING() { return getToken(mysqlParser.PARTITIONING, 0); }
		public TerminalNode UPGRADE() { return getToken(mysqlParser.UPGRADE, 0); }
		public Partition_byContext partition_by() {
			return getRuleContext(Partition_byContext.class,0);
		}
		public Alter_partition_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_partition_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_partition_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_partition_specification(this);
		}
	}

	public final Alter_partition_specificationContext alter_partition_specification() throws RecognitionException {
		Alter_partition_specificationContext _localctx = new Alter_partition_specificationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_alter_partition_specification);
		int _la;
		try {
			setState(579);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(ADD);
				setState(520);
				match(PARTITION);
				setState(521);
				skip_parens();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				match(DROP);
				setState(523);
				match(PARTITION);
				setState(524);
				partition_names();
				}
				break;
			case TRUNCATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				match(TRUNCATE);
				setState(526);
				match(PARTITION);
				setState(527);
				partition_names();
				}
				break;
			case DISCARD:
				enterOuterAlt(_localctx, 4);
				{
				setState(528);
				match(DISCARD);
				setState(529);
				match(PARTITION);
				setState(530);
				partition_names();
				setState(531);
				match(TABLESPACE);
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 5);
				{
				setState(533);
				match(IMPORT);
				setState(534);
				match(PARTITION);
				setState(535);
				partition_names();
				setState(536);
				match(TABLESPACE);
				}
				break;
			case COALESCE:
				enterOuterAlt(_localctx, 6);
				{
				setState(538);
				match(COALESCE);
				setState(539);
				match(PARTITION);
				setState(540);
				match(INTEGER_LITERAL);
				}
				break;
			case REORGANIZE:
				enterOuterAlt(_localctx, 7);
				{
				setState(541);
				match(REORGANIZE);
				setState(542);
				match(PARTITION);
				setState(547);
				_la = _input.LA(1);
				if (_la==IDENT || _la==QUOTED_IDENT) {
					{
					setState(543);
					partition_names();
					setState(544);
					match(INTO);
					setState(545);
					skip_parens();
					}
				}

				}
				break;
			case EXCHANGE:
				enterOuterAlt(_localctx, 8);
				{
				setState(549);
				match(EXCHANGE);
				setState(550);
				match(PARTITION);
				setState(551);
				match(IDENT);
				setState(552);
				match(WITH);
				setState(553);
				match(TABLE);
				setState(554);
				name();
				setState(557);
				_la = _input.LA(1);
				if (_la==WITH || _la==WITHOUT) {
					{
					setState(555);
					_la = _input.LA(1);
					if ( !(_la==WITH || _la==WITHOUT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(556);
					match(VALIDATION);
					}
				}

				}
				break;
			case ANALYZE:
				enterOuterAlt(_localctx, 9);
				{
				setState(559);
				match(ANALYZE);
				setState(560);
				match(PARTITION);
				setState(561);
				partition_names();
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 10);
				{
				setState(562);
				match(CHECK);
				setState(563);
				match(PARTITION);
				setState(564);
				partition_names();
				}
				break;
			case OPTIMIZE:
				enterOuterAlt(_localctx, 11);
				{
				setState(565);
				match(OPTIMIZE);
				setState(566);
				match(PARTITION);
				setState(567);
				partition_names();
				}
				break;
			case REBUILD:
				enterOuterAlt(_localctx, 12);
				{
				setState(568);
				match(REBUILD);
				setState(569);
				match(PARTITION);
				setState(570);
				partition_names();
				}
				break;
			case REPAIR:
				enterOuterAlt(_localctx, 13);
				{
				setState(571);
				match(REPAIR);
				setState(572);
				match(PARTITION);
				setState(573);
				partition_names();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 14);
				{
				setState(574);
				match(REMOVE);
				setState(575);
				match(PARTITIONING);
				}
				break;
			case UPGRADE:
				enterOuterAlt(_localctx, 15);
				{
				setState(576);
				match(UPGRADE);
				setState(577);
				match(PARTITIONING);
				}
				break;
			case PARTITION:
				enterOuterAlt(_localctx, 16);
				{
				setState(578);
				partition_by();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ignored_alter_specificationsContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(mysqlParser.ADD, 0); }
		public Index_definitionContext index_definition() {
			return getRuleContext(Index_definitionContext.class,0);
		}
		public TerminalNode ALTER() { return getToken(mysqlParser.ALTER, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode COLUMN() { return getToken(mysqlParser.COLUMN, 0); }
		public TerminalNode SET() { return getToken(mysqlParser.SET, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(mysqlParser.INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode DISABLE() { return getToken(mysqlParser.DISABLE, 0); }
		public TerminalNode KEYS() { return getToken(mysqlParser.KEYS, 0); }
		public TerminalNode ENABLE() { return getToken(mysqlParser.ENABLE, 0); }
		public TerminalNode ORDER() { return getToken(mysqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(mysqlParser.BY, 0); }
		public List<Alter_orderingContext> alter_ordering() {
			return getRuleContexts(Alter_orderingContext.class);
		}
		public Alter_orderingContext alter_ordering(int i) {
			return getRuleContext(Alter_orderingContext.class,i);
		}
		public TerminalNode FORCE() { return getToken(mysqlParser.FORCE, 0); }
		public TerminalNode DISCARD() { return getToken(mysqlParser.DISCARD, 0); }
		public TerminalNode TABLESPACE() { return getToken(mysqlParser.TABLESPACE, 0); }
		public TerminalNode IMPORT() { return getToken(mysqlParser.IMPORT, 0); }
		public TerminalNode ALGORITHM() { return getToken(mysqlParser.ALGORITHM, 0); }
		public Algorithm_typeContext algorithm_type() {
			return getRuleContext(Algorithm_typeContext.class,0);
		}
		public TerminalNode LOCK() { return getToken(mysqlParser.LOCK, 0); }
		public Lock_typeContext lock_type() {
			return getRuleContext(Lock_typeContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(mysqlParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(mysqlParser.TO, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public Ignored_alter_specificationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignored_alter_specifications; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIgnored_alter_specifications(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIgnored_alter_specifications(this);
		}
	}

	public final Ignored_alter_specificationsContext ignored_alter_specifications() throws RecognitionException {
		Ignored_alter_specificationsContext _localctx = new Ignored_alter_specificationsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ignored_alter_specifications);
		int _la;
		try {
			int _alt;
			setState(633);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				match(ADD);
				setState(582);
				index_definition();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(ALTER);
				setState(585);
				_la = _input.LA(1);
				if (_la==COLUMN) {
					{
					setState(584);
					match(COLUMN);
					}
				}

				setState(587);
				name();
				setState(593);
				switch (_input.LA(1)) {
				case SET:
					{
					{
					setState(588);
					match(SET);
					setState(589);
					match(DEFAULT);
					setState(590);
					literal();
					}
					}
					break;
				case DROP:
					{
					{
					setState(591);
					match(DROP);
					setState(592);
					match(DEFAULT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(595);
				match(DROP);
				setState(596);
				match(INDEX);
				setState(597);
				index_name();
				}
				break;
			case DISABLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(598);
				match(DISABLE);
				setState(599);
				match(KEYS);
				}
				break;
			case ENABLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(600);
				match(ENABLE);
				setState(601);
				match(KEYS);
				}
				break;
			case ORDER:
				enterOuterAlt(_localctx, 6);
				{
				setState(602);
				match(ORDER);
				setState(603);
				match(BY);
				setState(604);
				alter_ordering();
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(605);
						match(T__6);
						setState(606);
						alter_ordering();
						}
						} 
					}
					setState(611);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				}
				break;
			case FORCE:
				enterOuterAlt(_localctx, 7);
				{
				setState(612);
				match(FORCE);
				}
				break;
			case DISCARD:
				enterOuterAlt(_localctx, 8);
				{
				setState(613);
				match(DISCARD);
				setState(614);
				match(TABLESPACE);
				}
				break;
			case IMPORT:
				enterOuterAlt(_localctx, 9);
				{
				setState(615);
				match(IMPORT);
				setState(616);
				match(TABLESPACE);
				}
				break;
			case ALGORITHM:
				enterOuterAlt(_localctx, 10);
				{
				setState(617);
				match(ALGORITHM);
				setState(619);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(618);
					match(T__5);
					}
				}

				setState(621);
				algorithm_type();
				}
				break;
			case LOCK:
				enterOuterAlt(_localctx, 11);
				{
				setState(622);
				match(LOCK);
				setState(624);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(623);
					match(T__5);
					}
				}

				setState(626);
				lock_type();
				}
				break;
			case RENAME:
				enterOuterAlt(_localctx, 12);
				{
				setState(627);
				match(RENAME);
				setState(628);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(629);
				name();
				setState(630);
				match(TO);
				setState(631);
				name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Algorithm_typeContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public TerminalNode INPLACE() { return getToken(mysqlParser.INPLACE, 0); }
		public TerminalNode COPY() { return getToken(mysqlParser.COPY, 0); }
		public Algorithm_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algorithm_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlgorithm_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlgorithm_type(this);
		}
	}

	public final Algorithm_typeContext algorithm_type() throws RecognitionException {
		Algorithm_typeContext _localctx = new Algorithm_typeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_algorithm_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			_la = _input.LA(1);
			if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (COPY - 49)) | (1L << (DEFAULT - 49)) | (1L << (INPLACE - 49)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lock_typeContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public TerminalNode NONE() { return getToken(mysqlParser.NONE, 0); }
		public TerminalNode SHARED() { return getToken(mysqlParser.SHARED, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(mysqlParser.EXCLUSIVE, 0); }
		public Lock_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lock_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterLock_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitLock_type(this);
		}
	}

	public final Lock_typeContext lock_type() throws RecognitionException {
		Lock_typeContext _localctx = new Lock_typeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_lock_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==EXCLUSIVE || _la==NONE || _la==SHARED) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_namesContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Partition_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_names; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterPartition_names(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitPartition_names(this);
		}
	}

	public final Partition_namesContext partition_names() throws RecognitionException {
		Partition_namesContext _localctx = new Partition_namesContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_partition_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			id();
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(640);
				match(T__6);
				setState(641);
				id();
				}
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_orderingContext extends ParserRuleContext {
		public Alter_ordering_columnContext alter_ordering_column() {
			return getRuleContext(Alter_ordering_columnContext.class,0);
		}
		public TerminalNode ASC() { return getToken(mysqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(mysqlParser.DESC, 0); }
		public Alter_orderingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_ordering; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_ordering(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_ordering(this);
		}
	}

	public final Alter_orderingContext alter_ordering() throws RecognitionException {
		Alter_orderingContext _localctx = new Alter_orderingContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_alter_ordering);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			alter_ordering_column();
			setState(649);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(648);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_ordering_columnContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Alter_ordering_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_ordering_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_ordering_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_ordering_column(this);
		}
	}

	public final Alter_ordering_columnContext alter_ordering_column() throws RecognitionException {
		Alter_ordering_columnContext _localctx = new Alter_ordering_columnContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_alter_ordering_column);
		try {
			setState(662);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				name();
				setState(652);
				match(T__1);
				setState(653);
				name();
				setState(654);
				match(T__1);
				setState(655);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				name();
				setState(658);
				match(T__1);
				setState(659);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(661);
				name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionContext extends ParserRuleContext {
		public NameContext col_name;
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitColumn_definition(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			((Column_definitionContext)_localctx).col_name = name();
			setState(665);
			data_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_positionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(mysqlParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(mysqlParser.AFTER, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Col_positionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCol_position(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCol_position(this);
		}
	}

	public final Col_positionContext col_position() throws RecognitionException {
		Col_positionContext _localctx = new Col_positionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_col_position);
		try {
			setState(670);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(668);
				match(AFTER);
				setState(669);
				name();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public Generic_typeContext generic_type() {
			return getRuleContext(Generic_typeContext.class,0);
		}
		public Signed_typeContext signed_type() {
			return getRuleContext(Signed_typeContext.class,0);
		}
		public String_typeContext string_type() {
			return getRuleContext(String_typeContext.class,0);
		}
		public Enumerated_typeContext enumerated_type() {
			return getRuleContext(Enumerated_typeContext.class,0);
		}
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_data_type);
		try {
			setState(676);
			switch (_input.LA(1)) {
			case BINARY:
			case BIT:
			case BLOB:
			case BOOL:
			case BOOLEAN:
			case DATE:
			case DATETIME:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case JSON:
			case LINESTRING:
			case LONGBLOB:
			case MEDIUMBLOB:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case POINT:
			case POLYGON:
			case TIME:
			case TIMESTAMP:
			case TINYBLOB:
			case VARBINARY:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				generic_type();
				}
				break;
			case BIGINT:
			case DECIMAL:
			case DOUBLE:
			case FIXED:
			case FLOAT:
			case FLOAT4:
			case FLOAT8:
			case INT:
			case INT1:
			case INT2:
			case INT3:
			case INT4:
			case INT8:
			case INTEGER:
			case MEDIUMINT:
			case MIDDLEINT:
			case NUMERIC:
			case REAL:
			case SERIAL:
			case SMALLINT:
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				signed_type();
				}
				break;
			case CHAR:
			case CHARACTER:
			case LONG:
			case LONGTEXT:
			case MEDIUMTEXT:
			case NATIONAL:
			case NCHAR:
			case NVARCHAR:
			case TEXT:
			case TINYTEXT:
			case VARCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(674);
				string_type();
				}
				break;
			case ENUM:
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(675);
				enumerated_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Generic_typeContext extends ParserRuleContext {
		public Token col_type;
		public TerminalNode BIT() { return getToken(mysqlParser.BIT, 0); }
		public TerminalNode BINARY() { return getToken(mysqlParser.BINARY, 0); }
		public TerminalNode BLOB() { return getToken(mysqlParser.BLOB, 0); }
		public TerminalNode YEAR() { return getToken(mysqlParser.YEAR, 0); }
		public TerminalNode TIME() { return getToken(mysqlParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(mysqlParser.TIMESTAMP, 0); }
		public TerminalNode DATETIME() { return getToken(mysqlParser.DATETIME, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public List<Column_optionsContext> column_options() {
			return getRuleContexts(Column_optionsContext.class);
		}
		public Column_optionsContext column_options(int i) {
			return getRuleContext(Column_optionsContext.class,i);
		}
		public TerminalNode DATE() { return getToken(mysqlParser.DATE, 0); }
		public TerminalNode TINYBLOB() { return getToken(mysqlParser.TINYBLOB, 0); }
		public TerminalNode MEDIUMBLOB() { return getToken(mysqlParser.MEDIUMBLOB, 0); }
		public TerminalNode LONGBLOB() { return getToken(mysqlParser.LONGBLOB, 0); }
		public TerminalNode BOOLEAN() { return getToken(mysqlParser.BOOLEAN, 0); }
		public TerminalNode BOOL() { return getToken(mysqlParser.BOOL, 0); }
		public TerminalNode GEOMETRY() { return getToken(mysqlParser.GEOMETRY, 0); }
		public TerminalNode GEOMETRYCOLLECTION() { return getToken(mysqlParser.GEOMETRYCOLLECTION, 0); }
		public TerminalNode LINESTRING() { return getToken(mysqlParser.LINESTRING, 0); }
		public TerminalNode MULTILINESTRING() { return getToken(mysqlParser.MULTILINESTRING, 0); }
		public TerminalNode MULTIPOINT() { return getToken(mysqlParser.MULTIPOINT, 0); }
		public TerminalNode MULTIPOLYGON() { return getToken(mysqlParser.MULTIPOLYGON, 0); }
		public TerminalNode POINT() { return getToken(mysqlParser.POINT, 0); }
		public TerminalNode POLYGON() { return getToken(mysqlParser.POLYGON, 0); }
		public TerminalNode JSON() { return getToken(mysqlParser.JSON, 0); }
		public TerminalNode VARBINARY() { return getToken(mysqlParser.VARBINARY, 0); }
		public Generic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterGeneric_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitGeneric_type(this);
		}
	}

	public final Generic_typeContext generic_type() throws RecognitionException {
		Generic_typeContext _localctx = new Generic_typeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_generic_type);
		int _la;
		try {
			int _alt;
			setState(717);
			switch (_input.LA(1)) {
			case BINARY:
			case BIT:
			case BLOB:
			case DATETIME:
			case TIME:
			case TIMESTAMP:
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				((Generic_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BINARY) | (1L << BIT) | (1L << BLOB) | (1L << DATETIME))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (TIME - 194)) | (1L << (TIMESTAMP - 194)) | (1L << (YEAR - 194)))) != 0)) ) {
					((Generic_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(680);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(679);
					length();
					}
				}

				setState(685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(682);
						column_options();
						}
						} 
					}
					setState(687);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				}
				}
				break;
			case BOOL:
			case BOOLEAN:
			case DATE:
			case LONGBLOB:
			case MEDIUMBLOB:
			case TINYBLOB:
				enterOuterAlt(_localctx, 2);
				{
				setState(688);
				((Generic_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << BOOLEAN) | (1L << DATE))) != 0) || _la==LONGBLOB || _la==MEDIUMBLOB || _la==TINYBLOB) ) {
					((Generic_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(689);
						column_options();
						}
						} 
					}
					setState(694);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				}
				break;
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case LINESTRING:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case POINT:
			case POLYGON:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				((Generic_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (GEOMETRY - 87)) | (1L << (GEOMETRYCOLLECTION - 87)) | (1L << (LINESTRING - 87)) | (1L << (MULTILINESTRING - 87)) | (1L << (MULTIPOINT - 87)) | (1L << (MULTIPOLYGON - 87)))) != 0) || _la==POINT || _la==POLYGON) ) {
					((Generic_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(696);
						column_options();
						}
						} 
					}
					setState(701);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 4);
				{
				setState(702);
				((Generic_typeContext)_localctx).col_type = match(JSON);
				setState(706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(703);
						column_options();
						}
						} 
					}
					setState(708);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				}
				break;
			case VARBINARY:
				enterOuterAlt(_localctx, 5);
				{
				setState(709);
				((Generic_typeContext)_localctx).col_type = match(VARBINARY);
				setState(710);
				length();
				setState(714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(711);
						column_options();
						}
						} 
					}
					setState(716);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_typeContext extends ParserRuleContext {
		public Token col_type;
		public TerminalNode TINYINT() { return getToken(mysqlParser.TINYINT, 0); }
		public TerminalNode INT1() { return getToken(mysqlParser.INT1, 0); }
		public TerminalNode SMALLINT() { return getToken(mysqlParser.SMALLINT, 0); }
		public TerminalNode INT2() { return getToken(mysqlParser.INT2, 0); }
		public TerminalNode MEDIUMINT() { return getToken(mysqlParser.MEDIUMINT, 0); }
		public TerminalNode INT3() { return getToken(mysqlParser.INT3, 0); }
		public TerminalNode INT() { return getToken(mysqlParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(mysqlParser.INTEGER, 0); }
		public TerminalNode INT4() { return getToken(mysqlParser.INT4, 0); }
		public TerminalNode BIGINT() { return getToken(mysqlParser.BIGINT, 0); }
		public TerminalNode INT8() { return getToken(mysqlParser.INT8, 0); }
		public TerminalNode FIXED() { return getToken(mysqlParser.FIXED, 0); }
		public TerminalNode FLOAT4() { return getToken(mysqlParser.FLOAT4, 0); }
		public TerminalNode FLOAT8() { return getToken(mysqlParser.FLOAT8, 0); }
		public TerminalNode MIDDLEINT() { return getToken(mysqlParser.MIDDLEINT, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public List<Int_flagsContext> int_flags() {
			return getRuleContexts(Int_flagsContext.class);
		}
		public Int_flagsContext int_flags(int i) {
			return getRuleContext(Int_flagsContext.class,i);
		}
		public List<Column_optionsContext> column_options() {
			return getRuleContexts(Column_optionsContext.class);
		}
		public Column_optionsContext column_options(int i) {
			return getRuleContext(Column_optionsContext.class,i);
		}
		public TerminalNode REAL() { return getToken(mysqlParser.REAL, 0); }
		public TerminalNode FLOAT() { return getToken(mysqlParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(mysqlParser.DECIMAL, 0); }
		public TerminalNode NUMERIC() { return getToken(mysqlParser.NUMERIC, 0); }
		public Decimal_lengthContext decimal_length() {
			return getRuleContext(Decimal_lengthContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(mysqlParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(mysqlParser.PRECISION, 0); }
		public TerminalNode SERIAL() { return getToken(mysqlParser.SERIAL, 0); }
		public Signed_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterSigned_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitSigned_type(this);
		}
	}

	public final Signed_typeContext signed_type() throws RecognitionException {
		Signed_typeContext _localctx = new Signed_typeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_signed_type);
		int _la;
		try {
			int _alt;
			setState(777);
			switch (_input.LA(1)) {
			case BIGINT:
			case FIXED:
			case FLOAT4:
			case FLOAT8:
			case INT:
			case INT1:
			case INT2:
			case INT3:
			case INT4:
			case INT8:
			case INTEGER:
			case MEDIUMINT:
			case MIDDLEINT:
			case SMALLINT:
			case TINYINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(719);
				((Signed_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BIGINT || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (FIXED - 78)) | (1L << (FLOAT4 - 78)) | (1L << (FLOAT8 - 78)) | (1L << (INT - 78)) | (1L << (INT1 - 78)) | (1L << (INT2 - 78)) | (1L << (INT3 - 78)) | (1L << (INT4 - 78)) | (1L << (INT8 - 78)) | (1L << (INTEGER - 78)) | (1L << (MEDIUMINT - 78)) | (1L << (MIDDLEINT - 78)))) != 0) || _la==SMALLINT || _la==TINYINT) ) {
					((Signed_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(721);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(720);
					length();
					}
				}

				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (SIGNED - 177)) | (1L << (UNSIGNED - 177)) | (1L << (ZEROFILL - 177)))) != 0)) {
					{
					{
					setState(723);
					int_flags();
					}
					}
					setState(728);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(729);
						column_options();
						}
						} 
					}
					setState(734);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				}
				break;
			case DECIMAL:
			case FLOAT:
			case NUMERIC:
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				((Signed_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL || _la==FLOAT || _la==NUMERIC || _la==REAL) ) {
					((Signed_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(737);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(736);
					decimal_length();
					}
				}

				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (SIGNED - 177)) | (1L << (UNSIGNED - 177)) | (1L << (ZEROFILL - 177)))) != 0)) {
					{
					{
					setState(739);
					int_flags();
					}
					}
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(745);
						column_options();
						}
						} 
					}
					setState(750);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(751);
				((Signed_typeContext)_localctx).col_type = match(DOUBLE);
				setState(753);
				_la = _input.LA(1);
				if (_la==PRECISION) {
					{
					setState(752);
					match(PRECISION);
					}
				}

				setState(756);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(755);
					decimal_length();
					}
				}

				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (SIGNED - 177)) | (1L << (UNSIGNED - 177)) | (1L << (ZEROFILL - 177)))) != 0)) {
					{
					{
					setState(758);
					int_flags();
					}
					}
					setState(763);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(764);
						column_options();
						}
						} 
					}
					setState(769);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
				}
				}
				break;
			case SERIAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(770);
				((Signed_typeContext)_localctx).col_type = match(SERIAL);
				setState(774);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(771);
						column_options();
						}
						} 
					}
					setState(776);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_typeContext extends ParserRuleContext {
		public Boolean utf8 =  false;
		public Token col_type;
		public TerminalNode CHAR() { return getToken(mysqlParser.CHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(mysqlParser.CHARACTER, 0); }
		public TerminalNode VARCHAR() { return getToken(mysqlParser.VARCHAR, 0); }
		public TerminalNode NATIONAL() { return getToken(mysqlParser.NATIONAL, 0); }
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public List<Column_optionsContext> column_options() {
			return getRuleContexts(Column_optionsContext.class);
		}
		public Column_optionsContext column_options(int i) {
			return getRuleContext(Column_optionsContext.class,i);
		}
		public List<TerminalNode> BYTE() { return getTokens(mysqlParser.BYTE); }
		public TerminalNode BYTE(int i) {
			return getToken(mysqlParser.BYTE, i);
		}
		public List<TerminalNode> UNICODE() { return getTokens(mysqlParser.UNICODE); }
		public TerminalNode UNICODE(int i) {
			return getToken(mysqlParser.UNICODE, i);
		}
		public TerminalNode VARYING() { return getToken(mysqlParser.VARYING, 0); }
		public TerminalNode NCHAR() { return getToken(mysqlParser.NCHAR, 0); }
		public TerminalNode NVARCHAR() { return getToken(mysqlParser.NVARCHAR, 0); }
		public TerminalNode TINYTEXT() { return getToken(mysqlParser.TINYTEXT, 0); }
		public TerminalNode MEDIUMTEXT() { return getToken(mysqlParser.MEDIUMTEXT, 0); }
		public TerminalNode LONGTEXT() { return getToken(mysqlParser.LONGTEXT, 0); }
		public TerminalNode TEXT() { return getToken(mysqlParser.TEXT, 0); }
		public Long_flagContext long_flag() {
			return getRuleContext(Long_flagContext.class,0);
		}
		public TerminalNode BINARY() { return getToken(mysqlParser.BINARY, 0); }
		public TerminalNode VARBINARY() { return getToken(mysqlParser.VARBINARY, 0); }
		public TerminalNode LONG() { return getToken(mysqlParser.LONG, 0); }
		public String_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterString_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitString_type(this);
		}
	}

	public final String_typeContext string_type() throws RecognitionException {
		String_typeContext _localctx = new String_typeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_string_type);
		int _la;
		try {
			int _alt;
			setState(880);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				_la = _input.LA(1);
				if (_la==NATIONAL) {
					{
					setState(779);
					match(NATIONAL);
					((String_typeContext)_localctx).utf8 = true;
					}
				}

				setState(783);
				((String_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CHAR || _la==CHARACTER || _la==VARCHAR) ) {
					((String_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(785);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(784);
					length();
					}
				}

				setState(792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(790);
						switch (_input.LA(1)) {
						case AS:
						case ASCII:
						case AUTO_INCREMENT:
						case BINARY:
						case CHARACTER:
						case CHARSET:
						case CHECK:
						case COLLATE:
						case COLUMN_FORMAT:
						case COMMENT:
						case DEFAULT:
						case GENERATED:
						case KEY:
						case NOT:
						case NULL:
						case ON:
						case PRIMARY:
						case REFERENCES:
						case STORAGE:
						case STORED:
						case UNIQUE:
						case VIRTUAL:
							{
							setState(787);
							column_options();
							}
							break;
						case BYTE:
							{
							setState(788);
							match(BYTE);
							}
							break;
						case UNICODE:
							{
							setState(789);
							match(UNICODE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(794);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				_la = _input.LA(1);
				if (_la==NATIONAL) {
					{
					setState(795);
					match(NATIONAL);
					((String_typeContext)_localctx).utf8 = true;
					}
				}

				setState(799);
				_la = _input.LA(1);
				if ( !(_la==CHAR || _la==CHARACTER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(800);
				((String_typeContext)_localctx).col_type = match(VARYING);
				setState(801);
				length();
				setState(807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(805);
						switch (_input.LA(1)) {
						case AS:
						case ASCII:
						case AUTO_INCREMENT:
						case BINARY:
						case CHARACTER:
						case CHARSET:
						case CHECK:
						case COLLATE:
						case COLUMN_FORMAT:
						case COMMENT:
						case DEFAULT:
						case GENERATED:
						case KEY:
						case NOT:
						case NULL:
						case ON:
						case PRIMARY:
						case REFERENCES:
						case STORAGE:
						case STORED:
						case UNIQUE:
						case VIRTUAL:
							{
							setState(802);
							column_options();
							}
							break;
						case BYTE:
							{
							setState(803);
							match(BYTE);
							}
							break;
						case UNICODE:
							{
							setState(804);
							match(UNICODE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(809);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
				((String_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NCHAR || _la==NVARCHAR) ) {
					((String_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(812);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(811);
					length();
					}
				}

				setState(817);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(814);
						column_options();
						}
						} 
					}
					setState(819);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				((String_typeContext)_localctx).utf8 = true;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(821);
				match(NCHAR);
				setState(822);
				((String_typeContext)_localctx).col_type = match(VARCHAR);
				setState(824);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(823);
					length();
					}
				}

				setState(829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(826);
						column_options();
						}
						} 
					}
					setState(831);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				((String_typeContext)_localctx).utf8 = true;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(833);
				((String_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LONGTEXT || _la==MEDIUMTEXT || _la==TINYTEXT) ) {
					((String_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(839);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(837);
						switch (_input.LA(1)) {
						case AS:
						case ASCII:
						case AUTO_INCREMENT:
						case BINARY:
						case CHARACTER:
						case CHARSET:
						case CHECK:
						case COLLATE:
						case COLUMN_FORMAT:
						case COMMENT:
						case DEFAULT:
						case GENERATED:
						case KEY:
						case NOT:
						case NULL:
						case ON:
						case PRIMARY:
						case REFERENCES:
						case STORAGE:
						case STORED:
						case UNIQUE:
						case VIRTUAL:
							{
							setState(834);
							column_options();
							}
							break;
						case BYTE:
							{
							setState(835);
							match(BYTE);
							}
							break;
						case UNICODE:
							{
							setState(836);
							match(UNICODE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(841);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(842);
				((String_typeContext)_localctx).col_type = match(TEXT);
				setState(844);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(843);
					length();
					}
				}

				setState(851);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(849);
						switch (_input.LA(1)) {
						case AS:
						case ASCII:
						case AUTO_INCREMENT:
						case BINARY:
						case CHARACTER:
						case CHARSET:
						case CHECK:
						case COLLATE:
						case COLUMN_FORMAT:
						case COMMENT:
						case DEFAULT:
						case GENERATED:
						case KEY:
						case NOT:
						case NULL:
						case ON:
						case PRIMARY:
						case REFERENCES:
						case STORAGE:
						case STORED:
						case UNIQUE:
						case VIRTUAL:
							{
							setState(846);
							column_options();
							}
							break;
						case BYTE:
							{
							setState(847);
							match(BYTE);
							}
							break;
						case UNICODE:
							{
							setState(848);
							match(UNICODE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(853);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(854);
				long_flag();
				setState(855);
				((String_typeContext)_localctx).col_type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BINARY || _la==VARCHAR) ) {
					((String_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(858);
						switch (_input.LA(1)) {
						case AS:
						case ASCII:
						case AUTO_INCREMENT:
						case BINARY:
						case CHARACTER:
						case CHARSET:
						case CHECK:
						case COLLATE:
						case COLUMN_FORMAT:
						case COMMENT:
						case DEFAULT:
						case GENERATED:
						case KEY:
						case NOT:
						case NULL:
						case ON:
						case PRIMARY:
						case REFERENCES:
						case STORAGE:
						case STORED:
						case UNIQUE:
						case VIRTUAL:
							{
							setState(856);
							column_options();
							}
							break;
						case UNICODE:
							{
							setState(857);
							match(UNICODE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(862);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(863);
				long_flag();
				setState(864);
				((String_typeContext)_localctx).col_type = match(VARBINARY);
				setState(868);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(865);
						column_options();
						}
						} 
					}
					setState(870);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(871);
				((String_typeContext)_localctx).col_type = match(LONG);
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(875);
						switch (_input.LA(1)) {
						case AS:
						case ASCII:
						case AUTO_INCREMENT:
						case BINARY:
						case CHARACTER:
						case CHARSET:
						case CHECK:
						case COLLATE:
						case COLUMN_FORMAT:
						case COMMENT:
						case DEFAULT:
						case GENERATED:
						case KEY:
						case NOT:
						case NULL:
						case ON:
						case PRIMARY:
						case REFERENCES:
						case STORAGE:
						case STORED:
						case UNIQUE:
						case VIRTUAL:
							{
							setState(872);
							column_options();
							}
							break;
						case BYTE:
							{
							setState(873);
							match(BYTE);
							}
							break;
						case UNICODE:
							{
							setState(874);
							match(UNICODE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(879);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Long_flagContext extends ParserRuleContext {
		public TerminalNode LONG() { return getToken(mysqlParser.LONG, 0); }
		public Long_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_long_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterLong_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitLong_flag(this);
		}
	}

	public final Long_flagContext long_flag() throws RecognitionException {
		Long_flagContext _localctx = new Long_flagContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_long_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(LONG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerated_typeContext extends ParserRuleContext {
		public Token col_type;
		public Enumerated_valuesContext enumerated_values() {
			return getRuleContext(Enumerated_valuesContext.class,0);
		}
		public TerminalNode ENUM() { return getToken(mysqlParser.ENUM, 0); }
		public TerminalNode SET() { return getToken(mysqlParser.SET, 0); }
		public List<Column_optionsContext> column_options() {
			return getRuleContexts(Column_optionsContext.class);
		}
		public Column_optionsContext column_options(int i) {
			return getRuleContext(Column_optionsContext.class,i);
		}
		public Enumerated_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerated_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterEnumerated_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitEnumerated_type(this);
		}
	}

	public final Enumerated_typeContext enumerated_type() throws RecognitionException {
		Enumerated_typeContext _localctx = new Enumerated_typeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_enumerated_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			((Enumerated_typeContext)_localctx).col_type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ENUM || _la==SET) ) {
				((Enumerated_typeContext)_localctx).col_type = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(885);
			match(T__0);
			setState(886);
			enumerated_values();
			setState(887);
			match(T__7);
			setState(891);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(888);
					column_options();
					}
					} 
				}
				setState(893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_optionsContext extends ParserRuleContext {
		public NullabilityContext nullability() {
			return getRuleContext(NullabilityContext.class,0);
		}
		public Charset_defContext charset_def() {
			return getRuleContext(Charset_defContext.class,0);
		}
		public CollationContext collation() {
			return getRuleContext(CollationContext.class,0);
		}
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public Primary_keyContext primary_key() {
			return getRuleContext(Primary_keyContext.class,0);
		}
		public TerminalNode ON() { return getToken(mysqlParser.ON, 0); }
		public TerminalNode UPDATE() { return getToken(mysqlParser.UPDATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(mysqlParser.CURRENT_TIMESTAMP, 0); }
		public Now_functionContext now_function() {
			return getRuleContext(Now_functionContext.class,0);
		}
		public Current_timestamp_lengthContext current_timestamp_length() {
			return getRuleContext(Current_timestamp_lengthContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(mysqlParser.UNIQUE, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public TerminalNode AUTO_INCREMENT() { return getToken(mysqlParser.AUTO_INCREMENT, 0); }
		public TerminalNode BINARY() { return getToken(mysqlParser.BINARY, 0); }
		public TerminalNode COMMENT() { return getToken(mysqlParser.COMMENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode COLUMN_FORMAT() { return getToken(mysqlParser.COLUMN_FORMAT, 0); }
		public TerminalNode FIXED() { return getToken(mysqlParser.FIXED, 0); }
		public TerminalNode DYNAMIC() { return getToken(mysqlParser.DYNAMIC, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public TerminalNode STORAGE() { return getToken(mysqlParser.STORAGE, 0); }
		public TerminalNode DISK() { return getToken(mysqlParser.DISK, 0); }
		public TerminalNode MEMORY() { return getToken(mysqlParser.MEMORY, 0); }
		public TerminalNode VIRTUAL() { return getToken(mysqlParser.VIRTUAL, 0); }
		public TerminalNode STORED() { return getToken(mysqlParser.STORED, 0); }
		public TerminalNode AS() { return getToken(mysqlParser.AS, 0); }
		public Skip_parensContext skip_parens() {
			return getRuleContext(Skip_parensContext.class,0);
		}
		public TerminalNode GENERATED() { return getToken(mysqlParser.GENERATED, 0); }
		public TerminalNode ALWAYS() { return getToken(mysqlParser.ALWAYS, 0); }
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(mysqlParser.CHECK, 0); }
		public Column_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterColumn_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitColumn_options(this);
		}
	}

	public final Column_optionsContext column_options() throws RecognitionException {
		Column_optionsContext _localctx = new Column_optionsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_column_options);
		int _la;
		try {
			setState(931);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
				nullability();
				}
				break;
			case ASCII:
			case CHARACTER:
			case CHARSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(895);
				charset_def();
				}
				break;
			case COLLATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(896);
				collation();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(897);
				default_value();
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 5);
				{
				setState(898);
				primary_key();
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 6);
				{
				setState(899);
				match(ON);
				setState(900);
				match(UPDATE);
				setState(906);
				switch (_input.LA(1)) {
				case CURRENT_TIMESTAMP:
					{
					setState(901);
					match(CURRENT_TIMESTAMP);
					setState(903);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(902);
						current_timestamp_length();
						}
					}

					}
					break;
				case NOW:
					{
					setState(905);
					now_function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(908);
				match(UNIQUE);
				setState(910);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(909);
					match(KEY);
					}
					break;
				}
				}
				break;
			case KEY:
				enterOuterAlt(_localctx, 8);
				{
				setState(912);
				match(KEY);
				}
				break;
			case AUTO_INCREMENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(913);
				match(AUTO_INCREMENT);
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 10);
				{
				setState(914);
				match(BINARY);
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 11);
				{
				setState(915);
				match(COMMENT);
				setState(916);
				string_literal();
				}
				break;
			case COLUMN_FORMAT:
				enterOuterAlt(_localctx, 12);
				{
				setState(917);
				match(COLUMN_FORMAT);
				setState(918);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (DEFAULT - 58)) | (1L << (DYNAMIC - 58)) | (1L << (FIXED - 58)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case STORAGE:
				enterOuterAlt(_localctx, 13);
				{
				setState(919);
				match(STORAGE);
				setState(920);
				_la = _input.LA(1);
				if ( !(_la==DEFAULT || _la==DISK || _la==MEMORY) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case STORED:
			case VIRTUAL:
				enterOuterAlt(_localctx, 14);
				{
				setState(921);
				_la = _input.LA(1);
				if ( !(_la==STORED || _la==VIRTUAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case AS:
			case GENERATED:
				enterOuterAlt(_localctx, 15);
				{
				setState(924);
				_la = _input.LA(1);
				if (_la==GENERATED) {
					{
					setState(922);
					match(GENERATED);
					setState(923);
					match(ALWAYS);
					}
				}

				setState(926);
				match(AS);
				setState(927);
				skip_parens();
				}
				break;
			case REFERENCES:
				enterOuterAlt(_localctx, 16);
				{
				setState(928);
				reference_definition();
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 17);
				{
				setState(929);
				match(CHECK);
				setState(930);
				skip_parens();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_keyContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(mysqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public Primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterPrimary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitPrimary_key(this);
		}
	}

	public final Primary_keyContext primary_key() throws RecognitionException {
		Primary_keyContext _localctx = new Primary_keyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_primary_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(PRIMARY);
			setState(934);
			match(KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerated_valuesContext extends ParserRuleContext {
		public List<Enum_valueContext> enum_value() {
			return getRuleContexts(Enum_valueContext.class);
		}
		public Enum_valueContext enum_value(int i) {
			return getRuleContext(Enum_valueContext.class,i);
		}
		public Enumerated_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerated_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterEnumerated_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitEnumerated_values(this);
		}
	}

	public final Enumerated_valuesContext enumerated_values() throws RecognitionException {
		Enumerated_valuesContext _localctx = new Enumerated_valuesContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_enumerated_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			enum_value();
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(937);
				match(T__6);
				setState(938);
				enum_value();
				}
				}
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_valueContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Enum_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterEnum_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitEnum_value(this);
		}
	}

	public final Enum_valueContext enum_value() throws RecognitionException {
		Enum_valueContext _localctx = new Enum_valueContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_enum_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Charset_defContext extends ParserRuleContext {
		public Character_setContext character_set() {
			return getRuleContext(Character_setContext.class,0);
		}
		public TerminalNode ASCII() { return getToken(mysqlParser.ASCII, 0); }
		public Charset_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCharset_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCharset_def(this);
		}
	}

	public final Charset_defContext charset_def() throws RecognitionException {
		Charset_defContext _localctx = new Charset_defContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_charset_def);
		try {
			setState(948);
			switch (_input.LA(1)) {
			case CHARACTER:
			case CHARSET:
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				character_set();
				}
				break;
			case ASCII:
				enterOuterAlt(_localctx, 2);
				{
				setState(947);
				match(ASCII);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Character_setContext extends ParserRuleContext {
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode CHARSET() { return getToken(mysqlParser.CHARSET, 0); }
		public TerminalNode CHARACTER() { return getToken(mysqlParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(mysqlParser.SET, 0); }
		public Character_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCharacter_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCharacter_set(this);
		}
	}

	public final Character_setContext character_set() throws RecognitionException {
		Character_setContext _localctx = new Character_setContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_character_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			switch (_input.LA(1)) {
			case CHARACTER:
				{
				{
				setState(950);
				match(CHARACTER);
				setState(951);
				match(SET);
				}
				}
				break;
			case CHARSET:
				{
				setState(952);
				match(CHARSET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(955);
			charset_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullabilityContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(mysqlParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(mysqlParser.NULL, 0); }
		public NullabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterNullability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitNullability(this);
		}
	}

	public final NullabilityContext nullability() throws RecognitionException {
		NullabilityContext _localctx = new NullabilityContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_nullability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(957);
				match(NOT);
				setState(958);
				match(NULL);
				}
				break;
			case NULL:
				{
				setState(959);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(mysqlParser.CURRENT_TIMESTAMP, 0); }
		public Now_functionContext now_function() {
			return getRuleContext(Now_functionContext.class,0);
		}
		public Localtime_functionContext localtime_function() {
			return getRuleContext(Localtime_functionContext.class,0);
		}
		public Current_timestamp_lengthContext current_timestamp_length() {
			return getRuleContext(Current_timestamp_lengthContext.class,0);
		}
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDefault_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDefault_value(this);
		}
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_default_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(DEFAULT);
			setState(970);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__4:
			case FALSE:
			case NULL:
			case TRUE:
			case STRING_LITERAL:
			case DBL_STRING_LITERAL:
			case INTEGER_LITERAL:
				{
				setState(963);
				literal();
				}
				break;
			case CURRENT_TIMESTAMP:
				{
				setState(964);
				match(CURRENT_TIMESTAMP);
				setState(966);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(965);
					current_timestamp_length();
					}
				}

				}
				break;
			case NOW:
				{
				setState(968);
				now_function();
				}
				break;
			case LOCALTIME:
			case LOCALTIMESTAMP:
				{
				setState(969);
				localtime_function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitLength(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(T__0);
			setState(973);
			match(INTEGER_LITERAL);
			setState(974);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_flagsContext extends ParserRuleContext {
		public TerminalNode SIGNED() { return getToken(mysqlParser.SIGNED, 0); }
		public TerminalNode UNSIGNED() { return getToken(mysqlParser.UNSIGNED, 0); }
		public TerminalNode ZEROFILL() { return getToken(mysqlParser.ZEROFILL, 0); }
		public Int_flagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_flags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterInt_flags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitInt_flags(this);
		}
	}

	public final Int_flagsContext int_flags() throws RecognitionException {
		Int_flagsContext _localctx = new Int_flagsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_int_flags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_la = _input.LA(1);
			if ( !(((((_la - 177)) & ~0x3f) == 0 && ((1L << (_la - 177)) & ((1L << (SIGNED - 177)) | (1L << (UNSIGNED - 177)) | (1L << (ZEROFILL - 177)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decimal_lengthContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(mysqlParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(mysqlParser.INTEGER_LITERAL, i);
		}
		public Decimal_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDecimal_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDecimal_length(this);
		}
	}

	public final Decimal_lengthContext decimal_length() throws RecognitionException {
		Decimal_lengthContext _localctx = new Decimal_lengthContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_decimal_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(T__0);
			setState(979);
			match(INTEGER_LITERAL);
			setState(982);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(980);
				match(T__6);
				setState(981);
				match(INTEGER_LITERAL);
				}
			}

			setState(984);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Now_functionContext extends ParserRuleContext {
		public TerminalNode NOW() { return getToken(mysqlParser.NOW, 0); }
		public Now_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_now_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterNow_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitNow_function(this);
		}
	}

	public final Now_functionContext now_function() throws RecognitionException {
		Now_functionContext _localctx = new Now_functionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_now_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(NOW);
			setState(987);
			match(T__0);
			setState(988);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Current_timestamp_lengthContext extends ParserRuleContext {
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public Current_timestamp_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_current_timestamp_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCurrent_timestamp_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCurrent_timestamp_length(this);
		}
	}

	public final Current_timestamp_lengthContext current_timestamp_length() throws RecognitionException {
		Current_timestamp_lengthContext _localctx = new Current_timestamp_lengthContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_current_timestamp_length);
		try {
			setState(993);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				length();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				match(T__0);
				setState(992);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Localtime_functionContext extends ParserRuleContext {
		public TerminalNode LOCALTIME() { return getToken(mysqlParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(mysqlParser.LOCALTIMESTAMP, 0); }
		public Localtime_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localtime_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterLocaltime_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitLocaltime_function(this);
		}
	}

	public final Localtime_functionContext localtime_function() throws RecognitionException {
		Localtime_functionContext _localctx = new Localtime_functionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_localtime_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			_la = _input.LA(1);
			if ( !(_la==LOCALTIME || _la==LOCALTIMESTAMP) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(998);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(996);
				match(T__0);
				setState(997);
				match(T__7);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_byContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(mysqlParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(mysqlParser.BY, 0); }
		public Partition_by_whatContext partition_by_what() {
			return getRuleContext(Partition_by_whatContext.class,0);
		}
		public Partition_countContext partition_count() {
			return getRuleContext(Partition_countContext.class,0);
		}
		public Subpartition_byContext subpartition_by() {
			return getRuleContext(Subpartition_byContext.class,0);
		}
		public Partition_definitionsContext partition_definitions() {
			return getRuleContext(Partition_definitionsContext.class,0);
		}
		public Partition_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterPartition_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitPartition_by(this);
		}
	}

	public final Partition_byContext partition_by() throws RecognitionException {
		Partition_byContext _localctx = new Partition_byContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_partition_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(PARTITION);
			setState(1001);
			match(BY);
			setState(1002);
			partition_by_what();
			setState(1004);
			_la = _input.LA(1);
			if (_la==PARTITIONS) {
				{
				setState(1003);
				partition_count();
				}
			}

			setState(1007);
			_la = _input.LA(1);
			if (_la==SUBPARTITION) {
				{
				setState(1006);
				subpartition_by();
				}
			}

			setState(1010);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1009);
				partition_definitions();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_by_whatContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(mysqlParser.HASH, 0); }
		public Skip_parensContext skip_parens() {
			return getRuleContext(Skip_parensContext.class,0);
		}
		public TerminalNode LINEAR() { return getToken(mysqlParser.LINEAR, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public TerminalNode ALGORITHM() { return getToken(mysqlParser.ALGORITHM, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public TerminalNode RANGE() { return getToken(mysqlParser.RANGE, 0); }
		public TerminalNode COLUMNS() { return getToken(mysqlParser.COLUMNS, 0); }
		public TerminalNode LIST() { return getToken(mysqlParser.LIST, 0); }
		public Partition_by_whatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_by_what; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterPartition_by_what(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitPartition_by_what(this);
		}
	}

	public final Partition_by_whatContext partition_by_what() throws RecognitionException {
		Partition_by_whatContext _localctx = new Partition_by_whatContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_partition_by_what);
		int _la;
		try {
			setState(1037);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1013);
				_la = _input.LA(1);
				if (_la==LINEAR) {
					{
					setState(1012);
					match(LINEAR);
					}
				}

				setState(1015);
				match(HASH);
				setState(1016);
				skip_parens();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1018);
				_la = _input.LA(1);
				if (_la==LINEAR) {
					{
					setState(1017);
					match(LINEAR);
					}
				}

				setState(1020);
				match(KEY);
				setState(1024);
				_la = _input.LA(1);
				if (_la==ALGORITHM) {
					{
					setState(1021);
					match(ALGORITHM);
					setState(1022);
					match(T__5);
					setState(1023);
					match(INTEGER_LITERAL);
					}
				}

				setState(1026);
				skip_parens();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1027);
				match(RANGE);
				setState(1029);
				_la = _input.LA(1);
				if (_la==COLUMNS) {
					{
					setState(1028);
					match(COLUMNS);
					}
				}

				setState(1031);
				skip_parens();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1032);
				match(LIST);
				setState(1034);
				_la = _input.LA(1);
				if (_la==COLUMNS) {
					{
					setState(1033);
					match(COLUMNS);
					}
				}

				setState(1036);
				skip_parens();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subpartition_byContext extends ParserRuleContext {
		public TerminalNode SUBPARTITION() { return getToken(mysqlParser.SUBPARTITION, 0); }
		public TerminalNode BY() { return getToken(mysqlParser.BY, 0); }
		public Partition_by_whatContext partition_by_what() {
			return getRuleContext(Partition_by_whatContext.class,0);
		}
		public TerminalNode SUBPARTITIONS() { return getToken(mysqlParser.SUBPARTITIONS, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public Subpartition_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpartition_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterSubpartition_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitSubpartition_by(this);
		}
	}

	public final Subpartition_byContext subpartition_by() throws RecognitionException {
		Subpartition_byContext _localctx = new Subpartition_byContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_subpartition_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			match(SUBPARTITION);
			setState(1040);
			match(BY);
			setState(1041);
			partition_by_what();
			setState(1044);
			_la = _input.LA(1);
			if (_la==SUBPARTITIONS) {
				{
				setState(1042);
				match(SUBPARTITIONS);
				setState(1043);
				match(INTEGER_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_countContext extends ParserRuleContext {
		public TerminalNode PARTITIONS() { return getToken(mysqlParser.PARTITIONS, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public Partition_countContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_count; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterPartition_count(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitPartition_count(this);
		}
	}

	public final Partition_countContext partition_count() throws RecognitionException {
		Partition_countContext _localctx = new Partition_countContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_partition_count);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			match(PARTITIONS);
			setState(1047);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_definitionsContext extends ParserRuleContext {
		public Skip_parens_inside_partition_definitionsContext skip_parens_inside_partition_definitions() {
			return getRuleContext(Skip_parens_inside_partition_definitionsContext.class,0);
		}
		public Partition_definitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterPartition_definitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitPartition_definitions(this);
		}
	}

	public final Partition_definitionsContext partition_definitions() throws RecognitionException {
		Partition_definitionsContext _localctx = new Partition_definitionsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_partition_definitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1049);
			match(T__0);
			setState(1050);
			skip_parens_inside_partition_definitions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Skip_parens_inside_partition_definitionsContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(mysqlParser.PARTITION, 0); }
		public TerminalNode MAXWELL_ELIDED_PARSE_ISSUE() { return getToken(mysqlParser.MAXWELL_ELIDED_PARSE_ISSUE, 0); }
		public Skip_parens_inside_partition_definitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skip_parens_inside_partition_definitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterSkip_parens_inside_partition_definitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitSkip_parens_inside_partition_definitions(this);
		}
	}

	public final Skip_parens_inside_partition_definitionsContext skip_parens_inside_partition_definitions() throws RecognitionException {
		Skip_parens_inside_partition_definitionsContext _localctx = new Skip_parens_inside_partition_definitionsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_skip_parens_inside_partition_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			_la = _input.LA(1);
			if ( !(_la==PARTITION || _la==MAXWELL_ELIDED_PARSE_ISSUE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_databaseContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(mysqlParser.ALTER, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Alter_database_definitionContext alter_database_definition() {
			return getRuleContext(Alter_database_definitionContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(mysqlParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(mysqlParser.SCHEMA, 0); }
		public Alter_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_database(this);
		}
	}

	public final Alter_databaseContext alter_database() throws RecognitionException {
		Alter_databaseContext _localctx = new Alter_databaseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_alter_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			match(ALTER);
			setState(1055);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1056);
			name();
			setState(1057);
			alter_database_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_database_definitionContext extends ParserRuleContext {
		public List<Default_character_setContext> default_character_set() {
			return getRuleContexts(Default_character_setContext.class);
		}
		public Default_character_setContext default_character_set(int i) {
			return getRuleContext(Default_character_setContext.class,i);
		}
		public List<Default_collationContext> default_collation() {
			return getRuleContexts(Default_collationContext.class);
		}
		public Default_collationContext default_collation(int i) {
			return getRuleContext(Default_collationContext.class,i);
		}
		public TerminalNode UPGRADE() { return getToken(mysqlParser.UPGRADE, 0); }
		public TerminalNode DATA() { return getToken(mysqlParser.DATA, 0); }
		public TerminalNode DIRECTORY() { return getToken(mysqlParser.DIRECTORY, 0); }
		public TerminalNode NAME() { return getToken(mysqlParser.NAME, 0); }
		public Alter_database_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_database_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_database_definition(this);
		}
	}

	public final Alter_database_definitionContext alter_database_definition() throws RecognitionException {
		Alter_database_definitionContext _localctx = new Alter_database_definitionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_alter_database_definition);
		int _la;
		try {
			setState(1069);
			switch (_input.LA(1)) {
			case CHAR:
			case CHARACTER:
			case CHARSET:
			case COLLATE:
			case DEFAULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1061);
					switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
					case 1:
						{
						setState(1059);
						default_character_set();
						}
						break;
					case 2:
						{
						setState(1060);
						default_collation();
						}
						break;
					}
					}
					setState(1063); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CHARACTER) | (1L << CHARSET) | (1L << COLLATE) | (1L << DEFAULT))) != 0) );
				}
				break;
			case UPGRADE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065);
				match(UPGRADE);
				setState(1066);
				match(DATA);
				setState(1067);
				match(DIRECTORY);
				setState(1068);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_databaseContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(mysqlParser.CREATE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(mysqlParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(mysqlParser.SCHEMA, 0); }
		public If_not_existsContext if_not_exists() {
			return getRuleContext(If_not_existsContext.class,0);
		}
		public List<Default_character_setContext> default_character_set() {
			return getRuleContexts(Default_character_setContext.class);
		}
		public Default_character_setContext default_character_set(int i) {
			return getRuleContext(Default_character_setContext.class,i);
		}
		public List<Default_collationContext> default_collation() {
			return getRuleContexts(Default_collationContext.class);
		}
		public Default_collationContext default_collation(int i) {
			return getRuleContext(Default_collationContext.class,i);
		}
		public Create_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_database(this);
		}
	}

	public final Create_databaseContext create_database() throws RecognitionException {
		Create_databaseContext _localctx = new Create_databaseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_create_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			match(CREATE);
			setState(1072);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1074);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1073);
				if_not_exists();
				}
			}

			setState(1076);
			name();
			setState(1081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR) | (1L << CHARACTER) | (1L << CHARSET) | (1L << COLLATE) | (1L << DEFAULT))) != 0)) {
				{
				setState(1079);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(1077);
					default_character_set();
					}
					break;
				case 2:
					{
					setState(1078);
					default_collation();
					}
					break;
				}
				}
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_tableContext extends ParserRuleContext {
		public Create_table_preambleContext create_table_preamble() {
			return getRuleContext(Create_table_preambleContext.class,0);
		}
		public Create_specificationsContext create_specifications() {
			return getRuleContext(Create_specificationsContext.class,0);
		}
		public Create_like_tblContext create_like_tbl() {
			return getRuleContext(Create_like_tblContext.class,0);
		}
		public List<Table_creation_optionContext> table_creation_option() {
			return getRuleContexts(Table_creation_optionContext.class);
		}
		public Table_creation_optionContext table_creation_option(int i) {
			return getRuleContext(Table_creation_optionContext.class,i);
		}
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_table(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_create_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			create_table_preamble();
			setState(1096);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1085);
				create_specifications();
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << CHARACTER) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COLLATE) | (1L << COMMENT) | (1L << CONNECTION) | (1L << DATA) | (1L << DEFAULT) | (1L << DELAY_KEY_WRITE))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (ENGINE - 71)) | (1L << (INDEX - 71)) | (1L << (INSERT_METHOD - 71)) | (1L << (KEY_BLOCK_SIZE - 71)) | (1L << (MAX_ROWS - 71)) | (1L << (MIN_ROWS - 71)))) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & ((1L << (PACK_KEYS - 149)) | (1L << (PARTITION - 149)) | (1L << (PASSWORD - 149)) | (1L << (ROW_FORMAT - 149)) | (1L << (STATS_AUTO_RECALC - 149)) | (1L << (STATS_PERSISTENT - 149)) | (1L << (STATS_SAMPLE_PAGES - 149)) | (1L << (STORAGE - 149)) | (1L << (TABLESPACE - 149)) | (1L << (UNION - 149)))) != 0)) {
					{
					{
					setState(1086);
					table_creation_option();
					setState(1088);
					_la = _input.LA(1);
					if (_la==T__6) {
						{
						setState(1087);
						match(T__6);
						}
					}

					}
					}
					setState(1094);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1095);
				create_like_tbl();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preambleContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(mysqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(mysqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(mysqlParser.TEMPORARY, 0); }
		public If_not_existsContext if_not_exists() {
			return getRuleContext(If_not_existsContext.class,0);
		}
		public Create_table_preambleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preamble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_table_preamble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_table_preamble(this);
		}
	}

	public final Create_table_preambleContext create_table_preamble() throws RecognitionException {
		Create_table_preambleContext _localctx = new Create_table_preambleContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_create_table_preamble);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			match(CREATE);
			setState(1100);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1099);
				match(TEMPORARY);
				}
			}

			setState(1102);
			match(TABLE);
			setState(1104);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1103);
				if_not_exists();
				}
			}

			setState(1106);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_specificationsContext extends ParserRuleContext {
		public List<Create_specificationContext> create_specification() {
			return getRuleContexts(Create_specificationContext.class);
		}
		public Create_specificationContext create_specification(int i) {
			return getRuleContext(Create_specificationContext.class,i);
		}
		public Create_specificationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_specifications; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_specifications(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_specifications(this);
		}
	}

	public final Create_specificationsContext create_specifications() throws RecognitionException {
		Create_specificationsContext _localctx = new Create_specificationsContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_create_specifications);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			match(T__0);
			setState(1109);
			create_specification();
			setState(1114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(1110);
				match(T__6);
				setState(1111);
				create_specification();
				}
				}
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1117);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_specificationContext extends ParserRuleContext {
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public Index_definitionContext index_definition() {
			return getRuleContext(Index_definitionContext.class,0);
		}
		public Create_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_specification(this);
		}
	}

	public final Create_specificationContext create_specification() throws RecognitionException {
		Create_specificationContext _localctx = new Create_specificationContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_create_specification);
		try {
			setState(1121);
			switch (_input.LA(1)) {
			case ACTION:
			case AFTER:
			case ALGORITHM:
			case ALWAYS:
			case ASCII:
			case AUTO_INCREMENT:
			case AVG_ROW_LENGTH:
			case BEGIN:
			case BIT:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BYTE:
			case CHARSET:
			case CHECKSUM:
			case COALESCE:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COMMENT:
			case COMPACT:
			case COMPRESSED:
			case CONNECTION:
			case COPY:
			case DATA:
			case DATE:
			case DATETIME:
			case DEFINER:
			case DELAY_KEY_WRITE:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DYNAMIC:
			case ENABLE:
			case ENGINE:
			case ENUM:
			case EXCHANGE:
			case EXCLUSIVE:
			case FIRST:
			case FIXED:
			case FULL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case HASH:
			case IMPORT:
			case INPLACE:
			case INSERT_METHOD:
			case INVOKER:
			case JSON:
			case KEY_BLOCK_SIZE:
			case LAST:
			case LINESTRING:
			case LIST:
			case MAX_ROWS:
			case MEMORY:
			case MERGE:
			case MIN_ROWS:
			case MODIFY:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case NAME:
			case NATIONAL:
			case NCHAR:
			case NO:
			case NONE:
			case NOW:
			case NVARCHAR:
			case OFFLINE:
			case ONLINE:
			case PACK_KEYS:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case POINT:
			case POLYGON:
			case REBUILD:
			case REDUNDANT:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case ROW_FORMAT:
			case SECURITY:
			case SERIAL:
			case SHARED:
			case SIGNED:
			case SIMPLE:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STORAGE:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case TABLESPACE:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case TIME:
			case TIMESTAMP:
			case TRUNCATE:
			case UNDEFINED:
			case UNICODE:
			case UPGRADE:
			case VALIDATION:
			case VIEW:
			case WITHOUT:
			case YEAR:
			case DBL_STRING_LITERAL:
			case INTEGER_LITERAL:
			case IDENT:
			case QUOTED_IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1119);
				column_definition();
				}
				break;
			case CHECK:
			case CONSTRAINT:
			case FOREIGN:
			case FULLTEXT:
			case INDEX:
			case KEY:
			case PRIMARY:
			case SPATIAL:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1120);
				index_definition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_like_tblContext extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(mysqlParser.LIKE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_like_tblContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_like_tbl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_like_tbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_like_tbl(this);
		}
	}

	public final Create_like_tblContext create_like_tbl() throws RecognitionException {
		Create_like_tblContext _localctx = new Create_like_tblContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_create_like_tbl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1123);
				match(T__0);
				}
			}

			setState(1126);
			match(LIKE);
			setState(1127);
			table_name();
			setState(1129);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(1128);
				match(T__7);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_creation_optionContext extends ParserRuleContext {
		public Creation_engineContext creation_engine() {
			return getRuleContext(Creation_engineContext.class,0);
		}
		public Creation_auto_incrementContext creation_auto_increment() {
			return getRuleContext(Creation_auto_incrementContext.class,0);
		}
		public Creation_avg_row_lengthContext creation_avg_row_length() {
			return getRuleContext(Creation_avg_row_lengthContext.class,0);
		}
		public Creation_character_setContext creation_character_set() {
			return getRuleContext(Creation_character_setContext.class,0);
		}
		public Creation_checksumContext creation_checksum() {
			return getRuleContext(Creation_checksumContext.class,0);
		}
		public Creation_collationContext creation_collation() {
			return getRuleContext(Creation_collationContext.class,0);
		}
		public Creation_commentContext creation_comment() {
			return getRuleContext(Creation_commentContext.class,0);
		}
		public Creation_connectionContext creation_connection() {
			return getRuleContext(Creation_connectionContext.class,0);
		}
		public Creation_data_directoryContext creation_data_directory() {
			return getRuleContext(Creation_data_directoryContext.class,0);
		}
		public Creation_delay_key_writeContext creation_delay_key_write() {
			return getRuleContext(Creation_delay_key_writeContext.class,0);
		}
		public Creation_index_directoryContext creation_index_directory() {
			return getRuleContext(Creation_index_directoryContext.class,0);
		}
		public Creation_insert_methodContext creation_insert_method() {
			return getRuleContext(Creation_insert_methodContext.class,0);
		}
		public Creation_key_block_sizeContext creation_key_block_size() {
			return getRuleContext(Creation_key_block_sizeContext.class,0);
		}
		public Creation_max_rowsContext creation_max_rows() {
			return getRuleContext(Creation_max_rowsContext.class,0);
		}
		public Creation_min_rowsContext creation_min_rows() {
			return getRuleContext(Creation_min_rowsContext.class,0);
		}
		public Creation_pack_keysContext creation_pack_keys() {
			return getRuleContext(Creation_pack_keysContext.class,0);
		}
		public Creation_passwordContext creation_password() {
			return getRuleContext(Creation_passwordContext.class,0);
		}
		public Creation_row_formatContext creation_row_format() {
			return getRuleContext(Creation_row_formatContext.class,0);
		}
		public Creation_stats_auto_recalcContext creation_stats_auto_recalc() {
			return getRuleContext(Creation_stats_auto_recalcContext.class,0);
		}
		public Creation_stats_persistentContext creation_stats_persistent() {
			return getRuleContext(Creation_stats_persistentContext.class,0);
		}
		public Creation_stats_sample_pagesContext creation_stats_sample_pages() {
			return getRuleContext(Creation_stats_sample_pagesContext.class,0);
		}
		public Creation_storage_optionContext creation_storage_option() {
			return getRuleContext(Creation_storage_optionContext.class,0);
		}
		public Creation_tablespaceContext creation_tablespace() {
			return getRuleContext(Creation_tablespaceContext.class,0);
		}
		public Creation_unionContext creation_union() {
			return getRuleContext(Creation_unionContext.class,0);
		}
		public Partition_byContext partition_by() {
			return getRuleContext(Partition_byContext.class,0);
		}
		public Table_creation_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_creation_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterTable_creation_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitTable_creation_option(this);
		}
	}

	public final Table_creation_optionContext table_creation_option() throws RecognitionException {
		Table_creation_optionContext _localctx = new Table_creation_optionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_table_creation_option);
		try {
			setState(1156);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				creation_engine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				creation_auto_increment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1133);
				creation_avg_row_length();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1134);
				creation_character_set();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1135);
				creation_checksum();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1136);
				creation_collation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1137);
				creation_comment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1138);
				creation_connection();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1139);
				creation_data_directory();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1140);
				creation_delay_key_write();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1141);
				creation_index_directory();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1142);
				creation_insert_method();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1143);
				creation_key_block_size();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1144);
				creation_max_rows();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1145);
				creation_min_rows();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1146);
				creation_pack_keys();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1147);
				creation_password();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1148);
				creation_row_format();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1149);
				creation_stats_auto_recalc();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1150);
				creation_stats_persistent();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1151);
				creation_stats_sample_pages();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1152);
				creation_storage_option();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1153);
				creation_tablespace();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1154);
				creation_union();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1155);
				partition_by();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_engineContext extends ParserRuleContext {
		public TerminalNode ENGINE() { return getToken(mysqlParser.ENGINE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public TerminalNode MEMORY() { return getToken(mysqlParser.MEMORY, 0); }
		public TerminalNode MERGE() { return getToken(mysqlParser.MERGE, 0); }
		public Creation_engineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_engine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_engine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_engine(this);
		}
	}

	public final Creation_engineContext creation_engine() throws RecognitionException {
		Creation_engineContext _localctx = new Creation_engineContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_creation_engine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			match(ENGINE);
			setState(1160);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1159);
				match(T__5);
				}
			}

			setState(1166);
			switch (_input.LA(1)) {
			case IDENT:
			case QUOTED_IDENT:
				{
				setState(1162);
				id();
				}
				break;
			case STRING_LITERAL:
			case DBL_STRING_LITERAL:
				{
				setState(1163);
				string_literal();
				}
				break;
			case MEMORY:
				{
				setState(1164);
				match(MEMORY);
				}
				break;
			case MERGE:
				{
				setState(1165);
				match(MERGE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_auto_incrementContext extends ParserRuleContext {
		public TerminalNode AUTO_INCREMENT() { return getToken(mysqlParser.AUTO_INCREMENT, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Creation_auto_incrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_auto_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_auto_increment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_auto_increment(this);
		}
	}

	public final Creation_auto_incrementContext creation_auto_increment() throws RecognitionException {
		Creation_auto_incrementContext _localctx = new Creation_auto_incrementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_creation_auto_increment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			match(AUTO_INCREMENT);
			setState(1170);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1169);
				match(T__5);
				}
			}

			setState(1172);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_avg_row_lengthContext extends ParserRuleContext {
		public TerminalNode AVG_ROW_LENGTH() { return getToken(mysqlParser.AVG_ROW_LENGTH, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Creation_avg_row_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_avg_row_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_avg_row_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_avg_row_length(this);
		}
	}

	public final Creation_avg_row_lengthContext creation_avg_row_length() throws RecognitionException {
		Creation_avg_row_lengthContext _localctx = new Creation_avg_row_lengthContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_creation_avg_row_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(AVG_ROW_LENGTH);
			setState(1176);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1175);
				match(T__5);
				}
			}

			setState(1178);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_character_setContext extends ParserRuleContext {
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode CHARSET() { return getToken(mysqlParser.CHARSET, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public TerminalNode CHARACTER() { return getToken(mysqlParser.CHARACTER, 0); }
		public TerminalNode SET() { return getToken(mysqlParser.SET, 0); }
		public Creation_character_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_character_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_character_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_character_set(this);
		}
	}

	public final Creation_character_setContext creation_character_set() throws RecognitionException {
		Creation_character_setContext _localctx = new Creation_character_setContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_creation_character_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1180);
				match(DEFAULT);
				}
			}

			setState(1186);
			switch (_input.LA(1)) {
			case CHARACTER:
				{
				{
				setState(1183);
				match(CHARACTER);
				setState(1184);
				match(SET);
				}
				}
				break;
			case CHARSET:
				{
				setState(1185);
				match(CHARSET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1189);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1188);
				match(T__5);
				}
			}

			setState(1191);
			charset_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_checksumContext extends ParserRuleContext {
		public TerminalNode CHECKSUM() { return getToken(mysqlParser.CHECKSUM, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Creation_checksumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_checksum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_checksum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_checksum(this);
		}
	}

	public final Creation_checksumContext creation_checksum() throws RecognitionException {
		Creation_checksumContext _localctx = new Creation_checksumContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_creation_checksum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			match(CHECKSUM);
			setState(1194);
			match(T__5);
			setState(1195);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_collationContext extends ParserRuleContext {
		public Default_collationContext default_collation() {
			return getRuleContext(Default_collationContext.class,0);
		}
		public Creation_collationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_collation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_collation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_collation(this);
		}
	}

	public final Creation_collationContext creation_collation() throws RecognitionException {
		Creation_collationContext _localctx = new Creation_collationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_creation_collation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			default_collation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_commentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(mysqlParser.COMMENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Creation_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_comment(this);
		}
	}

	public final Creation_commentContext creation_comment() throws RecognitionException {
		Creation_commentContext _localctx = new Creation_commentContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_creation_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(COMMENT);
			setState(1201);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1200);
				match(T__5);
				}
			}

			setState(1203);
			string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_connectionContext extends ParserRuleContext {
		public TerminalNode CONNECTION() { return getToken(mysqlParser.CONNECTION, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Creation_connectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_connection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_connection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_connection(this);
		}
	}

	public final Creation_connectionContext creation_connection() throws RecognitionException {
		Creation_connectionContext _localctx = new Creation_connectionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_creation_connection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205);
			match(CONNECTION);
			setState(1207);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1206);
				match(T__5);
				}
			}

			setState(1209);
			string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_data_directoryContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(mysqlParser.DATA, 0); }
		public TerminalNode DIRECTORY() { return getToken(mysqlParser.DIRECTORY, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Creation_data_directoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_data_directory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_data_directory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_data_directory(this);
		}
	}

	public final Creation_data_directoryContext creation_data_directory() throws RecognitionException {
		Creation_data_directoryContext _localctx = new Creation_data_directoryContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_creation_data_directory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(DATA);
			setState(1212);
			match(DIRECTORY);
			setState(1214);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1213);
				match(T__5);
				}
			}

			setState(1216);
			string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_delay_key_writeContext extends ParserRuleContext {
		public TerminalNode DELAY_KEY_WRITE() { return getToken(mysqlParser.DELAY_KEY_WRITE, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Creation_delay_key_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_delay_key_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_delay_key_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_delay_key_write(this);
		}
	}

	public final Creation_delay_key_writeContext creation_delay_key_write() throws RecognitionException {
		Creation_delay_key_writeContext _localctx = new Creation_delay_key_writeContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_creation_delay_key_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			match(DELAY_KEY_WRITE);
			setState(1220);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1219);
				match(T__5);
				}
			}

			setState(1222);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_index_directoryContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(mysqlParser.INDEX, 0); }
		public TerminalNode DIRECTORY() { return getToken(mysqlParser.DIRECTORY, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Creation_index_directoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_index_directory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_index_directory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_index_directory(this);
		}
	}

	public final Creation_index_directoryContext creation_index_directory() throws RecognitionException {
		Creation_index_directoryContext _localctx = new Creation_index_directoryContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_creation_index_directory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			match(INDEX);
			setState(1225);
			match(DIRECTORY);
			setState(1227);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1226);
				match(T__5);
				}
			}

			setState(1229);
			string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_insert_methodContext extends ParserRuleContext {
		public TerminalNode INSERT_METHOD() { return getToken(mysqlParser.INSERT_METHOD, 0); }
		public TerminalNode NO() { return getToken(mysqlParser.NO, 0); }
		public TerminalNode FIRST() { return getToken(mysqlParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(mysqlParser.LAST, 0); }
		public Creation_insert_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_insert_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_insert_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_insert_method(this);
		}
	}

	public final Creation_insert_methodContext creation_insert_method() throws RecognitionException {
		Creation_insert_methodContext _localctx = new Creation_insert_methodContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_creation_insert_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231);
			match(INSERT_METHOD);
			setState(1233);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1232);
				match(T__5);
				}
			}

			setState(1235);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (FIRST - 77)) | (1L << (LAST - 77)) | (1L << (NO - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_key_block_sizeContext extends ParserRuleContext {
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(mysqlParser.KEY_BLOCK_SIZE, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Creation_key_block_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_key_block_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_key_block_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_key_block_size(this);
		}
	}

	public final Creation_key_block_sizeContext creation_key_block_size() throws RecognitionException {
		Creation_key_block_sizeContext _localctx = new Creation_key_block_sizeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_creation_key_block_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1237);
			match(KEY_BLOCK_SIZE);
			setState(1239);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1238);
				match(T__5);
				}
			}

			setState(1241);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_max_rowsContext extends ParserRuleContext {
		public TerminalNode MAX_ROWS() { return getToken(mysqlParser.MAX_ROWS, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Creation_max_rowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_max_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_max_rows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_max_rows(this);
		}
	}

	public final Creation_max_rowsContext creation_max_rows() throws RecognitionException {
		Creation_max_rowsContext _localctx = new Creation_max_rowsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_creation_max_rows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(MAX_ROWS);
			setState(1245);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1244);
				match(T__5);
				}
			}

			setState(1247);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_min_rowsContext extends ParserRuleContext {
		public TerminalNode MIN_ROWS() { return getToken(mysqlParser.MIN_ROWS, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Creation_min_rowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_min_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_min_rows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_min_rows(this);
		}
	}

	public final Creation_min_rowsContext creation_min_rows() throws RecognitionException {
		Creation_min_rowsContext _localctx = new Creation_min_rowsContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_creation_min_rows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			match(MIN_ROWS);
			setState(1251);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1250);
				match(T__5);
				}
			}

			setState(1253);
			integer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_pack_keysContext extends ParserRuleContext {
		public TerminalNode PACK_KEYS() { return getToken(mysqlParser.PACK_KEYS, 0); }
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public Creation_pack_keysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_pack_keys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_pack_keys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_pack_keys(this);
		}
	}

	public final Creation_pack_keysContext creation_pack_keys() throws RecognitionException {
		Creation_pack_keysContext _localctx = new Creation_pack_keysContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_creation_pack_keys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1255);
			match(PACK_KEYS);
			setState(1257);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1256);
				match(T__5);
				}
			}

			setState(1261);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
				{
				setState(1259);
				integer();
				}
				break;
			case DEFAULT:
				{
				setState(1260);
				match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_passwordContext extends ParserRuleContext {
		public TerminalNode PASSWORD() { return getToken(mysqlParser.PASSWORD, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Creation_passwordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_password; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_password(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_password(this);
		}
	}

	public final Creation_passwordContext creation_password() throws RecognitionException {
		Creation_passwordContext _localctx = new Creation_passwordContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_creation_password);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(PASSWORD);
			setState(1265);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1264);
				match(T__5);
				}
			}

			setState(1267);
			string_literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_row_formatContext extends ParserRuleContext {
		public TerminalNode ROW_FORMAT() { return getToken(mysqlParser.ROW_FORMAT, 0); }
		public List<TerminalNode> DEFAULT() { return getTokens(mysqlParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(mysqlParser.DEFAULT, i);
		}
		public TerminalNode DYNAMIC() { return getToken(mysqlParser.DYNAMIC, 0); }
		public TerminalNode FIXED() { return getToken(mysqlParser.FIXED, 0); }
		public TerminalNode COMPRESSED() { return getToken(mysqlParser.COMPRESSED, 0); }
		public TerminalNode REDUNDANT() { return getToken(mysqlParser.REDUNDANT, 0); }
		public TerminalNode COMPACT() { return getToken(mysqlParser.COMPACT, 0); }
		public Creation_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_row_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_row_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_row_format(this);
		}
	}

	public final Creation_row_formatContext creation_row_format() throws RecognitionException {
		Creation_row_formatContext _localctx = new Creation_row_formatContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_creation_row_format);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			match(ROW_FORMAT);
			setState(1271);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1270);
				match(T__5);
				}
			}

			setState(1273);
			_la = _input.LA(1);
			if ( !(((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & ((1L << (COMPACT - 44)) | (1L << (COMPRESSED - 44)) | (1L << (DEFAULT - 44)) | (1L << (DYNAMIC - 44)) | (1L << (FIXED - 44)))) != 0) || _la==REDUNDANT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_stats_auto_recalcContext extends ParserRuleContext {
		public TerminalNode STATS_AUTO_RECALC() { return getToken(mysqlParser.STATS_AUTO_RECALC, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public Creation_stats_auto_recalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_stats_auto_recalc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_stats_auto_recalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_stats_auto_recalc(this);
		}
	}

	public final Creation_stats_auto_recalcContext creation_stats_auto_recalc() throws RecognitionException {
		Creation_stats_auto_recalcContext _localctx = new Creation_stats_auto_recalcContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_creation_stats_auto_recalc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(STATS_AUTO_RECALC);
			setState(1277);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1276);
				match(T__5);
				}
			}

			setState(1279);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==INTEGER_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_stats_persistentContext extends ParserRuleContext {
		public TerminalNode STATS_PERSISTENT() { return getToken(mysqlParser.STATS_PERSISTENT, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public Creation_stats_persistentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_stats_persistent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_stats_persistent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_stats_persistent(this);
		}
	}

	public final Creation_stats_persistentContext creation_stats_persistent() throws RecognitionException {
		Creation_stats_persistentContext _localctx = new Creation_stats_persistentContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_creation_stats_persistent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			match(STATS_PERSISTENT);
			setState(1283);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1282);
				match(T__5);
				}
			}

			setState(1285);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==INTEGER_LITERAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_stats_sample_pagesContext extends ParserRuleContext {
		public TerminalNode STATS_SAMPLE_PAGES() { return getToken(mysqlParser.STATS_SAMPLE_PAGES, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public Creation_stats_sample_pagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_stats_sample_pages; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_stats_sample_pages(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_stats_sample_pages(this);
		}
	}

	public final Creation_stats_sample_pagesContext creation_stats_sample_pages() throws RecognitionException {
		Creation_stats_sample_pagesContext _localctx = new Creation_stats_sample_pagesContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_creation_stats_sample_pages);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287);
			match(STATS_SAMPLE_PAGES);
			setState(1289);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1288);
				match(T__5);
				}
			}

			setState(1291);
			match(INTEGER_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_storage_optionContext extends ParserRuleContext {
		public TerminalNode STORAGE() { return getToken(mysqlParser.STORAGE, 0); }
		public TerminalNode DISK() { return getToken(mysqlParser.DISK, 0); }
		public TerminalNode MEMORY() { return getToken(mysqlParser.MEMORY, 0); }
		public TerminalNode DEFAULT() { return getToken(mysqlParser.DEFAULT, 0); }
		public Creation_storage_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_storage_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_storage_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_storage_option(this);
		}
	}

	public final Creation_storage_optionContext creation_storage_option() throws RecognitionException {
		Creation_storage_optionContext _localctx = new Creation_storage_optionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_creation_storage_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1293);
			match(STORAGE);
			setState(1294);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==DISK || _la==MEMORY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_tablespaceContext extends ParserRuleContext {
		public TerminalNode TABLESPACE() { return getToken(mysqlParser.TABLESPACE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Creation_tablespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_tablespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_tablespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_tablespace(this);
		}
	}

	public final Creation_tablespaceContext creation_tablespace() throws RecognitionException {
		Creation_tablespaceContext _localctx = new Creation_tablespaceContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_creation_tablespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296);
			match(TABLESPACE);
			setState(1297);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creation_unionContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(mysqlParser.UNION, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Creation_unionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreation_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreation_union(this);
		}
	}

	public final Creation_unionContext creation_union() throws RecognitionException {
		Creation_unionContext _localctx = new Creation_unionContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_creation_union);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1299);
			match(UNION);
			setState(1301);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(1300);
				match(T__5);
				}
			}

			setState(1303);
			match(T__0);
			setState(1304);
			name();
			setState(1309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(1305);
				match(T__6);
				setState(1306);
				name();
				}
				}
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1312);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_definitionContext extends ParserRuleContext {
		public Index_type_1Context index_type_1() {
			return getRuleContext(Index_type_1Context.class,0);
		}
		public Index_type_pkContext index_type_pk() {
			return getRuleContext(Index_type_pkContext.class,0);
		}
		public Index_type_3Context index_type_3() {
			return getRuleContext(Index_type_3Context.class,0);
		}
		public Index_type_4Context index_type_4() {
			return getRuleContext(Index_type_4Context.class,0);
		}
		public Index_type_5Context index_type_5() {
			return getRuleContext(Index_type_5Context.class,0);
		}
		public Index_type_checkContext index_type_check() {
			return getRuleContext(Index_type_checkContext.class,0);
		}
		public Index_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_definition(this);
		}
	}

	public final Index_definitionContext index_definition() throws RecognitionException {
		Index_definitionContext _localctx = new Index_definitionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_index_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1314);
				index_type_1();
				}
				break;
			case 2:
				{
				setState(1315);
				index_type_pk();
				}
				break;
			case 3:
				{
				setState(1316);
				index_type_3();
				}
				break;
			case 4:
				{
				setState(1317);
				index_type_4();
				}
				break;
			case 5:
				{
				setState(1318);
				index_type_5();
				}
				break;
			case 6:
				{
				setState(1319);
				index_type_check();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_type_1Context extends ParserRuleContext {
		public Index_or_keyContext index_or_key() {
			return getRuleContext(Index_or_keyContext.class,0);
		}
		public Index_column_listContext index_column_list() {
			return getRuleContext(Index_column_listContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public List<Index_optionsContext> index_options() {
			return getRuleContexts(Index_optionsContext.class);
		}
		public Index_optionsContext index_options(int i) {
			return getRuleContext(Index_optionsContext.class,i);
		}
		public Index_type_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_type_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_type_1(this);
		}
	}

	public final Index_type_1Context index_type_1() throws RecognitionException {
		Index_type_1Context _localctx = new Index_type_1Context(_ctx, getState());
		enterRule(_localctx, 212, RULE_index_type_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			index_or_key();
			setState(1324);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << AFTER) | (1L << ALGORITHM) | (1L << ALWAYS) | (1L << ASCII) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << BEGIN) | (1L << BIT) | (1L << BOOL) | (1L << BOOLEAN) | (1L << BTREE) | (1L << BYTE) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLUMNS) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << COMPACT) | (1L << COMPRESSED) | (1L << CONNECTION) | (1L << COPY) | (1L << DATA) | (1L << DATE) | (1L << DATETIME) | (1L << DEFINER) | (1L << DELAY_KEY_WRITE) | (1L << DIRECTORY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DISABLE - 64)) | (1L << (DISCARD - 64)) | (1L << (DISK - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENABLE - 64)) | (1L << (ENGINE - 64)) | (1L << (ENUM - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (FIRST - 64)) | (1L << (FIXED - 64)) | (1L << (FULL - 64)) | (1L << (GEOMETRY - 64)) | (1L << (GEOMETRYCOLLECTION - 64)) | (1L << (HASH - 64)) | (1L << (IMPORT - 64)) | (1L << (INPLACE - 64)) | (1L << (INSERT_METHOD - 64)) | (1L << (INVOKER - 64)) | (1L << (JSON - 64)) | (1L << (KEY_BLOCK_SIZE - 64)) | (1L << (LAST - 64)) | (1L << (LINESTRING - 64)) | (1L << (LIST - 64)) | (1L << (MAX_ROWS - 64)) | (1L << (MEMORY - 64)) | (1L << (MERGE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MIN_ROWS - 128)) | (1L << (MODIFY - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (NAME - 128)) | (1L << (NATIONAL - 128)) | (1L << (NCHAR - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOW - 128)) | (1L << (NVARCHAR - 128)) | (1L << (OFFLINE - 128)) | (1L << (ONLINE - 128)) | (1L << (PACK_KEYS - 128)) | (1L << (PARSER - 128)) | (1L << (PARTIAL - 128)) | (1L << (PARTITIONING - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PASSWORD - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (REBUILD - 128)) | (1L << (REDUNDANT - 128)) | (1L << (REMOVE - 128)) | (1L << (REORGANIZE - 128)) | (1L << (REPAIR - 128)) | (1L << (ROW_FORMAT - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIAL - 128)) | (1L << (SHARED - 128)) | (1L << (SIGNED - 128)) | (1L << (SIMPLE - 128)) | (1L << (STATS_AUTO_RECALC - 128)) | (1L << (STATS_PERSISTENT - 128)) | (1L << (STATS_SAMPLE_PAGES - 128)) | (1L << (STORAGE - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUBPARTITIONS - 128)) | (1L << (TABLESPACE - 128)) | (1L << (TEMPORARY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TEMPTABLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNDEFINED - 192)) | (1L << (UNICODE - 192)) | (1L << (UPGRADE - 192)) | (1L << (VALIDATION - 192)) | (1L << (VIEW - 192)) | (1L << (WITHOUT - 192)) | (1L << (YEAR - 192)) | (1L << (DBL_STRING_LITERAL - 192)) | (1L << (INTEGER_LITERAL - 192)) | (1L << (IDENT - 192)) | (1L << (QUOTED_IDENT - 192)))) != 0)) {
				{
				setState(1323);
				index_name();
				}
			}

			setState(1327);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1326);
				index_type();
				}
			}

			setState(1329);
			index_column_list();
			setState(1333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==KEY_BLOCK_SIZE || _la==USING || _la==WITH) {
				{
				{
				setState(1330);
				index_options();
				}
				}
				setState(1335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_type_pkContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(mysqlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public Index_column_listContext index_column_list() {
			return getRuleContext(Index_column_listContext.class,0);
		}
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public List<Index_typeContext> index_type() {
			return getRuleContexts(Index_typeContext.class);
		}
		public Index_typeContext index_type(int i) {
			return getRuleContext(Index_typeContext.class,i);
		}
		public List<Index_nameContext> index_name() {
			return getRuleContexts(Index_nameContext.class);
		}
		public Index_nameContext index_name(int i) {
			return getRuleContext(Index_nameContext.class,i);
		}
		public List<Index_optionsContext> index_options() {
			return getRuleContexts(Index_optionsContext.class);
		}
		public Index_optionsContext index_options(int i) {
			return getRuleContext(Index_optionsContext.class,i);
		}
		public Index_type_pkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type_pk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_type_pk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_type_pk(this);
		}
	}

	public final Index_type_pkContext index_type_pk() throws RecognitionException {
		Index_type_pkContext _localctx = new Index_type_pkContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_index_type_pk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1336);
				index_constraint();
				}
			}

			setState(1339);
			match(PRIMARY);
			setState(1340);
			match(KEY);
			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << AFTER) | (1L << ALGORITHM) | (1L << ALWAYS) | (1L << ASCII) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << BEGIN) | (1L << BIT) | (1L << BOOL) | (1L << BOOLEAN) | (1L << BTREE) | (1L << BYTE) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLUMNS) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << COMPACT) | (1L << COMPRESSED) | (1L << CONNECTION) | (1L << COPY) | (1L << DATA) | (1L << DATE) | (1L << DATETIME) | (1L << DEFINER) | (1L << DELAY_KEY_WRITE) | (1L << DIRECTORY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DISABLE - 64)) | (1L << (DISCARD - 64)) | (1L << (DISK - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENABLE - 64)) | (1L << (ENGINE - 64)) | (1L << (ENUM - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (FIRST - 64)) | (1L << (FIXED - 64)) | (1L << (FULL - 64)) | (1L << (GEOMETRY - 64)) | (1L << (GEOMETRYCOLLECTION - 64)) | (1L << (HASH - 64)) | (1L << (IMPORT - 64)) | (1L << (INPLACE - 64)) | (1L << (INSERT_METHOD - 64)) | (1L << (INVOKER - 64)) | (1L << (JSON - 64)) | (1L << (KEY_BLOCK_SIZE - 64)) | (1L << (LAST - 64)) | (1L << (LINESTRING - 64)) | (1L << (LIST - 64)) | (1L << (MAX_ROWS - 64)) | (1L << (MEMORY - 64)) | (1L << (MERGE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MIN_ROWS - 128)) | (1L << (MODIFY - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (NAME - 128)) | (1L << (NATIONAL - 128)) | (1L << (NCHAR - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOW - 128)) | (1L << (NVARCHAR - 128)) | (1L << (OFFLINE - 128)) | (1L << (ONLINE - 128)) | (1L << (PACK_KEYS - 128)) | (1L << (PARSER - 128)) | (1L << (PARTIAL - 128)) | (1L << (PARTITIONING - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PASSWORD - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (REBUILD - 128)) | (1L << (REDUNDANT - 128)) | (1L << (REMOVE - 128)) | (1L << (REORGANIZE - 128)) | (1L << (REPAIR - 128)) | (1L << (ROW_FORMAT - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIAL - 128)) | (1L << (SHARED - 128)) | (1L << (SIGNED - 128)) | (1L << (SIMPLE - 128)) | (1L << (STATS_AUTO_RECALC - 128)) | (1L << (STATS_PERSISTENT - 128)) | (1L << (STATS_SAMPLE_PAGES - 128)) | (1L << (STORAGE - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUBPARTITIONS - 128)) | (1L << (TABLESPACE - 128)) | (1L << (TEMPORARY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TEMPTABLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNDEFINED - 192)) | (1L << (UNICODE - 192)) | (1L << (UPGRADE - 192)) | (1L << (USING - 192)) | (1L << (VALIDATION - 192)) | (1L << (VIEW - 192)) | (1L << (WITHOUT - 192)) | (1L << (YEAR - 192)) | (1L << (DBL_STRING_LITERAL - 192)) | (1L << (INTEGER_LITERAL - 192)) | (1L << (IDENT - 192)) | (1L << (QUOTED_IDENT - 192)))) != 0)) {
				{
				setState(1343);
				switch (_input.LA(1)) {
				case USING:
					{
					setState(1341);
					index_type();
					}
					break;
				case ACTION:
				case AFTER:
				case ALGORITHM:
				case ALWAYS:
				case ASCII:
				case AUTO_INCREMENT:
				case AVG_ROW_LENGTH:
				case BEGIN:
				case BIT:
				case BOOL:
				case BOOLEAN:
				case BTREE:
				case BYTE:
				case CHARSET:
				case CHECKSUM:
				case COALESCE:
				case COLUMNS:
				case COLUMN_FORMAT:
				case COMMENT:
				case COMPACT:
				case COMPRESSED:
				case CONNECTION:
				case COPY:
				case DATA:
				case DATE:
				case DATETIME:
				case DEFINER:
				case DELAY_KEY_WRITE:
				case DIRECTORY:
				case DISABLE:
				case DISCARD:
				case DISK:
				case DYNAMIC:
				case ENABLE:
				case ENGINE:
				case ENUM:
				case EXCHANGE:
				case EXCLUSIVE:
				case FIRST:
				case FIXED:
				case FULL:
				case GEOMETRY:
				case GEOMETRYCOLLECTION:
				case HASH:
				case IMPORT:
				case INPLACE:
				case INSERT_METHOD:
				case INVOKER:
				case JSON:
				case KEY_BLOCK_SIZE:
				case LAST:
				case LINESTRING:
				case LIST:
				case MAX_ROWS:
				case MEMORY:
				case MERGE:
				case MIN_ROWS:
				case MODIFY:
				case MULTILINESTRING:
				case MULTIPOINT:
				case MULTIPOLYGON:
				case NAME:
				case NATIONAL:
				case NCHAR:
				case NO:
				case NONE:
				case NOW:
				case NVARCHAR:
				case OFFLINE:
				case ONLINE:
				case PACK_KEYS:
				case PARSER:
				case PARTIAL:
				case PARTITIONING:
				case PARTITIONS:
				case PASSWORD:
				case POINT:
				case POLYGON:
				case REBUILD:
				case REDUNDANT:
				case REMOVE:
				case REORGANIZE:
				case REPAIR:
				case ROW_FORMAT:
				case SECURITY:
				case SERIAL:
				case SHARED:
				case SIGNED:
				case SIMPLE:
				case STATS_AUTO_RECALC:
				case STATS_PERSISTENT:
				case STATS_SAMPLE_PAGES:
				case STORAGE:
				case SUBPARTITION:
				case SUBPARTITIONS:
				case TABLESPACE:
				case TEMPORARY:
				case TEMPTABLE:
				case TEXT:
				case TIME:
				case TIMESTAMP:
				case TRUNCATE:
				case UNDEFINED:
				case UNICODE:
				case UPGRADE:
				case VALIDATION:
				case VIEW:
				case WITHOUT:
				case YEAR:
				case DBL_STRING_LITERAL:
				case INTEGER_LITERAL:
				case IDENT:
				case QUOTED_IDENT:
					{
					setState(1342);
					index_name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1348);
			index_column_list();
			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==KEY_BLOCK_SIZE || _la==USING || _la==WITH) {
				{
				{
				setState(1349);
				index_options();
				}
				}
				setState(1354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_type_3Context extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(mysqlParser.UNIQUE, 0); }
		public Index_column_listContext index_column_list() {
			return getRuleContext(Index_column_listContext.class,0);
		}
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public Index_or_keyContext index_or_key() {
			return getRuleContext(Index_or_keyContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public List<Index_optionsContext> index_options() {
			return getRuleContexts(Index_optionsContext.class);
		}
		public Index_optionsContext index_options(int i) {
			return getRuleContext(Index_optionsContext.class,i);
		}
		public Index_type_3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type_3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_type_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_type_3(this);
		}
	}

	public final Index_type_3Context index_type_3() throws RecognitionException {
		Index_type_3Context _localctx = new Index_type_3Context(_ctx, getState());
		enterRule(_localctx, 216, RULE_index_type_3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1355);
				index_constraint();
				}
			}

			setState(1358);
			match(UNIQUE);
			setState(1360);
			_la = _input.LA(1);
			if (_la==INDEX || _la==KEY) {
				{
				setState(1359);
				index_or_key();
				}
			}

			setState(1363);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << AFTER) | (1L << ALGORITHM) | (1L << ALWAYS) | (1L << ASCII) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << BEGIN) | (1L << BIT) | (1L << BOOL) | (1L << BOOLEAN) | (1L << BTREE) | (1L << BYTE) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLUMNS) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << COMPACT) | (1L << COMPRESSED) | (1L << CONNECTION) | (1L << COPY) | (1L << DATA) | (1L << DATE) | (1L << DATETIME) | (1L << DEFINER) | (1L << DELAY_KEY_WRITE) | (1L << DIRECTORY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DISABLE - 64)) | (1L << (DISCARD - 64)) | (1L << (DISK - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENABLE - 64)) | (1L << (ENGINE - 64)) | (1L << (ENUM - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (FIRST - 64)) | (1L << (FIXED - 64)) | (1L << (FULL - 64)) | (1L << (GEOMETRY - 64)) | (1L << (GEOMETRYCOLLECTION - 64)) | (1L << (HASH - 64)) | (1L << (IMPORT - 64)) | (1L << (INPLACE - 64)) | (1L << (INSERT_METHOD - 64)) | (1L << (INVOKER - 64)) | (1L << (JSON - 64)) | (1L << (KEY_BLOCK_SIZE - 64)) | (1L << (LAST - 64)) | (1L << (LINESTRING - 64)) | (1L << (LIST - 64)) | (1L << (MAX_ROWS - 64)) | (1L << (MEMORY - 64)) | (1L << (MERGE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MIN_ROWS - 128)) | (1L << (MODIFY - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (NAME - 128)) | (1L << (NATIONAL - 128)) | (1L << (NCHAR - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOW - 128)) | (1L << (NVARCHAR - 128)) | (1L << (OFFLINE - 128)) | (1L << (ONLINE - 128)) | (1L << (PACK_KEYS - 128)) | (1L << (PARSER - 128)) | (1L << (PARTIAL - 128)) | (1L << (PARTITIONING - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PASSWORD - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (REBUILD - 128)) | (1L << (REDUNDANT - 128)) | (1L << (REMOVE - 128)) | (1L << (REORGANIZE - 128)) | (1L << (REPAIR - 128)) | (1L << (ROW_FORMAT - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIAL - 128)) | (1L << (SHARED - 128)) | (1L << (SIGNED - 128)) | (1L << (SIMPLE - 128)) | (1L << (STATS_AUTO_RECALC - 128)) | (1L << (STATS_PERSISTENT - 128)) | (1L << (STATS_SAMPLE_PAGES - 128)) | (1L << (STORAGE - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUBPARTITIONS - 128)) | (1L << (TABLESPACE - 128)) | (1L << (TEMPORARY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TEMPTABLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNDEFINED - 192)) | (1L << (UNICODE - 192)) | (1L << (UPGRADE - 192)) | (1L << (VALIDATION - 192)) | (1L << (VIEW - 192)) | (1L << (WITHOUT - 192)) | (1L << (YEAR - 192)) | (1L << (DBL_STRING_LITERAL - 192)) | (1L << (INTEGER_LITERAL - 192)) | (1L << (IDENT - 192)) | (1L << (QUOTED_IDENT - 192)))) != 0)) {
				{
				setState(1362);
				index_name();
				}
			}

			setState(1366);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1365);
				index_type();
				}
			}

			setState(1368);
			index_column_list();
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==KEY_BLOCK_SIZE || _la==USING || _la==WITH) {
				{
				{
				setState(1369);
				index_options();
				}
				}
				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_type_4Context extends ParserRuleContext {
		public Index_column_listContext index_column_list() {
			return getRuleContext(Index_column_listContext.class,0);
		}
		public TerminalNode FULLTEXT() { return getToken(mysqlParser.FULLTEXT, 0); }
		public TerminalNode SPATIAL() { return getToken(mysqlParser.SPATIAL, 0); }
		public Index_or_keyContext index_or_key() {
			return getRuleContext(Index_or_keyContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public List<Index_optionsContext> index_options() {
			return getRuleContexts(Index_optionsContext.class);
		}
		public Index_optionsContext index_options(int i) {
			return getRuleContext(Index_optionsContext.class,i);
		}
		public Index_type_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type_4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_type_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_type_4(this);
		}
	}

	public final Index_type_4Context index_type_4() throws RecognitionException {
		Index_type_4Context _localctx = new Index_type_4Context(_ctx, getState());
		enterRule(_localctx, 218, RULE_index_type_4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1375);
			_la = _input.LA(1);
			if ( !(_la==FULLTEXT || _la==SPATIAL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1377);
			_la = _input.LA(1);
			if (_la==INDEX || _la==KEY) {
				{
				setState(1376);
				index_or_key();
				}
			}

			setState(1380);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << AFTER) | (1L << ALGORITHM) | (1L << ALWAYS) | (1L << ASCII) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << BEGIN) | (1L << BIT) | (1L << BOOL) | (1L << BOOLEAN) | (1L << BTREE) | (1L << BYTE) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLUMNS) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << COMPACT) | (1L << COMPRESSED) | (1L << CONNECTION) | (1L << COPY) | (1L << DATA) | (1L << DATE) | (1L << DATETIME) | (1L << DEFINER) | (1L << DELAY_KEY_WRITE) | (1L << DIRECTORY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DISABLE - 64)) | (1L << (DISCARD - 64)) | (1L << (DISK - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENABLE - 64)) | (1L << (ENGINE - 64)) | (1L << (ENUM - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (FIRST - 64)) | (1L << (FIXED - 64)) | (1L << (FULL - 64)) | (1L << (GEOMETRY - 64)) | (1L << (GEOMETRYCOLLECTION - 64)) | (1L << (HASH - 64)) | (1L << (IMPORT - 64)) | (1L << (INPLACE - 64)) | (1L << (INSERT_METHOD - 64)) | (1L << (INVOKER - 64)) | (1L << (JSON - 64)) | (1L << (KEY_BLOCK_SIZE - 64)) | (1L << (LAST - 64)) | (1L << (LINESTRING - 64)) | (1L << (LIST - 64)) | (1L << (MAX_ROWS - 64)) | (1L << (MEMORY - 64)) | (1L << (MERGE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MIN_ROWS - 128)) | (1L << (MODIFY - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (NAME - 128)) | (1L << (NATIONAL - 128)) | (1L << (NCHAR - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOW - 128)) | (1L << (NVARCHAR - 128)) | (1L << (OFFLINE - 128)) | (1L << (ONLINE - 128)) | (1L << (PACK_KEYS - 128)) | (1L << (PARSER - 128)) | (1L << (PARTIAL - 128)) | (1L << (PARTITIONING - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PASSWORD - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (REBUILD - 128)) | (1L << (REDUNDANT - 128)) | (1L << (REMOVE - 128)) | (1L << (REORGANIZE - 128)) | (1L << (REPAIR - 128)) | (1L << (ROW_FORMAT - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIAL - 128)) | (1L << (SHARED - 128)) | (1L << (SIGNED - 128)) | (1L << (SIMPLE - 128)) | (1L << (STATS_AUTO_RECALC - 128)) | (1L << (STATS_PERSISTENT - 128)) | (1L << (STATS_SAMPLE_PAGES - 128)) | (1L << (STORAGE - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUBPARTITIONS - 128)) | (1L << (TABLESPACE - 128)) | (1L << (TEMPORARY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TEMPTABLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNDEFINED - 192)) | (1L << (UNICODE - 192)) | (1L << (UPGRADE - 192)) | (1L << (VALIDATION - 192)) | (1L << (VIEW - 192)) | (1L << (WITHOUT - 192)) | (1L << (YEAR - 192)) | (1L << (DBL_STRING_LITERAL - 192)) | (1L << (INTEGER_LITERAL - 192)) | (1L << (IDENT - 192)) | (1L << (QUOTED_IDENT - 192)))) != 0)) {
				{
				setState(1379);
				index_name();
				}
			}

			setState(1382);
			index_column_list();
			setState(1386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT || _la==KEY_BLOCK_SIZE || _la==USING || _la==WITH) {
				{
				{
				setState(1383);
				index_options();
				}
				}
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_type_5Context extends ParserRuleContext {
		public TerminalNode FOREIGN() { return getToken(mysqlParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public Index_column_listContext index_column_list() {
			return getRuleContext(Index_column_listContext.class,0);
		}
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_type_5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type_5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_type_5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_type_5(this);
		}
	}

	public final Index_type_5Context index_type_5() throws RecognitionException {
		Index_type_5Context _localctx = new Index_type_5Context(_ctx, getState());
		enterRule(_localctx, 220, RULE_index_type_5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1389);
				index_constraint();
				}
			}

			setState(1392);
			match(FOREIGN);
			setState(1393);
			match(KEY);
			setState(1395);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << AFTER) | (1L << ALGORITHM) | (1L << ALWAYS) | (1L << ASCII) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << BEGIN) | (1L << BIT) | (1L << BOOL) | (1L << BOOLEAN) | (1L << BTREE) | (1L << BYTE) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLUMNS) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << COMPACT) | (1L << COMPRESSED) | (1L << CONNECTION) | (1L << COPY) | (1L << DATA) | (1L << DATE) | (1L << DATETIME) | (1L << DEFINER) | (1L << DELAY_KEY_WRITE) | (1L << DIRECTORY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DISABLE - 64)) | (1L << (DISCARD - 64)) | (1L << (DISK - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENABLE - 64)) | (1L << (ENGINE - 64)) | (1L << (ENUM - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (FIRST - 64)) | (1L << (FIXED - 64)) | (1L << (FULL - 64)) | (1L << (GEOMETRY - 64)) | (1L << (GEOMETRYCOLLECTION - 64)) | (1L << (HASH - 64)) | (1L << (IMPORT - 64)) | (1L << (INPLACE - 64)) | (1L << (INSERT_METHOD - 64)) | (1L << (INVOKER - 64)) | (1L << (JSON - 64)) | (1L << (KEY_BLOCK_SIZE - 64)) | (1L << (LAST - 64)) | (1L << (LINESTRING - 64)) | (1L << (LIST - 64)) | (1L << (MAX_ROWS - 64)) | (1L << (MEMORY - 64)) | (1L << (MERGE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MIN_ROWS - 128)) | (1L << (MODIFY - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (NAME - 128)) | (1L << (NATIONAL - 128)) | (1L << (NCHAR - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOW - 128)) | (1L << (NVARCHAR - 128)) | (1L << (OFFLINE - 128)) | (1L << (ONLINE - 128)) | (1L << (PACK_KEYS - 128)) | (1L << (PARSER - 128)) | (1L << (PARTIAL - 128)) | (1L << (PARTITIONING - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PASSWORD - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (REBUILD - 128)) | (1L << (REDUNDANT - 128)) | (1L << (REMOVE - 128)) | (1L << (REORGANIZE - 128)) | (1L << (REPAIR - 128)) | (1L << (ROW_FORMAT - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIAL - 128)) | (1L << (SHARED - 128)) | (1L << (SIGNED - 128)) | (1L << (SIMPLE - 128)) | (1L << (STATS_AUTO_RECALC - 128)) | (1L << (STATS_PERSISTENT - 128)) | (1L << (STATS_SAMPLE_PAGES - 128)) | (1L << (STORAGE - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUBPARTITIONS - 128)) | (1L << (TABLESPACE - 128)) | (1L << (TEMPORARY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TEMPTABLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNDEFINED - 192)) | (1L << (UNICODE - 192)) | (1L << (UPGRADE - 192)) | (1L << (VALIDATION - 192)) | (1L << (VIEW - 192)) | (1L << (WITHOUT - 192)) | (1L << (YEAR - 192)) | (1L << (DBL_STRING_LITERAL - 192)) | (1L << (INTEGER_LITERAL - 192)) | (1L << (IDENT - 192)) | (1L << (QUOTED_IDENT - 192)))) != 0)) {
				{
				setState(1394);
				index_name();
				}
			}

			setState(1397);
			index_column_list();
			setState(1398);
			reference_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_type_checkContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(mysqlParser.CHECK, 0); }
		public Skip_parensContext skip_parens() {
			return getRuleContext(Skip_parensContext.class,0);
		}
		public Index_constraintContext index_constraint() {
			return getRuleContext(Index_constraintContext.class,0);
		}
		public Index_type_checkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_type_check(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_type_check(this);
		}
	}

	public final Index_type_checkContext index_type_check() throws RecognitionException {
		Index_type_checkContext _localctx = new Index_type_checkContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_index_type_check);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1400);
				index_constraint();
				}
			}

			setState(1403);
			match(CHECK);
			setState(1404);
			skip_parens();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_or_keyContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(mysqlParser.INDEX, 0); }
		public TerminalNode KEY() { return getToken(mysqlParser.KEY, 0); }
		public Index_or_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_or_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_or_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_or_key(this);
		}
	}

	public final Index_or_keyContext index_or_key() throws RecognitionException {
		Index_or_keyContext _localctx = new Index_or_keyContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_index_or_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_constraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(mysqlParser.CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Index_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_constraint(this);
		}
	}

	public final Index_constraintContext index_constraint() throws RecognitionException {
		Index_constraintContext _localctx = new Index_constraintContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_index_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1408);
			match(CONSTRAINT);
			setState(1410);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << AFTER) | (1L << ALGORITHM) | (1L << ALWAYS) | (1L << ASCII) | (1L << AUTO_INCREMENT) | (1L << AVG_ROW_LENGTH) | (1L << BEGIN) | (1L << BIT) | (1L << BOOL) | (1L << BOOLEAN) | (1L << BTREE) | (1L << BYTE) | (1L << CHARSET) | (1L << CHECKSUM) | (1L << COALESCE) | (1L << COLUMNS) | (1L << COLUMN_FORMAT) | (1L << COMMENT) | (1L << COMPACT) | (1L << COMPRESSED) | (1L << CONNECTION) | (1L << COPY) | (1L << DATA) | (1L << DATE) | (1L << DATETIME) | (1L << DEFINER) | (1L << DELAY_KEY_WRITE) | (1L << DIRECTORY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DISABLE - 64)) | (1L << (DISCARD - 64)) | (1L << (DISK - 64)) | (1L << (DYNAMIC - 64)) | (1L << (ENABLE - 64)) | (1L << (ENGINE - 64)) | (1L << (ENUM - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXCLUSIVE - 64)) | (1L << (FIRST - 64)) | (1L << (FIXED - 64)) | (1L << (FULL - 64)) | (1L << (GEOMETRY - 64)) | (1L << (GEOMETRYCOLLECTION - 64)) | (1L << (HASH - 64)) | (1L << (IMPORT - 64)) | (1L << (INPLACE - 64)) | (1L << (INSERT_METHOD - 64)) | (1L << (INVOKER - 64)) | (1L << (JSON - 64)) | (1L << (KEY_BLOCK_SIZE - 64)) | (1L << (LAST - 64)) | (1L << (LINESTRING - 64)) | (1L << (LIST - 64)) | (1L << (MAX_ROWS - 64)) | (1L << (MEMORY - 64)) | (1L << (MERGE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MIN_ROWS - 128)) | (1L << (MODIFY - 128)) | (1L << (MULTILINESTRING - 128)) | (1L << (MULTIPOINT - 128)) | (1L << (MULTIPOLYGON - 128)) | (1L << (NAME - 128)) | (1L << (NATIONAL - 128)) | (1L << (NCHAR - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NOW - 128)) | (1L << (NVARCHAR - 128)) | (1L << (OFFLINE - 128)) | (1L << (ONLINE - 128)) | (1L << (PACK_KEYS - 128)) | (1L << (PARSER - 128)) | (1L << (PARTIAL - 128)) | (1L << (PARTITIONING - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PASSWORD - 128)) | (1L << (POINT - 128)) | (1L << (POLYGON - 128)) | (1L << (REBUILD - 128)) | (1L << (REDUNDANT - 128)) | (1L << (REMOVE - 128)) | (1L << (REORGANIZE - 128)) | (1L << (REPAIR - 128)) | (1L << (ROW_FORMAT - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIAL - 128)) | (1L << (SHARED - 128)) | (1L << (SIGNED - 128)) | (1L << (SIMPLE - 128)) | (1L << (STATS_AUTO_RECALC - 128)) | (1L << (STATS_PERSISTENT - 128)) | (1L << (STATS_SAMPLE_PAGES - 128)) | (1L << (STORAGE - 128)) | (1L << (SUBPARTITION - 128)) | (1L << (SUBPARTITIONS - 128)) | (1L << (TABLESPACE - 128)) | (1L << (TEMPORARY - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (TEMPTABLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TRUNCATE - 192)) | (1L << (UNDEFINED - 192)) | (1L << (UNICODE - 192)) | (1L << (UPGRADE - 192)) | (1L << (VALIDATION - 192)) | (1L << (VIEW - 192)) | (1L << (WITHOUT - 192)) | (1L << (YEAR - 192)) | (1L << (DBL_STRING_LITERAL - 192)) | (1L << (INTEGER_LITERAL - 192)) | (1L << (IDENT - 192)) | (1L << (QUOTED_IDENT - 192)))) != 0)) {
				{
				setState(1409);
				name();
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_name(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_typeContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(mysqlParser.USING, 0); }
		public TerminalNode BTREE() { return getToken(mysqlParser.BTREE, 0); }
		public TerminalNode HASH() { return getToken(mysqlParser.HASH, 0); }
		public Index_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_type(this);
		}
	}

	public final Index_typeContext index_type() throws RecognitionException {
		Index_typeContext _localctx = new Index_typeContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_index_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			match(USING);
			setState(1415);
			_la = _input.LA(1);
			if ( !(_la==BTREE || _la==HASH) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionsContext extends ParserRuleContext {
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(mysqlParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(mysqlParser.INTEGER_LITERAL, 0); }
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public TerminalNode WITH() { return getToken(mysqlParser.WITH, 0); }
		public TerminalNode PARSER() { return getToken(mysqlParser.PARSER, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(mysqlParser.COMMENT, 0); }
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Index_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_options(this);
		}
	}

	public final Index_optionsContext index_options() throws RecognitionException {
		Index_optionsContext _localctx = new Index_optionsContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_index_options);
		try {
			setState(1426);
			switch (_input.LA(1)) {
			case KEY_BLOCK_SIZE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1417);
				match(KEY_BLOCK_SIZE);
				setState(1418);
				match(T__5);
				setState(1419);
				match(INTEGER_LITERAL);
				}
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1420);
				index_type();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 3);
				{
				setState(1421);
				match(WITH);
				setState(1422);
				match(PARSER);
				setState(1423);
				name();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1424);
				match(COMMENT);
				setState(1425);
				string_literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_listContext extends ParserRuleContext {
		public Index_columnsContext index_columns() {
			return getRuleContext(Index_columnsContext.class,0);
		}
		public Index_column_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_column_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_column_list(this);
		}
	}

	public final Index_column_listContext index_column_list() throws RecognitionException {
		Index_column_listContext _localctx = new Index_column_listContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_index_column_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			match(T__0);
			setState(1429);
			index_columns();
			setState(1430);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_columnsContext extends ParserRuleContext {
		public List<Index_columnContext> index_column() {
			return getRuleContexts(Index_columnContext.class);
		}
		public Index_columnContext index_column(int i) {
			return getRuleContext(Index_columnContext.class,i);
		}
		public Index_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_columns(this);
		}
	}

	public final Index_columnsContext index_columns() throws RecognitionException {
		Index_columnsContext _localctx = new Index_columnsContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_index_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			index_column();
			setState(1437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(1433);
				match(T__6);
				setState(1434);
				index_column();
				}
				}
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_columnContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Index_column_partial_defContext index_column_partial_def() {
			return getRuleContext(Index_column_partial_defContext.class,0);
		}
		public Index_column_asc_or_descContext index_column_asc_or_desc() {
			return getRuleContext(Index_column_asc_or_descContext.class,0);
		}
		public Index_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_column(this);
		}
	}

	public final Index_columnContext index_column() throws RecognitionException {
		Index_columnContext _localctx = new Index_columnContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_index_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			name();
			setState(1442);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(1441);
				index_column_partial_def();
				}
			}

			setState(1445);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1444);
				index_column_asc_or_desc();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_partial_defContext extends ParserRuleContext {
		public Index_column_partial_lengthContext index_column_partial_length() {
			return getRuleContext(Index_column_partial_lengthContext.class,0);
		}
		public Index_column_partial_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_partial_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_column_partial_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_column_partial_def(this);
		}
	}

	public final Index_column_partial_defContext index_column_partial_def() throws RecognitionException {
		Index_column_partial_defContext _localctx = new Index_column_partial_defContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_index_column_partial_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			match(T__0);
			setState(1448);
			index_column_partial_length();
			setState(1449);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_partial_lengthContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(mysqlParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(mysqlParser.INTEGER_LITERAL, i);
		}
		public Index_column_partial_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_partial_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_column_partial_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_column_partial_length(this);
		}
	}

	public final Index_column_partial_lengthContext index_column_partial_length() throws RecognitionException {
		Index_column_partial_lengthContext _localctx = new Index_column_partial_lengthContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_index_column_partial_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1451);
				match(INTEGER_LITERAL);
				}
				}
				setState(1454); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTEGER_LITERAL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_column_asc_or_descContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(mysqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(mysqlParser.DESC, 0); }
		public Index_column_asc_or_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_column_asc_or_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIndex_column_asc_or_desc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIndex_column_asc_or_desc(this);
		}
	}

	public final Index_column_asc_or_descContext index_column_asc_or_desc() throws RecognitionException {
		Index_column_asc_or_descContext _localctx = new Index_column_asc_or_descContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_index_column_asc_or_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_definitionContext extends ParserRuleContext {
		public TerminalNode REFERENCES() { return getToken(mysqlParser.REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_column_listContext index_column_list() {
			return getRuleContext(Index_column_listContext.class,0);
		}
		public List<Reference_definition_matchContext> reference_definition_match() {
			return getRuleContexts(Reference_definition_matchContext.class);
		}
		public Reference_definition_matchContext reference_definition_match(int i) {
			return getRuleContext(Reference_definition_matchContext.class,i);
		}
		public List<Reference_definition_on_deleteContext> reference_definition_on_delete() {
			return getRuleContexts(Reference_definition_on_deleteContext.class);
		}
		public Reference_definition_on_deleteContext reference_definition_on_delete(int i) {
			return getRuleContext(Reference_definition_on_deleteContext.class,i);
		}
		public List<Reference_definition_on_updateContext> reference_definition_on_update() {
			return getRuleContexts(Reference_definition_on_updateContext.class);
		}
		public Reference_definition_on_updateContext reference_definition_on_update(int i) {
			return getRuleContext(Reference_definition_on_updateContext.class,i);
		}
		public Reference_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterReference_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitReference_definition(this);
		}
	}

	public final Reference_definitionContext reference_definition() throws RecognitionException {
		Reference_definitionContext _localctx = new Reference_definitionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_reference_definition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			match(REFERENCES);
			setState(1459);
			table_name();
			setState(1460);
			index_column_list();
			setState(1466);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1464);
					switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
					case 1:
						{
						setState(1461);
						reference_definition_match();
						}
						break;
					case 2:
						{
						setState(1462);
						reference_definition_on_delete();
						}
						break;
					case 3:
						{
						setState(1463);
						reference_definition_on_update();
						}
						break;
					}
					} 
				}
				setState(1468);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_definition_matchContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(mysqlParser.MATCH, 0); }
		public TerminalNode FULL() { return getToken(mysqlParser.FULL, 0); }
		public TerminalNode PARTIAL() { return getToken(mysqlParser.PARTIAL, 0); }
		public TerminalNode SIMPLE() { return getToken(mysqlParser.SIMPLE, 0); }
		public Reference_definition_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_definition_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterReference_definition_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitReference_definition_match(this);
		}
	}

	public final Reference_definition_matchContext reference_definition_match() throws RecognitionException {
		Reference_definition_matchContext _localctx = new Reference_definition_matchContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_reference_definition_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1469);
				match(MATCH);
				setState(1470);
				match(FULL);
				}
				break;
			case 2:
				{
				setState(1471);
				match(MATCH);
				setState(1472);
				match(PARTIAL);
				}
				break;
			case 3:
				{
				setState(1473);
				match(MATCH);
				setState(1474);
				match(SIMPLE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_definition_on_deleteContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(mysqlParser.ON, 0); }
		public TerminalNode DELETE() { return getToken(mysqlParser.DELETE, 0); }
		public Reference_optionContext reference_option() {
			return getRuleContext(Reference_optionContext.class,0);
		}
		public Reference_definition_on_deleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_definition_on_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterReference_definition_on_delete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitReference_definition_on_delete(this);
		}
	}

	public final Reference_definition_on_deleteContext reference_definition_on_delete() throws RecognitionException {
		Reference_definition_on_deleteContext _localctx = new Reference_definition_on_deleteContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_reference_definition_on_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			match(ON);
			setState(1478);
			match(DELETE);
			setState(1479);
			reference_option();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_definition_on_updateContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(mysqlParser.ON, 0); }
		public TerminalNode UPDATE() { return getToken(mysqlParser.UPDATE, 0); }
		public Reference_optionContext reference_option() {
			return getRuleContext(Reference_optionContext.class,0);
		}
		public Reference_definition_on_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_definition_on_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterReference_definition_on_update(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitReference_definition_on_update(this);
		}
	}

	public final Reference_definition_on_updateContext reference_definition_on_update() throws RecognitionException {
		Reference_definition_on_updateContext _localctx = new Reference_definition_on_updateContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_reference_definition_on_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1481);
			match(ON);
			setState(1482);
			match(UPDATE);
			setState(1483);
			reference_option();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_optionContext extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(mysqlParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(mysqlParser.CASCADE, 0); }
		public TerminalNode SET() { return getToken(mysqlParser.SET, 0); }
		public TerminalNode NULL() { return getToken(mysqlParser.NULL, 0); }
		public TerminalNode NO() { return getToken(mysqlParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(mysqlParser.ACTION, 0); }
		public Reference_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterReference_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitReference_option(this);
		}
	}

	public final Reference_optionContext reference_option() throws RecognitionException {
		Reference_optionContext _localctx = new Reference_optionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_reference_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			switch (_input.LA(1)) {
			case RESTRICT:
				{
				setState(1485);
				match(RESTRICT);
				}
				break;
			case CASCADE:
				{
				setState(1486);
				match(CASCADE);
				}
				break;
			case SET:
				{
				setState(1487);
				match(SET);
				setState(1488);
				match(NULL);
				}
				break;
			case NO:
				{
				setState(1489);
				match(NO);
				setState(1490);
				match(ACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_databaseContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode DATABASE() { return getToken(mysqlParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(mysqlParser.SCHEMA, 0); }
		public If_existsContext if_exists() {
			return getRuleContext(If_existsContext.class,0);
		}
		public Drop_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDrop_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDrop_database(this);
		}
	}

	public final Drop_databaseContext drop_database() throws RecognitionException {
		Drop_databaseContext _localctx = new Drop_databaseContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_drop_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			match(DROP);
			setState(1494);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1496);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1495);
				if_exists();
				}
			}

			setState(1498);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_tableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(mysqlParser.TABLE, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode TEMPORARY() { return getToken(mysqlParser.TEMPORARY, 0); }
		public If_existsContext if_exists() {
			return getRuleContext(If_existsContext.class,0);
		}
		public List<Drop_table_optionsContext> drop_table_options() {
			return getRuleContexts(Drop_table_optionsContext.class);
		}
		public Drop_table_optionsContext drop_table_options(int i) {
			return getRuleContext(Drop_table_optionsContext.class,i);
		}
		public Drop_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDrop_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDrop_table(this);
		}
	}

	public final Drop_tableContext drop_table() throws RecognitionException {
		Drop_tableContext _localctx = new Drop_tableContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_drop_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			match(DROP);
			setState(1502);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1501);
				match(TEMPORARY);
				}
			}

			setState(1504);
			match(TABLE);
			setState(1506);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1505);
				if_exists();
				}
			}

			setState(1508);
			table_name();
			setState(1513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(1509);
				match(T__6);
				setState(1510);
				table_name();
				}
				}
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASCADE || _la==RESTRICT) {
				{
				{
				setState(1516);
				drop_table_options();
				}
				}
				setState(1521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_optionsContext extends ParserRuleContext {
		public TerminalNode RESTRICT() { return getToken(mysqlParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(mysqlParser.CASCADE, 0); }
		public Drop_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDrop_table_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDrop_table_options(this);
		}
	}

	public final Drop_table_optionsContext drop_table_options() throws RecognitionException {
		Drop_table_optionsContext _localctx = new Drop_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_drop_table_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			_la = _input.LA(1);
			if ( !(_la==CASCADE || _la==RESTRICT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_existsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(mysqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(mysqlParser.EXISTS, 0); }
		public If_existsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_exists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterIf_exists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitIf_exists(this);
		}
	}

	public final If_existsContext if_exists() throws RecognitionException {
		If_existsContext _localctx = new If_existsContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_if_exists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			match(IF);
			setState(1525);
			match(EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rename_tableContext extends ParserRuleContext {
		public TerminalNode RENAME() { return getToken(mysqlParser.RENAME, 0); }
		public TerminalNode TABLE() { return getToken(mysqlParser.TABLE, 0); }
		public List<Rename_table_specContext> rename_table_spec() {
			return getRuleContexts(Rename_table_specContext.class);
		}
		public Rename_table_specContext rename_table_spec(int i) {
			return getRuleContext(Rename_table_specContext.class,i);
		}
		public Rename_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterRename_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitRename_table(this);
		}
	}

	public final Rename_tableContext rename_table() throws RecognitionException {
		Rename_tableContext _localctx = new Rename_tableContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_rename_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			match(RENAME);
			setState(1528);
			match(TABLE);
			setState(1529);
			rename_table_spec();
			setState(1534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(1530);
				match(T__6);
				setState(1531);
				rename_table_spec();
				}
				}
				setState(1536);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rename_table_specContext extends ParserRuleContext {
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public TerminalNode TO() { return getToken(mysqlParser.TO, 0); }
		public Rename_table_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename_table_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterRename_table_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitRename_table_spec(this);
		}
	}

	public final Rename_table_specContext rename_table_spec() throws RecognitionException {
		Rename_table_specContext _localctx = new Rename_table_specContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_rename_table_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1537);
			table_name();
			setState(1538);
			match(TO);
			setState(1539);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_viewContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(mysqlParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(mysqlParser.VIEW, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<View_optionsContext> view_options() {
			return getRuleContexts(View_optionsContext.class);
		}
		public View_optionsContext view_options(int i) {
			return getRuleContext(View_optionsContext.class,i);
		}
		public Alter_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterAlter_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitAlter_view(this);
		}
	}

	public final Alter_viewContext alter_view() throws RecognitionException {
		Alter_viewContext _localctx = new Alter_viewContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_alter_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			match(ALTER);
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALGORITHM || _la==DEFINER || _la==SQL) {
				{
				{
				setState(1542);
				view_options();
				}
				}
				setState(1547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1548);
			match(VIEW);
			setState(1549);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_viewContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(mysqlParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(mysqlParser.VIEW, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OR() { return getToken(mysqlParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(mysqlParser.REPLACE, 0); }
		public List<View_optionsContext> view_options() {
			return getRuleContexts(View_optionsContext.class);
		}
		public View_optionsContext view_options(int i) {
			return getRuleContext(View_optionsContext.class,i);
		}
		public Create_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_view(this);
		}
	}

	public final Create_viewContext create_view() throws RecognitionException {
		Create_viewContext _localctx = new Create_viewContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_create_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			match(CREATE);
			setState(1554);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(1552);
				match(OR);
				setState(1553);
				match(REPLACE);
				}
			}

			setState(1559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALGORITHM || _la==DEFINER || _la==SQL) {
				{
				{
				setState(1556);
				view_options();
				}
				}
				setState(1561);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1562);
			match(VIEW);
			setState(1563);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_viewContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(mysqlParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(mysqlParser.VIEW, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode IF() { return getToken(mysqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(mysqlParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(mysqlParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(mysqlParser.CASCADE, 0); }
		public Drop_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDrop_view(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDrop_view(this);
		}
	}

	public final Drop_viewContext drop_view() throws RecognitionException {
		Drop_viewContext _localctx = new Drop_viewContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_drop_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			match(DROP);
			setState(1566);
			match(VIEW);
			setState(1569);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1567);
				match(IF);
				setState(1568);
				match(EXISTS);
				}
			}

			setState(1571);
			name();
			setState(1576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(1572);
				match(T__6);
				setState(1573);
				name();
				}
				}
				setState(1578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1580);
			_la = _input.LA(1);
			if (_la==CASCADE || _la==RESTRICT) {
				{
				setState(1579);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_optionsContext extends ParserRuleContext {
		public TerminalNode ALGORITHM() { return getToken(mysqlParser.ALGORITHM, 0); }
		public TerminalNode UNDEFINED() { return getToken(mysqlParser.UNDEFINED, 0); }
		public TerminalNode MERGE() { return getToken(mysqlParser.MERGE, 0); }
		public TerminalNode TEMPTABLE() { return getToken(mysqlParser.TEMPTABLE, 0); }
		public TerminalNode DEFINER() { return getToken(mysqlParser.DEFINER, 0); }
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public TerminalNode CURRENT_USER() { return getToken(mysqlParser.CURRENT_USER, 0); }
		public TerminalNode SQL() { return getToken(mysqlParser.SQL, 0); }
		public TerminalNode SECURITY() { return getToken(mysqlParser.SECURITY, 0); }
		public TerminalNode INVOKER() { return getToken(mysqlParser.INVOKER, 0); }
		public View_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterView_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitView_options(this);
		}
	}

	public final View_optionsContext view_options() throws RecognitionException {
		View_optionsContext _localctx = new View_optionsContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_view_options);
		int _la;
		try {
			setState(1594);
			switch (_input.LA(1)) {
			case ALGORITHM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1582);
				match(ALGORITHM);
				setState(1583);
				match(T__5);
				setState(1584);
				_la = _input.LA(1);
				if ( !(_la==MERGE || _la==TEMPTABLE || _la==UNDEFINED) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case DEFINER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1585);
				match(DEFINER);
				setState(1586);
				match(T__5);
				setState(1589);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
				case DBL_STRING_LITERAL:
				case IDENT:
				case QUOTED_IDENT:
					{
					setState(1587);
					user();
					}
					break;
				case CURRENT_USER:
					{
					setState(1588);
					match(CURRENT_USER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SQL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1591);
				match(SQL);
				setState(1592);
				match(SECURITY);
				setState(1593);
				_la = _input.LA(1);
				if ( !(_la==DEFINER || _la==INVOKER) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00e9\u063f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\3\2\5\2\u0118\n\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0127\n\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0136\n\7\3\b\3\b\3\b\5\b\u013b\n\b\3"+
		"\t\3\t\3\t\5\t\u0140\n\t\3\n\3\n\3\n\3\n\5\n\u0146\n\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0150\n\f\3\r\5\r\u0153\n\r\3\r\5\r\u0156\n\r\3"+
		"\r\3\r\3\r\3\16\5\16\u015c\n\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u016c\n\22\3\23\5\23\u016f\n\23\3"+
		"\23\3\23\5\23\u0173\n\23\3\23\3\23\5\23\u0177\n\23\3\24\5\24\u017a\n\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u0183\n\25\3\26\3\26\5\26\u0187"+
		"\n\26\3\26\3\26\3\26\5\26\u018c\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\5\30\u0195\n\30\3\31\3\31\5\31\u0199\n\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\33\7\33\u01a3\n\33\f\33\16\33\u01a6\13\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\6\34\u01b3\n\34\r\34\16\34\u01b4"+
		"\3\34\5\34\u01b8\n\34\3\35\3\35\5\35\u01bc\n\35\3\35\3\35\5\35\u01c0\n"+
		"\35\3\36\3\36\5\36\u01c4\n\36\3\36\3\36\3\36\5\36\u01c9\n\36\3\36\3\36"+
		"\3\36\5\36\u01ce\n\36\7\36\u01d0\n\36\f\36\16\36\u01d3\13\36\3\36\3\36"+
		"\3\37\3\37\5\37\u01d9\n\37\3\37\3\37\3\37\5\37\u01de\n\37\3 \3 \5 \u01e2"+
		"\n \3 \3 \5 \u01e6\n \3!\3!\3\"\3\"\5\"\u01ec\n\"\3\"\3\"\5\"\u01f0\n"+
		"\"\3#\3#\5#\u01f4\n#\3#\3#\3#\3$\3$\3$\3$\3%\3%\5%\u01ff\n%\3%\3%\3&\3"+
		"&\3&\3&\3&\5&\u0208\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0226"+
		"\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0230\n\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0246"+
		"\n\'\3(\3(\3(\3(\5(\u024c\n(\3(\3(\3(\3(\3(\3(\5(\u0254\n(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0262\n(\f(\16(\u0265\13(\3(\3(\3(\3(\3("+
		"\3(\3(\5(\u026e\n(\3(\3(\3(\5(\u0273\n(\3(\3(\3(\3(\3(\3(\3(\5(\u027c"+
		"\n(\3)\3)\3*\3*\3+\3+\3+\7+\u0285\n+\f+\16+\u0288\13+\3,\3,\5,\u028c\n"+
		",\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0299\n-\3.\3.\3.\3/\3/\3/\5/\u02a1"+
		"\n/\3\60\3\60\3\60\3\60\5\60\u02a7\n\60\3\61\3\61\5\61\u02ab\n\61\3\61"+
		"\7\61\u02ae\n\61\f\61\16\61\u02b1\13\61\3\61\3\61\7\61\u02b5\n\61\f\61"+
		"\16\61\u02b8\13\61\3\61\3\61\7\61\u02bc\n\61\f\61\16\61\u02bf\13\61\3"+
		"\61\3\61\7\61\u02c3\n\61\f\61\16\61\u02c6\13\61\3\61\3\61\3\61\7\61\u02cb"+
		"\n\61\f\61\16\61\u02ce\13\61\5\61\u02d0\n\61\3\62\3\62\5\62\u02d4\n\62"+
		"\3\62\7\62\u02d7\n\62\f\62\16\62\u02da\13\62\3\62\7\62\u02dd\n\62\f\62"+
		"\16\62\u02e0\13\62\3\62\3\62\5\62\u02e4\n\62\3\62\7\62\u02e7\n\62\f\62"+
		"\16\62\u02ea\13\62\3\62\7\62\u02ed\n\62\f\62\16\62\u02f0\13\62\3\62\3"+
		"\62\5\62\u02f4\n\62\3\62\5\62\u02f7\n\62\3\62\7\62\u02fa\n\62\f\62\16"+
		"\62\u02fd\13\62\3\62\7\62\u0300\n\62\f\62\16\62\u0303\13\62\3\62\3\62"+
		"\7\62\u0307\n\62\f\62\16\62\u030a\13\62\5\62\u030c\n\62\3\63\3\63\5\63"+
		"\u0310\n\63\3\63\3\63\5\63\u0314\n\63\3\63\3\63\3\63\7\63\u0319\n\63\f"+
		"\63\16\63\u031c\13\63\3\63\3\63\5\63\u0320\n\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\7\63\u0328\n\63\f\63\16\63\u032b\13\63\3\63\3\63\5\63\u032f\n"+
		"\63\3\63\7\63\u0332\n\63\f\63\16\63\u0335\13\63\3\63\3\63\3\63\3\63\5"+
		"\63\u033b\n\63\3\63\7\63\u033e\n\63\f\63\16\63\u0341\13\63\3\63\3\63\3"+
		"\63\3\63\3\63\7\63\u0348\n\63\f\63\16\63\u034b\13\63\3\63\3\63\5\63\u034f"+
		"\n\63\3\63\3\63\3\63\7\63\u0354\n\63\f\63\16\63\u0357\13\63\3\63\3\63"+
		"\3\63\3\63\7\63\u035d\n\63\f\63\16\63\u0360\13\63\3\63\3\63\3\63\7\63"+
		"\u0365\n\63\f\63\16\63\u0368\13\63\3\63\3\63\3\63\3\63\7\63\u036e\n\63"+
		"\f\63\16\63\u0371\13\63\5\63\u0373\n\63\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\7\65\u037c\n\65\f\65\16\65\u037f\13\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\5\66\u038a\n\66\3\66\5\66\u038d\n\66\3\66\3\66\5"+
		"\66\u0391\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u039f\n\66\3\66\3\66\3\66\3\66\3\66\5\66\u03a6\n\66\3\67\3"+
		"\67\3\67\38\38\38\78\u03ae\n8\f8\168\u03b1\138\39\39\3:\3:\5:\u03b7\n"+
		":\3;\3;\3;\5;\u03bc\n;\3;\3;\3<\3<\3<\5<\u03c3\n<\3=\3=\3=\3=\5=\u03c9"+
		"\n=\3=\3=\5=\u03cd\n=\3>\3>\3>\3>\3?\3?\3@\3@\3@\3@\5@\u03d9\n@\3@\3@"+
		"\3A\3A\3A\3A\3B\3B\3B\5B\u03e4\nB\3C\3C\3C\5C\u03e9\nC\3D\3D\3D\3D\5D"+
		"\u03ef\nD\3D\5D\u03f2\nD\3D\5D\u03f5\nD\3E\5E\u03f8\nE\3E\3E\3E\5E\u03fd"+
		"\nE\3E\3E\3E\3E\5E\u0403\nE\3E\3E\3E\5E\u0408\nE\3E\3E\3E\5E\u040d\nE"+
		"\3E\5E\u0410\nE\3F\3F\3F\3F\3F\5F\u0417\nF\3G\3G\3G\3H\3H\3H\3I\3I\3J"+
		"\3J\3J\3J\3J\3K\3K\6K\u0428\nK\rK\16K\u0429\3K\3K\3K\3K\5K\u0430\nK\3"+
		"L\3L\3L\5L\u0435\nL\3L\3L\3L\7L\u043a\nL\fL\16L\u043d\13L\3M\3M\3M\3M"+
		"\5M\u0443\nM\7M\u0445\nM\fM\16M\u0448\13M\3M\5M\u044b\nM\3N\3N\5N\u044f"+
		"\nN\3N\3N\5N\u0453\nN\3N\3N\3O\3O\3O\3O\7O\u045b\nO\fO\16O\u045e\13O\3"+
		"O\3O\3P\3P\5P\u0464\nP\3Q\5Q\u0467\nQ\3Q\3Q\3Q\5Q\u046c\nQ\3R\3R\3R\3"+
		"R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0487"+
		"\nR\3S\3S\5S\u048b\nS\3S\3S\3S\3S\5S\u0491\nS\3T\3T\5T\u0495\nT\3T\3T"+
		"\3U\3U\5U\u049b\nU\3U\3U\3V\5V\u04a0\nV\3V\3V\3V\5V\u04a5\nV\3V\5V\u04a8"+
		"\nV\3V\3V\3W\3W\3W\3W\3X\3X\3Y\3Y\5Y\u04b4\nY\3Y\3Y\3Z\3Z\5Z\u04ba\nZ"+
		"\3Z\3Z\3[\3[\3[\5[\u04c1\n[\3[\3[\3\\\3\\\5\\\u04c7\n\\\3\\\3\\\3]\3]"+
		"\3]\5]\u04ce\n]\3]\3]\3^\3^\5^\u04d4\n^\3^\3^\3_\3_\5_\u04da\n_\3_\3_"+
		"\3`\3`\5`\u04e0\n`\3`\3`\3a\3a\5a\u04e6\na\3a\3a\3b\3b\5b\u04ec\nb\3b"+
		"\3b\5b\u04f0\nb\3c\3c\5c\u04f4\nc\3c\3c\3d\3d\5d\u04fa\nd\3d\3d\3e\3e"+
		"\5e\u0500\ne\3e\3e\3f\3f\5f\u0506\nf\3f\3f\3g\3g\5g\u050c\ng\3g\3g\3h"+
		"\3h\3h\3i\3i\3i\3j\3j\5j\u0518\nj\3j\3j\3j\3j\7j\u051e\nj\fj\16j\u0521"+
		"\13j\3j\3j\3k\3k\3k\3k\3k\3k\5k\u052b\nk\3l\3l\5l\u052f\nl\3l\5l\u0532"+
		"\nl\3l\3l\7l\u0536\nl\fl\16l\u0539\13l\3m\5m\u053c\nm\3m\3m\3m\3m\7m\u0542"+
		"\nm\fm\16m\u0545\13m\3m\3m\7m\u0549\nm\fm\16m\u054c\13m\3n\5n\u054f\n"+
		"n\3n\3n\5n\u0553\nn\3n\5n\u0556\nn\3n\5n\u0559\nn\3n\3n\7n\u055d\nn\f"+
		"n\16n\u0560\13n\3o\3o\5o\u0564\no\3o\5o\u0567\no\3o\3o\7o\u056b\no\fo"+
		"\16o\u056e\13o\3p\5p\u0571\np\3p\3p\3p\5p\u0576\np\3p\3p\3p\3q\5q\u057c"+
		"\nq\3q\3q\3q\3r\3r\3s\3s\5s\u0585\ns\3t\3t\3u\3u\3u\3v\3v\3v\3v\3v\3v"+
		"\3v\3v\3v\5v\u0595\nv\3w\3w\3w\3w\3x\3x\3x\7x\u059e\nx\fx\16x\u05a1\13"+
		"x\3y\3y\5y\u05a5\ny\3y\5y\u05a8\ny\3z\3z\3z\3z\3{\6{\u05af\n{\r{\16{\u05b0"+
		"\3|\3|\3}\3}\3}\3}\3}\3}\7}\u05bb\n}\f}\16}\u05be\13}\3~\3~\3~\3~\3~\3"+
		"~\5~\u05c6\n~\3\177\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u05d6\n\u0081"+
		"\3\u0082\3\u0082\3\u0082\5\u0082\u05db\n\u0082\3\u0082\3\u0082\3\u0083"+
		"\3\u0083\5\u0083\u05e1\n\u0083\3\u0083\3\u0083\5\u0083\u05e5\n\u0083\3"+
		"\u0083\3\u0083\3\u0083\7\u0083\u05ea\n\u0083\f\u0083\16\u0083\u05ed\13"+
		"\u0083\3\u0083\7\u0083\u05f0\n\u0083\f\u0083\16\u0083\u05f3\13\u0083\3"+
		"\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\7\u0086\u05ff\n\u0086\f\u0086\16\u0086\u0602\13\u0086\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\7\u0088\u060a\n\u0088\f\u0088"+
		"\16\u0088\u060d\13\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089"+
		"\5\u0089\u0615\n\u0089\3\u0089\7\u0089\u0618\n\u0089\f\u0089\16\u0089"+
		"\u061b\13\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\5\u008a\u0624\n\u008a\3\u008a\3\u008a\3\u008a\7\u008a\u0629\n\u008a\f"+
		"\u008a\16\u008a\u062c\13\u008a\3\u008a\5\u008a\u062f\n\u008a\3\u008b\3"+
		"\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0638\n\u008b\3"+
		"\u008b\3\u008b\3\u008b\5\u008b\u063d\n\u008b\3\u008b\2\2\u008c\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\2)\60\2\13\13\r\16\20\20\24\27\32"+
		"\32\34\36  %%\'(+\60\63\63\67\679:=>ADGLOPVVY[^^`ajknors{{\177\u0080\u0082"+
		"\u008b\u008d\u008d\u0090\u0091\u0093\u0093\u0097\u0099\u009b\u009f\u00a4"+
		"\u00a5\u00a7\u00a7\u00a9\u00aa\u00ad\u00ad\u00af\u00b0\u00b2\u00b4\u00b8"+
		"\u00bb\u00bd\u00be\u00c0\u00c5\u00cb\u00cd\u00d2\u00d2\u00d4\u00d4\u00d8"+
		"\u00d8\u00db\u00dc\4\2\3\3\u00e0\u00e0\3\2\u00e6\u00e7\3\2\6\7\3\2\u00e3"+
		"\u00e4\4\2\u00e3\u00e3\u00e6\u00e6\5\2]]\u0091\u0091\u0093\u0093\4\2_"+
		"_ll\4\2\22\22\u00c9\u00c9\3\2\u00da\u00db\5\2\63\63<<``\6\2<<LL\u008b"+
		"\u008b\u00b2\u00b2\4\2\23\23@@\6\2\31\33::\u00c4\u00c5\u00dc\u00dc\7\2"+
		"\34\3599xx||\u00c6\u00c6\6\2YZrr\u0084\u0086\u009e\u009f\n\2\30\30PPR"+
		"Sbh}}\u0081\u0081\u00b5\u00b5\u00c7\u00c7\6\2;;QQ\u008f\u008f\u00a3\u00a3"+
		"\4\2#$\u00d6\u00d6\3\2#$\4\2\u0089\u0089\u0090\u0090\5\2yy~~\u00c8\u00c8"+
		"\4\2\31\31\u00d6\u00d6\4\2JJ\u00b1\u00b1\5\2<<GGPP\5\2<<DD\177\177\4\2"+
		"\u00bc\u00bc\u00d9\u00d9\5\2\u00b3\u00b3\u00d0\u00d0\u00dd\u00dd\3\2t"+
		"u\4\2\u009a\u009a\u00e0\u00e0\4\288\u00ae\u00ae\5\2OOoo\u008a\u008a\7"+
		"\2./<<GGPP\u00a5\u00a5\4\2<<\u00e5\u00e5\4\2WW\u00b6\u00b6\4\2\36\36["+
		"[\4\2!!\u00ac\u00ac\5\2\u0080\u0080\u00c2\u00c2\u00cc\u00cc\4\2==jj\u0702"+
		"\2\u0117\3\2\2\2\4\u0126\3\2\2\2\6\u0128\3\2\2\2\b\u012a\3\2\2\2\n\u012c"+
		"\3\2\2\2\f\u0135\3\2\2\2\16\u0137\3\2\2\2\20\u013f\3\2\2\2\22\u0145\3"+
		"\2\2\2\24\u0147\3\2\2\2\26\u014f\3\2\2\2\30\u0152\3\2\2\2\32\u015b\3\2"+
		"\2\2\34\u015f\3\2\2\2\36\u0161\3\2\2\2 \u0163\3\2\2\2\"\u016b\3\2\2\2"+
		"$\u016e\3\2\2\2&\u0179\3\2\2\2(\u0182\3\2\2\2*\u0184\3\2\2\2,\u018d\3"+
		"\2\2\2.\u0191\3\2\2\2\60\u0196\3\2\2\2\62\u019d\3\2\2\2\64\u019f\3\2\2"+
		"\2\66\u01b7\3\2\2\28\u01b9\3\2\2\2:\u01c1\3\2\2\2<\u01d6\3\2\2\2>\u01df"+
		"\3\2\2\2@\u01e7\3\2\2\2B\u01e9\3\2\2\2D\u01f1\3\2\2\2F\u01f8\3\2\2\2H"+
		"\u01fc\3\2\2\2J\u0202\3\2\2\2L\u0245\3\2\2\2N\u027b\3\2\2\2P\u027d\3\2"+
		"\2\2R\u027f\3\2\2\2T\u0281\3\2\2\2V\u0289\3\2\2\2X\u0298\3\2\2\2Z\u029a"+
		"\3\2\2\2\\\u02a0\3\2\2\2^\u02a6\3\2\2\2`\u02cf\3\2\2\2b\u030b\3\2\2\2"+
		"d\u0372\3\2\2\2f\u0374\3\2\2\2h\u0376\3\2\2\2j\u03a5\3\2\2\2l\u03a7\3"+
		"\2\2\2n\u03aa\3\2\2\2p\u03b2\3\2\2\2r\u03b6\3\2\2\2t\u03bb\3\2\2\2v\u03c2"+
		"\3\2\2\2x\u03c4\3\2\2\2z\u03ce\3\2\2\2|\u03d2\3\2\2\2~\u03d4\3\2\2\2\u0080"+
		"\u03dc\3\2\2\2\u0082\u03e3\3\2\2\2\u0084\u03e5\3\2\2\2\u0086\u03ea\3\2"+
		"\2\2\u0088\u040f\3\2\2\2\u008a\u0411\3\2\2\2\u008c\u0418\3\2\2\2\u008e"+
		"\u041b\3\2\2\2\u0090\u041e\3\2\2\2\u0092\u0420\3\2\2\2\u0094\u042f\3\2"+
		"\2\2\u0096\u0431\3\2\2\2\u0098\u043e\3\2\2\2\u009a\u044c\3\2\2\2\u009c"+
		"\u0456\3\2\2\2\u009e\u0463\3\2\2\2\u00a0\u0466\3\2\2\2\u00a2\u0486\3\2"+
		"\2\2\u00a4\u0488\3\2\2\2\u00a6\u0492\3\2\2\2\u00a8\u0498\3\2\2\2\u00aa"+
		"\u049f\3\2\2\2\u00ac\u04ab\3\2\2\2\u00ae\u04af\3\2\2\2\u00b0\u04b1\3\2"+
		"\2\2\u00b2\u04b7\3\2\2\2\u00b4\u04bd\3\2\2\2\u00b6\u04c4\3\2\2\2\u00b8"+
		"\u04ca\3\2\2\2\u00ba\u04d1\3\2\2\2\u00bc\u04d7\3\2\2\2\u00be\u04dd\3\2"+
		"\2\2\u00c0\u04e3\3\2\2\2\u00c2\u04e9\3\2\2\2\u00c4\u04f1\3\2\2\2\u00c6"+
		"\u04f7\3\2\2\2\u00c8\u04fd\3\2\2\2\u00ca\u0503\3\2\2\2\u00cc\u0509\3\2"+
		"\2\2\u00ce\u050f\3\2\2\2\u00d0\u0512\3\2\2\2\u00d2\u0515\3\2\2\2\u00d4"+
		"\u052a\3\2\2\2\u00d6\u052c\3\2\2\2\u00d8\u053b\3\2\2\2\u00da\u054e\3\2"+
		"\2\2\u00dc\u0561\3\2\2\2\u00de\u0570\3\2\2\2\u00e0\u057b\3\2\2\2\u00e2"+
		"\u0580\3\2\2\2\u00e4\u0582\3\2\2\2\u00e6\u0586\3\2\2\2\u00e8\u0588\3\2"+
		"\2\2\u00ea\u0594\3\2\2\2\u00ec\u0596\3\2\2\2\u00ee\u059a\3\2\2\2\u00f0"+
		"\u05a2\3\2\2\2\u00f2\u05a9\3\2\2\2\u00f4\u05ae\3\2\2\2\u00f6\u05b2\3\2"+
		"\2\2\u00f8\u05b4\3\2\2\2\u00fa\u05c5\3\2\2\2\u00fc\u05c7\3\2\2\2\u00fe"+
		"\u05cb\3\2\2\2\u0100\u05d5\3\2\2\2\u0102\u05d7\3\2\2\2\u0104\u05de\3\2"+
		"\2\2\u0106\u05f4\3\2\2\2\u0108\u05f6\3\2\2\2\u010a\u05f9\3\2\2\2\u010c"+
		"\u0603\3\2\2\2\u010e\u0607\3\2\2\2\u0110\u0611\3\2\2\2\u0112\u061f\3\2"+
		"\2\2\u0114\u063c\3\2\2\2\u0116\u0118\5\4\3\2\u0117\u0116\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\2\2\3\u011a\3\3\2\2\2"+
		"\u011b\u0127\5.\30\2\u011c\u0127\5\u010e\u0088\2\u011d\u0127\5\u0092J"+
		"\2\u011e\u0127\5\u0096L\2\u011f\u0127\5\u0098M\2\u0120\u0127\5\u0110\u0089"+
		"\2\u0121\u0127\5\u0102\u0082\2\u0122\u0127\5\u0104\u0083\2\u0123\u0127"+
		"\5\u0112\u008a\2\u0124\u0127\5\u010a\u0086\2\u0125\u0127\7\27\2\2\u0126"+
		"\u011b\3\2\2\2\u0126\u011c\3\2\2\2\u0126\u011d\3\2\2\2\u0126\u011e\3\2"+
		"\2\2\u0126\u011f\3\2\2\2\u0126\u0120\3\2\2\2\u0126\u0121\3\2\2\2\u0126"+
		"\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2"+
		"\2\2\u0127\5\3\2\2\2\u0128\u0129\t\2\2\2\u0129\7\3\2\2\2\u012a\u012b\t"+
		"\3\2\2\u012b\t\3\2\2\2\u012c\u012d\5\22\n\2\u012d\13\3\2\2\2\u012e\u012f"+
		"\5\n\6\2\u012f\u0130\7\4\2\2\u0130\u0131\5\22\n\2\u0131\u0136\3\2\2\2"+
		"\u0132\u0133\7\4\2\2\u0133\u0136\5\22\n\2\u0134\u0136\5\22\n\2\u0135\u012e"+
		"\3\2\2\2\u0135\u0132\3\2\2\2\u0135\u0134\3\2\2\2\u0136\r\3\2\2\2\u0137"+
		"\u013a\5\20\t\2\u0138\u0139\7\5\2\2\u0139\u013b\5\20\t\2\u013a\u0138\3"+
		"\2\2\2\u013a\u013b\3\2\2\2\u013b\17\3\2\2\2\u013c\u0140\7\u00e6\2\2\u013d"+
		"\u0140\7\u00e7\2\2\u013e\u0140\5\34\17\2\u013f\u013c\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u013f\u013e\3\2\2\2\u0140\21\3\2\2\2\u0141\u0146\5\24\13\2\u0142"+
		"\u0146\5\6\4\2\u0143\u0146\7\u00e5\2\2\u0144\u0146\7\u00e4\2\2\u0145\u0141"+
		"\3\2\2\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146"+
		"\23\3\2\2\2\u0147\u0148\t\4\2\2\u0148\25\3\2\2\2\u0149\u0150\5\30\r\2"+
		"\u014a\u0150\5\32\16\2\u014b\u0150\5\34\17\2\u014c\u0150\7\u008e\2\2\u014d"+
		"\u0150\7\u00ca\2\2\u014e\u0150\7N\2\2\u014f\u0149\3\2\2\2\u014f\u014a"+
		"\3\2\2\2\u014f\u014b\3\2\2\2\u014f\u014c\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\27\3\2\2\2\u0151\u0153\t\5\2\2\u0152\u0151\3\2\2"+
		"\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0156\7\u00e5\2\2\u0155"+
		"\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\7\4"+
		"\2\2\u0158\u0159\7\u00e5\2\2\u0159\31\3\2\2\2\u015a\u015c\t\5\2\2\u015b"+
		"\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\7\u00e5"+
		"\2\2\u015e\33\3\2\2\2\u015f\u0160\t\6\2\2\u0160\35\3\2\2\2\u0161\u0162"+
		"\t\7\2\2\u0162\37\3\2\2\2\u0163\u0164\7\u00e5\2\2\u0164!\3\2\2\2\u0165"+
		"\u016c\7\u00e6\2\2\u0166\u016c\5\34\17\2\u0167\u016c\7\u00e7\2\2\u0168"+
		"\u016c\7\31\2\2\u0169\u016c\7\24\2\2\u016a\u016c\7<\2\2\u016b\u0165\3"+
		"\2\2\2\u016b\u0166\3\2\2\2\u016b\u0167\3\2\2\2\u016b\u0168\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016c#\3\2\2\2\u016d\u016f\7<\2\2\u016e"+
		"\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\5("+
		"\25\2\u0171\u0173\7\b\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0176\5\"\22\2\u0175\u0177\5*\26\2\u0176\u0175\3"+
		"\2\2\2\u0176\u0177\3\2\2\2\u0177%\3\2\2\2\u0178\u017a\7<\2\2\u0179\u0178"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\5*\26\2\u017c"+
		"\'\3\2\2\2\u017d\u0183\7%\2\2\u017e\u017f\7$\2\2\u017f\u0183\7\u00b1\2"+
		"\2\u0180\u0181\7#\2\2\u0181\u0183\7\u00b1\2\2\u0182\u017d\3\2\2\2\u0182"+
		"\u017e\3\2\2\2\u0182\u0180\3\2\2\2\u0183)\3\2\2\2\u0184\u0186\7)\2\2\u0185"+
		"\u0187\7\b\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018b\3\2"+
		"\2\2\u0188\u018c\7\u00e6\2\2\u0189\u018c\5\34\17\2\u018a\u018c\7\u00e7"+
		"\2\2\u018b\u0188\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018c"+
		"+\3\2\2\2\u018d\u018e\7\\\2\2\u018e\u018f\7\u008c\2\2\u018f\u0190\7M\2"+
		"\2\u0190-\3\2\2\2\u0191\u0192\5\60\31\2\u0192\u0194\5\64\33\2\u0193\u0195"+
		"\5L\'\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195/\3\2\2\2\u0196\u0198"+
		"\7\17\2\2\u0197\u0199\5\62\32\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2"+
		"\2\u0199\u019a\3\2\2\2\u019a\u019b\7\u00bf\2\2\u019b\u019c\5\f\7\2\u019c"+
		"\61\3\2\2\2\u019d\u019e\t\b\2\2\u019e\63\3\2\2\2\u019f\u01a4\5\66\34\2"+
		"\u01a0\u01a1\7\t\2\2\u01a1\u01a3\5\66\34\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\65\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a7\u01b8\58\35\2\u01a8\u01b8\5:\36\2\u01a9\u01b8\5<"+
		"\37\2\u01aa\u01b8\5> \2\u01ab\u01b8\5B\"\2\u01ac\u01b8\5D#\2\u01ad\u01b8"+
		"\5F$\2\u01ae\u01b8\5H%\2\u01af\u01b8\5J&\2\u01b0\u01b8\5$\23\2\u01b1\u01b3"+
		"\5\u00a2R\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2"+
		"\2\u01b4\u01b5\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b8\5N(\2\u01b7\u01a7"+
		"\3\2\2\2\u01b7\u01a8\3\2\2\2\u01b7\u01a9\3\2\2\2\u01b7\u01aa\3\2\2\2\u01b7"+
		"\u01ab\3\2\2\2\u01b7\u01ac\3\2\2\2\u01b7\u01ad\3\2\2\2\u01b7\u01ae\3\2"+
		"\2\2\u01b7\u01af\3\2\2\2\u01b7\u01b0\3\2\2\2\u01b7\u01b2\3\2\2\2\u01b7"+
		"\u01b6\3\2\2\2\u01b8\67\3\2\2\2\u01b9\u01bb\7\f\2\2\u01ba\u01bc\7*\2\2"+
		"\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf"+
		"\5Z.\2\u01be\u01c0\5\\/\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"9\3\2\2\2\u01c1\u01c3\7\f\2\2\u01c2\u01c4\7*\2\2\u01c3\u01c2\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c8\7\3\2\2\u01c6\u01c9\5Z"+
		".\2\u01c7\u01c9\5\u00d4k\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9"+
		"\u01d1\3\2\2\2\u01ca\u01cd\7\t\2\2\u01cb\u01ce\5Z.\2\u01cc\u01ce\5\u00d4"+
		"k\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf"+
		"\u01ca\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2"+
		"\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\7\n\2\2\u01d5"+
		";\3\2\2\2\u01d6\u01d8\7\"\2\2\u01d7\u01d9\7*\2\2\u01d8\u01d7\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\5@!\2\u01db\u01dd\5Z.\2"+
		"\u01dc\u01de\5\\/\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de=\3\2"+
		"\2\2\u01df\u01e1\7F\2\2\u01e0\u01e2\7*\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\5@!\2\u01e4\u01e6\7!\2\2\u01e5"+
		"\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6?\3\2\2\2\u01e7\u01e8\5\22\n\2"+
		"\u01e8A\3\2\2\2\u01e9\u01eb\7\u0083\2\2\u01ea\u01ec\7*\2\2\u01eb\u01ea"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\5Z.\2\u01ee"+
		"\u01f0\5\\/\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0C\3\2\2\2\u01f1"+
		"\u01f3\7F\2\2\u01f2\u01f4\7U\2\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4\3\2\2"+
		"\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\t\t\2\2\u01f6\u01f7\5\22\n\2\u01f7"+
		"E\3\2\2\2\u01f8\u01f9\7F\2\2\u01f9\u01fa\7\u00a1\2\2\u01fa\u01fb\7l\2"+
		"\2\u01fbG\3\2\2\2\u01fc\u01fe\7\u00a8\2\2\u01fd\u01ff\t\n\2\2\u01fe\u01fd"+
		"\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\5\f\7\2\u0201"+
		"I\3\2\2\2\u0202\u0203\7\62\2\2\u0203\u0204\7\u00c9\2\2\u0204\u0205\5("+
		"\25\2\u0205\u0207\5\"\22\2\u0206\u0208\5*\26\2\u0207\u0206\3\2\2\2\u0207"+
		"\u0208\3\2\2\2\u0208K\3\2\2\2\u0209\u020a\7\f\2\2\u020a\u020b\7\u009a"+
		"\2\2\u020b\u0246\5\b\5\2\u020c\u020d\7F\2\2\u020d\u020e\7\u009a\2\2\u020e"+
		"\u0246\5T+\2\u020f\u0210\7\u00cb\2\2\u0210\u0211\7\u009a\2\2\u0211\u0246"+
		"\5T+\2\u0212\u0213\7C\2\2\u0213\u0214\7\u009a\2\2\u0214\u0215\5T+\2\u0215"+
		"\u0216\7\u00c0\2\2\u0216\u0246\3\2\2\2\u0217\u0218\7^\2\2\u0218\u0219"+
		"\7\u009a\2\2\u0219\u021a\5T+\2\u021a\u021b\7\u00c0\2\2\u021b\u0246\3\2"+
		"\2\2\u021c\u021d\7(\2\2\u021d\u021e\7\u009a\2\2\u021e\u0246\7\u00e5\2"+
		"\2\u021f\u0220\7\u00a9\2\2\u0220\u0225\7\u009a\2\2\u0221\u0222\5T+\2\u0222"+
		"\u0223\7i\2\2\u0223\u0224\5\b\5\2\u0224\u0226\3\2\2\2\u0225\u0221\3\2"+
		"\2\2\u0225\u0226\3\2\2\2\u0226\u0246\3\2\2\2\u0227\u0228\7K\2\2\u0228"+
		"\u0229\7\u009a\2\2\u0229\u022a\7\u00e6\2\2\u022a\u022b\7\u00da\2\2\u022b"+
		"\u022c\7\u00bf\2\2\u022c\u022f\5\22\n\2\u022d\u022e\t\13\2\2\u022e\u0230"+
		"\7\u00d4\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0246\3\2\2"+
		"\2\u0231\u0232\7\21\2\2\u0232\u0233\7\u009a\2\2\u0233\u0246\5T+\2\u0234"+
		"\u0235\7&\2\2\u0235\u0236\7\u009a\2\2\u0236\u0246\5T+\2\u0237\u0238\7"+
		"\u0094\2\2\u0238\u0239\7\u009a\2\2\u0239\u0246\5T+\2\u023a\u023b\7\u00a4"+
		"\2\2\u023b\u023c\7\u009a\2\2\u023c\u0246\5T+\2\u023d\u023e\7\u00aa\2\2"+
		"\u023e\u023f\7\u009a\2\2\u023f\u0246\5T+\2\u0240\u0241\7\u00a7\2\2\u0241"+
		"\u0246\7\u009b\2\2\u0242\u0243\7\u00d2\2\2\u0243\u0246\7\u009b\2\2\u0244"+
		"\u0246\5\u0086D\2\u0245\u0209\3\2\2\2\u0245\u020c\3\2\2\2\u0245\u020f"+
		"\3\2\2\2\u0245\u0212\3\2\2\2\u0245\u0217\3\2\2\2\u0245\u021c\3\2\2\2\u0245"+
		"\u021f\3\2\2\2\u0245\u0227\3\2\2\2\u0245\u0231\3\2\2\2\u0245\u0234\3\2"+
		"\2\2\u0245\u0237\3\2\2\2\u0245\u023a\3\2\2\2\u0245\u023d\3\2\2\2\u0245"+
		"\u0240\3\2\2\2\u0245\u0242\3\2\2\2\u0245\u0244\3\2\2\2\u0246M\3\2\2\2"+
		"\u0247\u0248\7\f\2\2\u0248\u027c\5\u00d4k\2\u0249\u024b\7\17\2\2\u024a"+
		"\u024c\7*\2\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2"+
		"\2\2\u024d\u0253\5\22\n\2\u024e\u024f\7\u00b1\2\2\u024f\u0250\7<\2\2\u0250"+
		"\u0254\5\26\f\2\u0251\u0252\7F\2\2\u0252\u0254\7<\2\2\u0253\u024e\3\2"+
		"\2\2\u0253\u0251\3\2\2\2\u0254\u027c\3\2\2\2\u0255\u0256\7F\2\2\u0256"+
		"\u0257\7_\2\2\u0257\u027c\5\u00e6t\2\u0258\u0259\7B\2\2\u0259\u027c\7"+
		"m\2\2\u025a\u025b\7H\2\2\u025b\u027c\7m\2\2\u025c\u025d\7\u0096\2\2\u025d"+
		"\u025e\7\37\2\2\u025e\u0263\5V,\2\u025f\u0260\7\t\2\2\u0260\u0262\5V,"+
		"\2\u0261\u025f\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264"+
		"\3\2\2\2\u0264\u027c\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u027c\7T\2\2\u0267"+
		"\u0268\7C\2\2\u0268\u027c\7\u00c0\2\2\u0269\u026a\7^\2\2\u026a\u027c\7"+
		"\u00c0\2\2\u026b\u026d\7\16\2\2\u026c\u026e\7\b\2\2\u026d\u026c\3\2\2"+
		"\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u027c\5P)\2\u0270\u0272"+
		"\7v\2\2\u0271\u0273\7\b\2\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u027c\5R*\2\u0275\u0276\7\u00a8\2\2\u0276\u0277\t"+
		"\t\2\2\u0277\u0278\5\22\n\2\u0278\u0279\7\u00c9\2\2\u0279\u027a\5\22\n"+
		"\2\u027a\u027c\3\2\2\2\u027b\u0247\3\2\2\2\u027b\u0249\3\2\2\2\u027b\u0255"+
		"\3\2\2\2\u027b\u0258\3\2\2\2\u027b\u025a\3\2\2\2\u027b\u025c\3\2\2\2\u027b"+
		"\u0266\3\2\2\2\u027b\u0267\3\2\2\2\u027b\u0269\3\2\2\2\u027b\u026b\3\2"+
		"\2\2\u027b\u0270\3\2\2\2\u027b\u0275\3\2\2\2\u027cO\3\2\2\2\u027d\u027e"+
		"\t\f\2\2\u027eQ\3\2\2\2\u027f\u0280\t\r\2\2\u0280S\3\2\2\2\u0281\u0286"+
		"\5\24\13\2\u0282\u0283\7\t\2\2\u0283\u0285\5\24\13\2\u0284\u0282\3\2\2"+
		"\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287U"+
		"\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028b\5X-\2\u028a\u028c\t\16\2\2\u028b"+
		"\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028cW\3\2\2\2\u028d\u028e\5\22\n\2"+
		"\u028e\u028f\7\4\2\2\u028f\u0290\5\22\n\2\u0290\u0291\7\4\2\2\u0291\u0292"+
		"\5\22\n\2\u0292\u0299\3\2\2\2\u0293\u0294\5\22\n\2\u0294\u0295\7\4\2\2"+
		"\u0295\u0296\5\22\n\2\u0296\u0299\3\2\2\2\u0297\u0299\5\22\n\2\u0298\u028d"+
		"\3\2\2\2\u0298\u0293\3\2\2\2\u0298\u0297\3\2\2\2\u0299Y\3\2\2\2\u029a"+
		"\u029b\5\22\n\2\u029b\u029c\5^\60\2\u029c[\3\2\2\2\u029d\u02a1\7O\2\2"+
		"\u029e\u029f\7\r\2\2\u029f\u02a1\5\22\n\2\u02a0\u029d\3\2\2\2\u02a0\u029e"+
		"\3\2\2\2\u02a1]\3\2\2\2\u02a2\u02a7\5`\61\2\u02a3\u02a7\5b\62\2\u02a4"+
		"\u02a7\5d\63\2\u02a5\u02a7\5h\65\2\u02a6\u02a2\3\2\2\2\u02a6\u02a3\3\2"+
		"\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a5\3\2\2\2\u02a7_\3\2\2\2\u02a8\u02aa"+
		"\t\17\2\2\u02a9\u02ab\5z>\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02af\3\2\2\2\u02ac\u02ae\5j\66\2\u02ad\u02ac\3\2\2\2\u02ae\u02b1\3\2"+
		"\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02d0\3\2\2\2\u02b1"+
		"\u02af\3\2\2\2\u02b2\u02b6\t\20\2\2\u02b3\u02b5\5j\66\2\u02b4\u02b3\3"+
		"\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u02d0\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02bd\t\21\2\2\u02ba\u02bc\5"+
		"j\66\2\u02bb\u02ba\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd"+
		"\u02be\3\2\2\2\u02be\u02d0\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c4\7k"+
		"\2\2\u02c1\u02c3\5j\66\2\u02c2\u02c1\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4"+
		"\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02d0\3\2\2\2\u02c6\u02c4\3\2"+
		"\2\2\u02c7\u02c8\7\u00d5\2\2\u02c8\u02cc\5z>\2\u02c9\u02cb\5j\66\2\u02ca"+
		"\u02c9\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2"+
		"\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02a8\3\2\2\2\u02cf"+
		"\u02b2\3\2\2\2\u02cf\u02b9\3\2\2\2\u02cf\u02c0\3\2\2\2\u02cf\u02c7\3\2"+
		"\2\2\u02d0a\3\2\2\2\u02d1\u02d3\t\22\2\2\u02d2\u02d4\5z>\2\u02d3\u02d2"+
		"\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d8\3\2\2\2\u02d5\u02d7\5|?\2\u02d6"+
		"\u02d5\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2"+
		"\2\2\u02d9\u02de\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02dd\5j\66\2\u02dc"+
		"\u02db\3\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2"+
		"\2\2\u02df\u030c\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02e3\t\23\2\2\u02e2"+
		"\u02e4\5~@\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e8\3\2\2"+
		"\2\u02e5\u02e7\5|?\2\u02e6\u02e5\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e6"+
		"\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ee\3\2\2\2\u02ea\u02e8\3\2\2\2\u02eb"+
		"\u02ed\5j\66\2\u02ec\u02eb\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2"+
		"\2\2\u02ee\u02ef\3\2\2\2\u02ef\u030c\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1"+
		"\u02f3\7E\2\2\u02f2\u02f4\7\u00a0\2\2\u02f3\u02f2\3\2\2\2\u02f3\u02f4"+
		"\3\2\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02f7\5~@\2\u02f6\u02f5\3\2\2\2\u02f6"+
		"\u02f7\3\2\2\2\u02f7\u02fb\3\2\2\2\u02f8\u02fa\5|?\2\u02f9\u02f8\3\2\2"+
		"\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u0301"+
		"\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u0300\5j\66\2\u02ff\u02fe\3\2\2\2\u0300"+
		"\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u030c\3\2"+
		"\2\2\u0303\u0301\3\2\2\2\u0304\u0308\7\u00b0\2\2\u0305\u0307\5j\66\2\u0306"+
		"\u0305\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2"+
		"\2\2\u0309\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u02d1\3\2\2\2\u030b"+
		"\u02e1\3\2\2\2\u030b\u02f1\3\2\2\2\u030b\u0304\3\2\2\2\u030cc\3\2\2\2"+
		"\u030d\u030e\7\u0088\2\2\u030e\u0310\b\63\1\2\u030f\u030d\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313\t\24\2\2\u0312\u0314\5"+
		"z>\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u031a\3\2\2\2\u0315"+
		"\u0319\5j\66\2\u0316\u0319\7 \2\2\u0317\u0319\7\u00cd\2\2\u0318\u0315"+
		"\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0317\3\2\2\2\u0319\u031c\3\2\2\2\u031a"+
		"\u0318\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u0373\3\2\2\2\u031c\u031a\3\2"+
		"\2\2\u031d\u031e\7\u0088\2\2\u031e\u0320\b\63\1\2\u031f\u031d\3\2\2\2"+
		"\u031f\u0320\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\t\25\2\2\u0322\u0323"+
		"\7\u00d7\2\2\u0323\u0329\5z>\2\u0324\u0328\5j\66\2\u0325\u0328\7 \2\2"+
		"\u0326\u0328\7\u00cd\2\2\u0327\u0324\3\2\2\2\u0327\u0325\3\2\2\2\u0327"+
		"\u0326\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2"+
		"\2\2\u032a\u0373\3\2\2\2\u032b\u0329\3\2\2\2\u032c\u032e\t\26\2\2\u032d"+
		"\u032f\5z>\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0333\3\2\2"+
		"\2\u0330\u0332\5j\66\2\u0331\u0330\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331"+
		"\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\3\2\2\2\u0335\u0333\3\2\2\2\u0336"+
		"\u0373\b\63\1\2\u0337\u0338\7\u0089\2\2\u0338\u033a\7\u00d6\2\2\u0339"+
		"\u033b\5z>\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033f\3\2\2"+
		"\2\u033c\u033e\5j\66\2\u033d\u033c\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d"+
		"\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0342\3\2\2\2\u0341\u033f\3\2\2\2\u0342"+
		"\u0373\b\63\1\2\u0343\u0349\t\27\2\2\u0344\u0348\5j\66\2\u0345\u0348\7"+
		" \2\2\u0346\u0348\7\u00cd\2\2\u0347\u0344\3\2\2\2\u0347\u0345\3\2\2\2"+
		"\u0347\u0346\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u034a"+
		"\3\2\2\2\u034a\u0373\3\2\2\2\u034b\u0349\3\2\2\2\u034c\u034e\7\u00c3\2"+
		"\2\u034d\u034f\5z>\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0355"+
		"\3\2\2\2\u0350\u0354\5j\66\2\u0351\u0354\7 \2\2\u0352\u0354\7\u00cd\2"+
		"\2\u0353\u0350\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0352\3\2\2\2\u0354\u0357"+
		"\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0373\3\2\2\2\u0357"+
		"\u0355\3\2\2\2\u0358\u0359\5f\64\2\u0359\u035e\t\30\2\2\u035a\u035d\5"+
		"j\66\2\u035b\u035d\7\u00cd\2\2\u035c\u035a\3\2\2\2\u035c\u035b\3\2\2\2"+
		"\u035d\u0360\3\2\2\2\u035e\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0373"+
		"\3\2\2\2\u0360\u035e\3\2\2\2\u0361\u0362\5f\64\2\u0362\u0366\7\u00d5\2"+
		"\2\u0363\u0365\5j\66\2\u0364\u0363\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364"+
		"\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0373\3\2\2\2\u0368\u0366\3\2\2\2\u0369"+
		"\u036f\7w\2\2\u036a\u036e\5j\66\2\u036b\u036e\7 \2\2\u036c\u036e\7\u00cd"+
		"\2\2\u036d\u036a\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036c\3\2\2\2\u036e"+
		"\u0371\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0373\3\2"+
		"\2\2\u0371\u036f\3\2\2\2\u0372\u030f\3\2\2\2\u0372\u031f\3\2\2\2\u0372"+
		"\u032c\3\2\2\2\u0372\u0337\3\2\2\2\u0372\u0343\3\2\2\2\u0372\u034c\3\2"+
		"\2\2\u0372\u0358\3\2\2\2\u0372\u0361\3\2\2\2\u0372\u0369\3\2\2\2\u0373"+
		"e\3\2\2\2\u0374\u0375\7w\2\2\u0375g\3\2\2\2\u0376\u0377\t\31\2\2\u0377"+
		"\u0378\7\3\2\2\u0378\u0379\5n8\2\u0379\u037d\7\n\2\2\u037a\u037c\5j\66"+
		"\2\u037b\u037a\3\2\2\2\u037c\u037f\3\2\2\2\u037d\u037b\3\2\2\2\u037d\u037e"+
		"\3\2\2\2\u037ei\3\2\2\2\u037f\u037d\3\2\2\2\u0380\u03a6\5v<\2\u0381\u03a6"+
		"\5r:\2\u0382\u03a6\5*\26\2\u0383\u03a6\5x=\2\u0384\u03a6\5l\67\2\u0385"+
		"\u0386\7\u0092\2\2\u0386\u038c\7\u00d1\2\2\u0387\u0389\7\65\2\2\u0388"+
		"\u038a\5\u0082B\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038d"+
		"\3\2\2\2\u038b\u038d\5\u0080A\2\u038c\u0387\3\2\2\2\u038c\u038b\3\2\2"+
		"\2\u038d\u03a6\3\2\2\2\u038e\u0390\7\u00cf\2\2\u038f\u0391\7l\2\2\u0390"+
		"\u038f\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u03a6\3\2\2\2\u0392\u03a6\7l"+
		"\2\2\u0393\u03a6\7\25\2\2\u0394\u03a6\7\31\2\2\u0395\u0396\7-\2\2\u0396"+
		"\u03a6\5\34\17\2\u0397\u0398\7,\2\2\u0398\u03a6\t\32\2\2\u0399\u039a\7"+
		"\u00bb\2\2\u039a\u03a6\t\33\2\2\u039b\u03a6\t\34\2\2\u039c\u039d\7X\2"+
		"\2\u039d\u039f\7\20\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0\u03a1\7\22\2\2\u03a1\u03a6\5\b\5\2\u03a2\u03a6\5"+
		"\u00f8}\2\u03a3\u03a4\7&\2\2\u03a4\u03a6\5\b\5\2\u03a5\u0380\3\2\2\2\u03a5"+
		"\u0381\3\2\2\2\u03a5\u0382\3\2\2\2\u03a5\u0383\3\2\2\2\u03a5\u0384\3\2"+
		"\2\2\u03a5\u0385\3\2\2\2\u03a5\u038e\3\2\2\2\u03a5\u0392\3\2\2\2\u03a5"+
		"\u0393\3\2\2\2\u03a5\u0394\3\2\2\2\u03a5\u0395\3\2\2\2\u03a5\u0397\3\2"+
		"\2\2\u03a5\u0399\3\2\2\2\u03a5\u039b\3\2\2\2\u03a5\u039e\3\2\2\2\u03a5"+
		"\u03a2\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6k\3\2\2\2\u03a7\u03a8\7\u00a1"+
		"\2\2\u03a8\u03a9\7l\2\2\u03a9m\3\2\2\2\u03aa\u03af\5p9\2\u03ab\u03ac\7"+
		"\t\2\2\u03ac\u03ae\5p9\2\u03ad\u03ab\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af"+
		"\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0o\3\2\2\2\u03b1\u03af\3\2\2\2"+
		"\u03b2\u03b3\5\34\17\2\u03b3q\3\2\2\2\u03b4\u03b7\5t;\2\u03b5\u03b7\7"+
		"\24\2\2\u03b6\u03b4\3\2\2\2\u03b6\u03b5\3\2\2\2\u03b7s\3\2\2\2\u03b8\u03b9"+
		"\7$\2\2\u03b9\u03bc\7\u00b1\2\2\u03ba\u03bc\7%\2\2\u03bb\u03b8\3\2\2\2"+
		"\u03bb\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\5\"\22\2\u03beu\3"+
		"\2\2\2\u03bf\u03c0\7\u008c\2\2\u03c0\u03c3\7\u008e\2\2\u03c1\u03c3\7\u008e"+
		"\2\2\u03c2\u03bf\3\2\2\2\u03c2\u03c1\3\2\2\2\u03c3w\3\2\2\2\u03c4\u03cc"+
		"\7<\2\2\u03c5\u03cd\5\26\f\2\u03c6\u03c8\7\65\2\2\u03c7\u03c9\5\u0082"+
		"B\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cd\3\2\2\2\u03ca"+
		"\u03cd\5\u0080A\2\u03cb\u03cd\5\u0084C\2\u03cc\u03c5\3\2\2\2\u03cc\u03c6"+
		"\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cc\u03cb\3\2\2\2\u03cdy\3\2\2\2\u03ce"+
		"\u03cf\7\3\2\2\u03cf\u03d0\7\u00e5\2\2\u03d0\u03d1\7\n\2\2\u03d1{\3\2"+
		"\2\2\u03d2\u03d3\t\35\2\2\u03d3}\3\2\2\2\u03d4\u03d5\7\3\2\2\u03d5\u03d8"+
		"\7\u00e5\2\2\u03d6\u03d7\7\t\2\2\u03d7\u03d9\7\u00e5\2\2\u03d8\u03d6\3"+
		"\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03db\7\n\2\2\u03db"+
		"\177\3\2\2\2\u03dc\u03dd\7\u008d\2\2\u03dd\u03de\7\3\2\2\u03de\u03df\7"+
		"\n\2\2\u03df\u0081\3\2\2\2\u03e0\u03e4\5z>\2\u03e1\u03e2\7\3\2\2\u03e2"+
		"\u03e4\7\n\2\2\u03e3\u03e0\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e4\u0083\3\2"+
		"\2\2\u03e5\u03e8\t\36\2\2\u03e6\u03e7\7\3\2\2\u03e7\u03e9\7\n\2\2\u03e8"+
		"\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u0085\3\2\2\2\u03ea\u03eb\7\u009a"+
		"\2\2\u03eb\u03ec\7\37\2\2\u03ec\u03ee\5\u0088E\2\u03ed\u03ef\5\u008cG"+
		"\2\u03ee\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f1\3\2\2\2\u03f0\u03f2"+
		"\5\u008aF\2\u03f1\u03f0\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f4\3\2\2"+
		"\2\u03f3\u03f5\5\u008eH\2\u03f4\u03f3\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5"+
		"\u0087\3\2\2\2\u03f6\u03f8\7q\2\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2"+
		"\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\7[\2\2\u03fa\u0410\5\b\5\2\u03fb"+
		"\u03fd\7q\2\2\u03fc\u03fb\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03fe\3\2"+
		"\2\2\u03fe\u0402\7l\2\2\u03ff\u0400\7\16\2\2\u0400\u0401\7\b\2\2\u0401"+
		"\u0403\7\u00e5\2\2\u0402\u03ff\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404"+
		"\3\2\2\2\u0404\u0410\5\b\5\2\u0405\u0407\7\u00a2\2\2\u0406\u0408\7+\2"+
		"\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u0410"+
		"\5\b\5\2\u040a\u040c\7s\2\2\u040b\u040d\7+\2\2\u040c\u040b\3\2\2\2\u040c"+
		"\u040d\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0410\5\b\5\2\u040f\u03f7\3\2"+
		"\2\2\u040f\u03fc\3\2\2\2\u040f\u0405\3\2\2\2\u040f\u040a\3\2\2\2\u0410"+
		"\u0089\3\2\2\2\u0411\u0412\7\u00bd\2\2\u0412\u0413\7\37\2\2\u0413\u0416"+
		"\5\u0088E\2\u0414\u0415\7\u00be\2\2\u0415\u0417\7\u00e5\2\2\u0416\u0414"+
		"\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u008b\3\2\2\2\u0418\u0419\7\u009c\2"+
		"\2\u0419\u041a\7\u00e5\2\2\u041a\u008d\3\2\2\2\u041b\u041c\7\3\2\2\u041c"+
		"\u041d\5\u0090I\2\u041d\u008f\3\2\2\2\u041e\u041f\t\37\2\2\u041f\u0091"+
		"\3\2\2\2\u0420\u0421\7\17\2\2\u0421\u0422\t \2\2\u0422\u0423\5\22\n\2"+
		"\u0423\u0424\5\u0094K\2\u0424\u0093\3\2\2\2\u0425\u0428\5$\23\2\u0426"+
		"\u0428\5&\24\2\u0427\u0425\3\2\2\2\u0427\u0426\3\2\2\2\u0428\u0429\3\2"+
		"\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u0430\3\2\2\2\u042b"+
		"\u042c\7\u00d2\2\2\u042c\u042d\7\67\2\2\u042d\u042e\7A\2\2\u042e\u0430"+
		"\7\u0087\2\2\u042f\u0427\3\2\2\2\u042f\u042b\3\2\2\2\u0430\u0095\3\2\2"+
		"\2\u0431\u0432\7\64\2\2\u0432\u0434\t \2\2\u0433\u0435\5,\27\2\u0434\u0433"+
		"\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u043b\5\22\n\2"+
		"\u0437\u043a\5$\23\2\u0438\u043a\5&\24\2\u0439\u0437\3\2\2\2\u0439\u0438"+
		"\3\2\2\2\u043a\u043d\3\2\2\2\u043b\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c"+
		"\u0097\3\2\2\2\u043d\u043b\3\2\2\2\u043e\u044a\5\u009aN\2\u043f\u0446"+
		"\5\u009cO\2\u0440\u0442\5\u00a2R\2\u0441\u0443\7\t\2\2\u0442\u0441\3\2"+
		"\2\2\u0442\u0443\3\2\2\2\u0443\u0445\3\2\2\2\u0444\u0440\3\2\2\2\u0445"+
		"\u0448\3\2\2\2\u0446\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u044b\3\2"+
		"\2\2\u0448\u0446\3\2\2\2\u0449\u044b\5\u00a0Q\2\u044a\u043f\3\2\2\2\u044a"+
		"\u0449\3\2\2\2\u044b\u0099\3\2\2\2\u044c\u044e\7\64\2\2\u044d\u044f\7"+
		"\u00c1\2\2\u044e\u044d\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0450\3\2\2\2"+
		"\u0450\u0452\7\u00bf\2\2\u0451\u0453\5,\27\2\u0452\u0451\3\2\2\2\u0452"+
		"\u0453\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\5\f\7\2\u0455\u009b\3\2"+
		"\2\2\u0456\u0457\7\3\2\2\u0457\u045c\5\u009eP\2\u0458\u0459\7\t\2\2\u0459"+
		"\u045b\5\u009eP\2\u045a\u0458\3\2\2\2\u045b\u045e\3\2\2\2\u045c\u045a"+
		"\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045f\3\2\2\2\u045e\u045c\3\2\2\2\u045f"+
		"\u0460\7\n\2\2\u0460\u009d\3\2\2\2\u0461\u0464\5Z.\2\u0462\u0464\5\u00d4"+
		"k\2\u0463\u0461\3\2\2\2\u0463\u0462\3\2\2\2\u0464\u009f\3\2\2\2\u0465"+
		"\u0467\7\3\2\2\u0466\u0465\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\3\2"+
		"\2\2\u0468\u0469\7p\2\2\u0469\u046b\5\f\7\2\u046a\u046c\7\n\2\2\u046b"+
		"\u046a\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u00a1\3\2\2\2\u046d\u0487\5\u00a4"+
		"S\2\u046e\u0487\5\u00a6T\2\u046f\u0487\5\u00a8U\2\u0470\u0487\5\u00aa"+
		"V\2\u0471\u0487\5\u00acW\2\u0472\u0487\5\u00aeX\2\u0473\u0487\5\u00b0"+
		"Y\2\u0474\u0487\5\u00b2Z\2\u0475\u0487\5\u00b4[\2\u0476\u0487\5\u00b6"+
		"\\\2\u0477\u0487\5\u00b8]\2\u0478\u0487\5\u00ba^\2\u0479\u0487\5\u00bc"+
		"_\2\u047a\u0487\5\u00be`\2\u047b\u0487\5\u00c0a\2\u047c\u0487\5\u00c2"+
		"b\2\u047d\u0487\5\u00c4c\2\u047e\u0487\5\u00c6d\2\u047f\u0487\5\u00c8"+
		"e\2\u0480\u0487\5\u00caf\2\u0481\u0487\5\u00ccg\2\u0482\u0487\5\u00ce"+
		"h\2\u0483\u0487\5\u00d0i\2\u0484\u0487\5\u00d2j\2\u0485\u0487\5\u0086"+
		"D\2\u0486\u046d\3\2\2\2\u0486\u046e\3\2\2\2\u0486\u046f\3\2\2\2\u0486"+
		"\u0470\3\2\2\2\u0486\u0471\3\2\2\2\u0486\u0472\3\2\2\2\u0486\u0473\3\2"+
		"\2\2\u0486\u0474\3\2\2\2\u0486\u0475\3\2\2\2\u0486\u0476\3\2\2\2\u0486"+
		"\u0477\3\2\2\2\u0486\u0478\3\2\2\2\u0486\u0479\3\2\2\2\u0486\u047a\3\2"+
		"\2\2\u0486\u047b\3\2\2\2\u0486\u047c\3\2\2\2\u0486\u047d\3\2\2\2\u0486"+
		"\u047e\3\2\2\2\u0486\u047f\3\2\2\2\u0486\u0480\3\2\2\2\u0486\u0481\3\2"+
		"\2\2\u0486\u0482\3\2\2\2\u0486\u0483\3\2\2\2\u0486\u0484\3\2\2\2\u0486"+
		"\u0485\3\2\2\2\u0487\u00a3\3\2\2\2\u0488\u048a\7I\2\2\u0489\u048b\7\b"+
		"\2\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u0490\3\2\2\2\u048c"+
		"\u0491\5\24\13\2\u048d\u0491\5\34\17\2\u048e\u0491\7\177\2\2\u048f\u0491"+
		"\7\u0080\2\2\u0490\u048c\3\2\2\2\u0490\u048d\3\2\2\2\u0490\u048e\3\2\2"+
		"\2\u0490\u048f\3\2\2\2\u0491\u00a5\3\2\2\2\u0492\u0494\7\25\2\2\u0493"+
		"\u0495\7\b\2\2\u0494\u0493\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\3\2"+
		"\2\2\u0496\u0497\5 \21\2\u0497\u00a7\3\2\2\2\u0498\u049a\7\26\2\2\u0499"+
		"\u049b\7\b\2\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\3\2"+
		"\2\2\u049c\u049d\5 \21\2\u049d\u00a9\3\2\2\2\u049e\u04a0\7<\2\2\u049f"+
		"\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a4\3\2\2\2\u04a1\u04a2\7$"+
		"\2\2\u04a2\u04a5\7\u00b1\2\2\u04a3\u04a5\7%\2\2\u04a4\u04a1\3\2\2\2\u04a4"+
		"\u04a3\3\2\2\2\u04a5\u04a7\3\2\2\2\u04a6\u04a8\7\b\2\2\u04a7\u04a6\3\2"+
		"\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa\5\"\22\2\u04aa"+
		"\u00ab\3\2\2\2\u04ab\u04ac\7\'\2\2\u04ac\u04ad\7\b\2\2\u04ad\u04ae\5 "+
		"\21\2\u04ae\u00ad\3\2\2\2\u04af\u04b0\5&\24\2\u04b0\u00af\3\2\2\2\u04b1"+
		"\u04b3\7-\2\2\u04b2\u04b4\7\b\2\2\u04b3\u04b2\3\2\2\2\u04b3\u04b4\3\2"+
		"\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\5\34\17\2\u04b6\u00b1\3\2\2\2\u04b7"+
		"\u04b9\7\60\2\2\u04b8\u04ba\7\b\2\2\u04b9\u04b8\3\2\2\2\u04b9\u04ba\3"+
		"\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bc\5\34\17\2\u04bc\u00b3\3\2\2\2\u04bd"+
		"\u04be\7\67\2\2\u04be\u04c0\7A\2\2\u04bf\u04c1\7\b\2\2\u04c0\u04bf\3\2"+
		"\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\5\34\17\2\u04c3"+
		"\u00b5\3\2\2\2\u04c4\u04c6\7>\2\2\u04c5\u04c7\7\b\2\2\u04c6\u04c5\3\2"+
		"\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\5 \21\2\u04c9"+
		"\u00b7\3\2\2\2\u04ca\u04cb\7_\2\2\u04cb\u04cd\7A\2\2\u04cc\u04ce\7\b\2"+
		"\2\u04cd\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0"+
		"\5\34\17\2\u04d0\u00b9\3\2\2\2\u04d1\u04d3\7a\2\2\u04d2\u04d4\7\b\2\2"+
		"\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6"+
		"\t!\2\2\u04d6\u00bb\3\2\2\2\u04d7\u04d9\7n\2\2\u04d8\u04da\7\b\2\2\u04d9"+
		"\u04d8\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\5 "+
		"\21\2\u04dc\u00bd\3\2\2\2\u04dd\u04df\7{\2\2\u04de\u04e0\7\b\2\2\u04df"+
		"\u04de\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04e2\5 "+
		"\21\2\u04e2\u00bf\3\2\2\2\u04e3\u04e5\7\u0082\2\2\u04e4\u04e6\7\b\2\2"+
		"\u04e5\u04e4\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8"+
		"\5 \21\2\u04e8\u00c1\3\2\2\2\u04e9\u04eb\7\u0097\2\2\u04ea\u04ec\7\b\2"+
		"\2\u04eb\u04ea\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04f0"+
		"\5 \21\2\u04ee\u04f0\7<\2\2\u04ef\u04ed\3\2\2\2\u04ef\u04ee\3\2\2\2\u04f0"+
		"\u00c3\3\2\2\2\u04f1\u04f3\7\u009d\2\2\u04f2\u04f4\7\b\2\2\u04f3\u04f2"+
		"\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\5\34\17\2"+
		"\u04f6\u00c5\3\2\2\2\u04f7\u04f9\7\u00ad\2\2\u04f8\u04fa\7\b\2\2\u04f9"+
		"\u04f8\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\t\""+
		"\2\2\u04fc\u00c7\3\2\2\2\u04fd\u04ff\7\u00b8\2\2\u04fe\u0500\7\b\2\2\u04ff"+
		"\u04fe\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\t#"+
		"\2\2\u0502\u00c9\3\2\2\2\u0503\u0505\7\u00b9\2\2\u0504\u0506\7\b\2\2\u0505"+
		"\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\t#"+
		"\2\2\u0508\u00cb\3\2\2\2\u0509\u050b\7\u00ba\2\2\u050a\u050c\7\b\2\2\u050b"+
		"\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\7\u00e5"+
		"\2\2\u050e\u00cd\3\2\2\2\u050f\u0510\7\u00bb\2\2\u0510\u0511\t\33\2\2"+
		"\u0511\u00cf\3\2\2\2\u0512\u0513\7\u00c0\2\2\u0513\u0514\5\36\20\2\u0514"+
		"\u00d1\3\2\2\2\u0515\u0517\7\u00ce\2\2\u0516\u0518\7\b\2\2\u0517\u0516"+
		"\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051a\7\3\2\2\u051a"+
		"\u051f\5\22\n\2\u051b\u051c\7\t\2\2\u051c\u051e\5\22\n\2\u051d\u051b\3"+
		"\2\2\2\u051e\u0521\3\2\2\2\u051f\u051d\3\2\2\2\u051f\u0520\3\2\2\2\u0520"+
		"\u0522\3\2\2\2\u0521\u051f\3\2\2\2\u0522\u0523\7\n\2\2\u0523\u00d3\3\2"+
		"\2\2\u0524\u052b\5\u00d6l\2\u0525\u052b\5\u00d8m\2\u0526\u052b\5\u00da"+
		"n\2\u0527\u052b\5\u00dco\2\u0528\u052b\5\u00dep\2\u0529\u052b\5\u00e0"+
		"q\2\u052a\u0524\3\2\2\2\u052a\u0525\3\2\2\2\u052a\u0526\3\2\2\2\u052a"+
		"\u0527\3\2\2\2\u052a\u0528\3\2\2\2\u052a\u0529\3\2\2\2\u052b\u00d5\3\2"+
		"\2\2\u052c\u052e\5\u00e2r\2\u052d\u052f\5\u00e6t\2\u052e\u052d\3\2\2\2"+
		"\u052e\u052f\3\2\2\2\u052f\u0531\3\2\2\2\u0530\u0532\5\u00e8u\2\u0531"+
		"\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0537\5\u00ec"+
		"w\2\u0534\u0536\5\u00eav\2\u0535\u0534\3\2\2\2\u0536\u0539\3\2\2\2\u0537"+
		"\u0535\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u00d7\3\2\2\2\u0539\u0537\3\2"+
		"\2\2\u053a\u053c\5\u00e4s\2\u053b\u053a\3\2\2\2\u053b\u053c\3\2\2\2\u053c"+
		"\u053d\3\2\2\2\u053d\u053e\7\u00a1\2\2\u053e\u0543\7l\2\2\u053f\u0542"+
		"\5\u00e8u\2\u0540\u0542\5\u00e6t\2\u0541\u053f\3\2\2\2\u0541\u0540\3\2"+
		"\2\2\u0542\u0545\3\2\2\2\u0543\u0541\3\2\2\2\u0543\u0544\3\2\2\2\u0544"+
		"\u0546\3\2\2\2\u0545\u0543\3\2\2\2\u0546\u054a\5\u00ecw\2\u0547\u0549"+
		"\5\u00eav\2\u0548\u0547\3\2\2\2\u0549\u054c\3\2\2\2\u054a\u0548\3\2\2"+
		"\2\u054a\u054b\3\2\2\2\u054b\u00d9\3\2\2\2\u054c\u054a\3\2\2\2\u054d\u054f"+
		"\5\u00e4s\2\u054e\u054d\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550\3\2\2"+
		"\2\u0550\u0552\7\u00cf\2\2\u0551\u0553\5\u00e2r\2\u0552\u0551\3\2\2\2"+
		"\u0552\u0553\3\2\2\2\u0553\u0555\3\2\2\2\u0554\u0556\5\u00e6t\2\u0555"+
		"\u0554\3\2\2\2\u0555\u0556\3\2\2\2\u0556\u0558\3\2\2\2\u0557\u0559\5\u00e8"+
		"u\2\u0558\u0557\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055a\3\2\2\2\u055a"+
		"\u055e\5\u00ecw\2\u055b\u055d\5\u00eav\2\u055c\u055b\3\2\2\2\u055d\u0560"+
		"\3\2\2\2\u055e\u055c\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u00db\3\2\2\2\u0560"+
		"\u055e\3\2\2\2\u0561\u0563\t$\2\2\u0562\u0564\5\u00e2r\2\u0563\u0562\3"+
		"\2\2\2\u0563\u0564\3\2\2\2\u0564\u0566\3\2\2\2\u0565\u0567\5\u00e6t\2"+
		"\u0566\u0565\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u056c"+
		"\5\u00ecw\2\u0569\u056b\5\u00eav\2\u056a\u0569\3\2\2\2\u056b\u056e\3\2"+
		"\2\2\u056c\u056a\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u00dd\3\2\2\2\u056e"+
		"\u056c\3\2\2\2\u056f\u0571\5\u00e4s\2\u0570\u056f\3\2\2\2\u0570\u0571"+
		"\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0573\7U\2\2\u0573\u0575\7l\2\2\u0574"+
		"\u0576\5\u00e6t\2\u0575\u0574\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0577"+
		"\3\2\2\2\u0577\u0578\5\u00ecw\2\u0578\u0579\5\u00f8}\2\u0579\u00df\3\2"+
		"\2\2\u057a\u057c\5\u00e4s\2\u057b\u057a\3\2\2\2\u057b\u057c\3\2\2\2\u057c"+
		"\u057d\3\2\2\2\u057d\u057e\7&\2\2\u057e\u057f\5\b\5\2\u057f\u00e1\3\2"+
		"\2\2\u0580\u0581\t\t\2\2\u0581\u00e3\3\2\2\2\u0582\u0584\7\61\2\2\u0583"+
		"\u0585\5\22\n\2\u0584\u0583\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u00e5\3"+
		"\2\2\2\u0586\u0587\5\22\n\2\u0587\u00e7\3\2\2\2\u0588\u0589\7\u00d3\2"+
		"\2\u0589\u058a\t%\2\2\u058a\u00e9\3\2\2\2\u058b\u058c\7n\2\2\u058c\u058d"+
		"\7\b\2\2\u058d\u0595\7\u00e5\2\2\u058e\u0595\5\u00e8u\2\u058f\u0590\7"+
		"\u00da\2\2\u0590\u0591\7\u0098\2\2\u0591\u0595\5\22\n\2\u0592\u0593\7"+
		"-\2\2\u0593\u0595\5\34\17\2\u0594\u058b\3\2\2\2\u0594\u058e\3\2\2\2\u0594"+
		"\u058f\3\2\2\2\u0594\u0592\3\2\2\2\u0595\u00eb\3\2\2\2\u0596\u0597\7\3"+
		"\2\2\u0597\u0598\5\u00eex\2\u0598\u0599\7\n\2\2\u0599\u00ed\3\2\2\2\u059a"+
		"\u059f\5\u00f0y\2\u059b\u059c\7\t\2\2\u059c\u059e\5\u00f0y\2\u059d\u059b"+
		"\3\2\2\2\u059e\u05a1\3\2\2\2\u059f\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0"+
		"\u00ef\3\2\2\2\u05a1\u059f\3\2\2\2\u05a2\u05a4\5\22\n\2\u05a3\u05a5\5"+
		"\u00f2z\2\u05a4\u05a3\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a7\3\2\2\2"+
		"\u05a6\u05a8\5\u00f6|\2\u05a7\u05a6\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8"+
		"\u00f1\3\2\2\2\u05a9\u05aa\7\3\2\2\u05aa\u05ab\5\u00f4{\2\u05ab\u05ac"+
		"\7\n\2\2\u05ac\u00f3\3\2\2\2\u05ad\u05af\7\u00e5\2\2\u05ae\u05ad\3\2\2"+
		"\2\u05af\u05b0\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u00f5"+
		"\3\2\2\2\u05b2\u05b3\t\16\2\2\u05b3\u00f7\3\2\2\2\u05b4\u05b5\7\u00a6"+
		"\2\2\u05b5\u05b6\5\f\7\2\u05b6\u05bc\5\u00ecw\2\u05b7\u05bb\5\u00fa~\2"+
		"\u05b8\u05bb\5\u00fc\177\2\u05b9\u05bb\5\u00fe\u0080\2\u05ba\u05b7\3\2"+
		"\2\2\u05ba\u05b8\3\2\2\2\u05ba\u05b9\3\2\2\2\u05bb\u05be\3\2\2\2\u05bc"+
		"\u05ba\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u00f9\3\2\2\2\u05be\u05bc\3\2"+
		"\2\2\u05bf\u05c0\7z\2\2\u05c0\u05c6\7V\2\2\u05c1\u05c2\7z\2\2\u05c2\u05c6"+
		"\7\u0099\2\2\u05c3\u05c4\7z\2\2\u05c4\u05c6\7\u00b4\2\2\u05c5\u05bf\3"+
		"\2\2\2\u05c5\u05c1\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c6\u00fb\3\2\2\2\u05c7"+
		"\u05c8\7\u0092\2\2\u05c8\u05c9\7?\2\2\u05c9\u05ca\5\u0100\u0081\2\u05ca"+
		"\u00fd\3\2\2\2\u05cb\u05cc\7\u0092\2\2\u05cc\u05cd\7\u00d1\2\2\u05cd\u05ce"+
		"\5\u0100\u0081\2\u05ce\u00ff\3\2\2\2\u05cf\u05d6\7\u00ac\2\2\u05d0\u05d6"+
		"\7!\2\2\u05d1\u05d2\7\u00b1\2\2\u05d2\u05d6\7\u008e\2\2\u05d3\u05d4\7"+
		"\u008a\2\2\u05d4\u05d6\7\13\2\2\u05d5\u05cf\3\2\2\2\u05d5\u05d0\3\2\2"+
		"\2\u05d5\u05d1\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d6\u0101\3\2\2\2\u05d7\u05d8"+
		"\7F\2\2\u05d8\u05da\t \2\2\u05d9\u05db\5\u0108\u0085\2\u05da\u05d9\3\2"+
		"\2\2\u05da\u05db\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05dd\5\22\n\2\u05dd"+
		"\u0103\3\2\2\2\u05de\u05e0\7F\2\2\u05df\u05e1\7\u00c1\2\2\u05e0\u05df"+
		"\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e4\7\u00bf\2"+
		"\2\u05e3\u05e5\5\u0108\u0085\2\u05e4\u05e3\3\2\2\2\u05e4\u05e5\3\2\2\2"+
		"\u05e5\u05e6\3\2\2\2\u05e6\u05eb\5\f\7\2\u05e7\u05e8\7\t\2\2\u05e8\u05ea"+
		"\5\f\7\2\u05e9\u05e7\3\2\2\2\u05ea\u05ed\3\2\2\2\u05eb\u05e9\3\2\2\2\u05eb"+
		"\u05ec\3\2\2\2\u05ec\u05f1\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ee\u05f0\5\u0106"+
		"\u0084\2\u05ef\u05ee\3\2\2\2\u05f0\u05f3\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1"+
		"\u05f2\3\2\2\2\u05f2\u0105\3\2\2\2\u05f3\u05f1\3\2\2\2\u05f4\u05f5\t&"+
		"\2\2\u05f5\u0107\3\2\2\2\u05f6\u05f7\7\\\2\2\u05f7\u05f8\7M\2\2\u05f8"+
		"\u0109\3\2\2\2\u05f9\u05fa\7\u00a8\2\2\u05fa\u05fb\7\u00bf\2\2\u05fb\u0600"+
		"\5\u010c\u0087\2\u05fc\u05fd\7\t\2\2\u05fd\u05ff\5\u010c\u0087\2\u05fe"+
		"\u05fc\3\2\2\2\u05ff\u0602\3\2\2\2\u0600\u05fe\3\2\2\2\u0600\u0601\3\2"+
		"\2\2\u0601\u010b\3\2\2\2\u0602\u0600\3\2\2\2\u0603\u0604\5\f\7\2\u0604"+
		"\u0605\7\u00c9\2\2\u0605\u0606\5\f\7\2\u0606\u010d\3\2\2\2\u0607\u060b"+
		"\7\17\2\2\u0608\u060a\5\u0114\u008b\2\u0609\u0608\3\2\2\2\u060a\u060d"+
		"\3\2\2\2\u060b\u0609\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u060e\3\2\2\2\u060d"+
		"\u060b\3\2\2\2\u060e\u060f\7\u00d8\2\2\u060f\u0610\5\22\n\2\u0610\u010f"+
		"\3\2\2\2\u0611\u0614\7\64\2\2\u0612\u0613\7\u0095\2\2\u0613\u0615\7\u00ab"+
		"\2\2\u0614\u0612\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0619\3\2\2\2\u0616"+
		"\u0618\5\u0114\u008b\2\u0617\u0616\3\2\2\2\u0618\u061b\3\2\2\2\u0619\u0617"+
		"\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061c\3\2\2\2\u061b\u0619\3\2\2\2\u061c"+
		"\u061d\7\u00d8\2\2\u061d\u061e\5\22\n\2\u061e\u0111\3\2\2\2\u061f\u0620"+
		"\7F\2\2\u0620\u0623\7\u00d8\2\2\u0621\u0622\7\\\2\2\u0622\u0624\7M\2\2"+
		"\u0623\u0621\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u062a"+
		"\5\22\n\2\u0626\u0627\7\t\2\2\u0627\u0629\5\22\n\2\u0628\u0626\3\2\2\2"+
		"\u0629\u062c\3\2\2\2\u062a\u0628\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062e"+
		"\3\2\2\2\u062c\u062a\3\2\2\2\u062d\u062f\t&\2\2\u062e\u062d\3\2\2\2\u062e"+
		"\u062f\3\2\2\2\u062f\u0113\3\2\2\2\u0630\u0631\7\16\2\2\u0631\u0632\7"+
		"\b\2\2\u0632\u063d\t\'\2\2\u0633\u0634\7=\2\2\u0634\u0637\7\b\2\2\u0635"+
		"\u0638\5\16\b\2\u0636\u0638\7\66\2\2\u0637\u0635\3\2\2\2\u0637\u0636\3"+
		"\2\2\2\u0638\u063d\3\2\2\2\u0639\u063a\7\u00b7\2\2\u063a\u063b\7\u00af"+
		"\2\2\u063b\u063d\t(\2\2\u063c\u0630\3\2\2\2\u063c\u0633\3\2\2\2\u063c"+
		"\u0639\3\2\2\2\u063d\u0115\3\2\2\2\u00cc\u0117\u0126\u0135\u013a\u013f"+
		"\u0145\u014f\u0152\u0155\u015b\u016b\u016e\u0172\u0176\u0179\u0182\u0186"+
		"\u018b\u0194\u0198\u01a4\u01b4\u01b7\u01bb\u01bf\u01c3\u01c8\u01cd\u01d1"+
		"\u01d8\u01dd\u01e1\u01e5\u01eb\u01ef\u01f3\u01fe\u0207\u0225\u022f\u0245"+
		"\u024b\u0253\u0263\u026d\u0272\u027b\u0286\u028b\u0298\u02a0\u02a6\u02aa"+
		"\u02af\u02b6\u02bd\u02c4\u02cc\u02cf\u02d3\u02d8\u02de\u02e3\u02e8\u02ee"+
		"\u02f3\u02f6\u02fb\u0301\u0308\u030b\u030f\u0313\u0318\u031a\u031f\u0327"+
		"\u0329\u032e\u0333\u033a\u033f\u0347\u0349\u034e\u0353\u0355\u035c\u035e"+
		"\u0366\u036d\u036f\u0372\u037d\u0389\u038c\u0390\u039e\u03a5\u03af\u03b6"+
		"\u03bb\u03c2\u03c8\u03cc\u03d8\u03e3\u03e8\u03ee\u03f1\u03f4\u03f7\u03fc"+
		"\u0402\u0407\u040c\u040f\u0416\u0427\u0429\u042f\u0434\u0439\u043b\u0442"+
		"\u0446\u044a\u044e\u0452\u045c\u0463\u0466\u046b\u0486\u048a\u0490\u0494"+
		"\u049a\u049f\u04a4\u04a7\u04b3\u04b9\u04c0\u04c6\u04cd\u04d3\u04d9\u04df"+
		"\u04e5\u04eb\u04ef\u04f3\u04f9\u04ff\u0505\u050b\u0517\u051f\u052a\u052e"+
		"\u0531\u0537\u053b\u0541\u0543\u054a\u054e\u0552\u0555\u0558\u055e\u0563"+
		"\u0566\u056c\u0570\u0575\u057b\u0584\u0594\u059f\u05a4\u05a7\u05b0\u05ba"+
		"\u05bc\u05c5\u05d5\u05da\u05e0\u05e4\u05eb\u05f1\u0600\u060b\u0614\u0619"+
		"\u0623\u062a\u062e\u0637\u063c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}