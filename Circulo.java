public class Circulo {
	double raio;
	final double PI = Math.PI;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	double calcularArea() {
		return PI * (raio*raio);
	}
	
	double calcularPerimetro() {
		return 2*PI*raio;		
	}

	public String toString() {
		String info = "";
		info += "\nA Area: " + this.calcularArea();
		info += "\nO Perímetro: " + this.calcularPerimetro();
		return info;
	}
}
