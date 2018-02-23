public class ProgramaParaCalculo {

	public static void main(String[] args) {
		Calculo c1 = new Calculo();
		
		c1.credito(1000.0);
		c1.debito(500.0);
		
		System.out.println(c1.getSaldo());

	}

}
