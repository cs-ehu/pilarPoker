package poker;

public class FinBarajaException extends Exception {
  public FinBarajaException() {
    super("No hay mas cartas en la baraja");
  }
}
