package practice;

import java.util.Scanner;

public class checkprimenumber {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.print("enter your number : ");
        int n = check.nextInt();
        Boolean prime = true;
        for (int i = 2; i <= n-1 ; i++) {
            
            if (n % i  == 0) {
                prime=false;
                System.out.println(i );
            }
        }
        if ( prime == true) {
            System.out.println("this a prime number");
        } else {
            System.out.println("this is not a prime number");
        }
    }

}
