import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicate {
        public static int findSmallestInteger(int[] nums, int value) {
            List<Integer> lt=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=0){
                    if(lt.contains(nums[i])){
                        while(lt.contains(nums[i])){
                            nums[i]=nums[i]+value;
                        }
                        lt.add(nums[i]);
                    }else{
                        nums[i]=nums[i]%value;
                        lt.add(nums[i]);
                    }
                }
                else{
                    nums[i]=nums[i]%value!=0 ? value+nums[i]%value : 0;
                }
            }
            Arrays.sort(nums);
            int st=0;
            for(int val:nums){
                if(val==st){
                    st++;
                }
            }
            return st;
        }

    public static void main(String[] args) {
//        System.out.println(1^7);
//        System.out.println(-10%7);
//        System.out.println(-9%7);
        int arr[]={3,0,3,2,4,2,1,1,0,4};
        int value=5;
        findSmallestInteger(arr,value);
        System.out.println(Arrays.toString(arr));

    }
}
