public class Calculo {
	double saldo = 0.0;
	
	public void credito(double valor) {
		this.saldo += valor;
	}
	
	public void debito(double valor){
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
