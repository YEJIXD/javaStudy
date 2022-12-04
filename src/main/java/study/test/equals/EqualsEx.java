package study.test.equals;

public class EqualsEx {
    /*
     · equals()
     · 기본 타입 변수의 값이 같은지 비교할 떄, '==' 연산자를 이용하지만
       참조 타입 변수일 경우에 '==' 연산자 사용지 참조하고 있는 대상이 같은지 비교한다.
     · 아래 예제를 보면 str1과 str2는 서로 다른 주소를 가지므로 둘은 단순 비교하면 false지만 equals를 사용하면
       참조 타입 변수가 가리키는 값이 참조 대상의 값과 동일한지 비교하므로 true를 리턴한다.
    * */
    public void testEquals(){
        String str1 = new String("Apple");
        String str2 = new String("Apple");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
    }
}
