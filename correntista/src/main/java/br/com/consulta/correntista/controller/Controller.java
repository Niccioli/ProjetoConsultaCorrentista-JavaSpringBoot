package br.com.consulta.correntista.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.consulta.correntista.dao.ClienteDao;
import br.com.consulta.correntista.dao.ContaDao;
import br.com.consulta.correntista.model.Cliente;
import br.com.consulta.correntista.model.Conta;

@RestController
public class Controller {
	
	@Autowired
	private ClienteDao clienteDao;
	
	@Autowired
	private ContaDao contaDao;
	
	
	// Mapeamento rota para mostrar contas cadastradas no Banco de Dados
	@GetMapping("/contas")	
	public ArrayList<Conta> mostrarContas(){
		ArrayList<Conta> lista;
		lista = (ArrayList<Conta>)contaDao.findAll();
		return lista;
	}
	
	// Mapeamento rota para mostrar clientes cadastrados no Banco de Dados	
	@GetMapping("/clientes")	
	public ArrayList<Cliente> mostrarClientes(){
		ArrayList<Cliente> lista;
		lista = (ArrayList<Cliente>)clienteDao.findAll();
		return lista;
	}
	
	// Filtrar por cliente
	@GetMapping("cliente/{id}")
	public Cliente filtrar(@PathVariable int id) {		
		return clienteDao.findById(id).orElse(null);
		
	}
	
	
	
	

}
