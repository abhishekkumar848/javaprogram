package practice;

public class pyramidnumber {
    public static void pyramidnum(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 1+(n-i); j++) {
                System.out.print(j);
               
            }//12345
             //1234
             //123
             //12
             //1
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramidnum(5);
    }
}
