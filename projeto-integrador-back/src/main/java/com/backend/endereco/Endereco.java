package com.backend.endereco;


public class Endereco {
	private String logradouro;
	private String numero;
	private String cidade;
	private String bairro;
	private String complemento;
	private String uf;
	
    public Endereco(){}
	public Endereco(DadosEndereco dados){
		this.setLogradouro(dados.logradouro());
		this.setNumero(dados.numero());
		this.setCidade(dados.cidade());
		this.setBairro(dados.bairro());
		this.setComplemento(dados.complemento());
		this.setUf(dados.uf());
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public void atualizarInformacoes(DadosEndereco endereco) {
		if(endereco.logradouro() != null) {
			this.logradouro = endereco.logradouro();
		}
		if(endereco.bairro() != null) {
			this.bairro = endereco.bairro();
		}
		
		if(endereco.numero() != null) {
			this.numero = endereco.numero();
		}
		if(endereco.cidade() != null) {
			this.cidade = endereco.cidade();
		}
		if(endereco.uf() != null) {
			this.uf = endereco.uf();
		}if(endereco.complemento() != null) {
			this.complemento = endereco.complemento();
		}
	}
}
