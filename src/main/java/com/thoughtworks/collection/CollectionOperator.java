package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> resultList = new ArrayList<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                resultList.add(i);
            }
        } else {
            for (int i = left; i >= right; i--) {
                resultList.add(i);
            }
        }
        return resultList;
        // throw new NotImplementedException();
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> resultList = new ArrayList<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                if (i % 2 == 0) {
                    resultList.add(i);
                }

            }
        } else {
            for (int i = left; i >= right; i--) {
                if (i % 2 == 0) {
                    resultList.add(i);
                }
            }
        }
        return resultList;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (temp % 2 == 0) {
                resultList.add(temp);
            }

        }
        return resultList;
        // throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
        //  throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i]==secondArray[j]){
                    list.add(firstArray[i]);
                }
            }
        }
        return list;
        //    throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
       List<Integer> list=new ArrayList<>();
       list.addAll(Arrays.asList(firstArray));
        for (int i = 0; i <secondArray.length ; i++) {
            if(!list.contains(secondArray[i])){
                list.add(secondArray[i]);
            }
        }
        return list;
        // throw new NotImplementedException();
    }
}
