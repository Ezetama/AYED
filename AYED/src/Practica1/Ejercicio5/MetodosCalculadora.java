package Practica1.Ejercicio5;

public class MetodosCalculadora {
	private static Dato DC;
	
	public static Dato puntoA (int[] a) {
	int max=9999,min=-9999;
	double prom=0;
	int i;
	for (i=0;i<a.length;i++) {
		if (a[i]>max) {
			max=a[i];
		}
		if (a[i]<min) {
			min=a[i];
		}
		prom=prom+a[i];
	}
	Dato d= new Dato(max,min,prom/a.length);
	return d;
	}
	public static void puntoB (int[] a, Dato d) {
		int max=9999,min=-9999;
		double prom=0;
		int i;
		for (i=0;i<a.length;i++) {
			if (a[i]>max) {
				max=a[i];
			}
			if (a[i]<min) {
				min=a[i];
			}
			prom=prom+a[i];
		}
		d.setMaximo(max);
		d.setMinimo(min);
		d.setPromedio(prom/a.length);
	}
	
	public static void puntoC (int[] a) {
		int max=9999,min=-9999;
		double prom=0;
		int i;
		for (i=0;i<a.length;i++) {
			if (a[i]>max) {
				max=a[i];
			}
			if (a[i]<min) {
				min=a[i];
			}
			prom=prom+a[i];
		}
		DC.setMaximo(max);
		DC.setMinimo(min);
		DC.setPromedio(prom/a.length);
	}
	public static Dato devolverC () {
		return DC;
	}
	
}
