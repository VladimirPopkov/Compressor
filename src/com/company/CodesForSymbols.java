package com.company;

import java.util.ArrayList;
import java.util.List;

public class CodesForSymbols {
    private List <Character> mListSymbols = new ArrayList<>();
    private List <String> mListCodes = new ArrayList<>();

    CodesForSymbols(String str){
        listOfSymbols(str);
        listOfCodes();
    }

    private void listOfSymbols(String aStr){
        for (int i = 0; i < aStr.length(); i++){
            if (!mListSymbols.contains(aStr.charAt(i))){
                mListSymbols.add(aStr.charAt(i));
            }
        }
    }

    private void listOfCodes(){
        for (int i = 0; i < mListSymbols.size(); i++) {
            String tmp = Integer.toBinaryString(i);
            String nulls = creationOfNull(Integer.toBinaryString((mListSymbols.size()-1)).length() -
                    tmp.length());
            mListCodes.add(nulls + tmp);
        }
    }

    private String creationOfNull(int aDifference){
        String tmp = "";
        for (int i = 0; i < aDifference; i++){
            tmp = tmp + "0";
        }
        return tmp;
    }

    public String getCod(char aSymbol){
        int pos = mListSymbols.indexOf(aSymbol);
        if (pos != -1) {
            return mListCodes.get(pos);
        } else {
            return null;
        }
    }

    public Character getSynmols(String aCod){
        int pos = mListCodes.indexOf(aCod);
        if (pos != -1) {
            return mListSymbols.get(pos);
        } else {
            return null;
        }
    }

    public void printListCods(){
        for (String cod : mListCodes)
        System.out.print(cod + " ");
    }

    public void printListSymbols(){
        for (char symbol : mListSymbols)
            System.out.print(symbol);
    }

    public String encode(String aStr){
        StringBuilder builder = new StringBuilder();
        for (int i =0; i < aStr.length(); i++){
            builder.append(getCod(aStr.charAt(i)));
        }
        return builder.toString();
    }
}
