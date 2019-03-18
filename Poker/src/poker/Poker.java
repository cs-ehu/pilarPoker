package poker;

// TODO: Auto-generated Javadoc
/**
 * Esta clase lanza a consola el método robar carta.
 *
 * @see Markdown donde pongo antes y después
 * @author: Pilar
 * @version: 14-3-2019
 */
public class Poker {
  
 
  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    try {
      Baraja b = new Baraja();

      System.out.println("Resultado de robar carta con la baraja ordenada");
      for (int i = 0; i < 52; i++) {
        System.out.println(b.robarCarta());
      }
      System.out.println();
      Baraja b1 = new Baraja();
      b1.mezclarBaraja();
      System.out.println("Resultado de robar carta despúes de barajar");
      for (int i = 0; i < 52; i++) {
        System.out.println(b1.robarCarta());
      }
      System.out.println();
    } catch (Exception ex) {
      System.out.println(ex);
    }

  }
}
