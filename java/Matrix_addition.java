
import java.util.*;

class matrix{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int arr[][] = new int[a][b];
        int brr[][] = new int[a][b];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                arr[i][j] = s.nextInt();
            }
        }
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                brr[i][j] = s.nextInt();
            }
        }
        int crr[][] = new int[a][b];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                crr[i][j] = arr[i][j] + brr[i][j];
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}

