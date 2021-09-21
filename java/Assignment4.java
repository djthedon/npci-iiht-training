import java.util.*;

class ass4{
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int a = S.nextInt();
        int arr[] = new int[a];
        for(int i = 0; i < a; i++){
            arr[i] = S.nextInt();
        }
        
        int newArr[] = new int[a];
        int p = 1;
        newArr[0] = arr[0];
        int cntArr[] = new int[a];
        cntArr[0] = 1;
        
        for(int i = 1; i < a; i++){
            int archeck = 0;
            
            for(int j = 0; j < p; j++){
                if(arr[i] == newArr[j]){
                    cntArr[j] += 1;
                    archeck = 1;
                    break;
                }
            }
            
            if(archeck != 1){
                newArr[p++] = arr[i];
                cntArr[p - 1] = 1;
            }
        }
        
        int l = 0;
        
        int hr[] = new int[a];
        
        for(int i = 0; i < p; i++){
            for(int j = 0; j < cntArr[i]; j++){
                hr[l++] = newArr[i];
            }
        }
        
        for(int i = 0; i < a; i++){
            System.out.print(hr[i] + " ");
        }
        
        Arrays.sort(hr);
        
        System.out.println();
        
        //Case 2
        
        int pr[] = hr;
        
        for(int i = 0; i < a; i++){
            System.out.print(pr[i] + " ");
        }     
    }
}
