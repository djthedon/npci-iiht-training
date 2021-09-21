import java.util.*;

class reverse_fibonacci{
    public static void main(String[] args) {
        long arr[] = new long[100];
        arr[0] = 0;
        arr[1] = 1;
        int a = 0, b = 1;
        for(int i = 2 ;i < 100; i++){
            arr[i] = arr[a] + arr[b];
            a = b;
            b = i; 
        }
        for(int i = 99; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
    
    
}