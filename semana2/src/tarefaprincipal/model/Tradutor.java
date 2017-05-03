package tarefaprincipal.model;

import java.io.FileNotFoundException;
import java.util.List;

import tarefaprincipal.exception.NaoExisteEstaPalavraNoBanco;

public class Tradutor {

	public String recebePalavraRetornaTraducao(String palavra) {
		try {

			if (existePalavraNoBanco(palavra)) {
				List<String> palavrasTraducoes = new BancoDeTraducoes().buscandoPalavrasTraducoes();
				return procurandoTraducao(palavra, palavrasTraducoes);
			} else {
				throw new NaoExisteEstaPalavraNoBanco("Esta palavra não existe em nosso banco de palavras!");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NaoExisteEstaPalavraNoBanco e) {
			e.printStackTrace();
		}

		return null;
	}

	private String procurandoTraducao(String palavra, List<String> palavrasTraducoes) {
		for (String palavraTraducao : palavrasTraducoes) {
			String[] split = palavraTraducao.split(";");
			if (split[0].equals(palavra)) {
				return split[1];
			}
		}
		return null;
	}

	private boolean existePalavraNoBanco(String palavra) throws FileNotFoundException {
		List<String> palavras = new BancoDeTraducoes().buscandoPalavras();
		for (String p : palavras) {
			if (p.equalsIgnoreCase(palavra)) {
				return true;
			}
		}

		return false;
	}
}
