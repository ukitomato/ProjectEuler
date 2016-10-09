

public class Problem009 {
    public static void main(String[] args) {
        long a = 0,b;
        long c=0;
        Break:
        for(b=1;b<1000;b++) {
            for(a=1;a<b;a++) {
                c=1000-a-b;
                if (c * c == a * a + b * b && b<c) {
                    break Break;
                }
            }
        }
        System.out.println(a+"*"+b+"*"+c+"="+(a*b*c));
    }
}
