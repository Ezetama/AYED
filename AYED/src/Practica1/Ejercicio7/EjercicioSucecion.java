package Practica1.Ejercicio7;

import java.util.*;

public class EjercicioSucecion {
	public static List<Integer> calcularSucecion (int n){
		List<Integer> l= new ArrayList<Integer>();
		if (n==1) {
			l.add(n);
		}
		else {
			calculoRecursivo (n,l);
		}
		return l;
	}
	public static void calculoRecursivo (int n, List<Integer> l) {
		if (n==1) {
			l.add(n);
		}
		else {
			l.add(n);
			if (n%2==0) {
				n=n/2;
				calculoRecursivo(n,l);
			}
			else {
				n=3*n+1;
				calculoRecursivo(n,l);
			}
		}
	}
	public static void invertirLista (List<Integer> l) {
		if (!l.isEmpty()) {
			int pri=0;
			int ult= l.size()-1;
			while (pri<ult) {
				int aux= l.get(pri);
				l.set(pri, l.get(ult));
				l.set(ult, aux);
				pri=pri+1;
				ult=ult-1;
			}
		}
	}
	public static int sumarLinked (LinkedList<Integer> l) {
		int suma=0,i=0;
		while (i<l.size()) {
			suma=suma+l.get(i);
			i++;
		}
		return suma;
	}
}



