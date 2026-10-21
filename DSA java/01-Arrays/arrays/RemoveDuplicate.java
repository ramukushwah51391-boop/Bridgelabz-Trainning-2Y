package practice;
import java.util.Scanner;
public class RemoveDuplicate {
    public static void remove(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean dupli = false;

            for (int j = 0; j < i; j++){
                if(arr[i]==arr[j]){
                    dupli = true;
                    break;
                }
            }
            if(!dupli){
                System.out.println(arr[i]+ " ");
            }
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        remove(arr);
    }
}
