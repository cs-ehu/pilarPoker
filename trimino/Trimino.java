package trimino;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Trimino{
	/**
	 * @param args 
	 * @return 
	 */
	public static void main(String[] args ) {
		Tablero tableroTriminos;
		Trimino trimino = new Trimino();
		String Nombrefichero=null;
		int dimension=0;
		int tamanho = 0;
		for (int i = 0; i < args.length; i++) {                            
            if (args[i].equals("-h")) {        
                muestraSintaxis();
                muestraCreditos();
                tamanho++;
            }
            else {
            	 if (args[i].equals("-t")) {        
            		 tamanho++;
                 }
            }               
            }
		
		
		String[] argumentos = new String[args.length-tamanho];
		int indice = 0;
		for (int i = tamanho; i < args.length; i++){ 
			argumentos[indice]= args[i];
			indice++;
		}
		if (argumentos.length==0){
			char marca='*';
			System.out.println ("-----------------");
			for (int i=0;i<8;i++){
				for (int j=0;j<8;j++)
				System.out.print(" "+ marca);
				System.out.println();}
			System.out.println ("-----------------");
			}else{
			int filaInicial = Integer.parseInt(argumentos[0]);
			int columnaInicial=Integer.parseInt(argumentos[1]);
			dimension=8;
			
			if (argumentos.length>2){
			 
				  dimension=Integer.parseInt(argumentos[2]);
			  	  double numero = 0;
			  	  int potencia = 1;
			  	  boolean potenciaDos = false;
			  	  while (numero<=dimension){
			  		  numero = Math.pow (2, potencia);
			  		  if (numero == dimension){
			  			  potenciaDos = true;
			  			  break;
			  		  }
			  		  potencia = potencia + 1;				  
			  	  }
			  	  if (!potenciaDos){
			    	    	System.out.println("-------------------------------------------------------");
			    	    	System.out.println("Trimino de dimension incorrecta. No podremos resolverlo.");
			    	    	System.out.println("-------------------------------------------------------");
			    	    	System.exit(0);
			  	  }
			
			}
			
		 
			tableroTriminos= new Tablero(dimension);
			
			tableroTriminos.marcaCasillaInicial(filaInicial, columnaInicial);
			int dimensionInicial = tableroTriminos.getDimension();
			trimino.recursivo(dimensionInicial, filaInicial, columnaInicial, tableroTriminos.getDimension(), tableroTriminos);
	
			System.out.println("===========================================================");
			
			if (argumentos.length>3){
				  Nombrefichero = String.valueOf(argumentos[3]);
			}
				try {
					tableroTriminos.imprimeTablero(tableroTriminos.getDimension(),Nombrefichero);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}		
		}
			
	}
	
	public ArrayList<TriminoDimension> recursivoTriminos(ArrayList<TriminoDimension> listaTriminos,int dimensionTablero,Tablero tableroTriminos){
		ArrayList<TriminoDimension> listaTriminosAux =null;
		for (int i=0;i<listaTriminos.size();i++){
		TriminoDimension triminoDimensionAux = (TriminoDimension)listaTriminos.get(i); 
		int dimensionAux = triminoDimensionAux.getDimension();
		if(dimensionAux>1){
			Casilla[] triminoMarcaAux = triminoDimensionAux.getTriminoMarca();
			for (int j=0;j<triminoMarcaAux.length;j++){
				Casilla casilla = triminoMarcaAux[j];
				int fila=casilla.getFila();
				int columna= casilla.getColumna();
				listaTriminosAux = recursivo(dimensionAux/2, fila, columna, dimensionTablero, tableroTriminos);
			}
		}
		}
		return listaTriminosAux;
		}
	
	
	public ArrayList<TriminoDimension> recursivo(int dimensionCuadrante,int fila,int columna,int dimensionTablero,Tablero tableroTriminos){
		ArrayList<TriminoDimension>  listaTriminos = new ArrayList<TriminoDimension>();
		for(int i=dimensionCuadrante;i>1;i=i/2){
			String cuadranteMarca=tableroTriminos.definirCuadrante(fila, columna,i);
			Casilla[] triminoMarca = tableroTriminos.elegirTrimino(fila,columna,cuadranteMarca,dimensionTablero, i);
			TriminoDimension triminoDimension = new TriminoDimension();
			triminoDimension.setDimension(i);
			triminoDimension.setTriminoMarca(triminoMarca);
			listaTriminos.add(triminoDimension);
			recursivoTriminos(listaTriminos,dimensionTablero,tableroTriminos);
		}
		return listaTriminos;
		
	}
	
	  public static void muestraSintaxis () {
	        System.out.println("La sintaxis de la invocación debe ser");
	        System.out.println("trimino [-t][-h] x y [d][fichero]");
	    }
	  
	  public static void muestraCreditos () {
	        System.out.println("Alumno : Pilar");
	        System.out.println("Centro de Barbastro the best");                
	    }
}
		    
		


