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

//Imprimir vectores
public static void imprimirVector(int[] vector) {
	
	
	

	StringBuilder cadena= new StringBuilder();

	

	for (int i=0; i<vector.length; i++) {
			if (i+1<vector.length) {
				

					cadena.append(vector[i]+",");
				
			}
			else {
				cadena.append(vector[i]);
			}
			
		
		
	}
	System.out.println("["+ cadena +"]");
		
			
		}
	
//Ejercicio 3
public static int[][]sumarMatrices(int[][]matrizA, int[][]matrizB) {
	
	
	int[][]resultado=new int[matrizA.length][matrizA[0].length];
	
	
	if (matrizA.length==matrizB.length && matrizA[0].length==matrizB[0].length) {
		
		
			for(int i=0; i<matrizA.length;i++) {
				for(int j=0; j<matrizA[i].length;j++) {
					resultado[i][j]=matrizA[i][j]+matrizB[i][j];
				}
			}
		
	}
		
	return resultado;
}
	
	

//Ejercicio 4
public static int[] concatenarMatriz(int[] listaA, int[] listaB){
	int[]resultado = new int[listaA.length+listaB.length];
	
	
	for (int i=0; i<listaA.length; i++) {
		
			resultado[i]=listaA[i];
		
	}
	for (int i=0; i<listaB.length; i++) {
		
		resultado[i+listaA.length]=listaB[i];
	
}
	
	return resultado;
}

//Ejercicio 5
public static boolean rotarMatriz (int[][]matriz, int[][]matrizRotada) {
	if (matriz.length==matrizRotada.length && matriz[0].length==matrizRotada[0].length) {
		
		
	}
	
	
	boolean resultado=false;
	return resultado;
}

	
	
	
		
			
		

	public static void main(String[] args) {
		int[][] matrizA = {{1,2,3,4},{2,5,6,7}};
		int[][] matrizB = {{1,2,3,4},{2,5,6,7}};
		int[] listaA= {1,2,3,4};
		int[] listaB= {1,2,3,4};
		
		//imprimirVector(concatenarMatriz(listaA, listaB));
		imprimirMatrix(sumarMatrices(matrizA, matrizB));
	

	}

}
