import java.util.*;

public class basic{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if((b % a) == 0 && (a * a) == b){
            System.out.println("Square and multiple of " + a);
        }

        else if((b % a) == 0){
            System.out.println("Multiple of " + a);
        }

        else if((a * a) == b){
            System.out.println("Square of " + a);
        }
        else{
            System.out.println("neither square nor multiple of " + a);
        }
    }
}