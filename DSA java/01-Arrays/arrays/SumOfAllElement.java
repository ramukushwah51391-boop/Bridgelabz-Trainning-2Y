package practice;
import java.util.Scanner;
public class SumOfAllElement {
    public static int findsum(int arr[]){
        int sum =0;
        for(int i=0; i<arr.length; i++){
             sum = sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = findsum(arr);
        System.out.println(result);
    }

}
