import java.util.*;
public class l20ofleetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    String s = sc.nextLine();
 
    Stack <Character> st = new Stack<>();
    for(char ch:s.toCharArray()){
        if(ch==']' || ch=='}' || ch == ')'){
            st.push(ch);
        }
        else{
            if(st.isEmpty()){
                System.out.println("false");
            }
            if(ch=='[' && st.peek()!=']'){
                System.out.println("false");
            }
            if(ch=='{' && st.peek()!='}'){
                System.out.println("false");
            }
            if(ch=='(' && st.peek()!=')'){
                System.out.println("false");
            }
            st.pop();
        }

    }
    System.out.println(st.isEmpty());

}

}

