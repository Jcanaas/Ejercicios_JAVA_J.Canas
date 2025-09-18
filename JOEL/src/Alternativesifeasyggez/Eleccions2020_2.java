package Alternativesifeasyggez;

import java.util.Scanner;

public class Eleccions2020_2{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int votsJiden = sc.nextInt();
		int votsDrump = sc.nextInt();
		
		if (votsJiden > votsDrump) {
			System.out.println("Jiden");
			} 
		
		else if (votsJiden == votsDrump) {
				System.out.println("no");
		} else {
			System.out.println("Drump");
		}
		
		sc.close();
		
	}
	
}
