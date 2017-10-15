package com.company;


public class Main {

    public static void main(String[] args) {
        String str = "qqwerwteyfafggggadfgafgkl,.yoooo;.zxcvy";
        CodesForSymbols aaa = new CodesForSymbols(str);
        System.out.println(aaa.getCod('w'));
        System.out.println(aaa.getSynmols("010"));
        aaa.printListCods();
        System.out.println();
        aaa.printListSymbols();
        System.out.println();
        System.out.println(aaa.encode(str));
    }
}
