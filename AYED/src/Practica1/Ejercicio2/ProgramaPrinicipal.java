package Practica1.Ejercicio2;

import java.util.Scanner;

public class ProgramaPrinicipal {

	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el numero");
        int num = s.nextInt();
        int arreglo[] = ClaseEj2.crearVector(num);
        ClaseEj2.Imprimir(arreglo);
	}
}
