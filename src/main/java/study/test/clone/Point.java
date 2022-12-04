package study.test.clone;

public class Point implements Cloneable{
    private int posX;
    private int posY;

    public Point(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    @Override           // clone 메소드 재정의
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*
      · clone() 함수를 재정의하려면 Cloneable 인터페이스를 상속받아야 한다.
        그렇지 않으면 CloneNotSupportException 예외가 발생하며 이에 따른 예외 처리구문도 필요하다.ㅅ
    * */

    /* posX,Y GETTER & SETTER */
    public int getPosX(){
        return posX;
    }

    public void setPosX(int posX){
        this.posX = posX;
    }

    public int getPosY(){
        return posY;
    }

    public void setPosY(int posY){
        this.posY = posY;
    }
}
