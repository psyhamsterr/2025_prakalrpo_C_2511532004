package pekan4;

import java.util.Scanner;

public class pekan4tugasAlproPekan4_2511532004 {
    public static void main(String[] args) {
        int jumlahTiket;
        String namapembeli;
        int pilihanHari;
        int pilihanWaktu;
        int pilihanStudio;

        Scanner input = new Scanner(System.in);
        
        System.out.println("===== PEMBELIAN TIKET BIOSKOP =====");
        System.out.print("Masukkan nama anda: ");
        namapembeli = input.nextLine();

        System.out.print("Masukkan jumlah tiket anda: ");
        jumlahTiket = input.nextInt();
        input.nextLine(); 
        System.out.print("Masukkan hari anda (1=Senin-Kamis, 2=Jumat, 3=Sabtu-Minggu): ");
        pilihanHari = input.nextInt();

        System.out.print("Masukkan waktu anda (1=Pagi, 2=Siang, 3=Malam): ");
        pilihanWaktu = input.nextInt();

        System.out.print("Masukkan jenis studio (1=Regular, 2=Deluxe, 3=Premium): ");
        pilihanStudio = input.nextInt();

       
        int hargaDasar = 50000;

        
        String hari = "";
        double biayaHari = 0;
        if (pilihanHari == 1) {
            hari = "Senin-Kamis";
        } else if (pilihanHari == 2) {
            hari = "Jumat";
        } else if (pilihanHari == 3) {
            hari = "Sabtu-Minggu";
            biayaHari = 0.30; 
        }

        
        String waktu = "";
        double biayaWaktu = 0;
        if (pilihanWaktu == 1) {
            waktu = "Pagi (10:00-12:00)";
        } else if (pilihanWaktu == 2) {
            waktu = "Siang (12:00-17:00)";
        } else if (pilihanWaktu == 3) {
            waktu = "Malam (17:00-22:00)";
            biayaWaktu = 0.20;
        }

        
        String studio = "";
        double biayaStudio = 0;
        if (pilihanStudio == 1) {
            studio = "Regular";
        } else if (pilihanStudio == 2) {
            studio = "Deluxe";
            biayaStudio = 0.15; 
        } else if (pilihanStudio == 3) {
            studio = "Premium";
            biayaStudio = 0.25; 
        }

        
        double hargaPerTiket = hargaDasar * (1 + biayaHari + biayaWaktu + biayaStudio);

        
        double subtotal = hargaPerTiket * jumlahTiket;

        
        double diskon = 0;
        if (jumlahTiket >= 5) {
            diskon = subtotal * 0.20; 
        }

        
        double totalBayar = subtotal - diskon;

        // Output
        System.out.println("------------------------------------");
        System.out.println("Nama Pembeli : " + namapembeli);
        System.out.println("Jumlah Tiket : " + jumlahTiket);
        System.out.println("Hari : " + hari);
        System.out.println("Waktu Tayang : " + waktu);
        System.out.println("Jenis Studio : " + studio);
        System.out.println("------------------------------------");
        System.out.println("Harga Dasar : Rp " + hargaDasar + "/tiket");
        System.out.println("Biaya Hari : +" + (int)(biayaHari*100) + "%");
        System.out.println("Biaya Waktu : +" + (int)(biayaWaktu*100) + "%");
        System.out.println("Biaya Studio : +" + (int)(biayaStudio*100) + "%");
        System.out.println("Harga per Tiket : Rp " + (int)hargaPerTiket);
        System.out.println("Subtotal : Rp " + (int)subtotal);
        System.out.println("Diskon (20%) : Rp " + (int)diskon);
        System.out.println("------------------------------------");
        System.out.println("TOTAL BAYAR : Rp " + (int)totalBayar);

        input.close();
    }
}

