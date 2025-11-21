package pekan5_2511532004;

public class tugasAlproPekan5_2511532004 {
	public static void main(String[] args) {
		int n = 4;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			System.out.print("<>");
			for (int j = 1; j <= (i - 1); j++) {
				System.out.print("....");
			}
			if (i > 1)
				System.out.print("<>");
			System.out.println();
		}

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			System.out.print("<>");
			for (int j = 1; j <= (i - 1); j++) {
				System.out.print("....");
			}
			if (i > 1)
				System.out.print("<>");
			System.out.println();
		}
	}
}
