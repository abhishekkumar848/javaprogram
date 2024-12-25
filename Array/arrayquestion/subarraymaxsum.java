package Array.arrayquestion;

public class subarraymaxsum {
    public static void maxsum(int[] number) {
        int current = 0;
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i <     number.length; i++) {
           int start = i;
           for (int j = i; j <  number.length; j++) {
            int end = j;
            current= 0;
            for (int k = start; k <= end; k++) {
                current = current+ number[k];
                System.out.print(number[k] + "  "   );  
                
                if(current>maxsum){
                       maxsum= current;
                }
                }
                System.out.println("");
            }
           
            
           } 
           System.out.println("max sum is "+maxsum);
           
        }
    
    
    public static void main(String[] args) {
        int[] number = {1,2,4,6,8};
        maxsum(number);

    }
}
