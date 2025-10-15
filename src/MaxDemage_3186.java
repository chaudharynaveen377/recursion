import java.util.HashMap;

public class MaxDemage_3186 {
    static long solve(int arr[], int i, HashMap<Integer,Integer>mp){
        if (i>=arr.length){
            return 0;
        }
        if (!mp.containsKey(arr[i]-2) && !mp.containsKey(arr[i]-1) && !mp.containsKey(arr[i]+2) && !mp.containsKey(arr[i]+1)){
            mp.put(arr[i],1);
            long take=arr[i]+solve(arr,i+1,mp);
            mp.remove(arr[i]);
            long notTake=solve(arr,i+1,mp);
            return Math.max(take,notTake);
        }
        else{
            return solve(arr,i+1,mp);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,3,4};
        System.out.println(solve(arr,0,new HashMap<>()));
    }
}
