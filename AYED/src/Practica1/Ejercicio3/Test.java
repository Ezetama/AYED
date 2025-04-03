package Practica1.Ejercicio3;

public class Test {
	public static void main (String [] args) {
		Estudiante[] vectorEstudiantes= new Estudiante[2];
		Estudiante e1= new Estudiante ("Juan","Canguillen","3b","Juanchito@gmail.com","Villa Arguello");
		Estudiante e2 = new Estudiante("María", "López", "4A", "maria.lopez@gmail.com", "Centro");
		vectorEstudiantes[0]=e1;
		vectorEstudiantes[1]=e2;
		Profesor[] vectorProfesores= new Profesor[3];
		Profesor p1 = new Profesor("Luis", "Ramírez", "luis.ramirez@gmail.com", "10h", "Facultad de Ciencias");  
		Profesor p2 = new Profesor("Carlos", "Gutiérrez", "carlos.g@gmail.com", "6h", "Facultad de Ingeniería");  
		Profesor p3 = new Profesor("Ana", "Fernández", "ana.f@hotmail.com", "12h", "Facultad de Medicina"); 
		vectorProfesores[0]=p1;
		vectorProfesores[1]=p2;
		vectorProfesores[2]=p3;
		int i;
		for (i=0;i<2;i++) {
			System.out.println(vectorEstudiantes[i].tusDatos());
		}
		for (i=0;i<3;i++) {
			System.out.println(vectorProfesores[i].tusDatos());
		}
	}
}
