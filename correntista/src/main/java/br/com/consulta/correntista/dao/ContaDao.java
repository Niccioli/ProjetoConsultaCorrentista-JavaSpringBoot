package br.com.consulta.correntista.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.consulta.correntista.model.Conta;

public interface ContaDao extends JpaRepository<Conta, Integer> {

}
