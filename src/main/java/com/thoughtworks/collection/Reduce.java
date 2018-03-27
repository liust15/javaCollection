package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) > arrayList.get(i + 1)) {
                arrayList.set(i + 1, arrayList.get(i));
            }
        }
        return arrayList.get(arrayList.size() - 1);
    }

    public double getMinimum() {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) < arrayList.get(i + 1)) {
                arrayList.set(i + 1, arrayList.get(i));
            }
        }
        return arrayList.get(arrayList.size() - 1);
    }

    public double getAverage() {
        int count = arrayList.size();
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arrayList.get(i);
        }
        return sum / count;
    }

    public double getOrderedMedian() {
        int count = arrayList.size();
        double median = 0;
        if (count % 2 == 0) {
            median = ((double) (arrayList.get(count / 2) + arrayList.get(count / 2 - 1))) / 2;
        } else {
            median = arrayList.get(count / 2);
        }

        return median;
        //  throw new NotImplementedException();
    }

    public int getFirstEven() {
        for (int item : arrayList){
            if(item%2==0) {
                return item;
            }}return 0;
       // throw new NotImplementedException();
    }

    public int getIndexOfFirstEven() {

        for (int i = 0; i <arrayList.size() ; i++) {

            if(arrayList.get(i)%2==0) {
                return i;
            }
        }return 0;
        //throw new NotImplementedException();
    }

    public boolean isEqual(List<Integer> arrayList) {
        if(arrayList.size()!=this.arrayList.size()){
            return false;
        }else {
            for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i)!=this.arrayList.get(i)){
                    return false;
                }
            }
            return true;
        }
       // return Arrays.equals(arrayList, this.arrayList);
        //throw new NotImplementedException();
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink<Integer>  singleLink) {
        for (Integer item : arrayList) {
            singleLink.addTailPointer(item);
        }
        int count =arrayList.size();
        if (count% 2 == 0) {
            return ((double) (singleLink.getNode(count / 2) + singleLink.getNode(count / 2 + 1)) / 2);
        } else {
            return Double.valueOf(singleLink.getNode(count / 2 + 1));
        }
    }

    public int getLastOdd() {
        for (int i = arrayList.size()-1; i >=0 ; i--) {
            if(arrayList.get(i)%2!=0) {
                return arrayList.get(i);
            }
        }return 0;
    }

    public int getIndexOfLastOdd() {

        for (int i = arrayList.size()-1; i >=0 ; i--) {
            if(arrayList.get(i)%2!=0) {
                return i;
            }
        }return 0;
        //throw new NotImplementedException();
    }
}
