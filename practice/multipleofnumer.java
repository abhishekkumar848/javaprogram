package practice;

import java.util.Scanner;

public class multipleofnumer {
  public static void main(String[] args) {
    Scanner me = new Scanner(System.in); 
    // do {
    //     System.out.print("ENTER NUMBER : " );
    //     int mul = me.nextInt();
    //     if (mul % 10 == 0) {
    //         break;
    //     }
    //     System.out.println(mul);
    // } while(true);

    do {
        System.out.println("enter your number : ");
        int skip = me.nextInt();
        if (skip % 10 == 0) {
            continue;

        }
        System.out.println(skip);
    } while (true);
  }  
}
