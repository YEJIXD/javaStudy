package study.inherit.sample;

public class Student extends Person {
    private String subject;

    public Student() {
        super();
    }

    public Student (String subject) {
        super();
        this.subject = subject;
    }

    public Student(String name, String subject){
        //super(name);
        this.subject = subject;
    }

    @Override
    public void out(){  // 상속받은 부모의 추상 메소드는 반드시 오버라이딩해야 한다.
        System.out.println(getName() + " 학생입니다.");
        System.out.println(subject + "를 수강합니다.");
    }
}
