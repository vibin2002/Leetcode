import java.util.Scanner;

public class MyClass {
    
    static int ncr(int n,int r)
    {
        int res = 1;
        for(int i=n;i>n-r;i--)
            res = res*i;
        for(int i=r;i>=1;i--)
            res = res/i;
        return res;
    }
    
    public static void main(String args[]) 
    {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int r = sc.nextInt();
         System.out.print(ncr(n,r));
    }
}