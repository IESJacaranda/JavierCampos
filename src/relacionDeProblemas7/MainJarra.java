package relacionDeProblemas7;

public class MainJarra {

	public static void main(String[] args) {
		Jarra A =new Jarra(50);
		Jarra B = new Jarra(5);
		A.LlenarJarra();
		
		System.out.println(A.getCantidad());
		System.out.println(B.getCantidad());
		
		A.volcarAenB(B);
		System.out.println(A.getCantidad());
		System.out.println(B.getCantidad());
		
		B.volcarAenB(A);
		System.out.println(A.getCantidad());
		System.out.println(B.getCantidad());
		
		B.VaciarJarra();
		System.out.println(A.getCantidad());
		System.out.println(B.getCantidad());
		
		A.volcarAenB(B);
		System.out.println(A.getCantidad());
		System.out.println(B.getCantidad());
	}

}
