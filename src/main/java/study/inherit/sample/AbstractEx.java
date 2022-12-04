package study.inherit.sample;

public class AbstractEx {
    public static void main(String[] args){
        Student stu = new Student("홍길동", "Java");
        Professor prof = new Professor("김춘추", "컴퓨터 과학");

        stu.out();
        prof.out();
    }
}
