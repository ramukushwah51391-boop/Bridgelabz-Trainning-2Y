package leetcode;
import java.util.Arrays;
import java.util.Scanner;
public class leet3232code {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        int sum =0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            sum = sum+arr[i];
        }
        if(sum>arr[n-1] || sum ==arr[n-1]){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
