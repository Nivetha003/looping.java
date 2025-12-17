import java.util.Scanner;
class Digit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, d, i;
        int freq[] = new int[10];
        n = sc.nextInt();
        while(n > 0)
        {
            d = n % 10;
            freq[d]++;
            n = n / 10;
        }
        for(i = 0; i < 10; i++)
        {
            if(freq[i] > 0)
                System.out.println(i + " -> " + freq[i]);
        }
    }
}
