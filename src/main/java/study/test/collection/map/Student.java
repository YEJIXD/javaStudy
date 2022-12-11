package study.test.collection.map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
public class Student implements java.io.Serializable{
    private String no;
    private String name;
    private int score;

    public Student(){}
    public Student(String no, String name, int score){
        this.no = no;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString(){
        return no + ", " + name + ", " + score;
    }

    /* Getter & Setter */
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
