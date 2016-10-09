import java.util.jar.JarEntry;

public class Problem005 {
    public static void main(String[] args) {
        int sum=1;
        for(int i=1;i<=20;i++) {
            if (sum % i != 0) {
                for(int j=1;j<i;j++) {
                    switch (i % j) {
                        case 0:
                            i=i/j;
                            break;
                        default:
                            break;
                    }
                }
            sum=sum*i;
            }
        System.out.println(sum);
        }
    }
}
