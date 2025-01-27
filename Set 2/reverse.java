class reverse{
    public static String reverseString(String s){
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length-1;
        while(i<j){
            char ch = c[i];
            c[i]= c[j];
           c[j] = ch;
            i++;
            j--;
        }
        return new String(c);
    }
    public static void main(String[] args) {
        String s = "aswin";                                                         // OUTPUT
        System.out.println("The Reverse String is  "+reverseString(s));      //The Reverse String is  niwsa
    }
}