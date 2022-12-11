package study.test.collection.generic;

/*
* Generic
  · 다양한 객체들을 다루는 메소드나 클래스의 타입을 미리 명시해 줌으로써 컴파일 시, 타입을 체크할 수 있도록 하고
    형변환을 하는 번거로움 없이 사용하게 해주는 것
    > 배열이나 컬렉션 사용 시 데이터 타입의 안정성을 높일 수 있다.
       · 타입 안정성 : 의도하지 않는 타입의 객체가 저장되는 것을 막고, 저장된 객체를 의도하지 않은 타입으로 사용되는 것을 막는 것
        
  · Generic 선언
    - Generic은 class와 method에 선언 가능
    
      [접근제한자] class [클래스명] <Type1, Type2, ...>();
    
    - 클래스를 선언할 때 클래스명 옆에 < >를 이용하여 데이터 타입이나 타입 변수를 지정해주면 된다.
    - 제네릭 타입의 변수는 식별자 명명 규칙에 따라 어느 것이든 가능하지만 일반적으로 T를 많이 사용한다.
    - 이후 클래스 내부에 변수나 메소드를 선언할 때, 일반 데이터 타입과 동일하게 사용하면 되며, 타입 변수를 특정 데이터 타입으로 지정해주면
      해당 타입으로 메모리에 할당하여 사용 가능하다.
* */
public class GenericEx<T> {
    T object;

    void setObject(T object){
        this.object = object;
    }

    T getObject() {
        return object;
    }

    GenericEx<String> ex = new GenericEx<String>();
    
    /*
     · 만약 두 개 이상의 타입으로 제네릭 타입 변수를 사용하고 싶다면 콤마(,)로 구분하여 다른 이름으로 타입 변수를 지정해주면 된다.
    * */
    
    
    /*
    * Generic Method
       · 메소드에서 사용할 타입을 제네릭을 이용하여 선언할 수 있다.
       
         [접근제한자] <Type1, Type2, ...> [returnType][method명](parameter, ...) {...}
          
       · 제네릭 메소드를 호출할 때에는 타입 변수를 명시적으로 지정할 수도 있고, 컴파일러가 매개값의 타입ㅇ르 보고 추정하도록 할 수도 있다.
    * */
    
    /*
    * Generic 제한하기
      · 일반적인 방법으로 제네릭을 이용했을 경우, 타입에 대한 제한이 없다.
      · 하지만 제네릭 타입 변수에 extends 키워드를 사용하면 타입의 종류를 제한할 수 있다.
    * */
    class Point {
        int x;
        int y;
    }
    
    class Triangle<T extends Point>{
        T pos1, pos2, pos3;
    }
    
    // extends 뒤에 명시된 타입의 자손들만 타입 변수에 대입할 수 있게 된다.
    
    /*
    * WildCard(와일드카드)
      · 타입 변수를 매개변수나 리턴타입으로 사용할 때, 구체적인 타입대신 와일드 카드를 사용할 수 있다.
        1) 타입 변수를 대치할 수 있는 구체적인 타입으로 제한을 두지 않거나
        2) extends 키워드를 이용해 해당 타입과 자손 타입들만 가능하도록 제한하거나
        3) super 키워드를 이용해 해당 타입과 부모 타입들만 가능하도록 제한하는 방법
         
      · 와일드 카드 사용 (3가지)
        <?>                    : 제한 없음
        <? extends 상위타입>    : 상위 클래스 제한
        <? super 하위타입>      : 하위 클래스 제한
    * */

    /*
    * Generic 상속
       · 제네릭 클리스도 다른 클래스와 마찬가지로 부모 클래스가 될 수 있다.
       · 부모  클래스의 제네릭 타입을 상속해서 자식 클래스에서도 제네릭 타입을 상속할 수 있다.
        public class ChildProduct<T, K> extends Product<T, K> {...}

       · 자식 제네릭 클래스는 추가적인 타입 변수를 가질 수 있다.
         public class ChildProduct<T, K, S> extends Product<T, K> {...}
    * */
}
