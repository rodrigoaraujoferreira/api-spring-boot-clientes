package com.estudos.clientes.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.clientes.model.ClientesModel;
import com.estudos.clientes.repository.ClientesRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClientesRepository clientesRepository;
	
	@GetMapping
	public List<ClientesModel> listar() {
		return clientesRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ClientesModel adicionar(@RequestBody ClientesModel clientesModel) {
		return clientesRepository.save(clientesModel);
	}

}
