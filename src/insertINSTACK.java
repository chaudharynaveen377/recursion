import java.util.Stack;

public class insertINSTACK {
    static void sort(Stack<Integer> st){
        if (st.isEmpty()){
            return;
        }
        int top =st.pop();
        sort(st);
        solve(st,top);

    }
    static void solve(Stack<Integer> st,int element){
        if (st.isEmpty() || st.peek()<element){
            st.add(element);
            return;
        }

        int top=st.pop();
        solve(st,element);
        st.add(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.add(33);
        st.add(32);
        st.add(12);

        solve(st,43);
        sort(st);
        System.out.println(st);
    }
}
