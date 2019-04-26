package model;

public class Pessoa {
	private String nome;
	private String endereco;
	private String bairro;
	private long cep;
	private String cidade;
	private String estado;
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setEndereco(String endereco) {
			this.endereco=endereco;
	}
	public void setBairro(String bairro) {
		this.bairro=bairro;
	}
	public void setCep(long cep) {
		this.cep=cep;
	}
	public void setCidade(String cidade) {
		this.cidade=cidade;
	}
	public void setEstado(String estado) {
		this.estado=estado;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
			return endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public long getCep() {
		return cep;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	

}
