package study.test.random;

import java.util.Random;

public class RandomEx {
    /*
     · Java에서 난수를 발생시키는 방법은 2가지
       1) Math 클래스의 random90 메소드를 이용하는 방법
       2) Random 클래스를 이용하는 방법

     · Math.random()은 정적 메소드
        > 객체를 생성하지 않고 편하게 사용할 수 있지만, double 형태의 난수만 발생시킬 수 있다.

     · Random 클래스
        > 객체를 생성해야하는 불편함이 있지만, int, long, float, double, boolean 형의 난수를 발생시킬 수 있다.
        
        · Random 클래스의 메소드
          · int nextInt()           : int형 범위 안의 난수 발생
          · int nextInt(int n)      : 0부터 정수 n까지의 난수 발생
          · int nextBoolean()       : 무작위로 true 또는 false 반환
          · int nextFloat()         : float 범위의 난수 발생
          · int nextDouble()        : double 범위의 난수 발생
    * */
    public void testRandom(){
        Random r = new Random();

        System.out.println("nextInt() : " + r.nextInt());               // -2^31 ~ 2^31-1 사이의 난수
        System.out.println("nextInt(100) : " + r.nextInt(100));  // 0~100 사이의 난수
        System.out.println("nextBoolean() : " + r.nextBoolean());       // true 또는 false   
        System.out.println("nextDouble() : " + r.nextDouble());         // double형 표현 범위의 난수
        System.out.println("nextFloat() : " + r.nextFloat());           // float형 표현 범위의 난수
    }
}
