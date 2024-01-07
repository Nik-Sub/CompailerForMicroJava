package rs.ac.bg.etf.pp1;

import java_cup.runtime.Symbol;

%%

%{

	// ukljucivanje informacije o poziciji tokena
	private Symbol new_symbol(int type) {
		return new Symbol(type, yyline+1, yycolumn);
	}
	
	// ukljucivanje informacije o poziciji tokena
	private Symbol new_symbol(int type, Object value) {
		return new Symbol(type, yyline+1, yycolumn, value);
	}

%}

%cup
%line
%column

%xstate COMMENT

%eofval{
	return new_symbol(sym.EOF);
%eofval}

%%

" " 	{ }
"\b" 	{ }
"\t" 	{ }
"\r\n" 	{ }
"\f" 	{ }

"program"   { return new_symbol(sym.PROG, yytext());}
"break"		{ return new_symbol(sym.BREAK, yytext());}
"else"		{ return new_symbol(sym.ELSE, yytext());}
"const"		{ return new_symbol(sym.CONST, yytext());}
"if"		{ return new_symbol(sym.IF, yytext());}
"new"		{ return new_symbol(sym.NEW, yytext());}
"print"		{ return new_symbol(sym.PRINT, yytext());}
"read"		{ return new_symbol(sym.READ, yytext());}
"return"	{ return new_symbol(sym.RETURN, yytext());}
"void"		{ return new_symbol(sym.VOID, yytext());}
"continue"	{ return new_symbol(sym.CONTINUE, yytext());}
"for"		{ return new_symbol(sym.FOR, yytext());}
"static"	{ return new_symbol(sym.STATIC, yytext());}
"namespace" { return new_symbol(sym.NAMESPACE, yytext());}

"+" 		{ return new_symbol(sym.PLUS, yytext()); }
"-"			{ return new_symbol(sym.MINUS, yytext());}
"*"			{ return new_symbol(sym.ASTERISK, yytext());}
"/"			{ return new_symbol(sym.DIVISION, yytext());}
"%"			{ return new_symbol(sym.PERCENT, yytext());}
"=="		{ return new_symbol(sym.EQUALEQUAL, yytext());}
"!="		{ return new_symbol(sym.DIFF, yytext());}
">"			{ return new_symbol(sym.GT, yytext());}
">="		{ return new_symbol(sym.GET, yytext());}
"<"			{ return new_symbol(sym.LT, yytext());}
"<="		{ return new_symbol(sym.LET, yytext());}
"&&"		{ return new_symbol(sym.AND, yytext());}
"||"		{ return new_symbol(sym.OR, yytext());}
"=" 		{ return new_symbol(sym.EQUAL, yytext()); }
"++"		{ return new_symbol(sym.INC, yytext());}
"--"		{ return new_symbol(sym.DEC, yytext());}
";" 		{ return new_symbol(sym.SEMI, yytext()); }
":"			{ return new_symbol(sym.COL, yytext());}
"," 		{ return new_symbol(sym.COMMA, yytext()); }
"."			{ return new_symbol(sym.DOT, yytext());}
"(" 		{ return new_symbol(sym.LPAREN, yytext()); }
")" 		{ return new_symbol(sym.RPAREN, yytext()); }
"["			{ return new_symbol(sym.LBOXBRAC, yytext());}
"]"			{ return new_symbol(sym.RBOXBRAC, yytext());}
"{" 		{ return new_symbol(sym.LBRACE, yytext()); }
"}"			{ return new_symbol(sym.RBRACE, yytext()); }
"=>"		{ return new_symbol(sym.FOLLOWS, yytext());}

"//" {yybegin(COMMENT);}
<COMMENT> . {yybegin(COMMENT);}
<COMMENT> "\r\n" { yybegin(YYINITIAL); }

(true|false)   { return new_symbol(sym.BOOLCONST, new String (yytext())); }
[0-9]+  { return new_symbol(sym.NUMBER, new Integer (yytext())); }
"'"([a-z]|[A-Z])"'"  { return new_symbol(sym.LETTER, new String (yytext())); }
([a-z]|[A-Z])[a-z|A-Z|0-9|_]* 	{return new_symbol (sym.IDENT, yytext()); }

. { System.err.println("Leksicka greska ("+yytext()+") u liniji "+(yyline+1)); }