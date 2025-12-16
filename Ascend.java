import java.util.Scanner;

public class Ascend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int prevDigit = 10;  
        boolean isAscending = true;

        while (num > 0) {
            int digit = num % 10;

            if (digit > prevDigit) {
                isAscending = false;
                break;
            }

            prevDigit = digit;
            num = num / 10;
        }

        if (isAscending) {
            System.out.println("Digits are in ascending order.");
        } else {
            System.out.println("Digits are not in ascending order.");
        }
    }
}
