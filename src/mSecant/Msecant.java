package mSecant;

import java.util.Scanner;


public class Msecant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fx fx=new Fx();
		//  take equation ,a,b
		System.out.print("Enter equation: ");
		String equation=sc.nextLine();
		System.out.print("Enter value of A: ");
		fx.setA(sc.nextDouble());
		System.out.print("Enter Value of B: ");
		fx.setB(sc.nextDouble());
		System.out.print("Enter tolerance value :");
		fx.setT(sc.nextDouble());
	 //invoke Modified Secant method send equation to it 
		fx.mSecant(equation);
		

	}

}
