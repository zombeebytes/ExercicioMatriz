package exerc;

import java.util.Scanner;

public class Exerc2 {

//	Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. As 4 notas de cada participante
//	serão armazenadas em uma linha de uma matriz de números reais, logo cada linha da matriz serão as notas de um participante.
//	Em um vetor de números reais, armazene as médias de cada participante e exiba as médias de cada um na tela.

	public static void main(String[] args) {
//		

		int alunes = 10;
		int bimestres = 4;
		double[][] notas = new double[alunes][bimestres];
		double[] medias = new double[alunes];
		Scanner scanner = new Scanner(System.in);
		for (int a = 0; a < alunes; a++) {
			System.out.println("Digite as notas do alune " + (a + 1) + ":");
			for (int b = 0; b < bimestres; b++) {
				System.out.print("Nota do bimestre " + (b + 1) + ": ");
				notas[a][b] = scanner.nextDouble();
			}
		}
		for (int a = 0; a < alunes; a++) {
			double soma = 0;
			for (int b = 0; b < bimestres; b++) {
				soma += notas[a][b];
			}
			medias[a] = soma / bimestres;
		}
		System.out.println("Médias dos alunes:");
		for (int a = 0; a < alunes; a++) {
			System.out.println("alune " + (a + 1) + ": " + medias[a]);
		}

	}
}
