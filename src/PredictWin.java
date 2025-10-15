public class PredictWin {
    static boolean solve(int arr[],int i,int j,int s1,int s2,boolean chance){
if(i>j){
    return s1>=s2;
}
if (chance){
   boolean left= solve(arr,i+1,j,s1+arr[i],s2,false);
   boolean right= solve(arr,i,j-1,s1+arr[j],s2,false);
   return left || right;
}
else{
   boolean left= solve(arr,i+1,j,s1,s2+arr[i],true);
   boolean right= solve(arr,i,j-1,s1,s2+arr[j],true);
   return left && right;
}

    }
    static int solve(int arr[], int i, int j, boolean chance) {
        if (i > j) {
            return 0;
        }

        if (chance) { // Player 1's turn
            int left = arr[i] + solve(arr, i + 1, j, false);
            int right = arr[j] + solve(arr, i, j - 1, false);
            return Math.max(left, right);
        } else { // Player 2's turn
            int left = -arr[i] + solve(arr, i + 1, j, true);
            int right = -arr[j] + solve(arr, i, j - 1, true);
            return Math.min(left, right);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,5,233,2};
        System.out.println(solve(arr,0,arr.length-1,0,0,true));
        System.out.println(solve(arr,0,arr.length-1,true));
        String st="12";
       
//        st.substring()
    }
}
