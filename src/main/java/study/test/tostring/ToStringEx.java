package study.test.tostring;

public class ToStringEx {
    public void testToString(){
        Point point = new Point(10, 20);

        System.out.println(point);
        System.out.println(point.toString());
    }
}

class Point {
    int posX;
    int posY;

    public Point(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public String toString(){
        return "point 객체 : (" + posX + ", " + posY + ")";
    }
}
