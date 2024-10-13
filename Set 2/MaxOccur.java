import java.util.HashMap;
import java.util.Map;

class MaxOccur{
    public static void main(String[] args) {
        String s = "ilovecodingi";
        getMaxOccuringChar(s);
    }
    static void getMaxOccuringChar(String s){
        Map<Character,Integer> map = new HashMap<>();
        char[] str = s.toCharArray();
        for (Character i : str) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        int count = 0;
        char ch='\0';
        for (Map.Entry<Character,Integer> it : map.entrySet()) {
            char c = it.getKey();
            int n = it.getValue();
            if(count < n){
                count = n;
                ch = c;
            }
        }
        System.out.println("Max Character-> "+ch);
        System.out.println("Max Character Count-> "+count);
    }
}