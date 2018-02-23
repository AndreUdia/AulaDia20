public class ContaCorrente {
	private String nome;
	private String senha;
	private double saldo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void cadastrarSenha(String senhaAntiga, String novaSenha) {
		if(senhaAntiga.equals(this.senha)) {
			setSenha(novaSenha);
		}
		else {
			System.out.println("Você inseriu a senha incoreta");
		}
	}
	
	public void debitar(double valor, String senha){
		if(this.senha.equals(senha)) {
			this.saldo -= valor;
		}
		else {
			System.out.println("Senha incorreta!");
		}
	}
	
	public void creditar(double valor, String senha){
		if(this.senha.equals(senha)) {
			this.saldo += valor;
		}
		else {
			System.out.println("Senha incorreta!");
		}
	}
	
	
}
