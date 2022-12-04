package study;

public class Interface {
    /*
    * Interface
       · 추상 메소드로만 구성된 추상 클래스
       · 추상 클래스보다 추상화 정도를 높여 일반 메소드와 멤버 변수를 멤버로 가질 수 없게 하였다.
       · 상수(public static final 필드)만 멤버로 가진다.

       · 다중 상속에 제한이 없기 때문에 여러 추상화 메소드를 인터페이스로 작성함으로써 코드의 강제성을 부여할 수 있고,
         여러 클래스에서 사용되는 동일한 상수일 경우 인터페이스에 정의한 후 해당 상수를 공유할 수 있게 하면 중복을 줄일 수 있다.

    # Interface 장점
       · 정의해야 하는 메소드를 표준화하고 강제화할 수 있다.
       · 메소드화 시켜야 하는 기능을 분류해야 하는 고민 없이 구현만 하면 되므로 개발 시간을 단축시킬 수 있다.
       · 일반 클래스 상속을 이용해서 자식 클래스들의 관계를 맺는 것보다 간편하게 관계를 가질 수 있다.

    # Interface 작성
       · 추상 메소드를 작성하려면 abstract 키워드를 표시해야하지만 인터페이스 내부에는 모든 메소드가 추상 메소드이므로 public static 키워드를 생략할 수 있다.
         하지만 혼동할 수 있으므로 모든 인터페이스의 추상 메소드에 public abstract 를 표시해두기도 한다.
    * */
    public interface testA {
        // 상수 또는 추상 메소드
    }
    
    public interface testA1 {
        // 상수 또는 추상 메소드
    }
    
    public interface testA2 {
        // 상수 또는 추상 메소드
    }
    
    /*
    # Interface 상속
       · 클래스의 상속은 단일 상속만 가능하지만, 인터페이스는 다중 상속이 가능하다.

       · 추상 메소드에 대한 구현(implement)과 재정의(overriding)는 인터페이스를 상속받은 후손 클래스에서 구현(Implements)해야 한다.
    * */
    public interface testB extends testA, testA1, testA2{
        // 상수 또는 추상 메소드
    }
    /*
    # Interface 구현(Implements)
       · Interface가 가진 추상 메소드를 구현하려면 'implements' 키워드를 사용해서 후손 클래스가 인터페이스를 상속받아야 한다.
       · 상속받은 후손 클래스는 반드시 인터페이스의 추상 메소드를 구현(implement : 메소드 바디 추가하고 코드 작성)해야 한다.
    * */
    public class Phone implements testA {
        // 일반 클래스 정의
        // 인터페이스 추상 메소드 구현
    }
}
