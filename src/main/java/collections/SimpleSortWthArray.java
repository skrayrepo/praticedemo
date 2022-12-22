package collections;
//Get largest and smallest number from array
public class SimpleSortWthArray {
    public static void main(String[] args){
        int[] intArray = {45,12,67,30,55,77,90,54};
        int max = intArray[0];
        for(int i=0;i<intArray.length;i++){
            if(intArray[i] > max)
                max=intArray[i];
        }
        System.out.println("Largest value is"+max);
        int min = intArray[0];
        for(int i=0;i<intArray.length;i++){
            if(intArray[i] < min)
                min=intArray[i];
        }
        System.out.println("Minimum value is"+min);
    }
}
