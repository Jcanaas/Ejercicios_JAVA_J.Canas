package Alternativesifeasyggez;

import java.util.Scanner;

public class Etsjove{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int edat = sc.nextInt();
		
		if (edat < 32) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
		
		sc.close();
		
	}
	
}
