package Array;

import java.util.Scanner;

public class operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size = ");
        int size = sc.nextInt();
        int put []= new int[size];
        // input
        for (int i = 0; i < size; i++) {
            put [i] = sc.nextInt();
        }
        // outpot
        System.out.println(" Output = ");
        for (int i = 0; i < size; i++) {
            System.out.println(put[i]);
        }
         
        
    }
}
