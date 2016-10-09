public class Problem004 {
    public static void main(String[] args) {
        int i;
        int k=0;
        for (i = 999 * 999;k==0;i--) {
            String str = ""+i;
            int f[];
            f=new int[str.length()-1];
            for(int j=0;j<str.length()-1;j++){
                f[j]=i/(10^(j+1));
            }
        }
        System.out.println(i);
    }

}



