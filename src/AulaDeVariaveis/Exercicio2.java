
package AulaDeVariaveis;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int numero3 = entrada.nextInt();
		
		int soma = numero1 + numero2 + numero3;
		
		System.out.println("A soma dos números é: "+ soma);
		entrada.close();
	}

}
