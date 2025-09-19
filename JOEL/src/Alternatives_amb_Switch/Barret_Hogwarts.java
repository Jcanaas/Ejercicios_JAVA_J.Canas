package Alternatives_amb_Switch;

import java.util.Scanner;

public class Barret_Hogwarts{
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String valor = sc.nextLine();
		switch (valor) {
		case "Coratge":
			System.out.println("Gryffindor");
			break;
			case "Coneixement":
				System.out.println("Ravenclaw");
				break;
				case "Ambicio":
					System.out.println("Slytherin");
					break;
					default:
						System.out.println("Hufflepuff");
						break;
						
		}

		sc.close();
		
	}
}

//Si es diu "Coratge", dirà "Gryffindor"
//Si es diu "Coneixement", dirà "Ravenclaw"
//Si es diu "Ambicio", dirà "Slytherin"
//Si es diu qualsevol altra cosa, dirà "Hufflepuff"
//Exemples