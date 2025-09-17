package ejercicios;

import java.util.Scanner;

public class HelloWorld{
	
	
	public static void main(String[] args) {
		System.out.println("Quin es el teu nom?");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		System.out.println("Hola, " + nombre);
		
	}
}