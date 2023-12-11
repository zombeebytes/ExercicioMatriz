package exerc;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
//				Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, 
//				construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário 
//				irá digitar um número e o programa deve exibir na tela a posição deste número no vetor. 
//				Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela. 

		int[] vetor = { 9, 7, 4, 3, 5, 6, 2, 8, 1, 0 };
		Scanner scanner = new Scanner(System.in);
		while (true) {

		
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		int posicao = -1;
		for (int indice = 0; indice < vetor.length; indice++) {

			if (vetor[indice] == numero) {
				posicao = indice;

			}
		}
		if (posicao != -1) {
			System.out.println("O número " + numero + " está na posição " + posicao + "°");
			break;
		} else {
			System.out.println("Não foi encontrado!");

		
		}
		}

	}
}
