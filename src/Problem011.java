import java.io.*;

public class Problem011 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Grid.txt"));
            int k=0;
            int num[] = new int[400];
            for (int i = 0; i <20; i++) {
                String str=br.readLine();
                String [] snum = str.split(" ", -1);
                for(int j=0;j<20;j++) {
                    num[k]=Integer.parseInt(snum[j]);
                    System.out.println(k+":"+num[k]);
                    k++;
                }
            }
            int max=0;
            for(int n=0;n<400;n++) {
                int p=n,q=n,r=n,a=1,b=1,c=1;
                if (p/10!=1&&(p % 10 != 7 || p % 10 != 8 || p % 10 != 9)) {
                    for(int m=0;m<4;m++) {
                        a=a*num[p];
                        p=p+1;
                    }
                }
                System.out.println("横:"+a);
                if (q/10==1&&(q % 10 != 7 || q % 10 != 8 || q % 10 != 9)) {
                    for(int m=0;m<4;m++) {
                        b = b * num[q];
                        q = q + 21;
                    }
                }
                System.out.println("斜め:"+b);
                if(r<340){
                    for(int m=0;m<4;m++) {
                        c=c*num[r];
                        r=r+20;
                    }
                }
                System.out.println("縦:"+c);

                if (max < a) {
                    max = a;
                }
                if (max < b) {
                    max = b;
                }
                if (max < c) {
                    max=c;
                }
                System.out.println(n+":"+max);
            }
            System.out.println("max:"+max);
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
