package Alternativesifeasyggez;

import java.util.Scanner;

public class Caramels_Sobrants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        if (h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
