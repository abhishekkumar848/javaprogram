package practice;

public class primeornot {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <=n-1; i++) {
            if (n % i == 0 ) {
                isPrime= false;
            }
        }
        return isPrime;
    }

    // prime range print 
    public static void primerange(int n) {
        for (int i = 2; i<=n; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
       
    }
}
    public static void main(String[] args) {
        primerange(20);
    }
}
