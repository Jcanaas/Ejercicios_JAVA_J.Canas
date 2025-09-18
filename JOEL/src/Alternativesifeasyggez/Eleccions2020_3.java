	package Alternativesifeasyggez;
	
	import java.util.Scanner;
	
	public class Eleccions2020_3{
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int votsJiden = sc.nextInt();
			int votsDrump = sc.nextInt();
			int votsBanders = sc.nextInt();
			
			if (votsJiden > votsDrump && votsJiden > votsBanders) {
				System.out.println("Jiden");
			} else if (votsDrump > votsJiden && votsDrump > votsBanders) {
				System.out.println("Drump");
			} else if (votsBanders > votsJiden && votsBanders > votsDrump) {
				System.out.println("Banders");
			} else {
				System.out.println("no");
			}
			
			sc.close();
			
		}
		
	}
