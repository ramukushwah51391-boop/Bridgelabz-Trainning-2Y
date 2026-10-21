import java.util.*;
public class evenNomber {
public static void even(int n){
    if(n==0){
        
       return; 
    }

    
    even(n-1);
    if(n%2==0){
        System.out.println(n);
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        even(n);
    }

}
