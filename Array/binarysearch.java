package Array;

public class binarysearch {
    public static int search(int number[], int target) {
        int start = 0;
        int end = number.length-1;
        while (start<= end) {
            int mid = (start+end)/2;
            if (number[mid] == target) {
                return mid;
            }
             if (number[mid]< target) {
                start = mid +1;
            }
             else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]= {12,14,16,19,22,24,66,95};
        int target = 14;
        int result = search(number, target);

        System.out.println("ans = " +  result);

    }
}
