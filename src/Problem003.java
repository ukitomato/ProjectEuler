public class Problem003 {
    public static void main(String[] args) {
        long n=600851475143L,i=2L;
        while (n / i != 1L || n%i!=0) {
            if (n % i == 0L) {
                n /= i;
                System.out.println(n);
                System.out.println(i);
            } else {
                i++;
                System.out.println(n);
                System.out.println(i);
            }
        }
        System.out.println(i);
    }
}
