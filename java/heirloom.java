import java.util.*;

class st1_generation{
    int asset1;
    int asset2;
    
    st1_generation(int asset1, int asset2){
        this.asset1 = asset1;
        this.asset2 = asset2;
    }
    
    public void show(){
        System.out.println(asset1 + asset2);
    }
}


class nd2_generation extends st1_generation{
    int asset3;
    int asset4;
    String bike;
    
    nd2_generation(int asset1, int asset2, int asset3, int asset4, String bike){
        super(asset1, asset2);
        this.asset3 = asset3;
        this.asset4 = asset4;
        this.bike = bike;
    }
    
    public void show(){
        System.out.println(asset1 + " " + asset2 + " " + asset3 + " " + asset4 + " " + bike);
    }
}

class rd3_generation extends nd2_generation{
    int asset5;
    int asset6;
    String nBike;
    String car;
    
    rd3_generation(int asset1, int asset2, int asset3, int asset4, int asset5, int asset6, String bike,String nBike){
        super(asset1, asset2, asset3, asset4, bike);
        this.asset5 = asset5;
        this.asset6 = asset6;
        this.nBike = nBike;
    }
    
   public void show(){
        System.out.println(asset1 + " " + asset2 + " " + asset3 + " " + asset4 + " " + asset5 + " " + bike + " " + nBike);
    }
}

class Main{
    public static void main(String[] args){
        rd3_generation d3 = new rd3_generation(120, 1200, 120000, 1200000, 120000000, 10000000, "y2k", "bullet");
    }
}
