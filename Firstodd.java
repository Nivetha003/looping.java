import java.util.Scanner;
public class Firstodd
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    while(n>=10){
	        n = n/10;
	    }
	    System.out.println(n);
		if(n%2==0){
		    System.out.println("Even");
		}
		else{
		    System.out.println("Odd");
		}
	}
}