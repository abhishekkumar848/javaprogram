package Array.arrayquestion;

public class subpart {
    public static void subsum(int[] number) { // subsum is a method that takes an array of integers as an argument
        int current = 0;
        int max = Integer.MIN_VALUE;// ye program me maximum value ko find karne ke liye use kiya gaya hai
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                    current += number[k];

                }
                if (current > max) {
                    max = current;
                }
                System.out.print(",");
            }
            System.out.println(" max sum is " + max);
        }
    }
    public static void main(String[] args) {
        int[] number = {1,2,3,4};
        subsum(number);
    }
}
