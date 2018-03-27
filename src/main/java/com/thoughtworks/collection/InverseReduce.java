package com.thoughtworks.collection;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> list=new ArrayList<>();
       while (2 <number){
           number=number-2;
           list.add(number);
       }
       return list;
        //throw new NotImplementedException();
    }
}
