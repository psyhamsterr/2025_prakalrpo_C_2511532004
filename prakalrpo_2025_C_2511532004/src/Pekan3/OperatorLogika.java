package Pekan3;

import java.util.Scanner;

public class OperatorLogika {

	public static void main(String[] args) {
		Boolean A1;
		Boolean A2;
		Boolean c;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("input nilai boolean-1 (true/false): ");
		A1 = keyboard.nextBoolean();
		System.out.print("input nilai boolean-2 (true/false): ");
		A2 = keyboard.nextBoolean();
		keyboard.close();
		System.out.println("A1 =" +A1);
		System.out.println("A2 =" +A2);
		System.out.println("konjungsi");
		c = A1&&A2;
		System.out.println("true and false = " + c);
		System.out.println("dikonjungsi");
		c = A1||A2;
		System.out.println("true or false = " + c);
		System.out.println("negasi");
		c = !A1;
		System.out.println("bukan true = " + c);
		
		
	}

}
