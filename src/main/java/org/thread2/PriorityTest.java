package org.thread2;

/*
 * Thread 상태와 Scheduling
   ☁ 스레드 생명주기
     · 스레드 객체의 생성부터 종료까지를 스레드 생명주기(Thread Life Cycle)이라고 부르며 5가지로 나눈다.
        · NEW                        : 스레드가 생성되고 아직 start()가 호출되지 않은 상태
        · RUNNABLE                   : 실행 중 또는 실행 가능한 상태
        · BLOCKED                    : 동기화 블럭에 의해 일시정지된 상태
        · WAITING, TIMED_WAITING     : 스레드의 작업이 종료되지 않았지만 실행가능하지 않은 일시정지 상태, TIMED_WATING의 경우 일시정지 시간이 지정된 경우
        · TERMINATED                 : 스레드의 작업이 종료된 상태

   ☁ Thread Scheduling
     · 자바의 스레드 스케줄링은 우선순위(Priority) 방식과 순환 할당(Round-Robin) 방식을 사용한다.
     · 우선 순위 방식 : 우선순위가 높은 스레드가 실행 상태를 더 많이 가지도록 스케줄링 하는 것
     · 순환 할당 방식 : 시간 할당량을 정해서 스레드마다 정해진 시간만큼 작업시간을 주는 것

     · 우선순위 스케줄링은 코드를 이용해 제어할 수 있고, 순환 할당 스케줄링은 JVM에 의해 자동으로 정해진다.

   ☁ Thread 우선순위
     · Thread 클래스가 가지고 있는 priority 멤버변수를 이용해 우선순위를 지정한다.
     · 스레드 우선순위는 int형 정수값 1 ~ 10의 값을 가지며 기본값은 5이다.
     · 스레드의 우선순위는 setPriority() 메소드를 이용해 지정할 수 있고, getPriority() 메소드를 이용해 확인할 수 있다.
     · 단, 멀티코어 환경에서 OS마다 다른 방식으로 스케줄링을 하므로 반드시 자바 어플리케이션이 지정된 우선순위에 맞게 작업할 것이라고 기대할 수 없다.

     · Thread 클래스의 우선순위 상수
       · public static final int MAX_PRIORITY = 10;     // 최고 우선순위
       · public static final int MAX_PRIORITY = 5;     // 기본 우선순위
       · public static final int MAX_PRIORITY = 1;     // 최저 우선순위
* */
public class PriorityTest extends Thread{
    //Field
    private String threadName;   // thread 이름 기억하기 위해서 작성

    // Constructor
    public PriorityTest(String threadName) {
        this.threadName = threadName;
    }

    // Method
    @Override
    public void run(){
        // thread 이름 출력 3번 반복하기
        for(int i = 0; i < 3; i++){
            System.out.println(threadName + "가 구동됨");
        }
    }

    public static void main(String[] args){
        // 우선 순위 테스트용
        Thread t1 = new PriorityTest("제일 높은 Thread");
        Thread t2 = new PriorityTest("보통 Thread");
        Thread t3 = new PriorityTest("제일 낮은 Thread");

        t1.setPriority(Thread.MAX_PRIORITY);        // 10
        t2.setPriority(Thread.MAX_PRIORITY);        // 5
        t3.setPriority(Thread.MAX_PRIORITY);        // 1

        t1.start();
        t2.start();
        t3.start();
    }
}
