import java.util.*;

class second {
    public static void main(String[] args) {
        int[] a = {5,3,8};
        largestSecont(a);
    }   
    static void largestSecont(int[] a){
        HashSet<Integer>set = new HashSet<>();
        for(int i:a){
            set.add(i);
        }
        Integer[] ans = set.toArray(new Integer[0]);
        
        System.out.println(ans[ans.length-2]);
    } 
}
