package br.com.glandata.main;

import br.com.glandata.model.Conta;
import br.com.glandata.model.Titular;

public class AtribuicaoValoresObjetos {

	public static void main(String[] args) {
		// Cadastro dos titulares
		Titular titularA = new Titular();
		titularA.nome = "Ailton";
		titularA.endereco = "Rua dos Bobos, 2";
		titularA.telefone = "11963225874";

		Titular titularB = new Titular();
		titularB.nome = "Gian";
		titularB.endereco = "Rua dos Bobos, 0";
		titularB.telefone = "11987456321";

		// Cadastro das Contas
		Conta contaA = new Conta();
		contaA.agencia = 123;
		contaA.numero = 456;
		contaA.saldo = 127.00;
		contaA.titular = titularA;

		Conta contaB = new Conta();
		contaB.agencia = contaA.agencia;
		contaB.numero = contaA.numero;
		contaB.saldo = contaA.saldo + 1000;
		contaB.titular = titularB;

		System.out.println(contaA.titular.nome);
		System.out.println(contaA.saldo);
		System.out.println("\n");
		
		contaB.titular.nome = "Giancarlo Leite";
		System.out.println(contaB.titular.nome);
		System.out.println(contaB.saldo);
	}

}
