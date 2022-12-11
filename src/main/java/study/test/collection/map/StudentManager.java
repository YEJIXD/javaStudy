package study.test.collection.map;

import java.io.*;
import java.util.*;

public class StudentManager {
    private ArrayList<Student> list = new ArrayList<Student>();
    private Properties prop = new Properties();

    public StudentManager(){}
    public void propertyInsert(Student st){
        prop.setProperty(st.getNo(), st.toString());
        System.out.println(st.getName() + " 학생의 데이터 삽입 성공 !");
    }

    // 설정 파일 저장할 때
    public void propertyStore(){
        try{
            prop.store(new FileWriter(new File("prop.properties")), "Ex_Student.properties");
            System.out.println("학생 데이터 저장 성공 !");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }

    // 설정 파일 불러올 때
    public void propertyPrint(){
        try{
            prop.load(new FileReader(new File("prop.properties")));

            for(int i = 1; i <= prop.size(); i++){
                //String 형변환을 통한 key 값 도출
                String index = String.valueOf(i);

                list.add(parseStudent(prop.getProperty(index)));
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }

        for(Student s : list){
            System.out.println(s);
        }
        System.out.println("학생 데이터 출력이 완료되었습니다.");
    }

    public Student parseStudent(String str){
        String tmp[] = str.split(", ");
        return new Student(tmp[0], tmp[1], Integer.parseInt(tmp[2]));
    }

}
