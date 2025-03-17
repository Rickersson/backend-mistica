package com.backend.endereco;

public record DadosEndereco(
		String logradouro,
		String numero,
		String cidade,
		String bairro,
		String complemento,
		String uf) {

}
