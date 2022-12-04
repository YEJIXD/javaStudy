package study.test.etc.controller;

import java.util.Comparator;
import study.test.etc.vo.Student;

public class StuComparator implements Comparator<Student>{
    @Override                                           // Comparator 인터페이스의 compare() 메소드를 재정의
    public int compare(Student o1, Student o2){
        if(o1.getSum() > o2.getSum()){
            return 1;
        } else if(o1.getSum() < o2.getSum()){
            return -1;
        } else{
            return 0;
        }
    }
}
