package br.com.glandata.main;

import br.com.glandata.model.Conta;
import br.com.glandata.model.Titular;

public class Bug {

	/**
	 * Objetos nao podem ser sobrescritos, somente os seus atributos eles apontam
	 * para uma mesma referencia em memoria
	 */
	public static void main(String[] args) {
		// Cadastro dos titulares
		Titular titularA = new Titular();
		titularA.nome = "Nome 1";
		titularA.endereco = "Rua dos Bobos, 2";
		titularA.telefone = "11963225874";

		Conta contaA = new Conta();

		contaA.titular = titularA;

		System.out.println("Nome do titular A: " + contaA.titular.nome);

		Conta contaB = contaA;

		System.out.println("Nome do titular B: " + contaB.titular.nome);

		contaB.titular.nome = "Nome 4";

		System.out.println("Nome do titular B: " + contaB.titular.nome);

		System.out.println("Nome do titular A: " + contaA.titular.nome);

	}

}
