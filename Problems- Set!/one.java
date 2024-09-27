/**
 * one
 */
public class one {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,0}; 
        zeros(a);

    }
    static void zeros(int[] a){
        int n = a.length;
        int[] ans = new int[n];
        int val=0;
        for (int i = 0; i < a.length; i++) {
            ans[val++] = a[i]%2==0?0:1;
        }
        for (int i = 0; i < ans.length; i++) {
            a[i] = ans[i];
        }
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}