public class UsaFuncionario {

	public static void main(String[] args) {
		Funcionario joao = new Funcionario("João",20.00, 3.5);
		System.out.println(joao.toString());
		
		Funcionario mateus = new Funcionario("Mateus",40.00, 5.5);
		System.out.println(mateus.toString());
		
		Funcionario lucas = new Funcionario("Lucas",40.00, 13.5);
		System.out.println(lucas.toString());
	}

}
