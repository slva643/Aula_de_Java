// A função main()

package AulaDeVariaveis;

public class Aula_09_funão_main {
	// Essa função que torna a classe java em um programa Java
	public static void main(String[] args) {
		System.out.println("Qualquer texto");
		System.out.println(args[0]);
	}
	
}


/*
 *  Linguagem orientada a objetos
 *  
 *  - Função mai() é o ponto de entrada de um programa java.
 *  É por ela que a JVM começa a executar o seu programa.
 *  
 *  Palavra			  |	Significado										|	 Memorizar
 *  ------------------|-------------------------------------------------|-------------------------------------
 *	 public			  |	 Permite que a JVM acesse o método.				|	Acesso
 *   static			  |	 Permite executar sem criar um objeto da classe.|   Não precisa criar objeto
 *   void			  |	 Indica que o método não retorna nenhum valor.  |	Não retorna valor
 *   main			  |	 Nome do método principal.                      |   Início da execução
 *   string[] args	  |	 Recebe argumentos enviados ao programa.        |	Recebe informaçãoes externas
 *   
 *   
 *   - Obs:
 *   	Em Java, tecnicamente, main() não é uma função independente, 
 *   mas sim um método que pertence a uma classe.
 */