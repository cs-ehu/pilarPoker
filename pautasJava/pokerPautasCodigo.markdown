# PokerDoc

### Documentación del Proyecto Poker

1. Herramienta Doxygen para generar documentación:
    - Implementación: presentación/tutorial en mi drive CS
    - Configuración Doxyfile según documento excel grupo 
      - Importante para que se visualice como web desde gitHub:
          1. Crear carpeta docs donde alojar la documentación obtenida con Doxygen
          2. Configuración Doxyfile de la salida html en docs
               - HTML_OUTPUT = C:\Users\Usuario\Desktop\PokerGrupoCS\docs
          3. GitHub proyecto/seeting/github pages: seleccionar docs
    
2. Estudio de los [estándares de Google para Java ](https://google.github.io/styleguide/javaguide.html)

3. Herramienta checkstyle
    - Realiza el trabajo de contrastar el código con los stándares.
    - Plugin de eclipse: help/eclipsemarketplace
    - [Tutorial](https://www.youtube.com/watch?v=93OXBYCdRhE) 

5. Seguidamente recojo algunos de los ejemplos de warnings obtenidos:

>Multiple markers at this line
	- WhitespaceAround: '{' is not preceded with whitespace.
	- WhitespaceAround: '<' is not followed by whitespace. Empty blocks may 
	 only be represented as {} when not part of a multi-block statement (4.1.3)
	- WhitespaceAround: '<' is not preceded with whitespace.
	- WhitespaceAround: '=' is not followed by whitespace. Empty blocks may 
	 only be represented as {} when not part of a multi-block statement (4.1.3)
	- WhitespaceAround: '=' is not preceded with whitespace.
	- WhitespaceAround: 'for' is not followed by whitespace. Empty blocks may 
	 only be represented as {} when not part of a multi-block statement (4.1.3)
	 correcto, 2
	 
>```bash
for(int i=0; i<52;i++){
          System.out.println(b1.robarCarta());
}
```
>Modifico el código para que se ajuste a los estándares
```bash
for (int i = 0; i < 52;i++) {
        System.out.println(b1.robarCarta());
}
```
>Multiple markers at this line
	- WhitespaceAround: '{' is not preceded with whitespace.
	- WhitespaceAround: 'catch' is not followed by whitespace. Empty blocks may 
	 only be represented as {} when not part of a multi-block statement (4.1.3)
	- try rcurly en el nivel de sangrado 5 no está al nivel correcto, 4

>```bash
System.out.println();
     } catch(Exception ex){
            System.out.println(ex);
     }
```

> Modifico todos los warnings


>```bash
package poker;
public class Poker { /* Lanzamos la baraja  */
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
```

>```bash
/**
 * Esto es un comentario para javadoc ejemplo aprenderaprogramar.com
 */
```
> Nos da otro warning: Primera frase de Javadoc falta un período final.

>*Para alimentar javadoc se usan ciertas palabras reservadas (tags) precedidas por el carácter "@", dentro de los símbolos de comentario javadoc. Si no existe al menos una línea que comience con @ no se reconocerá el comentario para la documentación de la clase.*

>```bash
package poker;
/**
 * Esta clase lanza a consola el método robar carta
 * @author: Pilar
 * @version: 14-3-2019
 * @see Markdown donde pongo antes y después
 */
public class Poker { 
```



> Member name 'bCambiorealizado' must match pattern '^[a-z][a-z0-9][a-zA-....):cambio el nombre a bcambiorealizado

> Usar la importación con '.*' debería evitarse - java.util.* Lo sustituyo:

>```bash
//import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
```

##source/Format
Muchos de estos ***warnings se eliminan*** en eclipse con lo que posteriormente he descubierto: botón derecho sobre el código que estamos generando(o pestaña source/format): source/Format

##Generar javadoc 
Para crear los comentarios de acuerdo con checkstyle sin que se generen problemas varios lo mejor es instalar el plugin ***JAutodoc*** (help/eclipsemarketplace).
Sobre la clase o método que se desee, click derecho/jautodoc
>```
/**
   * Instantiates a new carta.
   *
   * @param n the n
   */
  public Carta(int n) {
```


