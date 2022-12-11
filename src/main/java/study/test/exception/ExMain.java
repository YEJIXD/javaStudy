package study.test.exception;

import study.test.exception.sample.CheckEven;
import study.test.exception.sample.EvenException;

public class ExMain {
    public static void main(String[] args){
        CheckEven ce = new CheckEven();

        int number1 = 100;
        int number2 = 99;

        try {
            System.out.println(ce.printEven(number1));
            System.out.println(ce.printEven(number2));
        } catch (EvenException e){
            e.printStackTrace();
        }
    }
}
