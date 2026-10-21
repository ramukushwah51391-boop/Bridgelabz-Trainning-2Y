import java.util.*;
public class palandrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
         
        for(int i=s.length()-1; i>=0; i--){
            rev = rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println(s+" palandrome");
        }
        else{
            System.out.println(s+" Not palandrome") ;
        }
    
    }

}
