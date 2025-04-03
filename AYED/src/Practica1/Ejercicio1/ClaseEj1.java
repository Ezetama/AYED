package Practica1.Ejercicio1;

public class ClaseEj1 {

	public static void conFor (int a,int b) {
		int i;
		if (a<=b) {
			for (i=a;i<=b;i++) {
				System.out.println(i);
			}
		}
		else {
			for (i=b;i<=a;i++) {
				System.out.println(i);
			}
		}	
	}
	public static void conWhile (int a,int b) {
		if (a<=b) {
			while (a<=b) {
				System.out.println(a++);
			}
		}
		else {
			while (b<=a) {
				System.out.println(b++);
			}
		}
	}
	public static void sinNada (int a,int b) {
		if (a<b) {
			System.out.println(a);
			int i=a+1;
			sinNada (i,b);
		}
		else {
			if (b<a) {
				System.out.println(b);
				int i=b+1;
				sinNada (a,i);
			}
			else {
				if (a==b) {
					System.out.println(a);
				}
			
			}
		}
	}
}


