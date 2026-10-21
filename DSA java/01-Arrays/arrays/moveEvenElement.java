package practice;
import java.util.Scanner;

public class moveEvenElement {
    public static void moveEven(int arr[]){
        int index=0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
               int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;



            }
        }
        for(int i=0; i<arr.length; i++) {
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
        moveEven(arr);
    }

}
