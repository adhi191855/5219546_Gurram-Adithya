import java.util.Scanner
class Fib
{
	public static void main(String[] args) 
	{
			Scanner scn=new Scanner(System.in);
			System.out.println("enter a num");
			int n=scn.nextInt();

			int a=0,b=1,c;
			for(int i=1;i<=n;i++){
				System.out.println(a);
				c=a+b;
				a=b;
				b=c;
			}
	}
}
