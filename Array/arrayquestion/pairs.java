package Array.arrayquestion;

public class pairs {
    public static void pair(int number[]) {
        for (int i = 0; i < number.length; i++) {
            // pair formula
            int cuurent     = number[i];
            for (int j = i+1; j < number.length; j++) {
                System.out.print("("+cuurent +","+ number[j]+")");
            }

         System.out.println();

        }
        
    }
    public static void main(String[] args) {
        int[] number = {2, 4, 3, 5, 7, 8, 9 ,10, 11, 12, 13, 14, 15};
        pair(number);
        
        
    }
}
