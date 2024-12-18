package Array;

import java.util.Scanner;

public class findx {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int put []= new int[size];
    for (int i = 0; i < size; i++) {
        put[i]= sc.nextInt();

    }
    // find x 
    int x = sc.nextInt();
    for (int i = 0; i < put.length; i++) {
        if (put [i]==x) {
            System.out.println( put.length+   " this value of x = " + x );
        }
    }
 }
}
