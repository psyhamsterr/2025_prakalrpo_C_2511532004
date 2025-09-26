package Pekan3;

import java.util.Scanner;

public class tugasAlproPekan3 {

		public static void main(String[] args) {
			int R;
			int T;
			int hasil;
			Scanner keyboard = new Scanner(System.in);
			System.out.print("masukkan jari jari: ");
			R = keyboard.nextInt();
			System.out.print("masukkan tinggi : ");
			T = keyboard.nextInt();
			keyboard.close();
			
			
			System.out.println("Volume tabung =" + R * R * T * 3.14);	

		}

}