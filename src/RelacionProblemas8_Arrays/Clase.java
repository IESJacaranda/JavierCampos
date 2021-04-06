package RelacionProblemas8_Arrays;

import java.util.ArrayList;
import java.util.List;

public class Clase {
	
	//Declaro la lista de alumnos. Si no inicializo es null
	private List<Alumno> alumnos;
	
	private final double NOTA_APROBADO=5;
	
	public Clase() {
		super();
		//Inicializo la lista de clase
		alumnos= new ArrayList<Alumno>();
	}
	
	
	public String getAlumnosAprobados() {
		StringBuilder aprobados = new StringBuilder("Lista de aprobados: \n");
		for(int i=0; i<alumnos.size();i++) {
			Alumno al = alumnos.get(i);
			if(al.getNota()>=NOTA_APROBADO) {
				aprobados.append(al.toString()+"\n");
			}
		}
		return aprobados.toString();
	}
	
	public String getAlumnosSuspensos() {
		StringBuilder suspensos = new StringBuilder("Lista de suspensos: \n");
		for(int i=0; i<alumnos.size();i++) {
			Alumno al = alumnos.get(i);
			if(al.getNota()<NOTA_APROBADO) {
				suspensos.append(al.toString()+"\n");
			}
		}
		return suspensos.toString();
	}
	
	public double getNotaMediaClase() {
		double sumaNotas=0;
		double result=0;
		//isEmpty comprueba que la lista no tennga 0 valores
		if(!alumnos.isEmpty()) {
			for(Alumno alumno : alumnos){
				sumaNotas+=alumno.getNota();
			}
			result=sumaNotas/alumnos.size();
		}
		return result;
	}
	

	
	
	
	public void addAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	

}
