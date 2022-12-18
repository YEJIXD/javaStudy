package org.network;

public class ThreadA implements Runnable{
    /*
      ☁ Thread 이름
        · Thread는 각각 자신의 이름을 갖고 있다.
        · 디버깅할 때, 어떤 스레드가 어떤 작업을 하는지 조사할 목적으로 사용된다.
        · 메인 스레드의 이름은 "main"
        · 생성한 스레드는 자동적으로 "Thread-n" 형식

      ☁ Thread 이름 직접 설정하기
        · Thread.setName("스레드명");

      ☁ Thread 이름 알아오기
        · Thread.getName();
    * */
    @Override
    public void run(){
        // 다른 스레드 클래스와 동시 처리하고 싶은 내용을 코드로 작성함
        for(int i = 0; i <= 500 ; i++){
            System.out.println("★");

            try{
                Thread.sleep(100);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
