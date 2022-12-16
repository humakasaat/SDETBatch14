package review_4;

public class Fruit {
    protected String name;
    String shape;
    private String color;

    public static boolean fresh;
     Fruit(String name){
         this.name=name;
     }
    Fruit(String name,String shape, String color){
         this(name);// this constructor , we are in same class don't need super
        // this() we make a call
         this.shape=shape;
         this.color=color;
    }
    void grow(){
        System.out.println(" All fruits grow fresh"+ fresh);

    }
    void  haveBenufits(){
        System.out.println("");
    }
}
