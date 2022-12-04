package study.test.wrapper;
public class Main {
    public static void main(String[] args){
        int i = 123;
        double d = 3.14;
        WrapperEx wp = new WrapperEx();
        wp.printWrapper(i);
        wp.printWrapper(d);
    }
}
