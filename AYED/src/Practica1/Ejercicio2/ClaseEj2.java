package Practica1.Ejercicio2;

public class ClaseEj2 {

	public static int[] crearVector (int a){
		int[] v= new int[a];
		int i;
		for (i=0;i<a;i++) {
			v[i]=a*(i+1);
		}
		return v;
	}
	public static void Imprimir (int[] v) {
		int i;
		for (i=0;i<v.length;i++) {
			System.out.println(v[i]);
		}
	}
}
