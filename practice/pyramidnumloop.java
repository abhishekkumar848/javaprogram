package practice;

public class pyramidnumloop {
    public static void pyramidsame(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {    // 1111
                                                  // 222                
                System.out.print(i);              // 33
               }
            System.out.println();
        }
    }
      // numbertriangle 
    public static void numtriangle(int n) {
        int counter =1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter+" " );
                counter++;

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramidsame(9);
        System.out.println("THIS IS A NEXT QUESTION");
        numtriangle(9);
    }
}
