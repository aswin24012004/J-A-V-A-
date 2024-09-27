 class str {
    public static void main(String[] args) {
        String s = "Hello World";
        String check = "He";
        reverseString(s,check);
    } 
    static void reverseString(String str,String check){
        str = str.trim();
        System.out.println();
        if(str.contains(check)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
