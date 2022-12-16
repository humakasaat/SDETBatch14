package review_4;

public class Banana extends Fruit{
     String origin;
    Banana(String name,String shape, String color, String origin ){
         super(name,shape,color);
         this.origin=origin;
    }
    void makeSmoothies(){
        System.out.println("From "+name+"we get tasty smoothie");
    }
    void grow(){

    }

    public static void main(String[] args) {
        Banana banana= new Banana("banana","banana shape","yellow","Ecuador");

    }

}
