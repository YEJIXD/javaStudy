package study.test.collection.map;

import java.util.HashMap;
import java.util.Iterator;

public class TestHashMap {
    /*
    * Map
      · key와 value로 구성된 엔트리 객체를 저장하며, 키와 값 모두 객체로, key는 중복될 수 없지만, value는 중복 가능하다.
      · 기존에 저장된 키로 값을 저장하면 덮어씌워진다.
      
      * 종류
        1) HashMap
          · Map 인터페이스를 구현한 대표 Map 컬렉션
          · key는 중복 저장을 허용하지 않으며, value은 중복을 허용
          · 동일한 key가 될 조건은 hashCode()의 리턴값이 같고, equals()메소드의 결과가 true여야 함

        2) Hashtable
          · HashMap과 동일한 내부 구조를 가지고 있음
          · HashMap과 달리 동기화된 메소드로 구성되어 있으며, 멀티 스레드 환경에서 동시에 구현된 메소드들을 실행할 수 없다.
    * */
    public void testMap(){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Apple");
        map.put(4, "Dandelion");
        map.put(3, "Com");
        map.put(2, "BlackBerry");

        Iterator<Integer> iterKey = map.keySet().iterator();

        while(iterKey.hasNext()){
            int key = iterKey.next();
            System.out.println("key : " + key + ", value : " + map.get(key));
        }
    }
}
