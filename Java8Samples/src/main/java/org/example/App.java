package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        Student s1 = new Student(1,100, true);
        Student s2 = new Student(4,90, true);
        Student s3 = new Student(6,70, true);
        Student s4 = new Student(8,60, true);
        Student s5 = new Student(5,40, true);
        Student s6 = new Student(1,50, true);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        /*
        for(Student s: students){
            if(s.getHeight() < 5){
                students.remove(s);
            }
        }
         */
        // Instead of writing above commented code, we write below removeIf java 8 addition to Collection interface.
        //students.removeIf(student -> student.getHeight() < 5); //Using lambda
        students.removeIf(Student::heightCheck);
        System.out.println("Before Sorting");
        students.forEach(System.out::println);

        Collections.sort(students);
        System.out.println("After Sorting based on height");
        students.forEach(System.out::println);

        System.out.println("After Sorting based on weight");
//        Collections.sort(students, new StudentComparator());
        Collections.sort(students,(Student w1, Student w2) -> w1.getWeight() - s5.getWeight());
        students.forEach(System.out::println);

    }
}
