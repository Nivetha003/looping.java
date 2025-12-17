import java.util.Scanner;
class Largest
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, d, max = 0;
        n = sc.nextInt();
        while(n > 0)
        {
            d = n % 10;
            if(d > max)
                max = d;
            n = n / 10;
        }
        System.out.println(max);
    }
}
