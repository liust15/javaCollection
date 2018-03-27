package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;

    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            Integer[] ele = array[i];//使用强制转化
            for (Integer str : ele) {
                result.add(str);
            }
        }
        return result;
        //  throw new NotImplementedException();
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            Integer[] ele = array[i];//使用强制转化
            for (Integer str : ele) {
                if(!result.contains(str)){
                    result.add(str);
                }

            }
        }
        return result;
    }
}
