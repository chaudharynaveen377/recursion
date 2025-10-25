class RecursiveJosephus {
    public static int josephus(int n, int k) {
        if (n == 1)
            return 1;
        return (josephus(n - 1, k) + k - 1) % n + 1;
    }
    public static int josephus1(int n, int k) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = (res + k) % i;
        }
        return res + 1;
    }

    public static void main(String[] args) {
        int n = 7, k = 3;
        System.out.println("Safe Position (Recursive): " + josephus(n, k));
        System.out.println("Safe Position (Recursive): " + josephus1(n, k));
    }
}
