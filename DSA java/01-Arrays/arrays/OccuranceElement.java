package practice;
import java.util.Scanner;
public class OccuranceElement {
    public static void occurance(int arr[], int key){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                count++;
            }

        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N :-");
        int n = sc.nextInt();
        System.out.println("Enter the Element of the Array :-");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Occurance No. :-");
        int key = sc.nextInt();

        occurance(arr,key);
    }
}
