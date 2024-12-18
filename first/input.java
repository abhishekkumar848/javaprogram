import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
      
        String name = sc.next();// capture a input next  one word
        System.out.println(name);

        int age = sc.nextInt();  // nextint use a number capture
        System.out.println(age);

        String massage = sc.nextLine();// nextline capture a large line 
        System.out.println(massage);
        
        float Weight = sc.nextFloat();// capture a float value 
        System.out.println(Weight); 
        
        


    }
}
