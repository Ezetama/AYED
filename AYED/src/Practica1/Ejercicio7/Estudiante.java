package Practica1.Ejercicio7;

public class Estudiante {
	private String nombre;
	private String apellido;
	private int legajo;
	
	public Estudiante (String unNombre, String unApellido,int unLegajo) {
		this.setApellido(unApellido);
		this.setNombre(unNombre);
		this.setLegajo(unLegajo);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	@Override
	public String toString () {
		String s="Nombre: "+this.getNombre()+" Apellido: "+this.getApellido()+" Legajo: "+this.getLegajo();
		return s;
	}
}
