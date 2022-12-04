package study.test.str;
public class StringBufferEx {
    /*
     · StringBuffer Class 와 StringBuilder Class
     · 문자열을 다룰 때 사용하며, 문자열을 변경할 때마다 새로운 객체를 생성하는 String 클래스와 다르게 문자열 변경 시 새로운 객체를 생성하지 않고, 버퍼에 담겨있는 문자열을 바로 수정한다.
     · StringBuffer Class와 StringBuilder Class의 객체는 객체 생성 시, 크기를 지정하지 않으면 기본적으로 16개의 문자를 저장할 수 있는 버퍼를 가진다.

     · StringBuffer Class와 StringBuilder Class는 기본적인 동작을 같으며,
     · StringBuffer Class만 동기화(Thread Safe)를 지원한다는 점이 다르다.
    * */
    public void testStringBuffer(){
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer(30);
        StringBuffer str3 = new StringBuffer("Java");

        str1.append("HI");
        str2.append("Hello");
        str3.insert(0, str2 + " ");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
