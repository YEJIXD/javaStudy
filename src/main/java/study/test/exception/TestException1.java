package study.test.exception;

/*
* Exception
   · 프로그래밍 오류(에러)는 발생 시점에 따라 컴파일 타임 에러, 런타임 에러, 시스템 에러 > 3가지로 구분
      · 컴파일 에러 : 소스 컴파일 시에 발생, 주로 문법적 에러
                    > 에러가 발생된 소스 코드를 수정하여야 한다.
      · 런타임 에러 : 프로그램 실행 도중에 발생하며, 잘못된 값의 입력 등 수행할 수 없는 작업을 시도할 경우에 발생
                    > 소스 코드로 에러 발생 구문을 수정하여야 한다.
      · 시스템 에러 : 컴퓨터 시스템 상에 발생하는 오동작에 의한 에러로 정정, 메모리 부족 등 소스 코드로는 해결할 수 없는 장비 또는 운영체제 관련 에러
                    > 소스 코드 수정으로는 해결할 수 없다.

   · Java는 런타임 에러를 Error와 Exception으로 구분
      · Error     : 프로그램 소스 코드로 해결할 수 없는 경우 (복구할 수 없는 심각한 경우)
      · Exception : 소스 코드로 해결할 수 있는 에러 (발생하더라도 해결할 수 있음)
       
   · Java는 예외를 크게 2가지로 구분
      · RuntiemException (그 후손들은 Unchecked Exception) : 소스 코드상에서 처리하지 않아도 되는 예외
      · Checked Exception : 반드시 소스 ㅋ드로 예외 처리(Exception Handling)를 해줘야 하는 예외

   · 예외 처리(Exception Handling) 구문
     1) 예외를 직접 처리할 때 사용하는 try ~ catch ~ finally
     2)
* */
public class TestException1 {
    public static void main(String[] args){
        int arr[] = new int[3];
        
        try{
            for(int i = 0; i<arr.length; i++){
                arr[i] = i;
            }
            
            for(int i = 0; i < arr.length; i++){
                System.out.println("arr[i] : " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("예외 : 사용불가 인덱스 접근");
            e.printStackTrace();
        } finally {
            System.out.println("반드시 수행하는 코드");
        }
    }
}
