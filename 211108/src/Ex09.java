class MyBox { //게터 생성자 투스트링
    private String Name;
    private int boxnum;

    public int getBoxnum() {
        return boxnum;
    }

    public MyBox(String name,int boxnum) { //생성자 :name 과 boxnum받ㅇ나서 클래스..?
        Name = name;
        this.boxnum= boxnum;
    }

    @Override
    public String toString() {
        return "MyBox{" +
                "Name='" + Name + '\'' +
                ", boxnum=" + boxnum +
                '}';
    }
}
public class Ex09 {
    public static void main(String[] args) {
        MyBox[] mybox = new MyBox[3];
        mybox[0] = new MyBox("Coffee",101);
        mybox[1] = new MyBox("Computer",202);
        mybox[2] = new MyBox("Dress",303);

        for(MyBox mb:mybox) {
            if (mb.getBoxnum() ==303)
                System.out.println(mb);
        }


    }
}
