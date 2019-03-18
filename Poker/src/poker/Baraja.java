package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// TODO: Auto-generated Javadoc


/**
 * The Class Baraja.
 */
public class Baraja {
  
  /** The cartas. */
  private List<Carta> cartas;
  
 
  
  /**
   * Instantiates a new baraja.
   */
  public Baraja() {
    cartas = new ArrayList<Carta>();
    for (int i = 0; i < 52; i++) {
      cartas.add(new Carta(i));
    }
  }
  
  /**
   * Mezclar baraja.
   */
  public void mezclarBaraja() {
    Collections.shuffle(cartas);
  }
  
 
  /**
   * Robar carta.
   *
   * @return the carta
   * @throws FinBarajaException the fin baraja exception
   */
  public Carta robarCarta() throws FinBarajaException {
    Carta c;
    try {
      c = cartas.remove(0);
      return c;
    } catch (IndexOutOfBoundsException ex) {
      throw new FinBarajaException();
    }
   
  }
}
