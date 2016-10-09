
public class Problem012a {
    public static void main(String[] args) {
        int sum=0,k=0;
        for(int i=1;k<500;i++) {
            sum=sum+i;
            while ((k * k) < sum) {
                k++;
            }
            k--;
            System.out.print(sum+":");
            System.out.println(k);
        }
        System.out.println(sum);
    }
}
