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
	public static void agregarMasChico (List<Integer> l1, List<Integer> l2,List<Integer> l3,int i, int j) {
		if ((i<l1.size())&&(j<l2.size())){
			if (l1.get(i)<l2.get(j)) {
				l3.add(l1.get(i));
				agregarMasChico(l1,l2,l3,i+1,j);
			}
			else {
				l3.add(l2.get(j));
				agregarMasChico(l1,l2,l3,i,j+1);
			}
		}
		else {
			if (i<l1.size()) {
				l3.add(l1.get(i));
				agregarMasChico(l1,l2,l3,i+1,j);
			}
			else {
				if (j<l2.size()) {
					l3.add(l2.get(j));
					agregarMasChico(l1,l2,l3,i,j+1);
				}
			}
		}
	}
	public static ArrayList<Integer> combinarListas (List<Integer> l1, List<Integer> l2){
		ArrayList <Integer> l3= new ArrayList<Integer>();
		int i=0,j=0;
		agregarMasChico (l1,l2,l3,i,j);
		return l3;
	}
}



