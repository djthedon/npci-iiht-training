import java.util.*;

class fibo2{
    int b = 0;
    int c = 1;
    int d;
    int print1(){
        d = b + c;
        b = c;
        c = d;
        return d;
        
    }
    int print2(){
        d = b + c;
        b = c;
        c = d;
        return d;
    }
}

class fibo{
    
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        fibo2 f = new fibo2();
        int k = 2;
        System.out.print(0 + " " + 1 + " ");
        while(k < a){
            if(k % 2 == 0){
                System.out.print(f.print1() + " ");
            }
            else{
                System.out.print(f.print2() + " ");
            }
            k++;
        }
        
    }
}
