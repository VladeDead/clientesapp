package com.analistas.clientesapp.model.service;

import com.analistas.clientesapp.model.entities.Cliente;
import com.analistas.clientesapp.model.repository.ClienteRepository;

import java.util.List;



public class ClienteServiceImpl implements IClienteService {
	
	ClienteRepository repo = new ClienteRepository();

	@Override
	public List<Cliente> buscarTodo() {
		// TODO Auto-generated method stub
		return repo.getClientes();
	}

	@Override
	public Cliente buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		repo.addCliente(cliente);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub

	}

}
