import java.util.Scanner;

import practice.starloop;

public class funtion { // use  a parameter
    public static int calculate( int a, int b ) {
        int sum = a+b;
        return sum;
    }
    public static int product(int c , int d ) {
        int multi = c*d;
        return multi;
    }
    public static void main(String[] args) {
        Scanner math = new Scanner(System.in);
        System.out.print( " Enter value  a :  " );
        int a = math.nextInt();
        System.out.print( " Enter value  b :  " );
        int b = math.nextInt();
        int sum = calculate(a, b);
        System.out.println( " This is total " + sum );
          // product 
          System.out.print( " Enter value  c :  " );
        int c = math.nextInt();
        System.out.print( " Enter value  d :  " );
        int d = math.nextInt();
        int multi = product(c, d);
        System.out.println( " This is total  c*d : " + multi );
        
    }
}
