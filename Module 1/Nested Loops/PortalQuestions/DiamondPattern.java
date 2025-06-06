package PortalQuestions;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int mt = 0; mt < t; mt++) {
            int n = sc.nextInt();
            // upper half
            int uf = n/2 + 1;
            int lf = n/2;
            for (int i = 1; i <= uf; i++) {
                for (int j = 1; j <= (uf - i); j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            // lower half
            for (int i = lf; i >=1 ; i--) {
                for (int j = 1; j <= (lf - i+1); j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
