public class CodigoPostal {
	private String indicativo, extensao, nomeZona;
	
	public CodigoPostal(String indicativo, String extensao, String nomeZona) {
		this.indicativo = indicativo;
		this.extensao = extensao;
		this.nomeZona = nomeZona;
	}

	public String getIndicativo() {
		return indicativo;
	}

	public void setIndicativo(String indicativo) {
		this.indicativo = indicativo;
	}

	public String getExtensao() {
		return extensao;
	}

	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}

	public String getNomeZona() {
		return nomeZona;
	}

	public void setNomeZona(String nomeZona) {
		this.nomeZona = nomeZona;
	}
	
	public void mostrar() {
		System.out.println(getIndicativo() + "-" + getExtensao() + " " + getNomeZona());
	}
}
