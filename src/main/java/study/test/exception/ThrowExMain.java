package study.test.exception;

public class ThrowExMain {
    public static void main(String[] args) throws NullPointerException{
        ThrowEx ex = new ThrowEx();
        ex.printStr(5);
    }
}
