/*Classe InvalidLoginException, criada no dia 05/02/2022
 * 
 * Todos os direitos reservados a Compasso.UOL e Pedro Henrique Nunes Dutra
 * 
 * Classe que ser� utilizada para criar uma exce��o em caso de erros.
 * 
 * */

package questao.sete;

public class InvalidLoginException extends RuntimeException{

	public InvalidLoginException(String msg) {
		super(msg);
	}
}
