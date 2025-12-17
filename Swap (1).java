import java.util.Scanner;
class Swap
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, first, last, middle, digits = 0;
        int temp;
        n = sc.nextInt();
        last = n % 10;
        temp = n;
        while(temp >= 10)
        {
            temp = temp / 10;
            digits++;
        }
        first = temp;
        middle = (n % (int)Math.pow(10, digits)) / 10;
        int result = last * (int)Math.pow(10, digits)
                     + middle * 10
                     + first;

        System.out.println(result);
    }
}
