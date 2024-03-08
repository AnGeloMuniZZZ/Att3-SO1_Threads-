package view;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {

		int[] vet = new int[1000];

		for (int i = 1; i < 3; i++) {
			Thread tempo = new ThreadVetor(i, vet);
			tempo.start();
		}
	}

}
