package Alternatives_AND_OR;

import java.util.Scanner;

public class NumerosContigus{
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		if num1 +1 == num2 || num1 -1 == num2 {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}

		sc.close();
		
	}
}

