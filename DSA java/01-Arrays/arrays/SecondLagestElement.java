package practice;
import java.util.Scanner;
public class SecondLagestElement {
    public static int secondlargest(int arr[]) {
        int max = 0;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {

                max2 = max;
                max = arr[i];
            }
            else if(arr[i]>max2 && max>max2){
                max2 = arr[i];
            }


        }
        return max2;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = secondlargest(arr);
        System.out.println(result);
    }
}

