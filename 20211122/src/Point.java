public class Point implements Cloneable {
    private int xpos;
    private int ypos;

    public void setXpos(int xpos) { //세터이용 :값바꿀수있음
        this.xpos = xpos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    public Point(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }

    //오버라이드 메서드 클론
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Point{" +
                "xpos=" + xpos +
                ", ypos=" + ypos +
                '}';
    }
}
