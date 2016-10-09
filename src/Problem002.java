public class Problem002 {
    public static void main(String[] args) {
        long f1=1,f2=1,sum,esum=0;
        while (f2 < 4000000) {
            sum=f1+f2;
            switch ((int) (sum % 2)) {
                case 0:
                    esum=esum+sum;
                    System.out.println(esum);
                    break;
                default:
                    System.out.println(esum);
                    break;
            }
            f1=f2;
            f2=sum;
        }
        System.out.print(esum);
    }
}

