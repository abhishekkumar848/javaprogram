import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner area= new Scanner(System.in);
        float rad = area.nextFloat();
        float circle = 3.14f *rad*rad;
        System.out.println(circle);
    }
}
