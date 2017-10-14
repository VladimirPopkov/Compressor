package com.company;

import java.util.ArrayList;
import java.util.List;

public class CodesForSymbols {
    private int mCount = 0;
    private List <Character> mListSymbols = new ArrayList<>();
    private List <String> mListCodes = new ArrayList<>();

    CodesForSymbols(String str){
        listOfSymbols(str);
        listOfCodes();
    }

    private void listOfSymbols(String aStr){
        for (int i = 0; i < aStr.length(); i++){
            for (int j = 0; j < i; j++){
                if (aStr.charAt(i) == aStr.charAt(j)){
                    mCount++;
                }
            }
            if (mCount == 0){
                mListSymbols.add(aStr.charAt(i));
            }
            mCount = 0;
        }
    }

    private void listOfCodes(){
        for (int i = 0; i < mListSymbols.size(); i++) {
            mListCodes.add(creationOfNull(Integer.toBinaryString((mListSymbols.size()-1)).length() -
                                                     Integer.toBinaryString(i).length()) +
                                                     Integer.toBinaryString(i));
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
        for (char symbol : mListSymbols){
            if (symbol == aSymbol){
                return mListCodes.get(mListSymbols.indexOf(symbol));
            }
        }
        return "N";
    }

    public char getSynmols(String aCod){
        for (String cod : mListCodes){
            if (cod.equals(aCod)){
                return mListSymbols.get(mListCodes.indexOf(cod));
            }
        }
        return 'N';
    }

    public void printListCods(){
        for (String cod : mListCodes)
        System.out.print(cod);
    }

    public void printListSymbols(){
        for (char symbol : mListSymbols)
            System.out.print(symbol);
    }
}
