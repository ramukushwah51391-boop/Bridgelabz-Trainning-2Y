import java.util.*;
public class countDigitinNo {
public static int digit(int n){
if(n==0){
    return 0;
}

   return 1+digit(n/10);
    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans = digit(n);
        if(n==0){
            System.out.println("1");
        }
        else{
             System.out.println(ans);
        }
    }

}
