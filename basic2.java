import java.util.*;
public class basic2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int number2 = number;
        int count = 0;
        while(number != 0){
            number /= 10;
            count ++;
        }
        if(count < 2){
            System.out.println(count);
            return;
        }

        if((count % 2 != 0) && (count % 3 != 0)){
            count -= 1;
        }

        if((count % 2) == 0){
            System.out.println(count * count);
        }
        else{
            System.out.println(count * count * count);
        }
    }
}