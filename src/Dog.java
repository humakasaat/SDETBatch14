public class Dog extends Animal {
   ;

    int color;
;

    double height;

    public Dog(String name, String breed, int color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }  public Dog(String name, String breed, int color, int age, double weight, double height) {
       /* this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.height = height;
        */
         this ( name,breed,color,age,weight);
         this.height=height;


}}
