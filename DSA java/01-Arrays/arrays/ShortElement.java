package practice;
import java.util.Arrays;
import java.util.Scanner;
public class ShortElement {
    public static void sort(int arr[]){
          Arrays.sort(arr);


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
         sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
