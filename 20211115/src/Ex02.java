public class Ex02 {
    public static void main(String[] args) {
        Friend f1 = new CmpFriend("aaa","1234","happy");
        Friend f2 = new UniFriend("bbb","4321","computer");

        f1.showInfo();
        f2.showInfo();

        Friend frs[] = new Friend[10]; //10명 담을수있음

        int frs_cnt = 0;
        frs[frs_cnt++] = new CmpFriend("a","1","A");
        frs[frs_cnt++] = new UniFriend("b","2","B");
        frs[frs_cnt++] = new CmpFriend("c","3","C");
        frs[frs_cnt++] = new UniFriend("d","4","D");
        frs[frs_cnt++] = new CmpFriend("e","5","E");
        frs[frs_cnt++] = new UniFriend("f","6","F");

        System.out.println("frs_cnt = " +frs_cnt);
//        frs[0].showInfo();
        for (Friend fr:frs) {
            fr.showInfo();
        }
    }
}
