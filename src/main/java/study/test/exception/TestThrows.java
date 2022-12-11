package study.test.exception;

import java.io.IOException;

public class TestThrows {
    /*
     · 예외 처리 미루기(throws)
        · 해당 메소드 안에서 발생한 예외 처리에 대한 책임을 메소드를 호출한 쪽으로 떠넘길 수 있다.
        · 컴파일 시에는 문제가 없지만 예외 발생 시에 호출하는 코드에서 예외를 처리하지 못한다면 프로 그램은 비정산 종료를 하게 된다.
        · 호출하는 입장에서 선언된 예외를 보고 발생할 수 있는 예외를 미리 파악할 수 있고, 또한 반드시 처리해야 하므로 프로그램을 견고하게 한다.
    * */

    public static void main(String[] args){
        IOSample test = new IOSample();

        try {
            test.input();
            test.output();
        } catch(IOException e){
            e.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
