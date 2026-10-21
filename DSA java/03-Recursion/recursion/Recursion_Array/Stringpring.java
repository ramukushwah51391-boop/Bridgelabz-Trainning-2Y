import java.util.*;
public class Stringpring {
    public static void print(String name, int idx){
        if(idx==name.length()){
            return;
        }
        print(name,idx+1);
        System.out.print(name.charAt(idx));
          

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        print(name, 0);
    }

}
