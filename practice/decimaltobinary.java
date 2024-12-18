package practice;

import java.util.Scanner;

public class decimaltobinary {
    public static int dectobin(int n) {
        int pow = 0;
        int binary = 0;
        while (n>0) {
            int rem = n%2;
            binary = binary+ (rem* (int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value : ");
        int n = sc.nextInt();
        System.out.println(dectobin(n));
    }
}
