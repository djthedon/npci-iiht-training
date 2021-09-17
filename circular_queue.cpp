#include<bits/stdc++.h>
using namespace std;
 
class Queue{
    public:
        int rear, front, size;
        int *arr;
    
        Queue(int size){
            front = rear = -1;
            size = this->size;
        }

        void enqueue(int data){
            if((front == 0 && rear == size - 1) || (rear + 1) == front){
                cout << "Queue is empty" << endl;
            }
            else if(front == -1){
                front = rear = 0;
                arr[rear] = data;
            }
            else if (rear == size - 1 && front != 0){
                rear = 0;
                arr[rear] = data;
            }
            else{
                rear++;
                arr[rear] = data;
            }
        }

        int deQueue(){
            if(front == -1){
                cout << "empty" << endl;
                return -1;
            }
            int data = arr[front];
            arr[front] = -1;
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else if(front == size - 1){
                front = 0;
            }
            else{
                front++;
            }
            return data;
        }

        void display(){
            if(front == -1){
                cout << "Queue is empty" << endl;
                return;
            }
            if(rear >= front){
                for(int i = front; i < rear; i++){
                    cout << arr[i];
                }
            }
            else{
                for(int i = front; i < size; i++){
                    cout << arr[i] << ' ';
                }
                for(int i = 0; i <= rear; i++){
                    cout << arr[i] << ' ';
                }
            }

        }
};

int main(){
    Queue w(3);
    w.enqueue(4);
    w.enqueue(5);
}
