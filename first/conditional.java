import java.util.Scanner;

public class conditional {
   public static void main(String[] args) {
    // if else statement
     Scanner sc = new Scanner(System.in);

    int age = sc.nextInt();
    if (age>=18) {
        System.out.println(" You are 18+ " + age);
        
    } else {
        System.out.println("You ARE NOT 18+ " + age);
    }
   } 
  
}
