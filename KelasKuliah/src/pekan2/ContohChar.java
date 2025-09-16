package pekan2;

class ContohChar {

	public static void main(String[] args) {
		char huruf1 = 'a';
		char huruf2 = 'B';
		char angka = '7';
		char simbol = '#';
		
		System.out.println("contoh variabel char");
		System.out.println("huruf pertama:" + huruf1);
		System.out.println("huruf kedua :" + huruf2);
		System.out.println("angka: " + angka);
		System.out.println("simbol:" + simbol);
		
		char huruf3 = (char) (huruf1 + 1);
		System.out.println("huruf1 + 1 = " + huruf3);
		
		int kodeHuruf = huruf1;
		String biner1 = String.format("%8s", Integer.toBinaryString(huruf1)).replace(' ', '0');
		System.out.println("kode ASCII dari" + huruf1 + " = " + kodeHuruf);
		System.out.println("kode biner dari" + huruf1 + " = " + biner1);
		
		
		String kata = "" + huruf1 + huruf2 + angka + simbol;
		System.out.println("gabungan char menjadi string: "+ kata);
	}

}
