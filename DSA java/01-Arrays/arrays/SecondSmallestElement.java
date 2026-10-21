package practice;
import java.util.Scanner;
public class SecondSmallestElement {
    public static int smallest(int arr[]){
        int min1= Integer.MAX_VALUE;
        int min2= Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min1){
                min2 = min1;
                min1 = arr[i];

            }
            else if(arr[i]<min2 && min1<min2){
                min2=arr[i];
            }
        }
        return min2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[]  arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = smallest(arr);
        System.out.println(result);
    }

}
