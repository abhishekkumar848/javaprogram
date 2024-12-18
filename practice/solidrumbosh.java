package practice;

public class solidrumbosh {
    public static void solid(int n) {
        for (int i = 1; i <=n; i++) {
            // space
            for (int j = 0; j <=n-i; j++) {
                System.out.print(" ");
            }
            // space
            for (int j = 1; j <= n; j++) {
                System.out.print("*" );
            }
            System.out.println();
        }
    }
    public static void hollow(int n) {
        for (int i = 1; i <= n; i++) {
            // space 
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // star 
            for (int j = 1; j <= n; j++) {
                if (i == 1||i == n||j == 1||j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solid(5);
        System.out.println("next ques ------------");
        hollow(5);
    }
}
