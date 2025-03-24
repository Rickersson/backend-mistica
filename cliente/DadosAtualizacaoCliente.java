package com.backend.cliente;

import java.util.Date;

import com.backend.endereco.DadosEndereco;


public record DadosAtualizacaoCliente(
		Long id,
		String nome,
		String cpf,
		Date dataNascimento,
		String email,
		DadosEndereco endereco
		) {

}
