package study.test.collection.map;

public class PropertiesMain {
    public static void main(String[] args){
        StudentManager sm = new StudentManager();

        // properties 데이터 삽입
        sm.propertyInsert(new Student("1", "홍길동", 80));
        sm.propertyInsert(new Student("2", "김유신", 60));
        sm.propertyInsert(new Student("3", "신사임당", 95));

        // properties 데이터 저장
        sm.propertyStore();

        // properties 데이터 입출력
        sm.propertyPrint();
    }
}
