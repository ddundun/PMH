public class Friend {
    protected String name;
    protected String tel;

    public Friend(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
    public void showInfo() {} //요기다가 이거 써줘야 f1,f2.showinfo사용가능
    public String getName() {
        return name;
    } //private사용시 필요 ->게터세터
    public void setName(String name) {
        this.name = name;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
}
class UniFriend extends Friend {
    private String major;

    public UniFriend(String name, String tel, String major) {
        super(name, tel);
        this.major = major;
    }
    public void showInfo() {
//        System.out.println("name = "+getName()+"tel = "+getTel()+"major = "+major);
        System.out.println("UniFrined name = "+name+" tel = "+tel+" major = "+major);
    }
}

class CmpFriend extends Friend {
    private String department;

    public CmpFriend(String name, String tel, String department) {
        super(name, tel);
        this.department = department;
    }
    public void showInfo() {
        System.out.println("CmpFrined name = "+name+" tel = "+tel+" department "+department);
    }
}