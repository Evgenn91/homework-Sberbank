package dFourReturnModifiedMap;

import java.util.*;

/**
 * Напишите метод, который получает на вход Map<K, V> и возвращает Map,
 * где ключи и значения поменяны местами.
 * Так как значения исходной Map могут совпадать,
 * то тип ключа в Map будет уже не K, а Collection<K>: Map<V, Collection<K>>
 */

public class TestReturnModifMap<K,V> {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>(  );
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"two");
        map.put(4,"one");
        map.put(5,"three");
        map.put(6,"four");

        System.out.println(new TestReturnModifMap<Integer,String>().reverseMapKeyVal(map));

    }

    public Map<V, Collection<K>> reverseMapKeyVal(Map<K,V> map){
        Map<V, Collection<K>> resultMap = new HashMap<>( );
        for(K key: map.keySet()){
            if(resultMap.containsKey(map.get(key))){
                resultMap.get(map.get(key)).add(key);
            }
            else {
                Collection<K> list = new ArrayList<>(  );
                list.add(key);
                resultMap.put(map.get(key),list);
            }
        }
        return resultMap;

    }


}

