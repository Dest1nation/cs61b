public class MaxValue {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int ComparedValue = m[0];
        for (int i = 1; i < m.length; i +=1 ){
            if (ComparedValue <= m[i]){
                ComparedValue = m[i];
            }
        }
        return ComparedValue;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
