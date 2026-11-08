package AulaDeVariaveis;

	import java.util.Scanner;
public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner resposta = new Scanner(System.in);
		
		System.out.println("Informa um numero real");
		double numeroReal = resposta.nextDouble();
		
		System.out.println("Seu número real é: " + numeroReal);
		resposta.close();

	}

}
