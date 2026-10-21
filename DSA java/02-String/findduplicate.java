import java.util.*;
public class findduplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                 if(s.charAt(i)==s.charAt(j)){
                     res = res+s.charAt(i);
                     
                 }
                  
            }
            
        }
        System.out.println(res);

    }

}
