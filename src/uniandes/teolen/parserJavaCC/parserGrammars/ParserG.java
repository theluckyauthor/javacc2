/* Generated By:JavaCC: Do not edit this line. ParserG.java */
package uniandes.teolen.parserJavaCC.parserGrammars;

import java.util.*;

public class ParserG implements ParserGConstants {

  final public void gram() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case RegD:
      jj_consume_token(RegD);
      jj_consume_token(16);
      label_1:
      while (true) {
        prodRD();
        jj_consume_token(17);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NTerm:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
      }
      break;
    case RegI:
      jj_consume_token(RegI);
      jj_consume_token(16);
      label_2:
      while (true) {
        prodRI();
        jj_consume_token(17);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NTerm:
          ;
          break;
        default:
          jj_la1[1] = jj_gen;
          break label_2;
        }
      }
      break;
    case DC:
      jj_consume_token(DC);
      jj_consume_token(16);
      label_3:
      while (true) {
        prod();
        jj_consume_token(17);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NTerm:
        case Term:
          ;
          break;
        default:
          jj_la1[2] = jj_gen;
          break label_3;
        }
      }
      break;
    case IC:
      jj_consume_token(IC);
      jj_consume_token(16);
      label_4:
      while (true) {
        prodI();
        jj_consume_token(17);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NTerm:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_4;
        }
      }
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void prodI() throws ParseException {
    jj_consume_token(NTerm);
    jj_consume_token(ARROW);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 18:
      jj_consume_token(18);
      break;
    case NTerm:
    case Term:
      label_5:
      while (true) {
        sim();
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NTerm:
        case Term:
          ;
          break;
        default:
          jj_la1[5] = jj_gen;
          break label_5;
        }
      }
      break;
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void prodRD() throws ParseException {
    jj_consume_token(NTerm);
    jj_consume_token(ARROW);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 18:
      jj_consume_token(18);
      break;
    case NTerm:
    case Term:
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case Term:
          ;
          break;
        default:
          jj_la1[7] = jj_gen;
          break label_6;
        }
        jj_consume_token(Term);
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NTerm:
        jj_consume_token(NTerm);
        break;
      case Term:
        jj_consume_token(Term);
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void prodRI() throws ParseException {
    jj_consume_token(NTerm);
    jj_consume_token(ARROW);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 18:
      jj_consume_token(18);
      break;
    case NTerm:
    case Term:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NTerm:
        jj_consume_token(NTerm);
        break;
      case Term:
        jj_consume_token(Term);
        break;
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case Term:
          ;
          break;
        default:
          jj_la1[11] = jj_gen;
          break label_7;
        }
        jj_consume_token(Term);
      }
      break;
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void prod() throws ParseException {
    p();
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NTerm:
      case Term:
        ;
        break;
      default:
        jj_la1[13] = jj_gen;
        break label_8;
      }
      sim();
    }
  }

  final public void p() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case Term:
      jj_consume_token(Term);
      p();
      sim();
      break;
    case NTerm:
      jj_consume_token(NTerm);
      p1();
      sim();
      break;
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void p1() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NTerm:
    case Term:
      sim();
      p1();
      sim();
      break;
    case ARROW:
      jj_consume_token(ARROW);
      break;
    default:
      jj_la1[15] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void sim() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case Term:
      jj_consume_token(Term);
      break;
    case NTerm:
      jj_consume_token(NTerm);
      break;
    default:
      jj_la1[16] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  /** Generated Token Manager. */
  public ParserGTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[17];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x4000,0x4000,0xc000,0x4000,0x3c00,0xc000,0x4c000,0x8000,0xc000,0x4c000,0xc000,0x8000,0x4c000,0xc000,0xc000,0xc020,0xc000,};
   }

  /** Constructor with InputStream. */
  public ParserG(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public ParserG(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ParserGTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
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
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public ParserG(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ParserGTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public ParserG(ParserGTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ParserGTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 17; i++) jj_la1[i] = -1;
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
    boolean[] la1tokens = new boolean[19];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 17; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 19; i++) {
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
