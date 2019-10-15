package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Integer emptyIntArr[] = new Integer[3];
        Integer resultInt[] = Task.createArray((Integer)1,(Integer)2,(Integer)3, emptyIntArr);
        System.out.println(resultInt[0] + " " + resultInt[1]+ " " + resultInt[2]);

        String emptyStringArr[] = new String[3];
        String resultString[] = Task.createArray("Hello","Cool","World", emptyStringArr);
        System.out.println(resultString[0] + " " + resultString[1]+ " " + resultString[2]);
//-------------------------------------------------------------------------------------------------
        Task.doStuff(1,"hello");
//-------------------------------------------------------------------------------------------------
        ArrayList<String> myString = new ArrayList<>();
        myString.add("hello");
        myString.add("World");

        Stack<Integer> ints = new Stack<>();
        ints.push(1);
        ints.push(4);
        ints.push(8);

        System.out.println(Task.getSumOfCollection(myString, ints));
//-------------------------------------------------------------------------------------------------
       /* MainMenu menuchoice=Task.showMenuAndGetChoice(MainMenu.values());
        CustomerMenu customerMenu=Task.showMenuAndGetChoice(CustomerMenu.values());
        System.out.println(menuchoice);
        System.out.println(customerMenu);*/
 //-------------------------------------------------------------------------------------------------
        GenericStorage<Student,String> genericStorage = new GenericStorage(new Student("kalle",25),"historia");
        System.out.println(genericStorage.getValue1());
        System.out.println(genericStorage.getValue2());

        GenericStorage<String,String> genericStorage1 = new GenericStorage<>(2);
        genericStorage1.addToArray("klas");
        genericStorage1.addToArray("sven");
        genericStorage1.addToArray("gunnar");

        System.out.println(genericStorage1.getT1(1));
    }




}
