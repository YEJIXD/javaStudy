package study.test.collection.list;

import java.util.LinkedList;

public class TestLinkedList {
    /*
    * LinkedList
      - 양방향 포인터 구조로 데이터의 삽입, 삭제가 빈번할 경우 빠른 성능을 보장
      - ArrayList와 사용 방법은 똑같지만, 내부 구현이 인접 참조 링크를 체인처럼 관리
      - ArrayList는 객체가 중간 index에 삭제되거나 삽입될 때, 뒤의 객체들의 index가 변경되지만
        LinkedList는 중간 index의 객체가 변경되더라도 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않음

      - 삭제와 삽입이 빈번히 일어나는 경우, ArrayList보다 LinkedList가 좋은 성능을 발휘한다.
      - Stack, Queue, 양방향 Queue 등을 만들기 위한 용도로 쓰임
    * */
    
    public TestLinkedList(){
        
    }
    
    public void testLinkedList(){
        LinkedList<String> list = new LinkedList<String>();
        
        list.add("포도");         // [포도]
        list.add("딸기");         // [포도, 딸기]
        list.add("복숭아");       // [포도, 딸기, 복숭아]
        list.add("키위");         // [포도, 딸기, 복숭아, 키위]
        printList(list);
        
        list.set(0, "오렌지");     // [오렌지, 딸기, 복숭아] > set으로 0번째 index 변경
        printList(list);

        list.remove(1);     // [오렌지, 딸기, 복숭아] > remove로 1번째 index 삭제
        list.remove("키위");   // "키위" 데이터 삭제
        printList(list);
    }
    
    public void printList(LinkedList<String> list){
        // 반복문을 이용한 LinkedList 출력
        for(int i = 0; i < list.size() ; i++){
            String str = "[" + list.get(i) + "]";
            System.out.print(str);
        }
        System.out.println();
    }
}
