package practice;

import java.util.Scanner;

public class binarytodecimal {
    public static int bintodec(int binNum) {
        int decimal = 0;
        int pow = 0;
        while (binNum>0) {
            int lastdight= binNum%10;
            decimal= decimal+(lastdight * (int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;

        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" ENTER BINARY NUM :  " );
        int binNum = sc.nextInt();
        
        System.out.println( bintodec(binNum) );

    }
}
