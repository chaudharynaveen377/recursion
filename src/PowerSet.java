import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    static List<List<Integer>>lt=new ArrayList<>();
    static void solve(int arr[],int i,List<Integer> lc){
        if(i>=arr.length){
            lt.add(new ArrayList<>(lc));
            return;
        }
        lc.add(arr[i]);
        solve(arr,i+1,lc);
        lc.removeLast();
        solve(arr,i+1,lc);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        solve(arr,0,new ArrayList<>());
        System.out.println(lt);
    }
}
