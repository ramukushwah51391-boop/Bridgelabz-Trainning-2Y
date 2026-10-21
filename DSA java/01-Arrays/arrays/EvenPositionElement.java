package practice;
import java.util.Scanner;
public class EvenPositionElement {
    public static void evenposition(int arr[]){
        for(int i=1; i<arr.length; i=i+2) {
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
         evenposition(arr);

    }
}
