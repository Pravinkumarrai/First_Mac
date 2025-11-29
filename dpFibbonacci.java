package dp;

public class dpFibbonacci {
//    public static int fibb(int n){

    /// /        if(n<=1) return n;
//        int[]  dp = new int[n+1];
//        dp[0]=0;
//        dp[1]=1;
//        for (int i = 2; i <=n ; i++) {
//            dp[i]=dp[i-1]+dp[i-2];
//        }
//        return dp[n];
//    }
//    static void main() {
//        System.out.println(fibb(7));
//    }

// space optimized
    static void main() {
        int n=7;
        int n1 =0;
        int n2 =1;
        for (int i = 2; i <=n ; i++) {
            int n3 = n1+n2;
            n1=n2;
            n2=n3;
        }
        System.out.println(n2);
    }
}