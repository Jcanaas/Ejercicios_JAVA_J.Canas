package Alternatives_amb_Switch;

import java.util.Scanner;

public class Iron_4{
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String valor = sc.nextLine();
		switch (valor) {
		case "Q":
			System.out.println("Skill 1");
			break;
		case "W":
			System.out.println("Skill 2");
			break;
		case "E":
			System.out.println("Skill 3");
			break;
		case "R":
			System.out.println("Ultimate");
			break;
		case "B":
			System.out.println("Recall");
			break;
		case "D":
			case "F":
			System.out.println("Bronzes never use summoners");
			break;
		default:
			System.out.println("Error");
			break;
						
		}

		sc.close();
		
	}
}
//
//Entrada	Sortida
//Q	Skill 1
//W	Skill 2
//E	Skill 3
//R	Ultimate
//B	Recall
//D	Bronzes never use summoners
//F	Bronzes never use summoners
//qualsevol altra cosa	Error