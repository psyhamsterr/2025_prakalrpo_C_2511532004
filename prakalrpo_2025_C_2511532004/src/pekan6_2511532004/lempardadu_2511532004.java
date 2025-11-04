package pekan6_2511532004;
import java.util.Random;

public class lempardadu_2511532004 {

public static void main(String[] args) {

Random rand = new Random();
int tries = 0;
int sum = 0;

while (sum != 7) {
	
	int dadul = rand.nextInt(6) + 1;
	int dadu2 = rand.nextInt(6) + 1;
	sum = dadul + dadu2;
	
	System.out.println(dadul + " + "  + dadu2+ " = " + sum);
			tries++;



}

System.out.println("You won after " + tries + " tries!");
}
}
