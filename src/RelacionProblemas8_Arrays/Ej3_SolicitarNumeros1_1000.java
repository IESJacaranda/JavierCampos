package RelacionProblemas8_Arrays;

import EjerciciosArrays.EjerciciosMatrices;

public class Ej3_SolicitarNumeros1_1000 {
	
	public static double calcularMedia(int[] lista) {
		double total=0;
		for(int i = 0; i<lista.length; i++) {
			total+=lista[i];
		}
		double media= total/(lista.length);
		return media;
	}
	
	public static int[] ultimoDigito(int[] lista) {
		int contador0=0, contador1=0, contador2=0, contador3=0, contador4=0, contador5=0, contador6=0,
				contador7=0, contador8=0, contador9=0;
		int [] listaDigitos= new int[10];
		
		for(int i =0; i<lista.length;i++) {
			listaDigitos[lista[i]%10]++;
			
		}
		return listaDigitos;
		
	}
	
	public static String digitoMasRepetido(int []lista) {
	 int mayor=lista[0];
	 for (int i=0; i<lista.length;i++) {
		 if(mayor<lista[i]) {
			 mayor=i;
		 }
	 }
		return ("El digito que mas se repite es "+mayor);
	}
	
	

	public static void main(String[] args) {
		int[]lista={0,1,1,1,2,3,3,3,3,3,3,3,4,5,6};
		//System.out.println(calcularMedia(lista));
		EjerciciosMatrices.imprimirVector(ultimoDigito(lista));
		System.out.println(digitoMasRepetido(ultimoDigito(lista)));

	}

}
