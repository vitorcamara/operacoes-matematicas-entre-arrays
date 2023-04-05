package com.vitorcamara.projetos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OperacoesDeArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		double[] vetorB = new double[vetorA.length];
		double[] vetorC = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posicao " + i + " do Vetor A:");
			vetorA[i] = scan.nextInt();

		}

		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com o valor da posicao " + i + " do Vetor B:");
			vetorB[i] = scan.nextInt();
		}

		System.out.print("Vetor A = ");

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();

		DecimalFormat df = new DecimalFormat("###.###");

		System.out.print("Vetor B = ");

		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
		}

		System.out.println();

		System.out.println("Qual operação gostaria de realizar?");
		System.out.println("Digite + para adição, - para subtração, * para muliplicacão ou / para divisão.");
		String operacao = scan.next();

		if (operacao.equals("+")) {
			System.out.println("Soma de Vetor A + B = Vetor C: ");
		} else if (operacao.equals("-")) {
			System.out.println("Subtração de Vetor A - B = Vetor C: ");
		} else if (operacao.equals("*")) {
			System.out.println("Multiplicação de Vetor A * B = Vetor C: ");
		} else if (operacao.equals("/")) {
			System.out.println("Divisão de Vetor A / B = Vetor C: ");
		}

		for (int i = 0; i < vetorA.length; i++) {

			if (operacao.equals("+")) {

				vetorC[i] = vetorA[i] + vetorB[i];
				System.out.println("Posição " + i + " = " + (df.format(vetorC[i])));
			}

			if (operacao.equals("-")) {

				vetorC[i] = vetorA[i] - vetorB[i];
				System.out.println("Posição " + i + " = " + (df.format(vetorC[i])));
			}
			if (operacao.equals("*")) {

				vetorC[i] = vetorA[i] + vetorB[i];
				System.out.println("Posição " + i + " = " + (df.format(vetorC[i])));
			}
			if (operacao.equals("/")) {

				vetorC[i] = vetorA[i] / vetorB[i];
				System.out.println("Posição " + i + " = " + (df.format(vetorC[i])));
			}
		}

	}

}