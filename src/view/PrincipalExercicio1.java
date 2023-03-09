package view;

import controller.ControllerExercicio1;

public class PrincipalExercicio1 {
	
		
	public static void main(String[] args) {
		
		 int N1=23,N2=42,N3=37,N4=84,N5=95;
		
		 
		Thread t1 = new ControllerExercicio1(N1,1);
		Thread t2 = new ControllerExercicio1(N2,2);
		Thread t3 = new ControllerExercicio1(N3,3);
		Thread t4 = new ControllerExercicio1(N4,4);
		Thread t5 = new ControllerExercicio1(N5,5);
	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
	

	}


}
