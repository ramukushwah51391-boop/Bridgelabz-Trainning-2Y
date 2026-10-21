import java.util.Scanner;

public class reverseNo {
   public static int reverse(int n, int rev){
    if(n==0){
        return rev;
    }
    int digit = n%10;
    rev = rev*10+digit;
    return reverse(n/10, rev);


   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int ans = reverse(n, 0);
    System.out.println(ans);
    
   }
   

}
