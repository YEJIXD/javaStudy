package study.test.etc.view;

import study.test.etc.controller.StuManager;
import study.test.etc.vo.Student;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("홍길동", 100, 90);
        Student s2 = new Student("고길동", 90, 80);
        new StuManager().scoreComp(s1, s2);
    }
}
