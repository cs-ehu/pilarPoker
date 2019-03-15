package poker;

/* *
 * Esta clase lanza a consola el m�todo robar carta
 * @author: Pilar
 * @version: 14-3-2019
 * @see Markdown donde pongo antes y despu�s
 */
public class Poker { 
  /* * 
   * Saca por pantalla el resultado de robarCarta
   * @param b baraja sin mezclar
   * @param b1 baraja mezclada
   */
  public static void main(String[] args) {
    try {
      Baraja b = new Baraja();
      for (int i = 0; i < 52; i++) {
        System.out.println(b.robarCarta());
      }
      System.out.println();
      Baraja b1 = new Baraja();
      b1.mezclarBaraja();
      for (int i = 0; i < 52;i++) {
        System.out.println(b1.robarCarta());
      }
      System.out.println();
    } catch (Exception ex) {
      System.out.println(ex);
    }
  }
}
