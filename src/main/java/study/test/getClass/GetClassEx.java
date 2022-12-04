package study.test.getClass;

import java.lang.reflect.Field;
import study.test.clone.Point;

public class GetClassEx {
    /*
      · getClass()
      · Object의 runtime class를 반환
      · JVM에 로딩되어있는 대상 클래스의 정보를 반환한다.
    * */
    public void testGetClass(){
        Point point = new Point(10, 20);
        
        Class cls = point.getClass();

        System.out.println("getName() : " + cls.getName());                 // 객체의 클래스 이름
        System.out.println("getSuperClass() : " + cls.getSuperclass());     // 상위 클래스 이름

        Field[] fields = cls.getDeclaredFields();

        for(Field f : fields){
            System.out.println("Field : " + f);
        }
    }
}
