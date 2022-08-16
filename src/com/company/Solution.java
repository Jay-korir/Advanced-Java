package com.company;


public class Solution {


    public static String repeatSeparator(String word, String sep, int count) {
       String result = "";
       for (int i =0 ; i < count; i++) {
           if (i < count-1)
               result += word + sep;
           else
               result += word;
       }
       return result;
   }
    public static boolean xyBalance(String str) {
        boolean balance = false;
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == 'y')
                balance = true;

            if(str.charAt(i) == 'x' && !balance)
                return false;
        }

        return true;
    }
    public static boolean prefixAgain(String str, int n){
       String prefix = str.substring(0,n);
       for (int i=n; i<str.length()-n;i++){
           if (str.substring(i,i+n).equals(prefix));
           return  true;
       }
       return false;
    }
    public static String zipZap(String str) {
        String finalS = "";

        for (int i = 0; i < str.length(); i++) {

            if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                finalS += "zp";
                i = i + 2;
            } else {
                finalS += str.charAt(i);
            }
        }
        return finalS;
    }



}
