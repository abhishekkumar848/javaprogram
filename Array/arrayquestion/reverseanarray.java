package Array.arrayquestion;

public class reverseanarray {
    public static void reverse(int[] number) {
        //swap method
        int start = 0;
        int end = number.length-1;
        while (start<end) {
            int temp = number[end];
            number[end]= number[start];
            number[start]= temp;

         start++;
            end--;

        }
       
    }
    public static void main(String[] args) {
        int[] number= {4,5,6,9,11,21,32,45,65};
         reverse(number);
             // print the reversed array
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");

        }
        System.out.println();
        
        
    }
}
