import java.util.Stack;

public class MidStack {
    static void solve(Stack<Integer> st, int i, int size) {
        if (i == size / 2) {
            st.pop();
            return;
        }

        int temp = st.pop();
        solve(st, i + 1, size);

        st.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Original stack: " + st);

        solve(st, 0, st.size());

        System.out.println("After deleting middle: " + st);
    }
}