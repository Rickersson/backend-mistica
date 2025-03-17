package com.backend.cliente;

import java.util.Date;

import com.backend.endereco.DadosEndereco;


public record DadosCadastroCliente(
		String name,
		String cpf,
		String email,
		DadosEndereco endereco,
		Long id,
		Date dataNascimento
		) {

}
