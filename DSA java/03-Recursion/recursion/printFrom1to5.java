public class printFrom1to5 {
public static void sumofn(int n){
        if(n==1){
            System.out.println(n);
            return;       }
    
    System.out.println(n);
    sumofn(n-1);
        }
    public static void main(String[] args) {
        int n=5;
        sumofn(n);
    }
}
