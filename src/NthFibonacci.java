import java.util.Arrays;

public class NthFibonacci {
    static int solve(int i,int dp[]){
        if(i==0){
            return 0;
        }
        if (i==1){
            return 1;
        }
        if (dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=solve(i-1,dp)+solve(i-2,dp);

    }
    public static void main(String[] args) {
        int n=3;
        int  dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println( solve(n,dp));
//        1 , 1 ,2 , 3
    }
}
