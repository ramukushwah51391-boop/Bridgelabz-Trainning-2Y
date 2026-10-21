package LogicalProblems;
import java.util.*;
public class ListToArrayElement {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0,2);
        list.add(1,5);
        list.add(2,8);
        list.add(3,24);
        list.add(0,23);
        list.add(3,32);
        System.out.println(list);
        int[] arr = new int[6];
        for(int i=0; i<6; i++){
            arr[i]=list.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
