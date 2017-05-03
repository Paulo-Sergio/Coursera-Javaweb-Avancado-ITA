package tarefaprincipal.exception;

public class NaoExisteEstaPalavraNoBanco extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 197134421210593420L;

	public NaoExisteEstaPalavraNoBanco(String msg) {
		super(msg);
	}
}
