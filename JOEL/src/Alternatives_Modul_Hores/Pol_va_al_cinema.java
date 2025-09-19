package Alternativesifeasyggez;

import java.util.Scanner;

public class Pol_va_al_cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int duracio = sc.nextInt();
        int marge = sc.nextInt();
        int hora = sc.nextInt();
        int minut = sc.nextInt();

        int minutsArribada = hora * 60 + minut;
        int minutsInici = minutsArribada % duracio;

        if (minutsInici <= marge) {
            System.out.println("VEURE");
        } else {
            System.out.println("MARXAR");
        }
        sc.close();
    }
}
