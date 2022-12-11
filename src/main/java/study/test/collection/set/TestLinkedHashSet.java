package study.test.collection.set;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class TestLinkedHashSet {
    /*
    * Set
      · 저장 순서가 유지되지 않으며, 객체를 중복해서 저장할 수 있음
      · 인덱스로 관리하지 않기 때문에 인덱스를 매개변수로 갖는 메소드가 없음

     * Set 인터페이스로 구현된 클래스
       1) HashSet
           · 내부적으로 HashMap을 사용
           · 객체들을 순서없이 저장하고, 동일한 객체는 중복 저장하지 않음
           · 저장하려는 객체의 해시코드와 저장된 객체들의 해시코드를 비교해 같은 값이 없다면 객체 추가

       2) LinkedHashSet
          · 해시 테이블에 데이터 저장
          · 저장된 순서에 따라 순서가 결정된다.
          · 추가된 순서, 또는 가장 최근에 접근한 순서대로 접근 가능
       
       3) TreeSet
          · 정렬 기능이 추가되었고, 동일한 객체는 중복 저장하지 않음
          · 정렬된 순서대로 보관하며 정렬 방법을 지정할 수 있음
          · 범위 검색 작업에 효과적
         - 레드블랙트리 구조를 사용
          · HashSet보다 성능상 느리지만 삽입과 동시에 정렬할 때 사용
    * */
    public void testLinkedHashSet(){
        LinkedHashSet<String> set = new LinkedHashSet<String>();

        set.add("Java");
        set.add("Oracle");
        set.add("JDBC");
        set.add("HTML5");

        for(String txt : set){
            System.out.println(txt);
        }
    }
}
