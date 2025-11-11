package pekan6_2511532004;
import java.util.Random;
import java.util.Scanner;
public class tugas6_2511532004 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int jumlah = 0;
        while (jumlah != 7) {
            System.out.print("Apakah mau menggoncang dadu? (y/n): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {
                int dadu1 = rand.nextInt(6) + 1;
                int dadu2 = rand.nextInt(6) + 1;
                jumlah = dadu1 + dadu2;
                System.out.println("Kamu dapat " + dadu1 + " dan " + dadu2 + " dengan total " + jumlah);
            }
        }
        scanner.close();
    }
}



