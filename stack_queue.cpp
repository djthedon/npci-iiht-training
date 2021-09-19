#include<bits/stdc++.h>
using namespace std;
class Stack{
    private:
        int *arr;
        int top;
        int capacity;
    
    public:
        Stack(int size){
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        void push(int i){
            if(!isFull()){
                arr[++top] = i;
            }
        }
        int pop(){
            if(isEmpty()){
                return -1;
            }
            return arr[top--];
        }
        int size(){
            return top + 1;
        }
        void printStack(){
            for(int i = 0; i < top; i++){
                cout << arr[i];
            }
        }

        int isEmpty(){
            return top == -1;
        }

        int isFull(){
            return top == capacity - 1;
        }
};

class Queue{
    public:
        int size;
        int* items;
        int front, rear;

        Queue(int size){
            items = new int[size];
            this->size = size;
            front = -1;
            rear = -1;
        }
        void enqueue(int element){
            if(isFull()){
                cout << "queue is full" << endl;
            }
            else{
                if(front == -1){
                    front = 0;
                }
                rear ++;
                items[rear] = element;
            }
        }
        int deque(){
            int element;
            if(isEmpty()){
                cout << "Queue is empty";
                return -1;
            }
            else{
                element = items[front];
                if(front >= rear){
                    front = -1;
                    rear = -1;
                }
                else{
                    front++;
                }
                return element;
            }
        }

        int isEmpty(){
            if(front == -1){
                return 1;
            }
            return 0;
        }
        int isFull(){
            if(front == 0 && rear == size - 1){
                return 1;
            }
            return 0;
        }
        void printqueue(){
            int i;
            if(!isEmpty()){
                for(i = front; i <= rear; i++){
                    cout << items[i] << ' ';
                }
            }
        }
    
};

int main(){
    Stack s(7);
    s.push(6);
    s.push(12);
    s.push(2);
    s.push(15);
    s.push(17);
    s.push(3);
    s.push(9);

    int min = INT_MAX;
    int min2 = INT_MAX - 1;
    int arr[s.size()];
    int i = 0;
    //cout << s.size();
    
    while(!s.isEmpty()){
        int a = s.pop();
        if(a < min){
            min2 = min;
            min = a; 
        }
        else if(a < min2){
            min2 = a;
        }
        else{

        }
        
        arr[i++] = a;
        //cout << arr[i - 1] << endl;

    }
    //cout << min << ' ' << min2;
    Queue Q(14); 
    for(int j = i - 1; j >= 0; j--){
        if((arr[j] % min) == 0 && arr[j] != min){
            //cout << arr[j] << " ";
            Q.enqueue(arr[j]);
        }
    }
    for(int j = i - 1; j >= 0; j--){
        if((arr[j] % min2) == 0 && arr[j] != min2){
            //cout << arr[j] << " ";
            Q.enqueue(arr[j]);
            //cout << arr[j] << ' ' << j << endl;
        }
    }

    Q.printqueue();
    cout << endl;

}