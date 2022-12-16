package Class17;

public class HW2_Tester {
    public static void main(String[] args) {
        HW2_CalculateAverageGrade student1= new HW2_CalculateAverageGrade("Emad",
                80,90,90
        );
        student1.CalculateAverageGrade();
        HW2_CalculateAverageGrade student2=new HW2_CalculateAverageGrade("Tasnim",80,
                90, 80);
         student2.CalculateAverageGrade();
        HW2_CalculateAverageGrade student3=new HW2_CalculateAverageGrade("Farhaan",100,
                90,80);
        student3.CalculateAverageGrade();
         HW2_CalculateAverageGrade student4= new HW2_CalculateAverageGrade("Fayez", 80,
                 90, 70) ;
    }
}
