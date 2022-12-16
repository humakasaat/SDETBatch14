package Class_24;

public class Cat {
    String name;
    String breed;
    int age;
    double weight;

    public Cat(String name, String breed, int age, double weight) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
    }
    void printinfo(){
        System.out.println(name+" "+ breed+" "+  age+" "+ weight+" ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
  class Tester{
      public static void main(String[] args) {
          Cat cat= new Cat("Peshow","Afghan",12,14);
         cat.printinfo();
      }

  }




