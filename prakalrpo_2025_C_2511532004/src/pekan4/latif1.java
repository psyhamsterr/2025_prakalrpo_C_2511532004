package pekan4;

import java.util.Scanner;

public final class latif1 {

	public static void main(String[] args) {
		double IPK;
		Scanner input =new Scanner(System.in);
		System.out.print("INput ipk anda = ");
		IPK=input.nextDouble();
		input.close();
		if (IPK>2.75) {
			System.out.println("Anda lulus sangat memuaskan dengan IPK"+ IPK);
		}

	}

}
