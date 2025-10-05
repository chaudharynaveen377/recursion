import java.util.Stack;

public class SortStack {
    static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }

        int top = stack.pop();
        insertInSortedOrder(stack, element);

        stack.push(top);
    }

    static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();

        sortStack(stack);

        insertInSortedOrder(stack, top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.add(41);
        st.add(3);
        st.add(32);
        st.add(2);
        st.add(1);
    }
}
