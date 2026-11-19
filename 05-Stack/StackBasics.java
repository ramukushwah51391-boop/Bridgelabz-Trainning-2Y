import java.util.*;
public class StackBasics {
    static void main (String[] args){
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(3);
        st.push(40);
        st.push(50);
        System.out.println(st);
        st.pop();
      
        System.out.println(st);
        
        System.out.println(st.peek());



    }

}
