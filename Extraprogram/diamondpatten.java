package Extraprogram;

public class diamondpatten {
    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n-i; j++) {
               System.out.print(" ");

            }
            // star 
            for (int j = 1; j <= (2*i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }// duplicate but revers
        for (int i = n; i>= 1; i--) {
            // space
            for (int j = 1; j <= n-i; j++) {
               System.out.print(" ");

            }
            // star 
            for (int j = 1; j <= (2*i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond(5);
    }
}
