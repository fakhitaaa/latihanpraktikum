//fakhita nur aziza

import java.util.Scanner;
public class positifnegatif {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int i;
		System.out.print("Masukkan nilai : ");
		i = input.nextInt();
		
		if (i >= 0) {
			System.out.println("Nilai bernilai positif");
		} else {
			System.out.println("Nilai bernilai negatif");
		}
	}
}