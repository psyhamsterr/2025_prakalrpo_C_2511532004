package pekan7_2511532004;

import java.util.Scanner;

public class tugaspekan7Alproutama_2511532004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		tugaspekan7Alprodata_2511532004 akun = new tugaspekan7Alprodata_2511532004();

		System.out.print("Masukkan Username: ");
		String username = scanner.nextLine();
		akun.setUsername(username);

		System.out.print("Masukkan Password: ");
		String password = scanner.nextLine();
		akun.setPassword(password);

		System.out.print("Masukkan Email: ");
		String email = scanner.nextLine();
		akun.setEmail(email);

		System.out.print("Masukkan PIN Angka (6 digit): ");
		int pinAngka = scanner.nextInt();
		akun.setPinAngka(pinAngka);

		if (!akun.isPasswordValid() || !akun.isEmailValid()) {
			if (!akun.isPasswordValid()) {
				System.out.println("Error: Password harus minimal 8 karakter.");
			}
			if (!akun.isEmailValid()) {
				System.out.println("Error: Email harus mengandung '@' dan '.'.");
			}
		} else {
			System.out.println("Registrasi Berhasil!");
			System.out.println("Username: " + akun.getUsername());
			System.out.println("Password: " + akun.getPassword().toUpperCase());
			System.out.println("Email: " + akun.getEmail().toLowerCase());
			System.out.println("PIN Angka: " + akun.getPinAngka());
			System.out.println("Panjang Username: " + akun.getUsername().length());
			System.out.println("Index '@' di Email: " + akun.getEmail().indexOf("@"));
			System.out.println("Username + Email: " + akun.getUsername().concat(akun.getEmail()));
		}

		scanner.close();
	}
}