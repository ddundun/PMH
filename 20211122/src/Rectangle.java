public class Rectangle implements Cloneable{
    Point upperLeft;
    Point lowerRight;

    public Rectangle(int x1,int y1, int x2, int y2) {
        this.upperLeft = new Point(x1,y1);
        this.lowerRight = new Point(x2,y2);
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        이렇게하면 얕은복사
//        return super.clone();
//    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
//        Rectangle 대신 Object ->    r2= (Rectangle)r1.clone();
//        Rectangle 쓰면  r2= r1.clone(); 가능
        Rectangle r1 = (Rectangle) super.clone();

        r1.upperLeft = (Point) upperLeft.clone();
        r1.lowerRight = (Point) lowerRight.clone();

        return r1;
    }

}
