package br.com.consulta.correntista.model;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;



@Entity
@Table(name = "tbconta")
public class Conta {
	
	@Id
		
	@Column(name = "numero")
	private double numero;
	
	@Column(name = "agencia")
	private int agencia;
	
	@Column(name = "tipo")
	private int tipo ;
	
	@Column(name = "saldo")
	private double saldo;
	
	@ManyToOne
	@JoinColumn(name="id_titular")
	private Cliente cliente;


	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
	
	
	

}
