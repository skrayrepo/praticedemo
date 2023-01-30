package stringmanipulation;

public class MixedStringPalindrome {
    public static void main(String[] args) {
        //String str = "A man, a plan, a canal: Panama";
        String str = "race a car";
        boolean isPolindrome = palindrome(str);
        System.out.println(isPolindrome);
    }

    private static boolean palindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;
        while(start < end){
            while(start < end && !Character.isAlphabetic(str.charAt(start))){
                start++;
            }
            while(start < end && !Character.isAlphabetic(str.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))){
                isPalindrome = false;
            }
            start++;
            end--;
        }
        return isPalindrome;
    }
}
