import java.util.Date;

public class Problem010 {
    public static void main(String[] args) {
        Date a = new Date();
        System.out.println(a);
        long i,j=2;
        for(i=3;i<2000000L;i+=2) {
            boolean which=true;
            for(int k=2;k<(i/2);k++) {
                if (i % k == 0) {
                    which=false;
                    break;
                }
            }
            if (which) {
                j=j+i;
                System.out.println(i+":");
                System.out.println(j);
            }
        }
        System.out.println(j);
        Date b =new Date();
        System.out.println(a);
        System.out.println(b);
    }
}
