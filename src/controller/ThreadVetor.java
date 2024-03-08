package controller;

public class ThreadVetor extends Thread {
	
	private int v;
	private int[] vet = new int[1000];
	
	public ThreadVetor(int v, int[] vet) {
		this.v = v;
		this.vet = vet;
	}
	
	@Override
	public void run() {
		Tempo();
	}
	
	private void Tempo() {
		if(v % 2 == 0) {
			int tInicial = (int) System.nanoTime();
			for (int i = 0 ; i < vet.length; i++) {
				vet[i] = (int) ((Math.random() * 100)+ 1);
			}
			int tFinal = (int) System.nanoTime();
			int tGasto = ((tInicial - tFinal) / ((int) (Math.pow(10, 9))));
			System.out.println(tGasto);
		} else {
			int tInicial = (int) System.nanoTime();
			for (int i : vet) {
				vet[i] = (int) ((Math.random() * 100)+ 1);
			}
			int tFinal = (int) System.nanoTime();
			int tGasto = ((tInicial - tFinal) / ((int) (Math.pow(10, 9))));
			System.out.println(tGasto);
		}
	}
}
