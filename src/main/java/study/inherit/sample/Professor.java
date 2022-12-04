package study.inherit.sample;

public class Professor extends Person{
    private String major;

    public Professor() {
        super();
    }

    public Professor(String major) {
        super();
        this.major = major;
    }

    public Professor (String name, String major){
        //super(name);
        this.major = major;
    }

    @Override
    public void out(){
        System.out.println(getName() + " 교수입니다.");
        System.out.println(major + "를 전공합니다.");
    }
}
