package ejercicios;

import java.util.Scanner;

public class Quadrat{
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int resultat = num1 * num1;
		System.out.println(resultat);

		sc.close();
		
	}
}