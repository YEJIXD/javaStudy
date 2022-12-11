package study.test.collection.map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import study.test.etc.vo.Student;

@Getter
@Setter
@ToString
public class PropertiesStudent implements java.io.Serializable{
    private String no;
    private String name;
    private int score;

    public PropertiesStudent(){}
    public PropertiesStudent(String no, String name, int score){
        this.no = no;
        this.name = name;
        this.score = score;
    }

    /*@Override
    public String toString(){
        return no + ", " + name + ", " + score;
    }*/

    /* Getter & Setter */
}
