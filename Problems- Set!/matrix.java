class matrix {
    public static void main(String[] args) {
        int[][] a = {{0,8,3},{1,0,4},{7,8,0}};
        int n =a.length;
        int m = a[0].length;
        int count=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(i==j){
                    if(a[i][j] == 0){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        if(count == n){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
