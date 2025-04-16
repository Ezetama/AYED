package Practica1.Ejercicio5;

public class Dato {
	private int maximo;
	private int minimo;
	private double promedio;
	
	public Dato (int max,int min, double prom) {
		this.setMaximo(max);
		this.setMinimo(min);
		this.setPromedio(prom);
	}
	
	public int getMaximo() {
		return maximo;
	}
	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}
	public int getMinimo() {
		return minimo;
	}
	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	
	@Override
	public String toString () {
		String s= "Maximo: "+this.getMaximo()+" Minimo: "+this.getMinimo()+" Promedio: "+this.getPromedio();
		return s;
	}
	
	
}
