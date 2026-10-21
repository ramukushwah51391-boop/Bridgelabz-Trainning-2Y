package practice;
import java.util.Scanner;
public class CountNOElement {
    public static int countelement(int arr[]){
        int count=0;
        for(int i=0; i<arr.length; i++){
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = countelement(arr);
        System.out.println(result);
    }
}
