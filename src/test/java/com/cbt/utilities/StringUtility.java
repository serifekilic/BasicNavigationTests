package com.cbt.utilities;

public class StringUtility {

    public static void main(String[] args) {



    }

    public static void verifyEquals(String expected, String actual){
        if(expected.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected: "+expected+"\t"+"Actual: "+actual);

        }
    }
}
