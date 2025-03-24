package com.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.cliente.Cliente;
import com.backend.cliente.DadosAtualizacaoCliente;
import com.backend.cliente.DadosCadastroCliente;
import com.backend.repository.ClienteRepository;
import com.backend.cliente.DadosListagemCliente;


import jakarta.transaction.Transactional;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@PostMapping("/cadastrar")
	@Transactional
	public void cadastrarAlunos(@RequestBody DadosCadastroCliente dados) {
		
		clienteRepository.save(new Cliente(dados));
		
	}
	
	@GetMapping("/listar")
	public List<DadosListagemCliente> listar(){
		return clienteRepository.findAll().stream().map(DadosListagemCliente::new).toList();
	}
	
	
	@GetMapping("/listar-tudo")
	public List<Cliente> listarTudo(){
		return clienteRepository.findAll();
		
	}
	
	@PutMapping("/atualizar")
	@Transactional
	public void atualizar(@RequestBody DadosAtualizacaoCliente dados) {
		var cliente = clienteRepository.getReferenceById(dados.id());
		cliente.atualizarInformacoes(dados);
	}
	@DeleteMapping("/deletar/{id}")
	@Transactional
	public void excluir(@PathVariable("id")Long id) {
		clienteRepository.deleteById(id);
		
	}
}