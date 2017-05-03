package tarefaprincipal;

import tarefaprincipal.model.Tradutor;

public class Teste {

	public static void main(String[] args) {

		String resposta = new Tradutor().recebePalavraRetornaTraducao("good");
		System.out.println(resposta);
	}
}
