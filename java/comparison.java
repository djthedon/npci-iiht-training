import java.io.*;
import java.lang.*;
import java.util.*;

class SortBy implements Comparator<Student>{
    public int compare(Student a, Student b){
        if(a.id - b.id == 0){
            return -1 * a.name.compareTo(b.name);
        }
        return a.id - b.id;
    }
}

class Student{
    
    int id;
    String name;
    
    public void add(String name, int id){
        this.id = id;
        this.name = name;
    }
    
    public void show(){
        System.out.println(id + " " + name);
    }
    
}

public class MyClass{
    
    public static void main(String[] args){
        ArrayList<Student> S = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            Student s1 = new Student();
            s1.add(s.next(), s.nextInt());
            S.add(s1);
        }
        Collections.sort(S, new SortBy());
        
        for(Student t : S){
          t.show();  
        }
    }
    
    
    
}
