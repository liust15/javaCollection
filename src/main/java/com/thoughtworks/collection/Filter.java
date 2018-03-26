package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                list.add(array.get(i));
            }
        }
        return list;
        // throw new NotImplementedException();
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 3 == 0) {
                list.add(array.get(i));
            }
        }
        return list;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < firstList.size(); i++) {
            for (int j = 0; j < secondList.size(); j++) {
                if (firstList.get(i) == secondList.get(j)) {
                    list.add(firstList.get(i));
                    break;
                }
            }
        }
        return list;
    }

    public List<Integer> getDifferentElements() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (!list.contains(array.get(i))) {
                list.add(array.get(i));
            }
        }
        return list;
    }
}