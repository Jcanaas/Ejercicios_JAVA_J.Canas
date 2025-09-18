package ProblemesdeScanner;

import java.util.Scanner;

public class Triangles{
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		float resultat = num1*num2 / 2;
		System.out.println(resultat);

		sc.close();
		
	}
}