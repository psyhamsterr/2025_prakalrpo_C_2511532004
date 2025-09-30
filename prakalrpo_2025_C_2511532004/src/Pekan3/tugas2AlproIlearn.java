package Pekan3;

import java.util.Scanner;

public class tugas2AlproIlearn {

	public static void main(String[] args) {
		
		int A1;
		int A2;
		
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String nama = keyboard.nextLine();
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan golongan: ");
        String gol = sc.nextLine();
        
        Scanner jml = new Scanner(System.in);
		System.out.print("jumlah jam kerja: ");
		A1 = keyboard.nextInt();
	        
	        Scanner upah = new Scanner(System.in);
			System.out.print("upah per jam kerja: ");
			A2 = keyboard.nextInt();
			
			
			if (A1 > 60 ) {
			    A2 += 5000;
			}
        System.out.println("Nama karyawan: " + nama);
        System.out.println("Golongan karyawan: " + gol);
        System.out.println("Jam kerja karyawan: " + A1);
        System.out.println("upah per jam: " + A2);
        
        
	}

}
