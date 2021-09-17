#include<bits/stdc++.h>
using namespace std;

int main(){
    int arr[] = {10, 10, 12, 8, 9, 1, 5, 2, 22, 12, 3};
    
    int a = 10;
    //case1
    for(int i = 0; i < 11; i++){
        if(arr[i] == a){
            cout << i + 1 << endl;
            break;
        }
    }
    a = 12;
    //case 2
    for(int i = 0; i < 11; i++){
        if(arr[i] == a){
            cout << i + 1 << ' ';
        }
    }
}