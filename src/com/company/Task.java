package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Task {
   public static <T> T[] createArray(T param1, T param2, T param3, T[] emptyArr){
       emptyArr[0]=param1;
       emptyArr[1]=param2;
       emptyArr[2]=param3;
       return emptyArr;
   }
   public static <T1, T2> void doStuff(T1 param1, T2 param2){
       System.out.println(param1);
       System.out.println(param2);
   }

   public static <T1 extends Collection, T2 extends Collection> int getSumOfCollection(T1 coll1, T2 coll2){
       return coll1.size()+coll2.size();
   }
    public static  <T extends HasDescription>  T showMenuAndGetChoice(T[] menuItems){

        System.out.println("Welcome to the bank.\nMake a choice:\n-----");
        int i=1;
        for (T menuItem : menuItems){
            System.out.println(i+" "+menuItem.getDescription());
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        int choiceIndex = scanner.nextInt();
        //MenuItem.values() => [ADD_SALARY_ACCOUNT, ADD_SAVINGS_ACCOUNT, ..]
        return menuItems[choiceIndex-1];
    }
}

