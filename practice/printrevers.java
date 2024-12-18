package practice;
// print reverse num 
public class printrevers {
    public static void main(String[] args) {
        int n = 85545;
        while (n>0) {
            int  revers = n%10;
            System.out.print(revers);
            n/=10;
        }
        int v = 54522;
        int rev  = 0;
        while (v>0) {
            int last = v%10;
            rev = (rev*10)+last;
            v/=10;
            System.out.println(rev);
        }
        
    }
}
