package Alternativesifeasyggez;


import java.util.Scanner;

public class Divisibledel1al10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if (n % 2 == 0 && n % 3 == 0 && n % 5 == 0 && n % 7 == 0) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}		sc.close();
		
	}
	
}