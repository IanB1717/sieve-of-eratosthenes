import java.util.Scanner;
public class cs210_lab3_distancetoprimes
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int number = n1+1;
		int c=0;
		int d=0;
		int n3=0;
		int n2=0;
		int ans1=0;
		int ans2=0;
		while(c!=1)
		{
			if(isPrime(number)==false)
			{
				number++;
			}
			else
			{
				ans1=number;
				c=1;
			}
		}
		while(d!=1)
		{
			if(isPrime2(n1)==false)
			{
				n1--;
			}
			else
			{
				ans2=n1;
				d=1;
			}
		}
		if(c + d ==2)
		{
			int distance = ans1-ans2;
			System.out.println(distance);
			//System.out.println(ans1);
			//System.out.println(ans2);
		}
	}


	public static boolean isPrime(int number)//number above given in number
		{


		     for(int j=2; j<number; j++)
		    {
		         if(number % j ==0) //if it can be divided by any other value.
		        {
		            return false;//it returns false.
		        }


		    }
		    return true; //else returns true i.e is prime
		}
		public static boolean isPrime2(int number)//number below given in number
		{


		    for(int j=number-1; j>=2; j--)
		    {
		       if(number % j ==0) //if it can be divided by any other value.
		        {
		            return false; //it returns false.
		        }


		    }
		    return true;//else returns true i.e is prime

		}
}