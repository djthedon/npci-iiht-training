

class Veichle{
    
    String v1, v2;    

    Veichle(String v1, String v2){
        this.v1 = v1;
        this.v2 = v2;
    }
    
    void show(){
        
    }
    
    void Specifications(){
        System.out.println(v1 + " " + v2);
    }
    
}

class Car extends Veichle{
    
    String name;
    
    Car(String name, String v1, String v2){
        super(v1, v2);
        this.name = name;
    }
    
    void show(){
        System.out.println("The name of the veichle is " + name);
    }
    
    void Specifications(){
        System.out.println(v1 + " " + v2);
    }
}

class Bike extends Car{
    
    String name2;
    
    Bike(String name1, String name2, String v1, String v2){
        super(name2, v1, v2);
        this.name2 = name2;
    }
    
    void show(){
        System.out.println("The name of the veichle is " + name2);
    }
    
    void Specifications(){
        System.out.println(v1 + " " + v2);
    }
    
}

class Construct{
    public static void main(String[] args){
        Veichle v1 = new Car("maruti", "1200cc", "mileage");
        Veichle v2 = new Bike("maruti", "honda", "133", "DTSI engine");
        
        v1.Specifications();
        v1.show();
        System.out.println();
        v2.Specifications();
        v2.show();
    }
}
