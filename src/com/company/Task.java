package com.company;

public class Task {
   public static <T> T[] createArray(T param1, T param2, T param3, T[] emptyArr){
       emptyArr[0]=param1;
       emptyArr[1]=param2;
       emptyArr[2]=param3;
       return emptyArr;
   }
}

