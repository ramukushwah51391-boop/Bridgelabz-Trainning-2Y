import java.util.*;
public class product {
    public static int pro(int n){
        if(n==0){
            return 1;
        }

        return (n%10)*pro(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = pro(n);
        System.out.println(ans);
    }
}
