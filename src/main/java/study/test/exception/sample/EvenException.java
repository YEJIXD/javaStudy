package study.test.exception.sample;

public class EvenException extends Exception{
    // > CheckEven > ExMain
    private Integer number = null;

    public EvenException (int number){
        this.number = number;
    }

    @Override
    public String getMessage(){
        if(number == null){
            return "숫자가 아닙니다.";
        }else {
            return Integer.toString(number) + "는 짝수가 아닙니다.";
        }
    }
}
