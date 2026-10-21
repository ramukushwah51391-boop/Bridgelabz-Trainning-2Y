
public class print5to {
    public static void sumofn(int n){
        if(n==0){
            return;  
     }
    
    System.out.println(n);
    sumofn(n-1);
        }
    public static void main(String[] args) {
        int n=5;
        sumofn(n);
    }

}
