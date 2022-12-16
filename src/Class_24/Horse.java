package Class_24;

public class Horse {
    private String name;
   private String color;
   private double weight;
   private String breed;

    public Horse(String name, String color, double weight, String breed) {
        setName(name);
        setColor(color);
        setWeight(weight);
        setBreed(breed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if( name.length()>20)
            System.out.println("Name can't be more than 20 letters,please try again");
        else if (name.isEmpty()){
            System.out.println("Name can't be empty, please try again");
        } else{
        this.name = name;
    }   }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight<600){
            System.out.println("weight can't be less than 600 ");
        }
        else if ( weight>2000){
            System.out.println(" weight can't be more than 20000");
        }
        else {
            this.weight = weight;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if( breed.isEmpty()){
            System.out.println("breed can't be empty");
        } else {
            this.breed = breed;
        }
    }
    void info(){
        System.out.println(" Name is "+ name+ " color "+ color+ " weight "+ weight+" breed "+ breed);
    }
}
  class HorseTester{
      public static void main(String[] args) {
        Horse rosie= new Horse("Roise ","white ",900,"New Zealand");
        rosie.info();
      }

  }
