class Patterns{
    
    static void  leftTriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void  rightTriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void  leftsideriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
                // System.out.print(""+i+","+j);
            }
            System.out.println();
        }
        // System.out.print("end");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
                // System.out.print(""+i+","+j);
            }
            System.out.println();
        }
    }
    static void  boxPattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || j==0 || i== n-1 || j== n-1 )
                    {
                        System.out.print("* ");
                    }
                else{
                    System.out.print("  ");
                    //2 spaces are iitated int this comndition....
                }
            }
            System.out.println();
        }
    }
    static void xPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i+j == n-1  || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces to match "* "
                }
            }
            System.out.println();
        }
    }
    static void sumPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i+j == n-1  || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Two spaces to match "* "
                }
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        sumPattern(5);
    }

}