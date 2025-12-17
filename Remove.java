import java.util.Scanner;
public class Remove
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a = 0;
	    int b = 1;
	    int digit;
	    while(n!=0){
	        digit = n%10;
	        if(digit!=0){
	            a = a+(digit*b);
	            b = b*10;
	        }
	        n = n/10;
	    }
	    System.out.println(a);
	}
}