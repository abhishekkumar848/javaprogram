package Array.arrayquestion;

public class findlargernumber {
    public static int largest(int number[]) {
        // largest formula
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (large<number[i]) {
                large = number[i];
                
            }
        }
        return large;
    }
    // for small value find 
    public static int small(int number[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (smallest>number[i]) {
                smallest= number[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int number[]= {44,55,66,1,2,8,99,24,26,93,3,89};
        int result= largest(number);
        int result_small = small(number);
        System.out.println("this a largest value = " + result);
        System.out.println("this a smallest value = " + result_small);

        
    }
}
