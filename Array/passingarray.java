package Array;
   // update i array 
public class passingarray {
    // create a new function
    public static void change(int marks[]) {
        // update function
        for (int i = 0; i < marks.length; i++) {
            marks [i]= marks[i]+2;
        }
    }
    public static void main(String[] args) {
        int marks[] = {55,25,89}; 
        // call function
        change(marks);
        // print update
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+ " ");
        }           
        System.out.println();
    }
}
