import java.util.Scanner;

public class XpowerY{
    
    static int xpowery(int x,int y)
    {
        int res = 1;
        while(y>0)
        {
            if(y%2 == 1)
                res = res*x;
            x = x*x;
            y=y/2;
        }
        return res;
    }
    
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         int y = sc.nextInt();
         System.out.print(xpowery(x,y));
    }
}
