public class Problem012 {
    public static void main(String[] args) {
        int i,j=0,sum=0;
        for(i=0;j<500;i++) {
            j=0;
            sum=sum+i;
            System.out.print(sum+":");
            int even=sum;
            for(int k=1;k<=even;k++) {
                if (even % k == 0) {
                    j++;
                }
            }
            System.out.println(j);

        }
        System.out.println("end:"+sum);
    }
}
