package stringmanipulation;

public class StringPolydrome {
    public static void main(String[] args) {
        String name = "abcdcba";
        //check String name is polidrome or not
        int start =0;
        int end =name.length() -1;
        boolean isPoli = true;
        while(start < end){
            if(name.charAt(start) != name.charAt(end)) {
                isPoli = false;
            }
            start++;
            end--;
        }
        System.out.println(isPoli);
    }
}
