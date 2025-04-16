package Practica1.Ejercicio7;

import java.util.*;

public class TestArrayList {
	public static boolean esCapicua (List<Integer> l) {
		if (l.isEmpty()) {
			System.out.println("La lista estaba vacia");
			return true;
		}
		else {
			boolean ok= esCapicuaRecursivo (l,0,l.size()-1);
			return ok;
		}
		
	}
	public static boolean esCapicuaRecursivo (List<Integer> l,int pri, int ult) {
		boolean ok= true;
		if (pri<ult) {
			if (l.get(pri).equals(l.get(ult))){
				ok=esCapicuaRecursivo (l,pri+1,ult-1);
			}
			else {
				ok=false;
			}
		}
		return ok;
	}
	public static void main (String args[]) {
		Scanner s= new Scanner (System.in);
		//ArrayList<Integer> l= new ArrayList<Integer>();
		List<Integer> l= new LinkedList<Integer>();
		System.out.println("Ingrese un numero para agregar a la ArrayList");
		int n= s.nextInt();
		while (n!=0) {
			l.add(n);
			System.out.println("Ingrese un numero para agregar a la ArrayList");
			n= s.nextInt();
		}
		System.out.println(l);
		for (int elem : l) {
			System.out.println(elem);
		}
		/*INCISO C
        Iterator<Integer> it = l.iterator();
        while(it.hasNext()) 
            System.out.println(it.next());
        
        System.out.println("-------------------");
        
        for(int i=0; i < l.size(); i++)
            System.out.println("Num=" + l.get(i));
        */
		List<Estudiante> alumnos = new ArrayList<Estudiante>();
		Estudiante e1= new Estudiante ("JuanMartin","Canguillen",112233);
		Estudiante e2= new Estudiante ("Ezequiel","Tamame",127127);
		Estudiante e3= new Estudiante ("Augusto","Cheka",44538);
		alumnos.add(e1);
		alumnos.add(e2);
		alumnos.add(e3);
		List<Estudiante> alumnos2 = alumnos; //copia directa
		//List<Estudiante> alumnos3 = new ArrayList<Estudiante>(alumnos); //solo copio el contenido pero es independiente
		System.out.println(alumnos);
		System.out.println(alumnos2);
		//System.out.println(alumnos3);
		//e1.setApellido("PANFLIN");
		//alumnos3.remove(1);
		//alumnos.remove(2);
		//System.out.println(alumnos);
		//System.out.println(alumnos2);
		//System.out.println(alumnos3);
		//Estudiante e4= new Estudiante ("ElNegro","Roman",777);
		Estudiante e4= new Estudiante ("ElNegro","Roman",127127);
		boolean ok= true;
		for (Estudiante elem: alumnos) { //cambiar a un WHILE y recorrer la lista con un indice
			if (elem.getLegajo()==e4.getLegajo()) {
				ok=false;
			}
		}
		if (ok==true) {
			alumnos.add(e4);
			System.out.println("Se pudo agregar el cuarto alumno");
		}
		else {
			System.out.println ("Ya habia un alumno con ese legajo en la lista");
		}
		System.out.println(alumnos);
		System.out.println(l.size());
		boolean es=esCapicua(l);
		if (es==true){
			System.out.println("Es capicua");
		}
		else {
			System.out.println("No lo es");
		}
		List<Integer> l2= EjercicioSucecion.calcularSucecion(6);
		System.out.println(l2);
		EjercicioSucecion.invertirLista(l2);
		System.out.println(l2);
		int suma= EjercicioSucecion.sumarLinked((LinkedList)l);
		System.out.println("La suma es: "+suma);
	}
	
	
}
