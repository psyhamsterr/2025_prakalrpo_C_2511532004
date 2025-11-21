package Pekan3;

import java.util.Scanner;

public class OperatorAssignment {

	public static void main(String[] args) {
		int A1;
		int A2;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("input angka-1: ");
		A1 = keyboard.nextInt();
		System.out.print("input angka-2: ");
		A2 = keyboard.nextInt();
		keyboard.close();
		System.out.println("assignment penambahan");
		A1 += A2;
		System.out.println("Penambahan: " + A1);
		System.out.println("assignment pengurangan");
		A1 -= A2;
		System.out.println("Pengurangan: " + A1);
		System.out.println("assignment perkalian");
		A1 *= A2;
		System.out.println("Perkalian: " + A1);
		System.out.println("assignment pembagian");
		A1 /= A2;
		System.out.println("Pembagian: " + A1);
		System.out.println("assignment hasil bagi");
		A1 %= A2;
		System.out.println("sisa bagi: " + A1);

	}

}
