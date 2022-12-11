package study.test.collection.map;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;

public class StudentManager {
    private ArrayList<PropertiesStudent> list = new ArrayList<PropertiesStudent>();
    private Properties prop = new Properties();

    public StudentManager(){}
    public void propertyInsert(PropertiesStudent st){
        prop.setProperty(st.getNo(), st.toString());
        System.out.println(st.getName() + " 학생의 데이터 삽입 성공 !");
    }

    public void propertyStore(){
        try{
            prop.store(new FileWriter(new File("prop.properties")), "Ex_Student.properties");
            System.out.println("학생 데이터 저장 성공 !");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public void propertyPrint(){
        try{
            prop.load(new FileReader(new File("prop.properties")));

            for(int i = 0; i <= prop.size(); i++){
                String index = String.valueOf(i);
                list.add(parsePropertiesStudent(prop.getProperty(index)));
                System.out.println("prop.getProperty(index) : " + prop.getProperty(index));
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }

        for(PropertiesStudent s : list){
            System.out.println(s);
        }

        System.out.println("학생 데이터 출력이 완료되었습니다.");
    }

    public PropertiesStudent parsePropertiesStudent(String str){
        String tmp[] = str.split(", ");
        return new PropertiesStudent(tmp[0], tmp[1], Integer.parseInt(tmp[2]));
    }

}
