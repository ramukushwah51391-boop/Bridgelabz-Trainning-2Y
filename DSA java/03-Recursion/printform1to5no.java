public class printform1to5no {
    public static void increase(int n){
        if(n==6){
            return;
        }

        System.out.println(n);
        increase(n+1);
    }
    public static void main(String[] args){
         int n =1;
        increase(n);
    } 

}
