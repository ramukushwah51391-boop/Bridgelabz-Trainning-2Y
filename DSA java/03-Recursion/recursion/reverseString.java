import java.util.*;
public class reverseString {
    public static void print(String s, int idx){
        if(s.length()==idx){
            return;
        }
        System.out.println(s.charAt(idx));
        print(s, idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        print(s, 0);
    }


}
