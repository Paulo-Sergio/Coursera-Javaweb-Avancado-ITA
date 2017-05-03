package tarefaprincipal.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoDeTraducoes {

	public List<String> buscandoPalavrasTraducoes() throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("traducoes.txt"));
		List<String> palavrasTraducoes = new ArrayList<String>();

		while (sc.hasNextLine()) {
			String palavra = sc.nextLine();
			palavrasTraducoes.add(palavra);
		}
		sc.close();
		return palavrasTraducoes;
	}

	public List<String> buscandoPalavras() throws FileNotFoundException {
		List<String> palavrasTraducoes = this.buscandoPalavrasTraducoes();
		
		List<String> palavras = new ArrayList<String>();
		for (String palavraTraducao : palavrasTraducoes) {
			String[] palavra = palavraTraducao.split(";");
			palavras.add(palavra[0]);
		}
		
		return palavras;
	}
	
	public List<String> buscandoTraducoes() throws FileNotFoundException {
		List<String> palavrasTraducoes = this.buscandoPalavrasTraducoes();
		
		List<String> traducoes = new ArrayList<String>();
		for (String palavraTraducao : palavrasTraducoes) {
			String[] traducao = palavraTraducao.split(";");
			traducoes.add(traducao[1]);
		}
		
		return traducoes;
	}

}
