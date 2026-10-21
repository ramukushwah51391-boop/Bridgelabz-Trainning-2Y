import java.util.*;
public class digitandalphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int count=0;
        int count1=0;
        for(int i=0; i<ch.length; i++){
            if((ch[i] >= 'a' && ch[i]<= 'z') || (ch[i] >= 'A' && ch[i]<= 'Z')){
                count++;
            }
            else if(ch[i] >= '0' && ch[i]<= '9'){
                count1++;
            }
             
        }
        System.out.println(count);
        System.out.println(count1);
    }

}
