import java.util.*;

public class span {

    static void calculateSpan(int arr[]) {

        int n = arr.length;

        int span[] = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }

            st.push(i);
        }

        System.out.println("Stock Span:");

        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {100, 80, 60, 70, 60, 75, 85};

        calculateSpan(arr);
    }
}