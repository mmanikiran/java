package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student implements Comparable<Student> {

    private int height;
    private int weight;
    private boolean sex;
    public boolean heightCheck(){
        return this.getHeight() < 5;
    }

    @Override
    public int compareTo(Student o) {
        return this.height - o.height;
    }
}
