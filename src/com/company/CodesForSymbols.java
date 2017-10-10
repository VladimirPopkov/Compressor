package com.company;

import java.util.ArrayList;
import java.util.List;

public class CodesForSymbols {
    private int mCount = 0;
    List <Character> mListSymbols = new ArrayList<>();
    List <String> mListCodes = new ArrayList<>();

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

    public String getCod()
}
