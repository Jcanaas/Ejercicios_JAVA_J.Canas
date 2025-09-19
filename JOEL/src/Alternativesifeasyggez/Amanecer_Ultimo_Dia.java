package Alternativesifeasyggez;

import java.util.Scanner;

public class Amanecer_Ultimo_Dia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long segons = sc.nextLong();
        long periodIndex = (segons - 1) / 43200;
        if (segons % 43200 == 0) {
            periodIndex++;
        }
        long dia = periodIndex / 2 + 1;
        String periode = (periodIndex % 2 == 0) ? "mati" : "nit";
        System.out.println(periode + " del dia " + dia);
        sc.close();
    }
}