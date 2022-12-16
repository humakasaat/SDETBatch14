package reviewClass12;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetDem {
    public static void main(String[] args) {
        Set<Student> students= new LinkedHashSet<>();//upcasting
        students.add(new Student("josh","plantin","123"));
        students.add(new Student("Saira","Javad","124"));
        students.add(new Student("Sonam","koh","1238"));
        System.out.println(students);
        //new object means new memory location
        List<Student> setStudents= new ArrayList<>(students);
        System.out.println(setStudents.get(1));



    }
}
