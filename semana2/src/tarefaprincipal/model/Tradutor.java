package tarefaprincipal.model;

import java.io.FileNotFoundException;
import java.util.List;

public class Tradutor {

	public String recebePalavraRetornaTraducao(String palavra) {
		try {

			if (existePalavraNoBanco(palavra)) {
				List<String> palavrasTraducoes = new BancoDeTraducoes().buscandoPalavrasTraducoes();
				return procurandoTraducao(palavra, palavrasTraducoes);
			}
			//throw new NaoExisteEstaPalavraNoBanco("Esta palavra não existe em nosso banco de palavras!");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return palavra;
	}

	private String procurandoTraducao(String palavra, List<String> palavrasTraducoes) {
		for (String palavraTraducao : palavrasTraducoes) {
			String[] split = palavraTraducao.split(";");
			if (split[0].equalsIgnoreCase(palavra)) {
				String traducao = split[1];
				return traducao.substring(0, 1).toUpperCase().concat(traducao.substring(1));
			}
		}
		return null;
	}

	private boolean existePalavraNoBanco(String palavra) throws FileNotFoundException {
		List<String> palavras = new BancoDeTraducoes().buscandoPalavrasTraducoes();
		for (String p : palavras) {
			String[] split = p.split(";");
			if (split[0].equalsIgnoreCase(palavra)) {
				return true;
			}
		}

		return false;
	}
}
