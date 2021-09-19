#include<bits/stdc++.h>
using namespace std;

class Node{
    public: 
        int data;
        Node* next;
        Node(int data){
            this->data = data;
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

class LinkedList{
    public:
        Node *head;

        LinkedList(){
            head = NULL;
        }

        void insert_At_Front(int a){
            Node* n = new Node(a);
            n->next = head;
            head = n;

        }

        void insert(Node* prev, int data){
            if(prev == NULL){
                return;
            }
            Node *n = new Node(data);
            n->next = prev->next;
            prev->next = n;
        }

        void insertAtEnd(int data){
            Node *n = new Node(data);
            if(head == NULL){
                head = new Node(data);
                return;
            }
            n->next = NULL;
            Node* last = head;
            while(last->next != NULL){
                last = last->next;
            }
            last->next = n;
            return;
        }
        
        void sort(){   
            Node *head1 = NULL;
            Node *j = NULL;
            while(head != NULL){
                int min = INT_MAX;
                Node *pre = NULL;
                Node *prev = head;
                Node *temp = NULL;
                for(Node *p = head; p != NULL; p = p->next){
                    if(p -> data < min){
                        min = p->data;
                        pre = prev;
                        temp = p;
                    }
                    prev = p;
                }
                if(temp == head){
                    Node* t = head;
                    head = head->next;
                    t->next = NULL;
                    temp->next = NULL;
                }
                else{
                    pre->next = temp->next;
                    temp->next = NULL;
                }
                if(head1 == NULL){
                    head1 = temp;
                    j = head1;
                }
                else{
                    j->next = temp;
                    j = j->next;
                }
            }
            head = head1;
            head1 = NULL;

        }

        int size(){
            Node* last = head;
            int count = 0;
            while(last != NULL){
               // cout << last->data << " ";
                count++; 
                last = last->next;
            }
            return ++count;
        }

        void print(){
            Node* last = head;
            while(last != NULL){
                cout << last->data << ' ';
                last = last->next;
            }
        }

        Queue queue(){
            Queue q(size());
            Node* last = head;
           // cout << size() << endl;
            while(last != NULL){
                q.enqueue(last->data);
                //cout << last->data << ' ';
                last = last->next;
            }
            return q;
        }

};

int main(){
    LinkedList* ll;
    ll = new LinkedList();
    ll->insertAtEnd(12);
    ll->insertAtEnd(11);
    ll->insertAtEnd(115);
    ll->insertAtEnd(15);
    ll->insertAtEnd(127);

    //ll->print();

    //cout << endl;

    ll->sort();

   //ll->print();

    //cout << endl;
    
    Queue q = ll->queue();
    q.printqueue();
    cout << endl;
}