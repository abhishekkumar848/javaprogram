package Array;

public class linearsearch {
    public static int search(int number[],int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i]==key) {
                return i;
            } 
        }
        return -1; // -1 is why because condition retune kaa lia kia hai or index 0 start hota hai -1 nahi hota hai is lia -1 lia hai 
    }
    public static void main(String[] args) {
        int number [] = {55,4,55,6,8,8,10,6};
        int key = 55;
        int liner = search(number, key);
        if (-1 == liner) {
            System.out.println(" your key does't not match");
        } else {
            System.out.println(" key match now = "+ key +" this is key length = " + liner);
        }
        
        
    }
}
