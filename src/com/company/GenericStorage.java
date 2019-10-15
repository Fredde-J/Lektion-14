package com.company;

import java.util.ArrayList;

public class GenericStorage <T1,T2> {
    private T1 value1;
    private T2 value2;
    private T1[] array;
    private int index=0;
    GenericStorage(T1 value1, T2 value2){
        this.value1=value1;
        this.value2=value2;
    }

    GenericStorage(int size){
        array=(T1[]) new Object[size];
    }

    public T1 getValue1() {
        return value1;
    }

    public T2 getValue2() {
        return value2;
    }
    public void addToArray(T1 t1){
        if(index==array.length){
            System.out.println("You have exceeded max size of the array, no more space!");
            return;
        }
        array[index]= t1;
        index++;

    }
    public T1 getT1(int num){
        if (num<0||num>=index){
            System.out.println("No element at this index");
        }
        return array[num];
    }

}
