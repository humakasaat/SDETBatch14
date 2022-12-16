package Class14;
// we can not use switch because of the limitations
public class HomeWork7 {
    char getGrade( int score){
      char grade;
      if ( score >90){
          grade='A';
      } else if( score >80){
          grade='B';
    } else if( score >70) {
          grade = 'C';
      } else if( score >50){
          grade='D';
}   else {
          grade = 'F';
      }
        return grade;
    }

    public static void main(String[] args) {
        HomeWork7 a= new HomeWork7();
        System.out.println(a.getGrade(90));
    }
}