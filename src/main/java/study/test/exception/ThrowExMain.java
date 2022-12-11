package study.test.exception;

import study.test.exception.sample.ThrowEx;

public class ThrowExMain {
    public static void main(String[] args) throws NullPointerException{
        ThrowEx ex = new ThrowEx();
        ex.printStr(5);
    }
}
