public class StringToInt {
    static int solve(String s, int i, int j) {
        // Base case: single character
        if (i == j) {
            int digit = s.charAt(i) - '0';   // '0' = 48
            if (digit < 0 || digit > 9) return -1; // invalid char
            return digit;
        }

        int mid = (i + j) / 2;

        int left = solve(s, i, mid);
        int right = solve(s, mid + 1, j);

        if (left == -1 ) {
            return -1;
        };  // propagate error
        if(right==-1){
    return left;
        }
        int rightDigits = j - mid;

        return left * (int)Math.pow(10, rightDigits) + right;
    }

    public static void main(String[] args) {
        String s = "-345";
        System.out.println(solve(s, 0, s.length() - 1)); // 42435
    }
}
