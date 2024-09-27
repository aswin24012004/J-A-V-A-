class reverse {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,3,2,1};
        isReverse(a);
    } 
    static void isReverse(int[] a){
        int start = 0;
        int end = a.length-1;
        int count = 0;
        while (start<end) {
            if(a[start] == a[end]){
                count++;
                start++;
                end--;
            }
        }
        System.out.println(start);
        System.out.println(count);
        if(count == start){
            System.out.println("Yes");
        }
    }   
}
