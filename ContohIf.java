//fakhita nur aziza

import java.util.Scanner;
public class ContohIf {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		int nilai;
		System.out.print ("masukkan nilai = ");
		nilai =input.nextInt ();
		
	//posisi if berjalan
	if (nilai ==1) {
		System.out.println ("angka yang dimasukkan adalah saatu");
	} 
	else 
		System.out.println ("angka yang dimasukkan bukan satu");
	}
}