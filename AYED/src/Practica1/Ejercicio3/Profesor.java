package Practica1.Ejercicio3;

public class Profesor {
	private String nombre;
	private String apellido;
	private String mail;
	private String catedra;
	private String facultad;
	
	public Profesor (String unNombre,String unApellido,String unMail,String unaCatedra,String unaFacultadd) {
		this.setNombre(unNombre);
		this.setApellido(unApellido);
		this.setMail(unMail);
		this.setCatedra(unaCatedra);
		this.setFacultad(unaFacultadd);
	}
	public String tusDatos () {
		String s= "Profesor "+this.getNombre()+" "+this.getApellido()+" Email: "+this.getMail()+" Catedra: "+this.getCatedra()+" Facultad: "+this.getFacultad();
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getCatedra() {
		return catedra;
	}
	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	
}
