package Array.arrayquestion;

import java.util.Scanner;

public class foodmenu {
    public static String linersearch( String menu[], String odder) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].trim().equals(odder)) {
                return menu[i];
            }
            
        }
        return "This item not found";
    }
   public static void main(String[] args) {
     String menu[] = {" pizza"," tea ", " fruits",};
    String odder = "pizza";
     String result = linersearch(menu, odder);
     System.out.println("this is your order " + result);

}
}
