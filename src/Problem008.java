import java.io.*;

public class Problem008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        long sum1=0L;
        for(int k=0;k<(str.length()-13L);k++){
            long sum2=1;
            for(int i=k;i<(k+13);i++) {
                long n=Long.parseLong(str.substring(i,i+1));
                sum2=sum2*n;
                System.out.print(n+"*");
            }
            if (sum1 < sum2) {
                sum1=sum2;
            }
            System.out.println("="+sum2);
        }
        System.out.println("last"+sum1);
    }
}
