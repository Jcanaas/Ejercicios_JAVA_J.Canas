package ProblemesdeScanner;

import java.util.Scanner;

public class CaramelsSobrants{
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int resultat = num1 % num2;
		System.out.println(resultat);

		sc.close();
		
	}
}

