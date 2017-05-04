package tarefaprincipal.teste;

import tarefaprincipal.model.Tradutor;

public class Teste {

	public static void main(String[] args) {

		String traducao = new Tradutor().recebePalavraRetornaTraducao("good");
		System.out.println(traducao);
	}
}
