import java.util.Arrays;

public class reverseArray {
    static void solve(int arr[],int i){
        if (i>=arr.length){
            return;
        }
        int k=arr[arr.length-1-i];
        solve(arr,i+1);
        arr[i]=k;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        solve(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
