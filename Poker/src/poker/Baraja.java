package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import java.util.*;

public class Baraja {
  private List<Carta> cartas;
  /* *
   * Estamos en 
   * @Baraja es el constructor
   */
  
  public Baraja() {
    cartas = new ArrayList();
    for (int i = 0; i < 52; i++) {
      cartas.add(new Carta(i));
    }
  }
  
  public void mezclarBaraja() {
    Collections.shuffle(cartas);
  }
  
  /* *
   * @robarCarta es un m�todo
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
