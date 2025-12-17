import java.util.Scanner;
class Ascend
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, d1, d2;
        boolean ascending = true;
        n = sc.nextInt();

        d2 = n % 10; 
        n = n / 10;
        while(n > 0)
        {
            d1 = n % 10;
            if(d1 > d2) 
            {
                ascending = false;
                break;
            }
            d2 = d1;
            n = n / 10;
        }

        if(ascending)
            System.out.println("Digits are in Ascending order");
        else
            System.out.println("Digits are NOT in ascending order");
    }
}
