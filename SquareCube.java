import java.util.Scanner;
public class SquareCube
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum = 0;
	    int cube = 0;
	    int digit;
	    while(n!=0){https://www.onlinegdb.com/online_java_compiler#tab-stdin
	        digit = n%10;
	        sum = sum+digit*digit;
	        cube = cube+ digit*digit*digit;
	        n = n/10;
	    }
	    System.out.println(sum);
	    System.out.println(cube);
	    
	}
}