import java.util.*;
public class remove {
    public static String removeC(String s, int idx){
        if(idx==s.length()){
            return " ";
        }
        String small = removeC(s, idx+1);
        char ch = s.charAt(idx);
        if(ch!='a'){
            return small+ch;
        }
        else{
            return small;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        
    }

}
