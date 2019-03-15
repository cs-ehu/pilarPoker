# PokerDoc

### Documentación del Proyecto Poker

1. Modificación del archivo de configuración Doxyfile según los requisitos decididos en grupo que me genera los resultados en PokerMio/documentación.

2. Estudio de los [estándares de Google para Java ](https://google.github.io/styleguide/javaguide.html)

3. Herramienta checkstyle: realiza el trabajo de contrastar el código con los stándares.

4. Sigo el [Tutorial](https://www.youtube.com/watch?v=93OXBYCdRhE) Al ejecutar la herramienta me da los errores recogidos en la tabla inferior.
5. Seguidamente recojo algunos de los ejemplos de warnings obtenidos:
6. Estos ***errores se eliminan*** en eclipse con lo que posteriormente he descubierto: botón derecho sobre el código que estamos generando: ***source/Format***

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
	 
```bash
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

```bash
System.out.println();
     } catch(Exception ex){
            System.out.println(ex);
     }

```

> Modifico todos los warnings


```bash
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
> Queda pendiente warning: falta comentario javadoc
Sin embargo si tengo un comentario. Pero le falta la estructura javadoc: 

```bash
/**

 * Esto es un comentario para javadoc ejemplo aprenderaprogramar.com

 */

```
> Nos da otro warning: Primera frase de Javadoc falta un período final.

*Para alimentar javadoc se usan ciertas palabras reservadas (tags) precedidas por el carácter "@", dentro de los símbolos de comentario javadoc. Si no existe al menos una línea que comience con @ no se reconocerá el comentario para la documentación de la clase.*

```bash
package poker;

/* *
 * Esta clase lanza a consola el método robar carta
 * @author: Pilar
 * @version: 14-3-2019
 * @see Markdown donde pongo antes y después
 */
public class Poker { 
```


>Tabla donde recojo la primera ejecución de checkstyle con numeros warnings
Esto lo voy cambiando para aprender cómo ha de escribirse el código obteniendo finalmente sólo warnings sobre:

> 1- la falta de javadoc

> 2- Member name 'bCambiorealizado' must match pattern '^[a-z][a-z0-9][a-zA-....):cambio el nombre a bcambiorealizado

> 3- Usar la importación con '.*' debería evitarse - java.util.* Lo sustituyo:

```bash
//import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
```

|Description	|Resource |Path	  |Location  |Type|
|---------------|---------|-------|----------|----|
|'(' está precedido de espacio en blanco.	| Baraja.java	/Poker/src/poker |  line 9	  | Checkstyle  |Problem |
|'(' está precedido de espacio en blanco.| Baraja.java	/Poker/src/poker|  line 21	|Checkstyle| Problem |
|'CTOR_DEF' debe ser separado de la declaración anterior.| Baraja.java	/Poker/src/poker|  line 6| Checkstyle| Problem |
|'CTOR_DEF' debe ser separado de la declaración anterior.| Carta.java	/Poker/src/poker|  line 7| Checkstyle |Problem |
|'CTOR_DEF' debe ser separado de la declaración anterior.| Mano.java	/Poker/src/poker|  line 8	|Checkstyle| Problem |
|'import' debe ser separado de la declaración anterior.| Baraja.java	/Poker/src/poker	|  line 2	|Checkstyle| Problem |
'import' debe ser separado de la declaración anterior.	|Mano.java	/Poker/src/poker|  line 2	|Checkstyle |Problem |
|'METHOD_DEF' debe ser separado de la declaración anterior.| Baraja.java	/Poker/src/poker|  line 12	|Checkstyle| Problem |
|'METHOD_DEF' debe ser separado de la declaración anterior.| Baraja.java	/Poker/src/poker	|  line 15	|Checkstyle |Problem |
|'METHOD_DEF' debe ser separado de la declaración anterior.| Carta.java	/Poker/src/poker|  line 36| Checkstyle |Problem |
|'METHOD_DEF' debe ser separado de la declaración anterior.| Carta.java	/Poker/src/poker|  line 40	|Checkstyle |Problem |
|'METHOD_DEF' debe ser separado de la declaración anterior.	|Carta.java	/Poker/src/poker	|  line 43	|Checkstyle| Problem |
|'METHOD_DEF' debe ser separado de la declaración anterior.| Carta.java	/Poker/src/poker	|  line 46	|Checkstyle |Problem |
|'METHOD_DEF' debe ser separado de la declaración anterior.| Mano.java	/Poker/src/poker|  line 16	|Checkstyle| Problem |
|block el descendiente en el nivel de sangrado 23 no está al nivel correcto, 8	|Carta.java	/Poker/src/poker|  line 11	|Checkstyle| Problem |
|block el descendiente en el nivel de sangrado 23 no está al nivel correcto, 8| Carta.java	/Poker/src/poker	|  line 12| Checkstyle| Problem |
|block el descendiente en el nivel de sangrado 23 no está al nivel correcto, 8	|Carta.java	/Poker/src/poker|  line 14	|Checkstyle| Problem |
|block el descendiente en el nivel de sangrado 23 no está al nivel correcto, 8	|Carta.java	/Poker/src/poker|  line 15| Checkstyle| Problem |
|block el descendiente en el nivel de sangrado 23 no está al nivel correcto, 8	|Carta.java	/Poker/src/poker	|  line 17| Checkstyle| Problem |
|block el descendiente en el nivel de sangrado 23 no está al nivel correcto, 8| Carta.java	/Poker/src/poker|  line 18	|Checkstyle |Problem |
|block el descendiente en el nivel de sangrado 23 no está al nivel correcto, 8	|Carta.java	/Poker/src/poker|  line 20| Checkstyle |Problem |
|case el descendiente en el nivel de sangrado 19 no está al nivel correcto, 6	|Carta.java	/Poker/src/poker|  line 10| Checkstyle |Problem |
|case el descendiente en el nivel de sangrado 19 no está al nivel correcto, 6	|Carta.java	/Poker/src/poker|  line 13| Checkstyle |Problem |
|case el descendiente en el nivel de sangrado 19 no está al nivel correcto, 6	|Carta.java	/Poker/src/poker	|  line 16| Checkstyle| Problem |
|case el descendiente en el nivel de sangrado 23 no está al nivel correcto, 6	|Carta.java	/Poker/src/poker|  line 19| Checkstyle |Problem |
|catch el descendiente en el nivel de sangrado 20 no está al nivel correcto, 6	|Poker.java	/Poker/src/poker|  line 20	|Checkstyle |Problem |
|catch el descendiente en el nivel de sangrado 21 no está al nivel correcto, 6	| Baraja.java	/Poker/src/poker|  line 21| Checkstyle |Problem |
|catch rcurly en el nivel de sangrado 16 no está al nivel correcto, 4| Poker.java	/Poker/src/poker|  line 21| Checkstyle |Problem |
|catch rcurly en el nivel de sangrado 17 no está al nivel correcto, 4	| Baraja.java	/Poker/src/poker|  line 22| Checkstyle |Problem |
|Comentario tiene nivel incorrecto muesca 2, que se espera es 3, la sangría debe estar al mismo nivel que la línea 7.| Poker.java	/Poker/src/poker	|  line 6	|Checkstyle |Problem |
|ctor def el descendiente en el nivel de sangrado 15 no está al nivel correcto, 4	| Baraja.java	/Poker/src/poker|  line 7| Checkstyle |Problem |
|ctor def el descendiente en el nivel de sangrado 15 no está al nivel correcto, 4	|Carta.java	/Poker/src/poker	|  line 8| Checkstyle |Problem |
|ctor def el descendiente en el nivel de sangrado 15 no está al nivel correcto, 4	|Carta.java	/Poker/src/poker	|  line 23| Checkstyle |Problem |
|ctor def el descendiente en el nivel de sangrado 8 no está al nivel correcto, 4	|FinBarajaException.java	/Poker/src/poker	|  line 5	|Checkstyle |Problem |
|ctor def el descendiente en el nivel de sangrado 8 no está al nivel correcto, 4	|Mano.java	/Poker/src/poker	|  line 9	|Checkstyle |Problem |
|ctor def el descendiente en el nivel de sangrado 8 no está al nivel correcto, 4	|Mano.java	/Poker/src/poker|  line 10	|Checkstyle |Problem |
|ctor def el descendiente en el nivel de sangrado 8 no está al nivel correcto, 4| Mano.java	/Poker/src/poker|  line 14	|Checkstyle |Problem |
|ctor def modifier en el nivel de sangrado 12 no está al nivel correcto, 2	| Baraja.java	/Poker/src/poker	|  line 6	|Checkstyle |Problem |
|ctor def modifier en el nivel de sangrado 12 no está al nivel correcto, 2	|Carta.java	/Poker/src/poker|  line 7	|Checkstyle| Problem |
|ctor def modifier en el nivel de sangrado 4 no está al nivel correcto, 2	|Mano.java	/Poker/src/poker	|  line 8| Checkstyle |Problem |
|ctor def modifier en el nivel de sangrado 8 no está al nivel correcto, 2	|FinBarajaException.java	/Poker/src/poker|  line 4	|Checkstyle| Problem |
|ctor def rcurly en el nivel de sangrado 12 no está al nivel correcto, 2	| Baraja.java	/Poker/src/poker|  line 11| Checkstyle |Problem |
|ctor def rcurly en el nivel de sangrado 12 no está al nivel correcto, 2	|Carta.java	/Poker/src/poker	|  line 35	|Checkstyle| Problem |
|ctor def rcurly en el nivel de sangrado 4 no está al nivel correcto, 2	|FinBarajaException.java	/Poker/src/poker|  line 6	|Checkstyle| Problem |
|ctor def rcurly en el nivel de sangrado 4 no está al nivel correcto, 2	|Mano.java	/Poker/src/poker|  line 15	|Checkstyle| Problem |
|Falta el comentario Javadoc.	| Baraja.java	/Poker/src/poker	|  line 6	|Checkstyle| Problem |
|Falta el comentario Javadoc.	| Baraja.java	/Poker/src/poker	|  line 15	|Checkstyle |Problem |
|Falta el comentario Javadoc.	|Carta.java	/Poker/src/poker|  line 7	|Checkstyle| Problem |
|Falta el comentario Javadoc.| Mano.java	/Poker/src/poker	|  line 8| Checkstyle| Problem |
|Falta el comentario Javadoc.| Poker.java	/Poker/src/poker	|  line 5| Checkstyle| Problem |
|for el descendiente en el nivel de sangrado 11 no está al nivel correcto, 6| Mano.java	/Poker/src/poker	|  line 12| Checkstyle| Problem |
|for el descendiente en el nivel de sangrado 19 no está al nivel correcto, 6	| Baraja.java	/Poker/src/poker	|  line 9| Checkstyle| Problem |
|for el descendiente en el nivel de sangrado 24 no está al nivel correcto, 8| Poker.java	/Poker/src/poker	|  line 10| Checkstyle| Problem |
|for el descendiente en el nivel de sangrado 24 no está al nivel correcto, 8| Poker.java	/Poker/src/poker	|  line 16| Checkstyle| Problem |
|for en el nivel de sangrado 15 no está al nivel correcto, 4	| Baraja.java	/Poker/src/poker	|  line 8| Checkstyle| Problem |
|for en el nivel de sangrado 20 no está al nivel correcto, 6| Poker.java	/Poker/src/poker	|  line 9| Checkstyle| Problem |
|for en el nivel de sangrado 20 no está al nivel correcto, 6| Poker.java	/Poker/src/poker	|  line 15| Checkstyle| Problem |
|for en el nivel de sangrado 8 no está al nivel correcto, 4| Mano.java	/Poker/src/poker	|  line 11| Checkstyle| Problem |
|for rcurly en el nivel de sangrado 15 no está al nivel correcto, 4	| Baraja.java	/Poker/src/poker	|  line 10| Checkstyle| Problem |
|for rcurly en el nivel de sangrado 20 no está al nivel correcto, 6| Poker.java	/Poker/src/poker	|  line 11| Checkstyle| Problem |
|for rcurly en el nivel de sangrado 20 no está al nivel correcto, 6| Poker.java	/Poker/src/poker	|  line 17| Checkstyle| Problem |
|for rcurly en el nivel de sangrado 8 no está al nivel correcto, 4| Mano.java	/Poker/src/poker	|  line 13| Checkstyle| Problem |
|if el descendiente en el nivel de sangrado 19 no está al nivel correcto, 6| Carta.java	/Poker/src/poker	|  line 31| Checkstyle| Problem |
|if el descendiente en el nivel de sangrado 19 no está al nivel correcto, 6| Carta.java	/Poker/src/poker	|  line 32| Checkstyle| Problem |
|if en el nivel de sangrado 15 no está al nivel correcto, 4| Carta.java	/Poker/src/poker	|  line 24| Checkstyle| Problem |
|if en el nivel de sangrado 15 no está al nivel correcto, 4| Carta.java	/Poker/src/poker	|  line 26| Checkstyle| Problem |
|if en el nivel de sangrado 15 no está al nivel correcto, 4| Carta.java	/Poker/src/poker	|  line 28| Checkstyle| Problem |
|if en el nivel de sangrado 15 no está al nivel correcto, 4| Carta.java	/Poker/src/poker	|  line 30| Checkstyle| Problem |
|if rcurly en el nivel de sangrado 15 no está al nivel correcto, 4| Carta.java	/Poker/src/poker	|  line 33| Checkstyle| Problem |
|La construcción 'else' debe usar '{}' (llaves).| Carta.java	/Poker/src/poker	|  line 33| Checkstyle| Problem |
|La construcción 'if' debe usar '{}' (llaves).| Carta.java	/Poker/src/poker	|  line 24| Checkstyle| Problem |
|La construcción 'if' debe usar '{}' (llaves).| Carta.java	/Poker/src/poker	|  line 26| Checkstyle| Problem |
|La construcción 'if' debe usar '{}' (llaves).| Carta.java	/Poker/src/poker	|  line 28| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 5| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 6| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 7| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 8| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 9| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 10| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 11| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 12| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 13| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 14| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 15| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 16| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 17| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 18| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 19| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 20| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 21| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 22| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 23| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 24| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	| Baraja.java	/Poker/src/poker	|  line 25| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 4| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 5| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 6| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 7| Checkstyle| Problem |
|WhitespaceAround: 'try' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)	| Baraja.java	/Poker/src/poker	|  line 17| Checkstyle| Problem |
|WhitespaceAround: 'switch' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 9| Checkstyle| Problem |
|WhitespaceAround: 'catch' is not preceded with whitespace.	| Baraja.java	/Poker/src/poker	|  line 20| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 14| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 11| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 8| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.	| Baraja.java	/Poker/src/poker	|  line 18| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.	| Baraja.java	/Poker/src/poker	|  line 8| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.	| Baraja.java	/Poker/src/poker	|  line 7| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 14| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)	|Carta.java	/Poker/src/poker	|  line 11	|Checkstyle |Problem |
|WhitespaceAround: '=' is not preceded with whitespace.	|Carta.java	/Poker/src/poker	|  line 17| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)	|Carta.java	/Poker/src/poker|  line 17| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)	|Carta.java	/Poker/src/poker|  line 8| Checkstyle |Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)|Baraja.java	/Poker/src/poker|  line 18| Checkstyle |Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)	| Baraja.java	/Poker/src/poker|  line 8	|Checkstyle| Problem |
|WhitespaceAround: '<' is not preceded with whitespace.	| Baraja.java	/Poker/src/poker	|  line 8| Checkstyle| Problem |
|WhitespaceAround: '<' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Baraja.java	/Poker/src/poker|  line 8	|Checkstyle| Problem |
|WhitespaceAround: '+' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 8	|Checkstyle| Problem |
WhitespaceAround: '=' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 20| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 20| Checkstyle| Problem |
|WhitespaceAround: '+' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 8| Checkstyle| Problem |
|WhitespaceAround: '/' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 8| Checkstyle| Problem |
|WhitespaceAround: '/' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 8| Checkstyle| Problem |
|WhitespaceAround: '}' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)	| Baraja.java	/Poker/src/poker	|  line 20| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 9| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 23| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 23| Checkstyle| Problem |
|WhitespaceAround: '%' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 23| Checkstyle| Problem |
|WhitespaceAround: '%' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 23| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 7| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.	| Baraja.java	/Poker/src/poker	|  line 20| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.	| Baraja.java	/Poker/src/poker	|  line 17| Checkstyle| Problem |
|WhitespaceAround: 'if' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 24| Checkstyle| Problem |
|WhitespaceAround: '==' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 24| Checkstyle| Problem |
|WhitespaceAround: '==' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 24| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.	| Baraja.java	/Poker/src/poker	|  line 15| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 25| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 25| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.	| Baraja.java	/Poker/src/poker	|  line 12| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.	| Baraja.java	/Poker/src/poker	|  line 8| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.	| Baraja.java	/Poker/src/poker	|  line 6| Checkstyle| Problem |
|WhitespaceAround: 'if' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 26| Checkstyle| Problem |
|WhitespaceAround: '==' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 26| Checkstyle| Problem |
|WhitespaceAround: '==' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 26| Checkstyle| Problem |
|Usar la importación con '.*' debería evitarse - java.util.*.	| Baraja.java	/Poker/src/poker	|  line 2| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 27| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 27| Checkstyle| Problem |
|try rcurly en el nivel de sangrado 17 no está al nivel correcto, 4	| Baraja.java	/Poker/src/poker	|  line 20| Checkstyle| Problem |
|try en el nivel de sangrado 17 no está al nivel correcto, 4	| Baraja.java	/Poker/src/poker	|  line 17| Checkstyle| Problem |
|WhitespaceAround: 'if' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 28| Checkstyle| Problem |
|WhitespaceAround: '==' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 28| Checkstyle| Problem |
|WhitespaceAround: '==' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 28| Checkstyle| Problem |
|try el descendiente en el nivel de sangrado 17 no está al nivel correcto, 6	| Baraja.java	/Poker/src/poker	|  line 19| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 29| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 29| Checkstyle| Problem |
|try el descendiente en el nivel de sangrado 17 no está al nivel correcto, 6	| Baraja.java	/Poker/src/poker	|  line 18| Checkstyle| Problem |
|switch rcurly en el nivel de sangrado 31 no está al nivel correcto, 4| Carta.java	/Poker/src/poker	|  line 22| Checkstyle| Problem |
|WhitespaceAround: '==' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 30| Checkstyle| Problem |
|WhitespaceAround: '==' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 30| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 30| Checkstyle| Problem |
|switch en el nivel de sangrado 15 no está al nivel correcto, 4| Carta.java	/Poker/src/poker	|  line 9| Checkstyle| Problem |
|method def rcurly en el nivel de sangrado 17 no está al nivel correcto, 2	| Baraja.java	/Poker/src/poker	|  line 24| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 31| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 31| Checkstyle| Problem |
|method def rcurly en el nivel de sangrado 17 no está al nivel correcto, 2	| Baraja.java	/Poker/src/poker	|  line 14| Checkstyle| Problem |
|method def modifier en el nivel de sangrado 17 no está al nivel correcto, 2	| Baraja.java	/Poker/src/poker	|  line 15| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 32| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 32| Checkstyle| Problem |
|method def modifier en el nivel de sangrado 17 no está al nivel correcto, 2	| Baraja.java	/Poker/src/poker	|  line 12| Checkstyle| Problem |
|method def el descendiente en el nivel de sangrado 21 no está al nivel correcto, 4	| Baraja.java	/Poker/src/poker	|  line 16| Checkstyle| Problem |
|method def el descendiente en el nivel de sangrado 21 no está al nivel correcto, 4	| Baraja.java	/Poker/src/poker	|  line 13| Checkstyle| Problem |
|WhitespaceAround: 'else' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 33| Checkstyle| Problem |
|WhitespaceAround: '}' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 33| Checkstyle| Problem |
|Member name 'iValor' must match pattern '^[a-z][a-z0-9][a-zA-Z0-9]*$'.| Carta.java	/Poker/src/poker	|  line 6| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 34| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Carta.java	/Poker/src/poker	|  line 34| Checkstyle| Problem |
|member def modifier en el nivel de sangrado 9 no está al nivel correcto, 2| Carta.java	/Poker/src/poker	|  line 4| Checkstyle| Problem |
|member def modifier en el nivel de sangrado 16 no está al nivel correcto, 2	| Baraja.java	/Poker/src/poker	|  line 5| Checkstyle| Problem |
|member def modifier en el nivel de sangrado 12 no está al nivel correcto, 2| Carta.java	/Poker/src/poker	|  line 6| Checkstyle| Problem |
|method def modifier en el nivel de sangrado 12 no está al nivel correcto, 2| Carta.java	/Poker/src/poker	|  line 36| Checkstyle| Problem |
|member def modifier en el nivel de sangrado 12 no está al nivel correcto, 2| Carta.java	/Poker/src/poker	|  line 5| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 37| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 37| Checkstyle| Problem |
|method def el descendiente en el nivel de sangrado 16 no está al nivel correcto, 4| Carta.java	/Poker/src/poker	|  line 38| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 38| Checkstyle| Problem |
|WhitespaceAround: '+' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 38| Checkstyle| Problem |
|method def rcurly en el nivel de sangrado 12 no está al nivel correcto, 2| Carta.java	/Poker/src/poker	|  line 39| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 39| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 36| Checkstyle| Problem |
|method def modifier en el nivel de sangrado 12 no está al nivel correcto, 2| Carta.java	/Poker/src/poker	|  line 40| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 40| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 40| Checkstyle| Problem |
|method def el descendiente en el nivel de sangrado 16 no está al nivel correcto, 4| Carta.java	/Poker/src/poker	|  line 41| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 41| Checkstyle| Problem |
|method def rcurly en el nivel de sangrado 12 no está al nivel correcto, 2| Carta.java	/Poker/src/poker	|  line 42| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 42| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 35| Checkstyle| Problem |
|method def modifier en el nivel de sangrado 12 no está al nivel correcto, 2| Carta.java	/Poker/src/poker	|  line 43| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 43| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 43| Checkstyle| Problem |
|method def el descendiente en el nivel de sangrado 16 no está al nivel correcto, 4| Carta.java	/Poker/src/poker	|  line 44| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 44| Checkstyle| Problem |
|method def rcurly en el nivel de sangrado 12 no está al nivel correcto, 2| Carta.java	/Poker/src/poker	|  line 45| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 45| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 34| Checkstyle| Problem |
|method def modifier en el nivel de sangrado 12 no está al nivel correcto, 2| Carta.java	/Poker/src/poker	|  line 46| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 46| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.| Carta.java	/Poker/src/poker	|  line 46| Checkstyle| Problem |
|method def el descendiente en el nivel de sangrado 16 no está al nivel correcto, 4| Carta.java	/Poker/src/poker	|  line 47| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 47| Checkstyle| Problem |
|method def rcurly en el nivel de sangrado 12 no está al nivel correcto, 2| Carta.java	/Poker/src/poker	|  line 48| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 48| Checkstyle| Problem |
|The serializable class FinBarajaException does not declare a static final serialVersionUID field of type long| FinBarajaException.java	/Poker/src/poker	|  line 3|	Java| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.| FinBarajaException.java	/Poker/src/poker	|  line 3| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 33| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| FinBarajaException.java	/Poker/src/poker	|  line 4| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 32| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 31| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 30| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 29| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Mano.java	/Poker/src/poker	|  line 14| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Mano.java	/Poker/src/poker	|  line 14| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 28| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 27| Checkstyle| Problem |
|method def modifier en el nivel de sangrado 4 no está al nivel correcto, 2| Mano.java	/Poker/src/poker	|  line 16| Checkstyle| Problem |
|method def rcurly en el nivel de sangrado 4 no está al nivel correcto, 2| Mano.java	/Poker/src/poker	|  line 18| Checkstyle| Problem |
|The value of the field Mano.bCambiorealizado is not used	|Mano.java	/Poker/src/poker	|  line 6|	Java| Problem |
|The value of the field Mano.baraja is not used| Mano.java	/Poker/src/poker	|  line 7	|Java| Problem |
|Type safety: The expression of type ArrayList needs unchecked conversion to conform to List<Carta>| Mano.java	/Poker/src/poker	|  line 10	Java| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 26| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 25| Checkstyle| Problem |
|Usar la importación con '.*' debería evitarse - java.util.*.| Mano.java	/Poker/src/poker	|  line 2| Checkstyle| Problem |
|member def modifier en el nivel de sangrado 8 no está al nivel correcto, 2| Mano.java	/Poker/src/poker	|  line 5| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Mano.java	/Poker/src/poker	|  line 5| Checkstyle| Problem |
|member def modifier en el nivel de sangrado 4 no está al nivel correcto, 2| Mano.java	/Poker/src/poker	|  line 6| Checkstyle| Problem |
|Member name 'bCambiorealizado' must match pattern '^[a-z][a-z0-9][a-zA-Z0-9]*$'.| Mano.java	/Poker/src/poker	|  line 6| Checkstyle| Problem |
|member def modifier en el nivel de sangrado 4 no está al nivel correcto, 2| Mano.java	/Poker/src/poker	|  line 7| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 24| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 23| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 22| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.| Mano.java	/Poker/src/poker	|  line 8| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 21| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Mano.java	/Poker/src/poker	|  line 9| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Mano.java	/Poker/src/poker	|  line 9| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 20| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Mano.java	/Poker/src/poker	|  line 10| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 19| Checkstyle| Problem |
|WhitespaceAround: 'for' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Mano.java	/Poker/src/poker	|  line 11| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Mano.java	/Poker/src/poker	|  line 11| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Mano.java	/Poker/src/poker	|  line 11| Checkstyle| Problem |
|WhitespaceAround: '<' is not preceded with whitespace.| Mano.java	/Poker/src/poker	|  line 11| Checkstyle| Problem |
|WhitespaceAround: '<' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Mano.java	/Poker/src/poker	|  line 11| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.| Mano.java	/Poker/src/poker	|  line 11| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 18| Checkstyle| Problem |
|method def modifier en el nivel de sangrado 8 no está al nivel correcto, 2| Poker.java	/Poker/src/poker	|  line 5| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Poker.java	/Poker/src/poker	|  line 5| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 17| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 16| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Poker.java	/Poker/src/poker	|  line 6| Checkstyle| Problem |
|try en el nivel de sangrado 17 no está al nivel correcto, 4| Poker.java	/Poker/src/poker	|  line 7| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Poker.java	/Poker/src/poker	|  line 7| Checkstyle| Problem |
|WhitespaceAround: 'try' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Poker.java	/Poker/src/poker	|  line 7| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.| Poker.java	/Poker/src/poker	|  line 7| Checkstyle| Problem |
|try el descendiente en el nivel de sangrado 20 no está al nivel correcto, 6| Poker.java	/Poker/src/poker	|  line 8| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Poker.java	/Poker/src/poker	|  line 8| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Poker.java	/Poker/src/poker	|  line 8| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 15| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Poker.java	/Poker/src/poker	|  line 9| Checkstyle| Problem |
|WhitespaceAround: 'for' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Poker.java	/Poker/src/poker	|  line 9| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Poker.java	/Poker/src/poker	|  line 9| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Poker.java	/Poker/src/poker	|  line 9| Checkstyle| Problem |
|WhitespaceAround: '<' is not preceded with whitespace.| Poker.java	/Poker/src/poker	|  line 9| Checkstyle| Problem |
|WhitespaceAround: '<' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Poker.java	/Poker/src/poker	|  line 9| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.| Poker.java	/Poker/src/poker	|  line 9| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 14| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Poker.java	/Poker/src/poker	|  line 10| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 13| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Poker.java	/Poker/src/poker	|  line 11| Checkstyle| Problem |
|try el descendiente en el nivel de sangrado 20 no está al nivel correcto, 6| Poker.java	/Poker/src/poker	|  line 12| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Poker.java	/Poker/src/poker	|  line 12| Checkstyle| Problem |
|try el descendiente en el nivel de sangrado 20 no está al nivel correcto, 6| Poker.java	/Poker/src/poker	|  line 13| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Poker.java	/Poker/src/poker	|  line 13| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Poker.java	/Poker/src/poker	|  line 13| Checkstyle| Problem |
|try el descendiente en el nivel de sangrado 20 no está al nivel correcto, 6| Poker.java	/Poker/src/poker	|  line 14| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Poker.java	/Poker/src/poker	|  line 14| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 12| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Poker.java	/Poker/src/poker	|  line 15| Checkstyle| Problem |
|WhitespaceAround: 'for' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Poker.java	/Poker/src/poker	|  line 15| Checkstyle| Problem |
|WhitespaceAround: '=' is not preceded with whitespace.| Poker.java	/Poker/src/poker	|  line 15| Checkstyle| Problem |
|WhitespaceAround: '=' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Poker.java	/Poker/src/poker	|  line 15| Checkstyle| Problem |
|WhitespaceAround: '<' is not preceded with whitespace.| Poker.java	/Poker/src/poker	|  line 15| Checkstyle| Problem |
|WhitespaceAround: '<' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)| Poker.java	/Poker/src/poker	|  line 15| Checkstyle| Problem |
|WhitespaceAround: '{' is not preceded with whitespace.| Poker.java	/Poker/src/poker	|  line 15| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Carta.java	/Poker/src/poker	|  line 11	|Checkstyle |Problem |
|La línea contiene un carácter de tabulación.| Poker.java	/Poker/src/poker	|  line 16| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	|Carta.java	/Poker/src/poker	|  line 10	|Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Poker.java	/Poker/src/poker	|  line 17| Checkstyle| Problem |
|try el descendiente en el nivel de sangrado 20 no está al nivel correcto, 6	|Poker.java	/Poker/src/poker|  line 18	|Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Poker.java	/Poker/src/poker	|  line 18	|Checkstyle |Problem |
|try rcurly en el nivel de sangrado 16 no está al nivel correcto, 4	|Poker.java	/Poker/src/poker	|  line 19	|Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	|Poker.java	/Poker/src/poker	|  line 19	|Checkstyle| Problem |
|WhitespaceAround: 'catch' is not preceded with whitespace.	|Poker.java	/Poker/src/poker	|  line 19	|Checkstyle| Problem |
|WhitespaceAround: '}' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)	|Poker.java	/Poker/src/poker	|  line 19	|Checkstyle| Problem |
|WhitespaceAround: 'catch' is not followed by whitespace. Empty blocks may only be represented as {} when not part of a multi-block statement (4.1.3)	|Poker.java	/Poker/src/poker	|  line 19	|Checkstyle |Problem |
|WhitespaceAround: '{' is not preceded with whitespace.	|Poker.java	/Poker/src/poker	|  line 19	|Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	|Carta.java	/Poker/src/poker	|  line 9	|Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	|Poker.java	/Poker/src/poker	|  line 20| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	|Carta.java	/Poker/src/poker	|  line 8	|Checkstyle| Problem |
|La línea contiene un carácter de tabulación.	|Poker.java	/Poker/src/poker	|  line 21	|Checkstyle| Problem |
|method def rcurly en el nivel de sangrado 12 no está al nivel correcto, 2	|Poker.java	/Poker/src/poker	|  line 22| Checkstyle| Problem |
|La línea contiene un carácter de tabulación.| Poker.java	/Poker/src/poker	|  line 22	|Checkstyle |Problem |
