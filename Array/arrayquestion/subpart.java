package Array.arrayquestion;

public class subpart {
    public static void sub(int[] number) {
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.print(",");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9};
        sub(number);
    }
}
