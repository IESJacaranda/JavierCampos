package RelacionProblemas8_Arrays;

public class Baraja {

		private final static int NUMERO_CARTAS=48;
		private final static int CARTAS_POR_PALO=12;
		private Carta[] cartas= new Carta[NUMERO_CARTAS];
		
		private void inicalizarBaraja(){
			
				for(int i=0; i<Carta.PALOS.length; i++) {
					int index=0;
					for(int j=0; j< CARTAS_POR_PALO; j++) {
						cartas[index]= new Carta(Carta.PALOS[i], j+1);
						index++;
				}
			}
		}
		
		
		
		
		
}
