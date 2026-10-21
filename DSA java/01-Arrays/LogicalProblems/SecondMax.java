package src.Arrays.LogicalProblems;
import java.util.Scanner;
public class SecondMax {
    static int secondmax(int[] arr){
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
