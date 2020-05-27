package db;

/*
 * Exceção para garatir a integridade do banco caso seja feita tentativa de apagar uma linha
 * de uma tabela e a mesma possua uma chave extrangeira em uso em outra.
 */
public class DBIntegrityException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public DBIntegrityException(String msg) {
		super(msg);
	}

}
