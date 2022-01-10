package com.reinel.javatest.util;

public class StringUtil {

    public static String repeat(String str , int times){

        if(times < 0){
            throw new IllegalArgumentException("negative times not allowed");
        }

        String result = "";
        for (int i = 0; i < times; i++) {
            result = result + str;
        }

        return result;
    }


    public static boolean isEmpty(String string){
        if (string == null || string.length() == 0 || string.trim().length() == 0) return true;
        return false;
    }

}
