public class Problem007 {
    public static void main(String[] args) {
        int i,j=0;
        for(i=2;j<10001;i++) {
            boolean which=true;
            for(int k=2;k<i;k++) {
                if (i % k == 0) {
                    which=false;
                    break;
                }
            }
            if (which) {
                j++;
                System.out.print(j+":");
                System.out.println(i);
            }
        }
    }
}

