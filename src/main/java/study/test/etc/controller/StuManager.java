package study.test.etc.controller;

import study.test.etc.vo.Student;

import java.util.Objects;

public class StuManager {
    public void scoreComp(Student s1, Student s2){
        new StuComparator().compare(s1, s2);
        int result = Objects.compare(s1, s2, new StuComparator());

        if(result > 0){
            System.out.println(s1.getName() + " 학생이 우수합니다.");
        } else if(result < 0){
            System.out.println(s2.getName() + " 학생이 우수합니다.");
        } else {
            System.out.println("두 학생은 점수가 같습니다.");
        }
    }
}
