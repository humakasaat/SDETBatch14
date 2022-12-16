package review_4;

public class Apple extends Fruit{
    String size;
    String test;
    double prize;
    Apple( String name,String shape, String color,String size){
       super(name, shape, color);
       this.size=size;

    }
    Apple(String name, String shape, String color,String test,double prize){
        super(name, shape, color);
        this.test=test;
        this.prize=prize;

    }

    public static void main(String[] args) {
        Apple app= new Apple("apple", "circle","red","big Apple");
        // app.color is not visible since access modifier is Private
    }

}
