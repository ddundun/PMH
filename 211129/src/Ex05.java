import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* list, set, map : 기억해야함
* list ... 반복자.. 향상된 for.. 
* 배열기반의 자료형타입들
* 0번째 1번째 2번째..  중복허용
*
* set... 반복자.. 향상된 for.. 
* 주소값 비교.. 내용비교.. equals..
* 중복을 허용하지 않는 자료들을 넣으면 된다.
*
* map... 키와 값이 쌍을 이루고있음
* python에서 dict와 동일한 자료형
* 반복자 NO, Keyset함수 사용해야함
* key는 중복허용x, 값은 중복허용
* */


public class Ex05 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"aaa");
        map.put(2,"bbb");
        map.put(3,"ccc");

        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
//     ->키 직접던져서 값얻기
//        System.out.println(map[1]);

//        for (??: map)

        
//        keyset이용하기
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(map.get(key));
        }
    }
}
