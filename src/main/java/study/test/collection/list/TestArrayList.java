package study.test.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    /*
    * Collection Framework
      - 객체를 그룹 단위의 데이터로 저장하는 기본적인 자료구조들의 모음
      - 다수의 데이터를 그룹으로 묶어 관리할 수 있으므로  프로그래밍이 보다 편리해지고, 코드의 재사용성을 늘릴 수 있다.

    - 기본 생성자로 ArrayList 객체를 생성
      List<기본타입> list = new ArrayList<기본타입>();

    - 고정된 객체들로 구성된 list를 생성하고자 할 때 사용
      List<String> list = ArrayList.asList("Apple", "Banana", "Orange");
    * */
    private List<String> list = new ArrayList<String>();

    public void testArrayList(){
        list.add("Red");                            // [Red]
        list.add("Orange");                         // [Red, Orange]
        list.add(1, "Yellow");        // [Red, Yellow, Orange]
        printList();

        list.remove(2);                       // [Red, Yellow]
        printList();

        list.clear();                               // []
        System.out.println("List가 비었나요 ? " + list.isEmpty());   // true
    }

    public void printList(){
        System.out.println("list : " + list);
    }
}