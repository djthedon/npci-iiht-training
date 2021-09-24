//start coding a new Program

import java.util.*;

class Items{
    
    String name;
    int price;
    Items(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void getItem(){
        System.out.println("Item_name" + name + "Items Price" + price);
    }
    
    public String get_name(){
        return name;
    }
    
    public int get_price(){
        return price;
    }
    
}

class Human{
    
    List<Items> Shopping_kart;
    int bill;
    Human(){
        Shopping_kart = new ArrayList<>();
        bill = 0;
    }
    public String get(String t1, List<Items> l2){
        
        for(Items i : l2){
            if(t1.equals(i.get_name())){
                Shopping_kart.add(i);
                bill += i.get_price();
                return "Sucessful added";
            }
        }
        return "Not availaible";
    }
    
    public int show_bill(){
        return bill;
    }
    
}

public class MyClass{
    
    public static void main(String[] args){
        //List<Items> Shopping_cart = new ArrayList<>();
        List<Items> kl = new ArrayList<>();
        kl.add(new Items("ketchup", 1200));
        kl.add(new Items("jim-jam", 1300));
        kl.add( new Items("breads", 1400));
        kl.add(new Items("tye", 1200));
        Scanner S = new Scanner(System.in);
        Human h1 = new Human();
        String s = "yes";
        while(!s.equals("no")){
            System.out.println("Enter the item you want");
            String a = S.next();
            System.out.println(h1.get(a, kl));
            System.out.println("Do you want to continue[yes/no]");
            s = S.next();
        }
        System.out.println("your total bill is " + h1.show_bill());
    }
    
    
}




 //Click Enter to expand window
