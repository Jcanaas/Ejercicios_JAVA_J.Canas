package Alternativesifeasyggez;


import java.util.Scanner;

public class BulletiNotes{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if (n >= 0 && n <= 4) {
			System.out.println("Suspes");
		} else if (n >= 5 && n <= 6) {
			System.out.println("Aprovat");
		} else if (n >= 7 && n <= 8) {
			System.out.println("Notable");
		} else if (n >= 9 && n <= 10) {
			System.out.println("Excelent");
		} else {
			System.out.println("Nota incorrecta");
		}		sc.close();
		
	}
	
}
