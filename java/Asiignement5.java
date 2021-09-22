//start coding a new Program


class BasicArray{
    
    public static void main(String[] args){
        int arr[][] = new int[2][3];
        int j = 1;
        for(int i = 0; i < 2; i++){
            if(i%2 == 0){
                for(int p = 0; p < 3; p++){
                    arr[i][p] = j++;
                }
            }
            else{
                for(int p = 2; p >= 0; p--){
                    arr[i][p] = j++;
                }
            }
        }
        for(int i = 0; i < 2; i++){
            for(int p = 0; p < 3; p++){
                System.out.print(arr[i][p] + " ");
            }
            System.out.println(); 
        }
    }
    
}







 //Click Enter to expand window
