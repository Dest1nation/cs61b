public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        /** your code here */

        for ( int var = 0; var < a.length; var += 1){
            if (a[var] > 0){
                sum(a,n,var);
                }
            else{
                continue;
            }
        }
    }

    public static void sum(int[] a, int n, int idx){
        for (int j = 1; j <= n; j +=1){
            if( idx + j >= a.length){
                break;
            }
            else {
                a[idx] = a[idx] + a[idx + j];
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}
