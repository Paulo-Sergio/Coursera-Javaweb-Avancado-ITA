package tarefaprincipal.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoDeTraducoes {

	public List<String> buscandoPalavrasTraducoes() throws FileNotFoundException {
		String caminho = "C:/projetos/Coursera-Javaweb-Avancado-ITA/semana2/";

		Scanner sc = new Scanner(new FileInputStream(caminho + "/traducoes.txt"));
		List<String> palavrasTraducoes = new ArrayList<String>();

		while (sc.hasNextLine()) {
			String palavra = sc.nextLine();
			palavrasTraducoes.add(palavra);
		}
		sc.close();
		return palavrasTraducoes;
	}

}
