public class Sieve{

    public static void main(String[] args)
    {
        int n = 15;
        boolean a[] = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (a[i] == false) {
                for (int j = i * i; j <= n; j = j + i)
                {
                    a[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++)
        {
            if (a[i] == false)
            {
                System.out.print(i + " ");
            }
        }
    }

}