import java.util.Scanner;

public class Switchstatement {
    public static void main(String[] args) {
        Scanner light = new Scanner(System.in);
        int traffic_light = light.nextInt();
        switch (traffic_light) {
            case 1 : System.out.println("stop");
                
                break;
                case 2 : System.out.println("go");
                
                break;
        
            default:
                break;
        }
    }
}
