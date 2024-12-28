package Sorting;

public class bubblsort {
    public static void Sort(int num[]) {
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length-1-i; j++) {
               if (num[j]>num[j+1]) {
                int temp = num[j];
                num[j] = num[j+1];  
                num[j+1] = temp;
               } 
            }
            
        }

        
    }
    public static void print(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {5,4,12,2,1};
        Sort(nums);
        print(nums);
    } 
}
