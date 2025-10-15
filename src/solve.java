import java.util.HashMap;

public class solve {
    static boolean solve(String s){

        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),1);
            }
            else{
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            }
        }
        int freq=0;
        boolean flag=false;
        System.out.println(mp.values());
        for(int val:mp.values()){
            if(!flag){
                freq=val;
                flag=true;
            }
            if(freq!=val){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="spr";
        int max=0;

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(solve(s.substring(i,j+1))){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        System.out.println(max);
    }
}
