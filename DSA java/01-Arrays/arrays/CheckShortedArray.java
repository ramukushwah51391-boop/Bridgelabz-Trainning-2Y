package practice;
import java.util.Arrays;
import java.util.Scanner;
public class CheckShortedArray {
    public static void ShortedOrNot(int arr[]){
        int[] arr2 =  Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        for(int i=0; i<arr.length; i++) {

            if (arr[i] != arr2[i]) {
                System.out.println("Array Not sorted");
                return;
            }

            }
        System.out.println("Array sorted");

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
        ShortedOrNot(arr);
        }
    }

