import java.util.*;
public class powerOfTwo {
    public boolean ispower(int n){
        if(n==1){
            return true; 
        }
        if(n<=0 || n%2!=0){
            return false;
        }
        return ispower(n/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        powerOfTwo obj = new powerOfTwo();
        boolean ans = obj.ispower(n);
        System.out.println(ans);
    }
    

}
