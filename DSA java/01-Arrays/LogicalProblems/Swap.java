package LogicalProblems;
import java.util.Scanner;
public class Swap {
   public static void swapping(int arr[] , int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        a++;
        b++;
    }
    public static void dis(int arr[]){
        System.out.println(arr);
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0; i<n; i++){
           arr[i] = sc.nextInt();
       }
       dis(arr);
        System.out.println("after swapping");
        dis(arr);
    }

}
