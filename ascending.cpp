#include<bits/stdc++.h>
using namespace std;

int main(){
    int arr[] = {10, 12, 8, 9, 1, 5, 2, 22, 34};
    for(int i = 0; i < 8; i++){
        int min = i;
        for(int j = i + 1; j < 9; j++){
            if(arr[min] > arr[j]){
                min = j;
            }
        }
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }

    for(int i = 0; i < 9; i++){
        cout << arr[i] << " ";
    }
    cout << endl;
}

