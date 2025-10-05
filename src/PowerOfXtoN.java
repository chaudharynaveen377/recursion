public class PowerOfXtoN {
    static int solve1(int x,int n){
        if(n<=0){
            return 1;
        }
        if (n%2==0){
            return solve(x,n/2)*solve(x,n/2);}
        else{
            return x*solve(x,(n-1)/2)*solve(x,(n-1)/2);
        }
    }

    static int solve(int x,int n){
        if(n<=0){
            return 1;
        }
        if (n%2==0){
       return solve(x*x,n/2);}
        else{
           return x*solve(x*x,(n-1)/2);
        }
    }
    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(solve1(x,n));
    }
}
