import java.util.HashSet;
import java.util.Stack;

public class permutation {
    static HashSet<String> st=new HashSet<>();


        public static String nextPermutation(String s) {
            char[] chars = s.toCharArray();
            int n = chars.length;
            int i = n - 2;
            while (i >= 0 && chars[i] >= chars[i + 1]) {
                i--;
            }

            if (i >= 0) {
                int j = n - 1;
                while (chars[j] <= chars[i]) {
                    j--;
                }

                swap(chars, i, j);
            }

            reverse(chars, i + 1, n - 1);

            return new String(chars);
        }
        private static void reverse(char[] chars, int start, int end) {
            while (start < end) {
                swap(chars, start++, end--);
            }
        }





    static void swap(char[]str,int i,int j){

        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
    }
    static void solve(char[] s,int i){
        if (i == s.length - 1) { // base case: last position fixed
            st.add(new String(s)); // convert to proper string
            return;
        }
             for (int k=i;k<s.length;k++){
                 swap(s,i,k);
                 solve(s,i+1);
                 swap(s,i,k);
             }
    }
    public static void main(String[] args) {
        String s="123";
        char[]ch=s.toCharArray();
solve(ch,0);
        System.out.println(st);
    }
}
