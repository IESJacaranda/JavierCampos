package EjerciciosArrays;

public class EjerciciosMatrices {
	
public static void ejercicio1() {
		
		
		int[][] matriz = new int[4][4];

		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (i==j) {
					matriz[i][j]=1;
				}
				else {
					matriz[i][j]=0;
				}
				
			System.out.println(matriz[i][j]+ "\t");
			System.out.println("");
			}
		}
			
				
			}

//Ejercicio2
public static void imprimirMatrix(int[][] matriz) {
	
	
	

	StringBuilder cadena= new StringBuilder();
	int contador=0;
	

	for (int i=0; i<matriz.length; i++) {
		for (int j=0; j<matriz[i].length; j++) {
			if (contador==i) {
				if(j+1<matriz[i].length) {
					
					cadena.append(matriz[i][j]+",");
				}
				else {
					cadena.append(matriz[i][j]);
				}

			}
			else {
				
				cadena=new StringBuilder();
				cadena.append(matriz[i][j]+",");
				contador++;
				
			}
			
		
		}
		System.out.println("["+ cadena +"]");
	}
		
			
		}
	

public static void ejercicio3() {
	boolean igualdad=false;
	
	int[][] matriz = {{1,2,3,4},{2,5,6,7},{1,3,4,5},{2,3,4,5}};
	int[][] matriz2 = {{1,2,3,4},{2,5,6,7},{1,3,4,5},{2,3,4,5}};
	
	
	if (matriz.length==matriz2.length) {
		for(int i=0; i<matriz.length;i++) {
			if(matriz[i].length==matriz2[i].length) {
				igualdad=true;
				}
			else {
				igualdad=false;
			}
		}
	}
		
	if (igualdad==true) {
	StringBuilder cadena= new StringBuilder();
	int contador=0;
	

	for (int i=0; i<matriz.length; i++) {
		for (int j=0; j<matriz[i].length; j++) {
			if (contador==i) {
				if(j+1<matriz[i].length) {
					
					cadena.append(matriz[i][j]+matriz[i][j]+",");
				}
				else {
					cadena.append(matriz[i][j]+matriz[i][j]);
				}

			}
			else {
				
				cadena=new StringBuilder();
				cadena.append(matriz[i][j]+matriz[i][j]+",");
				contador++;
				
			}
			
		
		}
		System.out.println("["+ cadena +"]");
	}
	
	}
	else {
		System.out.println("No son iguales");
		
	}
	
	
	}


	
	
	
		
			
		

	public static void main(String[] args) {
		int[][] matriz = {{1,2,3,4},{2,5,6,7},{1,3,4,5},{2,3,4,5}};
		imprimirMatrix(matriz);
	

	}

}
