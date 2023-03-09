package controller;

public class ControllerExercicio1 extends Thread {
	
	private int N,i;
	
	public ControllerExercicio1(int N,int i) {
		
		this.N=N;
        this.i=i;
		
	}
	
	private void Calcular() {
		System.out.println("Thread número "+ i +" com Valor: " +N);
	}
	public void run() {	
		Calcular();

	}

}
