import java.util.Scanner;

class Small
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, d;
        int min = 9;
        n = sc.nextInt();
        while(n > 0)
        {
            d = n % 10;
            if(d < min)
                min = d;
            n = n / 10;
        }
        System.out.println(min);
    }
}
