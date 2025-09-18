package Alternativesifeasyggez;


import java.util.Scanner;

public class LesTorresBesones{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n = sc.nextInt();
		float m = sc.nextInt();
		float diferencia = Math.abs(n - m);
		if (diferencia < 5) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}		sc.close();
		
	}
	
}
