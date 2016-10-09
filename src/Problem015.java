public class Problem015 {
    public static void main(String[] args) {
        long sum1=1L;
        for(int i=0;i<1000;i++) {
            sum1 = sum1 * 2L;
            System.out.print((i + 1) + ":");
            System.out.println(sum1);
            String s = String.valueOf(sum1);
            long sum2 = 0L;
            for (int k = 0; k < s.length(); k++) {
                sum2 += Character.getNumericValue(s.charAt(k));
                System.out.println(sum2);
            }
        }
    }
}
