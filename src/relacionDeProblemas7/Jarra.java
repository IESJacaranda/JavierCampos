package relacionDeProblemas7;

public class Jarra {
	private double capacidad;
	private double totalAgua;
	private double cantidad;
	
	public Jarra() {
		
	}
	public Jarra(double capacidad) {
		this.capacidad=capacidad;
	}
	public double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
		this.totalAgua=0;
	}
	
	
	public double getTotalAgua() {
		return totalAgua;
	}
	public void setTotalAgua(double totalAgua) {
		this.totalAgua = totalAgua;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public void LlenarJarra () {
		this.cantidad=this.capacidad;
		this.totalAgua+=this.capacidad;
	}
	
	public void VaciarJarra() {
		this.cantidad=0;
		this.totalAgua+=this.capacidad;
	}
	
	public void volcarAenB(Jarra j2) {
		if (j2.cantidad>=j2.capacidad) {
			System.out.println("No podemos realizar la operacion porque la jarra B está llena");
		}
		else if (this.cantidad<=0) {
			System.out.println("No podemos realizar la operacion porque la jarra A está vacia");
		}
		else {
			double posibilidadAgua=j2.capacidad-j2.cantidad;
			double totalIntroducido=0;
			if (posibilidadAgua<=this.cantidad){
				totalIntroducido=this.cantidad-posibilidadAgua;
			}
			else if (posibilidadAgua>this.cantidad) {
				totalIntroducido=posibilidadAgua-this.cantidad;
			}
			j2.cantidad+=totalIntroducido;
			this.cantidad-=totalIntroducido;
		}
	}

}
