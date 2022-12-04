package study.test.hashcode;

public class GetHashCodeEx {
    /*
     · hashCode()
     · 객체가 할당받은 메모리에 매핑되는 유일한 정수를 해시값으로 반환
     · memory 사용의 안정성을 위해 프로그램이 메모리에 직접 접근하는 것을 막고 있으며
       new 연산자를 이용해 메모리를 할당할 때 메모리에 접근할 수 있는 코드인 해시코드를 생성한다.
    * */
    public void testHashCode(){
        Point point = new Point(10, 20);

        System.out.println(point.hashCode());
    }
}

class Point {               // 객체를 선언하여 hashCode 재정의
    int posX;
    int posY;

    public Point(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public int hashCode(){      // hashCode 메서드 재정의
        return super.hashCode();
    }
    /*
     · Object Class에 정의된 toString()
     · toString()을 overLoading 해서 사용하지 않으면 클래스 이름과 16진수 hashCode를 반환한다.
    * */
    public String toString() {
        return getClass().getName() + "@"
                + Integer.toHexString(hashCode());
    }
}