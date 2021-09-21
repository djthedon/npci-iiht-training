import java.util.*;
import java.lang.Math;
public class MyClass {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a1 = s.next();
        int a = 0;
        double d = 0.0;
        int k = 0; 
        int cnt = 0, cdt = 0;
        for(int i = 0; i < a1.length(); i++){
            if(a1.charAt(i) == '.'){
                d = Double.parseDouble(a1);
                cdt = 1;
                a = 1;
                break;
            }
        }
        if(a == 0){
            k = Integer.parseInt(a1);
            //System.out.println(a1 + " " + k);
            cnt = 1;
        }
        
        if(cnt == 1){
            if(k >= -32768 && k <= 32767){
                //System.out.println(k);
                short Short = (short)k;
                System.out.println("short data type " + Short);
            }
            else{
                System.out.println("int data type " + k);
            }
        }
        else{
            if(d >= 1.40239846 * Math.pow(10, -45) && d <= 3.40282347 * Math.pow(10, 38)){
                float f = (float)d;
                System.out.println("float data type " + f);
            }
            else{
                System.out.println("double data type " + d);
            }
        }
    }
}
