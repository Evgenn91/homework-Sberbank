package bTwoFrequencyDictionaryLetters;

import java.util.*;

public class DictionLett {
    //массив букв текста, который необходимо обработать
    private char[] listChars;
    //список букв текста, где ключ это символ, а значение - колличество раз встречаемое в тексте
    private Map<Character, Integer> mapLetters;


    public DictionLett(String text) {
        this.listChars = text.toCharArray();
        this.mapLetters = new HashMap<>( );
    }

    public void dictMethod(){
        //инкрементируем значение по заданному ключу
        //а если в мап нету такого символа то добавим его в мап
        for(Character letter: listChars){
            if ((int) letter>64 && (int)letter<91 || letter>96 && letter<123){
                if(mapLetters.containsKey(letter)){
                    mapLetters.put(letter, mapLetters.get(letter) + 1);
                }
                else mapLetters.put(letter, 1);
            }
        }
        printMap();
    }

    //метод вывода на экран результата
    private void printMap(){
        for(Character key: mapLetters.keySet()){
            System.out.println(key + ": " + mapLetters.get(key));
        }
    }


    public char[] getListChars() {
        return listChars;
    }

    public Map<Character, Integer> getMapLetters() {
        return mapLetters;
    }

    @Override
    public String toString() {
        return "DictionLett{" +
                "listChars=" + Arrays.toString(listChars) +
                ", mapLetters=" + mapLetters +
                '}';
    }


}
