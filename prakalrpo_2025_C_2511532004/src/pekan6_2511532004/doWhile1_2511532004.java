package pekan6_2511532004;

import java.util.Scanner;

public class doWhile1_2511532004 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
			String phrase;
			do {
				System.out.print("input Password: ");
				phrase = console.next();
				
			} while (! phrase.equals("abcd"));
	}

}
