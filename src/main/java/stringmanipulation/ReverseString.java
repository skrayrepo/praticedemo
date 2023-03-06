package stringmanipulation;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str = "santosh";
        String result ="";
        /*for (int i = str.length() -1; i > -1; i--) {
            result = result + str.charAt(i);
        }*/
        int j = str.length()-1;
        String result1 = recursionReverse(str,j,result);
        System.out.println(result1);
    }

    private static String recursionReverse(String str, int j,String result) {
        if(j < 0){
            return result;
        }
        result = result + str.charAt(j);
        j--;
        return recursionReverse(str,j,result);
    }




}
