package Class17;

public class HW2_CalculateAverageGrade {
    //Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
    // Your program should print an average mark of each students name.
       private String name;
       private double mathGrade;
       private double artGrade;
       private double scienceGrade;

       public HW2_CalculateAverageGrade( String studentName, double studentMathGrade, double studentArtGrade, double studentScienceGrade){
            name =studentName;
            mathGrade  =studentMathGrade;
            artGrade = studentArtGrade;
             scienceGrade  =studentScienceGrade;
      } void CalculateAverageGrade(){
          double average=( mathGrade+artGrade+scienceGrade )/3;
        System.out.println( "name is "+ name+ " and"+ " average grade is "+ average);
    }
}
