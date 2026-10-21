package practice;
import java.util.Scanner;
public class MoveZerosElement {
    public static int[] movezeros(int arr[]){
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index] =0;
            index++;
        }

        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        int[] result = movezeros(arr);
        for(int i=0; i<result.length; i++){
        System.out.println(result[i]+" ");
        }
    }


}
