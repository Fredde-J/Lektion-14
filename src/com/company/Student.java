package com.company;

import java.util.PrimitiveIterator;

public class Student {
    private String name="";
    private int age=0;
    Student(String name, int age){
        this.age=age;
        this.name=name;
    }
    public String toString(){return "name:" + name +"  age:"+ age;}
}
