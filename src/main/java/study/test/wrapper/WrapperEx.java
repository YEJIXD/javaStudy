package study.test.wrapper;
public class WrapperEx {
    /*
     · Wrapper Class
     · 자바의 기본형 Data Type을 Class화 하기 위해 사용하는 클래스
     · 기본형 DataType을 클래스화하면 Object 클래스의 자식 클래스가 되며 DataType에 상관없이 Object Class를 이용한 처리가 가능해진다.

      · 기본형 DataType    |   Wrapper Class
        -------------------------------------
            boolean       |    Boolean
             byte         |     Byte
             char         |   Character
             short        |     Short
             int          |    Integer
            long          |     Long
            float         |     Float
           double         |    Double

    * */
    public void printWrapper(Object obj){
        // Object형 매개변수를 이용하여 하나의 함수로 int형과 double형 data 처리
        System.out.println("데이터 : " + obj);
        System.out.println("데이터 클래스 : " + obj.getClass());


        // Boxing : 기본형 DataType을 객체화 시키는 작업
        int i = 10;
        Integer iValue1 = new Integer(i);
        Integer iValue2 = new Integer(123);

        double d = 1.123;
        Double dValue1 = new Double(d);
        Double dValue2 = new Double(5.323);

        // UnBoxing : 객체에 저장되어 있는 data를 기본형 data로 꺼내는 작업
        Integer iValue = new Integer(4578);
        int in = iValue.intValue();

        Double dValue = new Double(44.241);
        Double dn = dValue.doubleValue();

        // Auto Boxing(자동 박싱), Auto UnBoxing(자동 언박싱) : 자바 JDK 1.5 이상부터는 기본 타입과 Wrapper 클래스 타입 간의 변환이 자동으로 이뤄진다.
        int j = 10;
        Integer jValue = j;

        Double dValue3 = new Double(3.14);
        double dou = dValue3;
    }
}
