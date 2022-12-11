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


    /*
    * 동기화 된 컬렉션
       · 대부분의 컬렉션 클래스들은 싱글 스레드 환경에서 사용할 수 있도록 설계
       · Multi-Thread 환경에서 무결성을 보장하지 못함
       · Vector와 Hashtable은 동기화된 메서드로 구성되어 있어 멀티 스레드 환경에서 안전하게 사용 가능
       · 싱글 스레드 환경에 맞게 설계된 컬렉션 객체들을 동기화된 메소드로 래핑할 수 있도록 Collections가 메소드들을 제공한다.


    * Collections의 동기화 래핑 메소드
       · List<T>    : synchronizedList(List<T> list)    : List를 동기화된 List로 return
       · Map<K, V>  : synchronizedMap(Map<K, V> map)    : Map을 동기화된 Map으로 return
       · Set<T>     : synchronizedSet(Set<T> set)       : Set을 동기화된 Set으로 return

    * Collections의 동기화 객체 생성
       · List<T> syncList = Collections.synchronizedList(list);
       · Map<K, V> syncMap = Collections.synchronizedMap(map);
       · Set<T> syncSet = Collections.synchronizedSet(set);
       *     * */
}