package study.test.etc.vo;

public class Student {
    /*
     · 그 외의 유용한 Class
     · Object Class와 유사한 이름을 가진 클래스로 객체 비교, 해시코드 생성, null 여부, 객체 문자열 리턴 등의 연산을 수행할 수 있다.
     
     · int compare(T a, T b, Comparator<T> c) : 두 객체 a와 b를 Comparator를 사용해 비교
     · int hashCode(Object o)                 : 객체의 해시코드 생성
     · Boolean isNull(Object o)               : null 인지 확인
     · Boolean nonNull(Object o)              : null 아닌지 확인
     · String toString(Object o)              : 객체의 toString() 값 리턴
    * */
    private String name;
    private int kor;
    private int eng;

    public Student(String name, int kor, int eng){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }

    public int getSum(){
        return kor + eng;
    }

    public String getName(){
        return name;
    }
}
