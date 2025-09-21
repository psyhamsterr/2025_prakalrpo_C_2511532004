package pekan2;

public class tugasAlproPekan2 {
    public static void main(String[] args) {
        int umur = 17;
        float tinggi = 165.5f;
        char inisial = 'B';

        int tahunSekarang = 2025;
        int tahunLahir = tahunSekarang - umur;

        boolean dewasa = umur >= 18;

        System.out.println("DATA SISWA:");
        System.out.println("Inisial Nama  : " + inisial);
        System.out.println("Umur          : " + umur);
        System.out.println("Tinggi Badan  : " + tinggi);
        System.out.println("Tahun Lahir   : " + tahunLahir);
        System.out.println("Status Dewasa : " + dewasa);
    }
}

