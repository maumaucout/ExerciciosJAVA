package PraticasPOO;

public class Cliente {
	
	private String nomeCompleto;
	private String cpff;
	private String dataDeCadastro;
	
	public Cliente (String nome,String cpf, String cad)
	{
		nomeCompleto = nome;
		cpff = cpf;
		dataDeCadastro = cad;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpff;
	}

	public void setCpf(String cpf) {
		this.cpff = cpf;
	}

	public String getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(String dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	

}
