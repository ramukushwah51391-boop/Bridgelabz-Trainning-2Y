public class printarray {
    public static void arrayInc(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");
        arrayInc(arr, idx+1);


    }
    public static void arrayDec(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }
        arrayDec(arr, idx+1);
        System.out.print(arr[idx]+" ");
        
    }
    public static void main(String[] args){
        int[] arr = {20,1,8,76,95,90};
        arrayInc(arr, 0);
        System.out.println();
        arrayDec(arr, 0);

    }

}
