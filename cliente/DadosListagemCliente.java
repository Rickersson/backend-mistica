package com.backend.cliente;

import java.util.Date;

import com.backend.endereco.Endereco;


public record DadosListagemCliente(
		String name,
		String email,
		String cpf,
		Endereco endereco,
		Long id,
		Date dataNascimento) {
	
	public DadosListagemCliente(Cliente cliente) {
		this(cliente.getName(), cliente.getEmail(), cliente.getCpf(), cliente.getEndereco(), cliente.getId(), cliente.getDataNascimento());
		
		
		
		}


}
