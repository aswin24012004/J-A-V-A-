 class MergeString {
    public static void main(String[] args) {
        String s1 = "abc ";
        String s2 = "def";
        String answer = toMergeString(s1,s2);
        System.out.println(answer);
        System.out.println(s1+s2);
    }  
    public static String toMergeString(String s1,String s2) {
        String result = "";
        for (int i = 0; i < s1.length() ||i< s2.length(); i++) {
            if(i<s1.length()){
                result+=s1.charAt(i);
            }
            if(i<s2.length()){
                result += s2.charAt(i);
            }
        }
        return result;
    } 
}
