package practice;

import java.util.Scanner;

public class largerst {
  public static void main(String[] args) {
    Scanner largests =  new Scanner(System.in);
    int a = largests.nextInt();
    int b = largests.nextInt();
    int c = largests.nextInt();
    if (a>=b && a>=c) {
       System.out.println("largest is a");
    } else if (b>=c){
      System.out.println(" largest is b");

    }
    

     else {
      System.out.println(" largest is c");
    }
    
  }  
}
