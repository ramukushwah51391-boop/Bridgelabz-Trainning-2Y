package practice;
import java.util.Scanner;
public class CommonElement {
    public static void common(int arr1[], int arr2[]){
        int index=0;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N :-");
        int n = sc.nextInt();
        System.out.println("Enter the value of M :-");
        int m= sc.nextInt();

        int[] arr1 = new int[n];

        int[] arr2= new int[m];
        System.out.println("Enter the arr1 Element :-");

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enetr the arr2 Element :-");
        for(int j=0; j<m; j++){
            arr2[j]= sc.nextInt();
        }
        System.out.println("These are the common element");
        common(arr1,arr2);
    }
}
