package study.test.exception.sample;

public class ThrowEx {
    String str = null;

    public void printStr(int cnt) throws NullPointerException{
        if(str == null){
            System.out.println("str이 null이다.");
            throw new NullPointerException();
        }

        for(int i = 0; i < cnt; i++){
            System.out.println(str);
        }
    }
}
