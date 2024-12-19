package Array.arrayquestion;

import java.util.Scanner;

public class greaternumfind {
    public static int greaters(int number[],int key) {
        int start = 0;
        int end = number.length -1;
        while (start<= end) {
            int mid = (start+end)/2;
            if (number[mid]==key) {
                return mid;
            }
            if (number[mid]<key) {
                start = mid+1;

            }
            else{
                end = mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = {1,2,3,4,5,6,20,21,35,36,66,64};
        System.out.print("Enter num  = ");
        int key = sc.nextInt();
        int result = greaters(number, key);
        System.out.println("this your index = " + result);


    }
}
