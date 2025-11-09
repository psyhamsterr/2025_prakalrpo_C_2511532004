package pekan6_2511532004;
import java.util.Random;
import java.util.Scanner;
public class tugas6_2511532004 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (sum != 7) {
            System.out.print("Apakah mau menggoncang dadu? (y/n): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {
                int dadu1 = rand.nextInt(6) + 1;
                int dadu2 = rand.nextInt(6) + 1;
                sum = dadu1 + dadu2;
                System.out.println("Kamu dapat " + dadu1 + " dan " + dadu2 + " dengan total " + sum);
            }else {
            	System.out.println("program berhenti");
            }
        }
        scanner.close();
    }
}



