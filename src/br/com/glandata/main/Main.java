package br.com.glandata.main;

import br.com.glandata.model.Conta;
import br.com.glandata.model.Titular;

public class Main {

	public static void main(String[] args) {
		// Cadastro dos titulares
		Titular titularA = new Titular();
		titularA.nome = "Giancarlo";
		titularA.endereco = "Rua dos Bobos, 2";
		titularA.telefone = "11963225874";

		Titular titularB = new Titular();
		titularB.nome = "Camila";
		titularB.endereco = "Rua dos Bobos, 0";
		titularB.telefone = "11987456321";

		Conta conta = new Conta();
		conta.agencia = 1234;
		conta.numero = 005;
		conta.saldo = 457.03;
		conta.titular = titularA;

		Conta conta2 = new Conta();
		conta2.agencia = 4321;
		conta2.numero = 123;
		conta2.saldo = 501.23;
		conta2.titular = titularB;

		System.out.println("Titular da Conta: " + conta.titular.nome);
		System.out.println("Saldo da Conta: " + conta.saldo);
		System.out.println("\n");
		System.out.println("Titular da Conta 2: " + conta2.titular.nome);
		System.out.println("Saldo da Conta 2: " + conta2.saldo);
		System.out.println("\n");
		System.out.println("O saldo total das 2 contas é: R$" + (conta.saldo + conta2.saldo));
	}

}
