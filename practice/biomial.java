package practice;

import java.util.Scanner;

public class biomial {
    public static int fat(int n) {
        int f =1;
        for (int i = 1; i <=n; i++) {
            f = f*i;
        }
        return f;

    

    }
    public static int biomials(int n ,int r) {
        int far_n = fat(n);
        int far_r = fat(r);
        int nsubr= fat(n-r);
        int biomials = far_n/(far_r*nsubr);
        return biomials; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "ENTER n VALUE : ");
        int n = sc.nextInt();
        System.out.print( "ENTER r VALUE : ");
        int r = sc .nextInt();
        System.out.println("ANS  n = "+fat(n));
        System.out.println("ANS  r = "+fat(r));
        System.out.println(" TOTAL = "+biomials(n, r));
    }
}
