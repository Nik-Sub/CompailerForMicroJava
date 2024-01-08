/* The following code was generated by JFlex 1.4.3 on 1/8/24, 1:24 PM */

package rs.ac.bg.etf.pp1;

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 1/8/24, 1:24 PM from the specification file
 * <tt>spec/mjlexer.lex</tt>
 */
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\1\1\1\1\1\3\1\0\1\1\1\2\22\0\1\1\1\36"+
    "\3\0\1\34\1\41\1\56\1\47\1\50\1\32\1\30\1\45\1\31"+
    "\1\46\1\33\12\55\1\44\1\43\1\40\1\35\1\37\2\0\32\57"+
    "\1\51\1\0\1\52\1\0\1\60\1\0\1\10\1\12\1\17\1\25"+
    "\1\13\1\23\1\7\1\57\1\22\1\57\1\14\1\15\1\11\1\20"+
    "\1\6\1\4\1\57\1\5\1\16\1\21\1\26\1\27\1\24\3\57"+
    "\1\53\1\42\1\54\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\1\14\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\1\1\12\1\13\2\1\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\1\2\27\1\3\1\0\10\3\1\30"+
    "\3\3\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\0\1\42\2\3\1\43\7\3\1\44"+
    "\1\3\1\45\2\3\1\46\2\3\1\47\2\3\1\50"+
    "\4\3\1\51\1\52\1\3\1\53\1\3\1\54\1\3"+
    "\1\55\3\3\1\56\1\57\2\3\1\60\2\3\1\61"+
    "\1\3\1\62";

  private static int [] zzUnpackAction() {
    int [] result = new int[114];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\142\0\223\0\304\0\365\0\u0126"+
    "\0\u0157\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae"+
    "\0\u02df\0\u0310\0\u0341\0\142\0\u0372\0\142\0\u03a3\0\u03d4"+
    "\0\u0405\0\u0436\0\u0467\0\u0498\0\142\0\142\0\142\0\142"+
    "\0\142\0\142\0\142\0\142\0\142\0\142\0\u04c9\0\u04fa"+
    "\0\142\0\u052b\0\u055c\0\u058d\0\u05be\0\u05ef\0\u0620\0\u0651"+
    "\0\u0682\0\u06b3\0\u06e4\0\u0715\0\u0126\0\u0746\0\u0777\0\u07a8"+
    "\0\142\0\142\0\142\0\142\0\142\0\142\0\142\0\142"+
    "\0\142\0\u07d9\0\142\0\u080a\0\u083b\0\142\0\u086c\0\u089d"+
    "\0\u08ce\0\u08ff\0\u0930\0\u0961\0\u0992\0\u0126\0\u09c3\0\u0126"+
    "\0\u09f4\0\u0a25\0\142\0\u0a56\0\u0a87\0\u0126\0\u0ab8\0\u0ae9"+
    "\0\u0126\0\u0b1a\0\u0b4b\0\u0b7c\0\u0bad\0\u0126\0\u0126\0\u0bde"+
    "\0\u0126\0\u0c0f\0\u0126\0\u0c40\0\u0126\0\u0c71\0\u0ca2\0\u0cd3"+
    "\0\u0126\0\u0126\0\u0d04\0\u0d35\0\u0126\0\u0d66\0\u0d97\0\u0126"+
    "\0\u0dc8\0\u0126";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[114];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\0\1\6\1\7\4\10\1\11"+
    "\1\12\2\10\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\3\10\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\10\1\3\2\51\1\52\1\0\55\51\64\0"+
    "\1\4\61\0\1\10\1\53\22\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\4\0\7\10\1\55"+
    "\14\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\24\10\12\0\1\10\1\0\1\54\10\0"+
    "\1\10\1\0\2\10\4\0\1\10\1\56\22\10\12\0"+
    "\1\10\1\0\1\54\10\0\1\10\1\0\2\10\4\0"+
    "\11\10\1\57\12\10\12\0\1\10\1\0\1\54\10\0"+
    "\1\10\1\0\2\10\4\0\15\10\1\60\6\10\12\0"+
    "\1\10\1\0\1\54\10\0\1\10\1\0\2\10\4\0"+
    "\2\10\1\61\21\10\12\0\1\10\1\0\1\54\10\0"+
    "\1\10\1\0\2\10\4\0\4\10\1\62\2\10\1\63"+
    "\14\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\1\10\1\64\22\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\4\0\17\10\1\65"+
    "\4\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\2\10\1\66\1\10\1\67\17\10\12\0"+
    "\1\10\1\0\1\54\10\0\1\10\1\0\2\10\4\0"+
    "\2\10\1\70\21\10\12\0\1\10\1\0\1\54\10\0"+
    "\1\10\1\0\2\10\30\0\1\71\61\0\1\72\62\0"+
    "\1\51\62\0\1\73\1\0\1\74\56\0\1\75\60\0"+
    "\1\76\60\0\1\77\64\0\1\100\61\0\1\101\73\0"+
    "\1\47\7\0\24\102\27\0\1\102\4\0\1\103\61\0"+
    "\2\10\1\104\13\10\1\105\5\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\44\0\1\106\20\0"+
    "\4\10\1\107\10\10\1\110\6\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\4\0\7\10\1\111"+
    "\14\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\12\10\1\112\11\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\4\0\4\10\1\113"+
    "\17\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\14\10\1\114\7\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\4\0\5\10\1\115"+
    "\16\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\20\10\1\116\3\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\4\0\22\10\1\117"+
    "\1\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\1\10\1\120\22\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\4\0\11\10\1\121"+
    "\12\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\16\10\1\122\5\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\56\0\1\123\6\0"+
    "\3\10\1\124\20\10\12\0\1\10\1\0\1\54\10\0"+
    "\1\10\1\0\2\10\4\0\14\10\1\125\7\10\12\0"+
    "\1\10\1\0\1\54\10\0\1\10\1\0\2\10\4\0"+
    "\21\10\1\126\2\10\12\0\1\10\1\0\1\54\10\0"+
    "\1\10\1\0\2\10\4\0\22\10\1\127\1\10\12\0"+
    "\1\10\1\0\1\54\10\0\1\10\1\0\2\10\4\0"+
    "\4\10\1\130\17\10\12\0\1\10\1\0\1\54\10\0"+
    "\1\10\1\0\2\10\4\0\7\10\1\131\14\10\12\0"+
    "\1\10\1\0\1\54\10\0\1\10\1\0\2\10\4\0"+
    "\15\10\1\132\6\10\12\0\1\10\1\0\1\54\10\0"+
    "\1\10\1\0\2\10\4\0\12\10\1\133\2\10\1\134"+
    "\6\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\7\10\1\135\14\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\4\0\7\10\1\136"+
    "\14\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\12\10\1\117\11\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\4\0\21\10\1\137"+
    "\2\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\1\10\1\140\22\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\4\0\15\10\1\141"+
    "\6\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\1\10\1\142\22\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\4\0\10\10\1\143"+
    "\13\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\16\10\1\144\5\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\4\0\15\10\1\145"+
    "\6\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\16\10\1\146\5\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\4\0\12\10\1\147"+
    "\11\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\4\10\1\150\17\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\4\0\14\10\1\151"+
    "\7\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\13\10\1\152\10\10\12\0\1\10\1\0"+
    "\1\54\10\0\1\10\1\0\2\10\4\0\14\10\1\153"+
    "\7\10\12\0\1\10\1\0\1\54\10\0\1\10\1\0"+
    "\2\10\4\0\1\154\23\10\12\0\1\10\1\0\1\54"+
    "\10\0\1\10\1\0\2\10\4\0\5\10\1\155\16\10"+
    "\12\0\1\10\1\0\1\54\10\0\1\10\1\0\2\10"+
    "\4\0\22\10\1\156\1\10\12\0\1\10\1\0\1\54"+
    "\10\0\1\10\1\0\2\10\4\0\4\10\1\157\17\10"+
    "\12\0\1\10\1\0\1\54\10\0\1\10\1\0\2\10"+
    "\4\0\7\10\1\160\14\10\12\0\1\10\1\0\1\54"+
    "\10\0\1\10\1\0\2\10\4\0\13\10\1\161\10\10"+
    "\12\0\1\10\1\0\1\54\10\0\1\10\1\0\2\10"+
    "\4\0\7\10\1\162\14\10\12\0\1\10\1\0\1\54"+
    "\10\0\1\10\1\0\2\10";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3577];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\17\1\1\11\1\1\1\11\6\1\12\11"+
    "\2\1\1\11\2\1\1\0\14\1\11\11\1\0\1\11"+
    "\2\1\1\11\14\1\1\11\37\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[114];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

	// ukljucivanje informacije o poziciji tokena
	private Symbol new_symbol(int type) {
		return new Symbol(type, yyline+1, yycolumn);
	}
	
	// ukljucivanje informacije o poziciji tokena
	private Symbol new_symbol(int type, Object value) {
		return new Symbol(type, yyline+1, yycolumn, value);
	}



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 128) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 4: 
          { return new_symbol(sym.PLUS, yytext());
          }
        case 51: break;
        case 37: 
          { return new_symbol(sym.FOR, yytext());
          }
        case 52: break;
        case 17: 
          { return new_symbol(sym.RPAREN, yytext());
          }
        case 53: break;
        case 47: 
          { return new_symbol(sym.STATIC, yytext());
          }
        case 54: break;
        case 14: 
          { return new_symbol(sym.COMMA, yytext());
          }
        case 55: break;
        case 19: 
          { return new_symbol(sym.RBOXBRAC, yytext());
          }
        case 56: break;
        case 36: 
          { return new_symbol(sym.NEW, yytext());
          }
        case 57: break;
        case 8: 
          { return new_symbol(sym.PERCENT, yytext());
          }
        case 58: break;
        case 21: 
          { return new_symbol(sym.RBRACE, yytext());
          }
        case 59: break;
        case 11: 
          { return new_symbol(sym.LT, yytext());
          }
        case 60: break;
        case 40: 
          { return new_symbol(sym.ELSE, yytext());
          }
        case 61: break;
        case 24: 
          { return new_symbol(sym.IF, yytext());
          }
        case 62: break;
        case 38: 
          { return new_symbol(sym.LETTER, new String (yytext()));
          }
        case 63: break;
        case 15: 
          { return new_symbol(sym.DOT, yytext());
          }
        case 64: break;
        case 22: 
          { return new_symbol(sym.NUMBER, new Integer (yytext()));
          }
        case 65: break;
        case 3: 
          { return new_symbol (sym.IDENT, yytext());
          }
        case 66: break;
        case 5: 
          { return new_symbol(sym.MINUS, yytext());
          }
        case 67: break;
        case 42: 
          { return new_symbol(sym.VOID, yytext());
          }
        case 68: break;
        case 34: 
          { yybegin(YYINITIAL);
          }
        case 69: break;
        case 45: 
          { return new_symbol(sym.CONST, yytext());
          }
        case 70: break;
        case 32: 
          { return new_symbol(sym.AND, yytext());
          }
        case 71: break;
        case 16: 
          { return new_symbol(sym.LPAREN, yytext());
          }
        case 72: break;
        case 9: 
          { return new_symbol(sym.EQUAL, yytext());
          }
        case 73: break;
        case 23: 
          { yybegin(COMMENT);
          }
        case 74: break;
        case 44: 
          { return new_symbol(sym.BREAK, yytext());
          }
        case 75: break;
        case 10: 
          { return new_symbol(sym.GT, yytext());
          }
        case 76: break;
        case 20: 
          { return new_symbol(sym.LBRACE, yytext());
          }
        case 77: break;
        case 39: 
          { return new_symbol(sym.READ, yytext());
          }
        case 78: break;
        case 29: 
          { return new_symbol(sym.DIFF, yytext());
          }
        case 79: break;
        case 25: 
          { return new_symbol(sym.INC, yytext());
          }
        case 80: break;
        case 6: 
          { return new_symbol(sym.ASTERISK, yytext());
          }
        case 81: break;
        case 41: 
          { return new_symbol(sym.BOOLCONST, new String (yytext()));
          }
        case 82: break;
        case 28: 
          { return new_symbol(sym.FOLLOWS, yytext());
          }
        case 83: break;
        case 7: 
          { return new_symbol(sym.DIVISION, yytext());
          }
        case 84: break;
        case 30: 
          { return new_symbol(sym.GET, yytext());
          }
        case 85: break;
        case 1: 
          { System.err.println("Leksicka greska ("+yytext()+") u liniji "+(yyline+1));
          }
        case 86: break;
        case 18: 
          { return new_symbol(sym.LBOXBRAC, yytext());
          }
        case 87: break;
        case 12: 
          { return new_symbol(sym.SEMI, yytext());
          }
        case 88: break;
        case 43: 
          { return new_symbol(sym.PRINT, yytext());
          }
        case 89: break;
        case 31: 
          { return new_symbol(sym.LET, yytext());
          }
        case 90: break;
        case 50: 
          { return new_symbol(sym.NAMESPACE, yytext());
          }
        case 91: break;
        case 35: 
          { return new_symbol (sym.IDENTCOLCOL, yytext());
          }
        case 92: break;
        case 48: 
          { return new_symbol(sym.PROG, yytext());
          }
        case 93: break;
        case 46: 
          { return new_symbol(sym.RETURN, yytext());
          }
        case 94: break;
        case 49: 
          { return new_symbol(sym.CONTINUE, yytext());
          }
        case 95: break;
        case 13: 
          { return new_symbol(sym.COL, yytext());
          }
        case 96: break;
        case 33: 
          { return new_symbol(sym.OR, yytext());
          }
        case 97: break;
        case 26: 
          { return new_symbol(sym.DEC, yytext());
          }
        case 98: break;
        case 27: 
          { return new_symbol(sym.EQUALEQUAL, yytext());
          }
        case 99: break;
        case 2: 
          { 
          }
        case 100: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { 	return new_symbol(sym.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
