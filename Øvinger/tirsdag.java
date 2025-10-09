/*
import java.util.Scanner;

public class tirsdag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < (y + 1); x++) {
                System.out.print("*"); // Bruker print i stedet for println for å få stjernene på samme linje
            }
            System.out.println(); // Ny linje etter hver rad
        }
    }
}
*/

import java.util.Scanner;

public class tirsdag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfLines = 5;
        int numberOfSpace = numberOfLines - i;
        int numberOfSymbols = 1 + 2*i;

        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < (y + 1); x +=1) {
                System.out.print();
                System.out.print("*"); // Bruker print i stedet for println for å få stjernene på samme linje
            }
            System.out.println(); // Ny linje etter hver rad
        }
    }
}