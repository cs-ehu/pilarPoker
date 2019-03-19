package trimino;

public class Trimino{
	/**
	 * @param args 
	 * @return 
	 */
	public static void main(String[] args ) {
		Tablero tableroTriminos;
		Trimino trimino = new Trimino();
		int dimension=0;
		if (args.length==0){
			char marca='*';
			System.out.println ("-----------------");
			for (int i=0;i<8;i++){
				for (int j=0;j<8;j++)
				System.out.print(" "+ marca);
				System.out.println();}
			System.out.println ("-----------------");
			}else{
			int filaInicial = Integer.parseInt(args[0]);
			int columnaInicial=Integer.parseInt(args[1]);
			dimension=8;
			
			if (args.length>2){
			  dimension=Integer.parseInt(args[2]);
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
			int dimensionTablero = tableroTriminos.getDimension();
			int dimensionInicial = 0;
			
			/************  TRIMINO DE LA MARCA INICIAL********************************************************/
			dimensionInicial = tableroTriminos.getDimension();					
			int dimensionMarca= dimensionInicial/2;

			
			trimino.llenadoCuadrante(filaInicial, columnaInicial, dimensionInicial, tableroTriminos,dimensionMarca);
	
			System.out.println("===========================================================");	
			tableroTriminos.imprimeTablero(tableroTriminos.getDimension());
			
			/***************************INICIO***********************************/
			String cuadranteIni=tableroTriminos.definirCuadrante(filaInicial, columnaInicial,dimensionTablero);
			Casilla[] triminoElegidoInicial=tableroTriminos.elegirTrimino(filaInicial,columnaInicial,cuadranteIni,dimensionTablero, dimensionTablero);
			
			for (int i=0;i<triminoElegidoInicial.length;i++){
					dimensionInicial = tableroTriminos.getDimension();
					dimensionMarca= dimensionInicial/2;
					Casilla casilla = triminoElegidoInicial[i];
					int fila=casilla.getFila();
					int columna= casilla.getColumna();
					
					trimino.llenadoCuadrante(fila, columna, dimensionInicial, tableroTriminos,dimensionMarca);
			}
			System.out.println("===========================================================");	
			tableroTriminos.imprimeTablero(tableroTriminos.getDimension());
			}
	}
	
	public void llenadoCuadrante(int fila, int columna, int dimensionTablero,Tablero tableroTriminos,int dimensionMarca){
		int dimension = dimensionTablero/4;
		int dimensionInicial = dimensionTablero;
		while(dimension>=1){
			
			String cuadranteMarca=tableroTriminos.definirCuadrante(fila, columna,dimensionMarca);
			Casilla[] triminoMarca = tableroTriminos.elegirTrimino(fila,columna,cuadranteMarca,dimensionTablero, dimensionMarca);
			tableroTriminos.imprimeTablero(tableroTriminos.getDimension());
			if (dimension>1){
				this.triminoRecursivoSuperior(triminoMarca, tableroTriminos, dimension);
				this.triminoRecursivoInferior(triminoMarca, tableroTriminos, 2,dimension);
			}
			dimensionInicial = dimensionInicial/2;
			dimensionMarca= dimensionInicial/2;
			dimension = dimensionInicial/4;
		}
	}
	/*     PROCEDIMIENTO RECURSIVO APLICANDO LA ESTRATEGIA DIVIDE Y VENCERAS     */

	public void triminoRecursivoSuperior(Casilla[] trimino,Tablero tableroTriminos,int dimension){
		Casilla[] triminoElegido = null;
		String cuadrante= null;
		for (int i=0;i<trimino.length;i++){
			Casilla casilla = trimino[i];
			int fila=casilla.getFila();
			int columna= casilla.getColumna();
			cuadrante=tableroTriminos.definirCuadrante(fila, columna, dimension);
			triminoElegido=tableroTriminos.elegirTrimino(fila, columna,cuadrante,tableroTriminos.getDimension(),dimension);
			tableroTriminos.imprimeTablero(tableroTriminos.getDimension());
			System.out.println("===========================================================");
			if (dimension/2>1)
				triminoRecursivoSuperior(triminoElegido,tableroTriminos,dimension/2);
			
		}
		}
	
	public void triminoRecursivoInferior(Casilla[] trimino,Tablero tableroTriminos,int dimensionInferior,int dimensionSuperior){
		Casilla[] triminoElegido = null;
		String cuadrante= null;
		for (int i=0;i<trimino.length;i++){
			Casilla casilla = trimino[i];
			int fila=casilla.getFila();
			int columna= casilla.getColumna();
			cuadrante=tableroTriminos.definirCuadrante(fila, columna, dimensionInferior);
			triminoElegido=tableroTriminos.elegirTrimino(fila, columna,cuadrante,tableroTriminos.getDimension(),dimensionInferior);
			tableroTriminos.imprimeTablero(tableroTriminos.getDimension());
			System.out.println("===========================================================");
			if (dimensionInferior*2<dimensionSuperior)
				triminoRecursivoInferior(triminoElegido,tableroTriminos,dimensionInferior*2,dimensionSuperior);
		}
		}
}
		    
		


