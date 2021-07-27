import java.util.*;

public class arrayinsertshift {

    public static int[] insertShiftArray(int[] arr ,int newValue){
        int[] tempArr = new int[arr.length + 1];
        int shiftIndex = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if( i == (Math.ceil(((float)arr.length / 2))))
            {
                tempArr[i] = newValue ;
                shiftIndex = 1 ;
            }
            tempArr[i + shiftIndex] = arr[i] ;
        }
        return  tempArr ;
    }

    public static void main(String[]args){
            System.out.println("Hello in Code Challenge Number 2");
            int[] arr1 = {1,2,3,4,5,6};
            System.out.println(Arrays.toString(insertShiftArray(arr1,70)));
            int[] arr2 = {1,2,3,4,5,6,7};
            System.out.println(Arrays.toString(insertShiftArray(arr2,90)));
        }
}