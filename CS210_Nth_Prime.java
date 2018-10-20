import java.util.*;
import java.util.Scanner;
public class labs
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count;
		int num;
		num=1;
		int j;
		count=0;
		while(count<n)
		{
			num=num+1;
			for( j=2; j<=num; j++)
				{
		         if(num % j ==0) //if it can be divided by any other value.
		         {
		            break;
		         }

				}
				if(j==num)
				{
					count=count+1;
				}
		}
		         System.out.println(num);


			}
	}