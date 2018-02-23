public class ProgramaTestaContaCorrente {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		
		c1.setSenha("aula1");
		c1.cadastrarSenha("aula1", "senhaforte");
		
		System.out.println(c1.getSenha());
		
		c1.creditar(100.00, "senhafraca");
		c1.creditar(100.00, "senhaforte");
		
		System.out.println(c1.getSaldo());
		
		c1.debitar(50.00, "senhafraca");
		c1.debitar(50.00, "senhaforte");
		
		System.out.println(c1.getSaldo());
		
	}

}
