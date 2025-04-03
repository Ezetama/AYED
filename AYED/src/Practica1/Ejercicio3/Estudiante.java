package Practica1.Ejercicio3;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String comision;
	private String mail;
	private String direccion;
	
	public Estudiante (String unNombre, String unApellido, String unaComision, String unMail, String unaDireccion) {
		this.setNombre(unNombre);
		this.setApellido(unApellido);
		this.setComision(unaComision);
		this.setMail(unMail);
		this.setDireccion(unaDireccion);
	}
	public String tusDatos () {
		String s= "Estudiante "+this.getNombre()+" "+this.getApellido()+" Email: "+this.getMail()+" Comision: "+this.getComision()+" Direccion: "+this.getDireccion();
		return s;
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
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
