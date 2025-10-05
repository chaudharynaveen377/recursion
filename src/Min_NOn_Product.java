import java.util.ArrayList;
import java.util.List;

public class Min_NOn_Product {
    public static List<String> generate(int p) {
        String s = "0".repeat(p);
        List<String> st = new ArrayList<>();
        st.add(s);

        for (int i = p - 1; i >= 0; i--) {
            int size = st.size();
            for (int j = 0; j < size; j++) {
                String s1 = st.get(j);

                StringBuilder sb = new StringBuilder(s1);
                sb.setCharAt(i, '1');
                s1 = sb.toString();

                if (!st.contains(s1)) {
                    st.add(s1);
                }
            }
        }
        return st;
    }

    public static void main(String[] args) {
        System.out.println(generate(3));
    }
}
