package practice;
import java.util.Scanner;
public class LeftRotateElement {
     public static int[] leftrotate(int arr[]){
         int[] arr1 = new int[arr.length];
         for(int i=1; i<arr.length; i++) {
             arr1[i- 1] = arr[i];
         }
         arr1[arr.length-1] = arr[0];
             return arr1;

     }
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];

         for(int i=0; i<n; i++){
             arr[i] = sc.nextInt();
         }
         int[] res = leftrotate(arr);
         for(int i=0; i<res.length; i++){
         System.out.println(res[i]+" ");
         }
     }
}
