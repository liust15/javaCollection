package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        for (int i = 0; i < array.size(); i++) {
            array.set(i, array.get(i) * 3);
        }
        return array;
    }

    public List<String> mapLetter() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            list.add(String.valueOf((char) (array.get(i).intValue() + 96)));
        }
        return list;
    }

    public List<String> mapLetters() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            int temp = array.get(i).intValue();
            if (temp > 26) {
                int temp2 = temp % 26;
                temp = temp / 26;
                if (temp2 == 0) {
                    temp = temp - 1;
                    temp2 = 26;
                }
                list.add(String.valueOf((char) (temp + 96)) + String.valueOf((char) (temp2 + 96)));
            } else {
                list.add(String.valueOf((char) (temp + 96)));
            }

        }
        return list;
    }

    public List<Integer> sortFromBig() {
        for (int i = 0; i < array.size(); i++) {
            for (int j = i+1; j < array.size(); j++) {
                if(array.get(i)<array.get(j)){
                    int temp=array.get(j);
                    array.set(j,array.get(i));
                    array.set(i,temp);
                }
            }
        }
        return array;
    }

    public List<Integer> sortFromSmall() {
        for (int i = 0; i < array.size(); i++) {
            for (int j = i+1; j < array.size(); j++) {
                if(array.get(i)>array.get(j)){
                    int temp=array.get(j);
                    array.set(j,array.get(i));
                    array.set(i,temp);
                }
            }
        }
        return array;
    }
}
