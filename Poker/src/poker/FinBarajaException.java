package poker;

public class FinBarajaException extends Exception {
  
  private static final long serialVersionUID = 1L;

  public FinBarajaException() {
    super("No hay mas cartas en la baraja");
  }
}
