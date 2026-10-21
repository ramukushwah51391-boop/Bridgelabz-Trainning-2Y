package practice;

import java.util.Scanner;

public class FrequencyEachElement {
        public static void Frequency(int arr[]){

            for(int i=0; i<arr.length; i++) {
                boolean app = false;
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        app = true;

                       break;

                    }
                }
                if(app){
                    continue;
                }
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }


                    System.out.println(arr[i] + " =  " + count);
                }
            }


        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Frequency(arr);
        }
}
