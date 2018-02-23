public class Retangulo {
	private int base,altura;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int calcularArea() {
		return this.base * this.altura;
	}
	
	public int calcularPerimetro() {
		return (2*this.base) + (2*this.altura);
	}
	
	public String eQuadrado() {
		if(this.base == this.altura) {
			return "SIM";
		}
		else {
			return "NÃO";
		}
	}
}
