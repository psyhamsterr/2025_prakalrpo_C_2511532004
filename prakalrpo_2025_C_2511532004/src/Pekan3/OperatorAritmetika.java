package Pekan3;

import java.util.Scanner;

public class OperatorAritmetika {

	public static void main(String[] args) {
		int A1;
		int A2;
		int hasil;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("input angka-1: ");
		A1 = keyboard.nextInt();
		System.out.print("input angka-2: ");
		A2 = keyboard.nextInt();
		keyboard.close();
		System.out.println("operator penjumlahan");
		hasil = A1 + A2;
		System.out.println("hasil =" + hasil);
		System.out.println("operator pengurangan");
		hasil = A1 - A2;
		System.out.println("hasil =" + hasil);
		System.out.println("operator perkalian");
		hasil = A1 * A2;
		System.out.println("hasil =" + hasil);
		System.out.println("operator pembagian");
		hasil = A1 / A2;
		System.out.println("hasil =" + hasil);
		System.out.println("operator hasil sisa bagi");
		hasil = A1 % A2;
		System.out.println("hasil =" + hasil);
		
		

	}

}
