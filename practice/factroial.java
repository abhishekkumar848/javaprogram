package practice;

import java.util.Scanner;

public class factroial {

    public static int factroials(int n) {
       
        int f =1;
        for (int i = 1; i <=n; i++) {
            f = f*i;
        }
        return f;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int n = sc.nextInt();
        System.out.println(factroials(n) );
    }
}
