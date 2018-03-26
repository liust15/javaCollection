package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        if (rightBorder < leftBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        int sum = 0;
        for (int i = leftBorder; i <= rightBorder; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
        // throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        if (rightBorder < leftBorder) {
            int temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        int sum = 0;
        for (int i = leftBorder; i <= rightBorder; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            int temp = arrayList.get(i) * 3 + 2;
            sum += temp;
        }
        return sum;
        //throw new NotImplementedException();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            int temp = 0;
            if (arrayList.get(i) % 2 != 0) {
                temp = arrayList.get(i) * 3 + 2;
                arrayList.set(i, temp);
            }
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            int temp = 0;
            if (arrayList.get(i) % 2 != 0) {
                temp = arrayList.get(i) * 3 + 5;
                sum += temp;
            }
        }
        return sum;
        // throw new NotImplementedException();
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        List<Integer> list = getOuShu(arrayList);
        int count = list.size();
        if (count % 2 != 0) {
            return list.get(count / 2);
        } else {
            int i = count / 2;
            return (list.get(i) + arrayList.get(i + 1)) / 2;
        }
        // throw new NotImplementedException();
    }



    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        double result = 0;
        List<Integer> list = getOuShu(arrayList);
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        result = result / list.size();
        return result;
        // throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println();
            if (arrayList.get(i) % 2 == 0 && arrayList.get(i) == specialElment) {
                return true;
            }
        }return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
      List<Integer> list=getOuShu(arrayList);
        return list;
       // throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
      List<Integer> listOushu=getOuShu(arrayList);
      List<Integer> listJiShu=getJiShu(arrayList);
        for (int i = listJiShu.size()-1; i >=0 ; i--) {
            listOushu.add(listJiShu.get(i));
        }
        return listOushu;
      //  throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <arrayList.size() -1; i++) {
            list.add((arrayList.get(i)+arrayList.get(i+1))*3);
        }
        return list;
       // throw new NotImplementedException();
    }
    //获取list中的偶数
    public List<Integer> getOuShu(List<Integer> arrayList) {
        int count = arrayList.size();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (arrayList.get(i) % 2 == 0) {
                list.add(arrayList.get(i));
            }
        }
        return list;
    }
    //获取list中的奇数
    public List<Integer> getJiShu(List<Integer> arrayList) {
        int count = arrayList.size();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (arrayList.get(i) % 2 != 0) {
                list.add(arrayList.get(i));
            }
        }
        return list;
    }
}
