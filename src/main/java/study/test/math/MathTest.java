package study.test.math;
public class MathTest {
    /*
     · 숫자 계산에 흔히 사용되는 수학적 기능을 가지는 메소드를 제공하는 클래스
     · 모든 메소드들이 정적 메소드로 정의되어 객체를 생성하지 않고 사용한다.

      · static int abs(int num)                         - 절대 값을 반환
      · static double acos(double num)                  - arc cosine을 반환
      · static double asin(double num)                  - arc sine을 반환
      · static double atan(double num)                  - arc tangent를 반환
      · static double cos(double num)                   - cosine을 반환
      · static double sin(double num)                   - sine을 반환
      · static double tan(double num)                   - tangent를 반환
      · static double ceil(double num)                  - 올림 값(ceiling)을 반환
      · static double floor(double num)                 - 내림 값을 반환
      · static double exp(double power)                 - 지정된 power만큼 e의 제곱된 값을 반환
      · static double pow(double num, double power)     - num을 power만큼 제곱한 값을 반환
      · static double random()                          - 0.0(포함)과 1.0(미포함) 사이의 난수를 반환
      · static double sqrt(double num)                  - 양수만 가능한 num의 제곱근을 반환
    * */
    public void printMath(){
        System.out.println("abs(-10) : " + Math.abs(-10));
        System.out.println("ceil(3.7) : " + Math.ceil(3.7));
        System.out.println("floor(3.7) : " + Math.floor(3.7));
        System.out.println("exp(3.3) : " + Math.exp(3.3));
        System.out.println("pow(2.1, 2) : " + Math.pow(2.1, 2));
        System.out.println("random() : " + Math.random());
    }
}
