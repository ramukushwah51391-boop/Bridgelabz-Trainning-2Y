import java.util.*;
public class checkpal {
    public static void pal(String s, int idx){
         if (idx >= s.length() / 2) {
            System.out.println("pal");
            return;
        }

        int end = s.length() - 1 - idx;

        if (s.charAt(idx) != s.charAt(end)) {
            System.out.println("not pal");
            return;
        }

        pal(s, idx+1);
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        pal(s, 0);
    }

}
