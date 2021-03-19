package RelacionProblemas8_Arrays;

public class MainFecha {

	public static void main(String[] args) {
Fecha fecha= new Fecha();
try {
	System.out.println(fecha.comprobarFechaCorrecta(30, 2, 212));
} catch (Exception e) {
	
	System.out.println(e.getMessage());
}
	}

}
