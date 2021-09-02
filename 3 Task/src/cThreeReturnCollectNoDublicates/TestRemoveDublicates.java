package cThreeReturnCollectNoDublicates;

import java.util.*;

/**
 *Напишите метод, который на вход получает коллекцию объектов,
 * а возвращает коллекцию уже без дубликатов.
 * <T> Collection<T> removeDuplicates(Collection<T> collection)
 */

public class TestRemoveDublicates <T> {
    public static void main(String[] args) {
        List<String> listWithDubl = new ArrayList<>();
        listWithDubl.add("one");
        listWithDubl.add("two");
        listWithDubl.add("two");
        listWithDubl.add("three");
        listWithDubl.add("four");
        listWithDubl.add("three");

        System.out.println(new TestRemoveDublicates<String>().removeDublicated(listWithDubl) );

    }

    public Collection<T> removeDublicated(Collection<T> listWithDubl){
        Collection<T> resultSet = new HashSet<>(listWithDubl);
        return resultSet;
    }

}
