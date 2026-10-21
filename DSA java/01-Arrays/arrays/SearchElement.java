package practice;
import java.util.Scanner;
public class SearchElement {
    public static void search(int arr[], int key) {
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("array  = " + i);
                m = 1;
                break;

            }
        }
        if (m == 0) {
            System.out.println("element not found");

        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        search(arr,key);

    }
}