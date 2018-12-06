/* Generated By:JavaCC: Do not edit this line. NuevoParserPost.java */
package uniandes.teolen.parserJavaCC.newParserPost;

public class NuevoParserPost implements NuevoParserPostConstants {

  final public int one_line() throws ParseException {
 int r=0;
    r = exp();
    jj_consume_token(11);
     {if (true) return r;}
    throw new Error("Missing return statement in function");
  }

  final public int exp() throws ParseException {
int t,t1;
    // Parses:  E -> num
    //         E -> E E +
    //         E -> E E -
    //         E -> E E /
    //         E -> E E *
    //   in EBNF:  E -> num | E (E + | E - | E * | E /)
    
    
       t1 = num();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      t = exp();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        jj_consume_token(PLUS);
                       t1 = t1 + t; System.out.println(t1);
        break;
      case MINUS:
        jj_consume_token(MINUS);
                t1= t1 - t;
        break;
      case MULTIPLY:
        jj_consume_token(MULTIPLY);
                  t1= t1 *t;
        break;
      case DIVIDE:
        jj_consume_token(DIVIDE);
                  t1 = t1 / t;
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
   {if (true) return t1;}
    throw new Error("Missing return statement in function");
  }

  final public int num() throws ParseException, Error {
        int total=1;
        Token token;
    token = jj_consume_token(INT);
                try {
                        total = Integer.parseInt(token.image);
                }
                catch (NumberFormatException ee)
                {
                        // Dada la forma de <ENTERO>, sabemos que solo puede tener digitos 
                        {if (true) throw new Error("Numero demasiado grande"+token.image);}
                }
                {if (true) return total;}
    throw new Error("Missing return statement in function");
  }

  /** Generated Token Manager. */
  public NuevoParserPostTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[2];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x200,0x1e0,};
   }

  /** Constructor with InputStream. */
  public NuevoParserPost(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public NuevoParserPost(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new NuevoParserPostTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public NuevoParserPost(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new NuevoParserPostTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public NuevoParserPost(NuevoParserPostTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(NuevoParserPostTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 2; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[12];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 2; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 12; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
