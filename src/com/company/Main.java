package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String str = "qqwerwteyy";
        CodesForSymbols aaa = new CodesForSymbols(str);
        System.out.println(aaa.getCod('w'));
        System.out.println(aaa.getSynmols("010"));
        aaa.printListCods();
        System.out.println();
        aaa.printListSymbols();
    }
}
