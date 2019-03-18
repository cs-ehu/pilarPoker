package poker;

import java.util.ArrayList;
import java.util.List;

// TODO: Auto-generated Javadoc
//import java.util.*;

/**
 * The Class Mano.
 */
public class Mano {

  /** The cartas. */
  private List<Carta> cartas;

  /**
   * Instantiates a new mano.
   *
   * @param b the b
   * @throws FinBarajaException the fin baraja exception
   */
  public Mano(Baraja b) throws FinBarajaException {

    cartas = new ArrayList<Carta>();
    for (int i = 0; i < 5; i++) {
      cartas.add(b.robarCarta());
    }

  }

  /**
   * Cambiar.
   *
   * @param cambios the cambios
   * @throws FinBarajaException the fin baraja exception
   */
  public void cambiar(List<Integer> cambios) throws FinBarajaException {

  }
}
