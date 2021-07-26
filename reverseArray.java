import java.util.Arrays;

public class reverseArray {

    public static int [] reverseArray(int [] arr){
        int[] newArr = new int[arr.length] ;
        int indexer = arr.length - 1;
        for(int i =0 ; i < arr.length ; i++){
            newArr[i] = arr[indexer];
            indexer--;
        }
        return  newArr ;
    }

    public static void main(String[] args) {
        int [] testArr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(reverseArray(testArr)));
    }


}