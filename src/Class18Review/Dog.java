package Class18Review;

public class Dog {
    String name;
    int weight;
    static String breed;// shared by all objects/ only one copy be shared
    void printInfo(){
        System.out.println("Dog features:"+ name+ weight+breed);

    }	// create a method to return price
    // if weight is more than 5 -> 100
    // if weight is more more than 10 -> 300
    // if weight is more than 20 -> 1000

    float getPrice() {
        if(weight<5) {
            return 100;
        }else if(weight <10) {
            return 300;
        }else {
            return 1000;
        }
    }

    // create a method that will return bark type

    // if weight is more less than 5 --> loud
    // if weight less 20 -> noise is wooh
    // if weight is less 500 > noise Gav gav

    String bark() {
        String noise;

        if (weight<5) {
            noise="loud";
        } else if(weight<10) {
            noise="woof woof";
        }else {
            noise="GAV GAV";
        }
        return noise;
    }
// when we do no create a constructor compiler create a default constructor
    void love( String things){
        System.out.println(name+" loves "+things);
    }


}
