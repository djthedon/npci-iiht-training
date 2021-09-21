import java.util.*;

public class basic{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if((b % 2) == 0 && (a * a) == b){
            System.out.println("Square and multiple of " + a);
        }

        else if((b % 2) == 0){
            System.out.println("Multiple of " + a + "and number of times is " + b/2);
        }

        else if((a * a) == b){
            System.out.println("Square of " + a);
        }
        else{
            System.out.println("neither square nor multiple of " + a);
        }
    }
}