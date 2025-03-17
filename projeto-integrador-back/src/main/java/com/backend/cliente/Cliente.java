package com.backend.cliente;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;

import java.util.Date;
import com.backend.endereco.Endereco;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Table(name = "clientes")
@Entity(name = "Cliente")


@EqualsAndHashCode(of = "id")
	

public class Cliente {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
	
	private Long id;
	private String name;
	private Date dataNascimento;
	private String email;
	private String cpf;
	private Endereco endereco;
	
	public Cliente() {}
	public Cliente(DadosCadastroCliente dados) {
		this.setName(dados.name());
		this.setEmail(dados.email());
		this.setCpf(dados.cpf());
		this.setEndereco(new Endereco (dados.endereco()));
		this.setDataNascimento(dados.dataNascimento());
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	} 
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void atualizarInformacoes(DadosAtualizacaoCliente dados) {
		if(dados.nome() != null) {
			this.name = dados.nome();
		}
		if(dados.cpf() != null) {
			this.cpf = dados.cpf();
		}
		if(dados.email() != null) {
			this.email = dados.email();
		}
		
		
		if(dados.endereco() != null) {
			this.endereco.atualizarInformacoes(dados.endereco());
		}
		
		
	}
}
