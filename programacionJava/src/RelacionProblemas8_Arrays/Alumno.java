package RelacionProblemas8_Arrays;

public class Alumno extends Persona implements Comparable<Alumno>{
	
	private double nota;
	
	public Alumno(String nombre, String apellido1, String apellido2, double nota) {
		super(nombre, apellido1, apellido2);
		this.nota=nota;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " y su nota es: "+this.nota;
	}
	
	


 //comparado por nota
	@Override
	public int compareTo(Alumno o) {
		int compareResult =0;
		if(this.nota>o.getNota()) {
			compareResult=1;
		}
		else if(this.nota<o.getNota()) {
			compareResult=-1;
		}
		else {
			compareResult=0;
		}
		return compareResult;
	}

	/*
	@Override
	public int compareTo(Alumno o) {
		
		return this.getNombre().compareTo(o.getNombre());
	}
	
	*/

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	

}
