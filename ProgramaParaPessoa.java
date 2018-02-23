public class ProgramaParaPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.setCpf("051.054.216-00");
		p1.setIdade(12);
		p1.setNome("Gustavo");
		
		p2.setCpf("034.055.254-01");
		p2.setIdade(18);
		p2.setNome("Aline");
		
		System.out.println("O nome da 1° pessoa é : " + p1.getNome());
		System.out.println("O nome da 2° pessoa é : " + p2.getNome());
		
		System.out.println("O cpf da 1° pessoa é : " + p1.getCpf());
		System.out.println("O cpf da 2° pessoa é : " + p2.getCpf());
		
		System.out.println("A idade da 1° pessoa é : " + p1.getIdade());
		System.out.println("A idade da 2° pessoa é : " + p2.getIdade());
		
	}
}
