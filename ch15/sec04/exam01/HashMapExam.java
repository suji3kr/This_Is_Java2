package ch15.sec04.exam01;

import java.util.Map.Entry;
import java.util.*;

public class HashMapExam {
    public static void main(String[] args) {
        //map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        //객체 저장
        map.put("신용권",85);
        map.put("홍길동",90);
        map.put("동장군",80);
        map.put("홍길동",95);

        //키로 값얻기
        String key ="홍길동";
        int value = map.get(key);
        System.out.println(key+ ":"+value);
        System.out.println();


        //키 set 컬렉션을 얻고, 반복해서 키와 값을 얻기

        Set<String> keyset = map.keySet();
        Iterator<String> keyIterator = keyset.iterator(); //키를 반복하기위해 반복자 얻음
        while (keyIterator.hasNext()){
            String k= keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + ":"+ v);
        }
        System.out.println();

        //set 컬렉션을 얻고, 반복해서 키와값을 얻기

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>>entryIterator=entrySet.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k= entry.getKey();
            Integer v =entry.getValue();
            System.out.println(k + ":"+ v);
        }
        System.out.println();

        //키로 엔트리 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수  :" + map.size());
        System.out.println();
    }

}
