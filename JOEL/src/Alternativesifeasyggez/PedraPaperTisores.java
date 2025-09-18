package Alternativesifeasyggez;

import java.util.Scanner;

public class PedraPaperTisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean valid = true;

        int ej1 = sc.nextInt();
        if (ej1 < 1 || ej1 > 3) {
            System.out.println("Eleccio incorrecta del jugador 1");
            valid = false;
        } else {
            int ej2 = sc.nextInt();
            if (ej2 < 1 || ej2 > 3) {
                System.out.println("Eleccio incorrecta del jugador 2");
                valid = false;
            } else {
                if (ej1 == ej2) {
                    System.out.println("Empat");
                } else if ((ej1 == 1 && ej2 == 3) || (ej1 == 2 && ej2 == 1) || (ej1 == 3 && ej2 == 2)) {
                    System.out.println("Guanya el jugador 1");
                } else {
                    System.out.println("Guanya el jugador 2");
                }
            }
        }

        sc.close();
    }
}
