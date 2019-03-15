package poker;

public class Carta {
  
  private String strPalo;
  private String strValor;
  private int ivalor;
  /* *
   * 
   * @param n
   */
  
  public Carta(int n) {
    int ipalo = n + 1 / 13;
    switch (ipalo) {
      case 0:
        strPalo = "Diamantes";
        break;
      case 1:
        strPalo = "Picas";
        break;
      case 2:
        strPalo = "Tr�boles";
        break;
      default:
        strPalo = "Corazones";
        
    }
    ivalor = n % 13 + 1;
    if (ivalor == 11) {
      strValor = "Jota";
    }
    if (ivalor == 12) {
      strValor = "Dama";
    }
    if (ivalor == 13) {
      strValor = "Rey";
    }
    if (ivalor == 1) {
      strValor = "As";
      ivalor = 14;
    } else {
      strValor = String.valueOf(ivalor);
    }
  }
  
  @Override
  public String toString() {
    return strValor + " de " + strPalo;
  }
  
  public int getValorNumerico() {
    return ivalor;
  }
  
  public String getValor() {
    return strValor;
  }
  
  public String getPalo() {
    return strPalo;
  }
}
