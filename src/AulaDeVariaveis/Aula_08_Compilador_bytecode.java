// O compilador e o Bytecode

package AulaDeVariaveis;

public class Aula_08_Compilador_bytecode {

	public static void main(String[] args) {
		int idade = 28;
		System.out.println("Eu tenho "+ idade);

	}

}


/*  - Bytecode é uma código intermediário gerado pelo compilador 
 *  java depois que você escreve seu programa.
 *  
 *  - Ele funciona como um espécie de tradução entre o código que você escreve e
 *  o computador
 *  
 *  Deste que existem um JVM compatível instalada.
 *  
 *  Uma maneira fácil de memoriza:
 *  	.java    = código que você escreve.
 *  	.class   = bytecode gerado pelo compilador.
 *  	 JVM      = responsável por executar o bytecode.
 *  
 *  Resumido: O Bytecode é uma linguagem intermediária que
 *  permite as java executar programas em diferentes sistemas
 *  operacionais sem precisar reescrever o código para cada um.
 */