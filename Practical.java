import java.util.*;
public class Practical
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String n= args[1];
		String value1=args[0];
		double sum=1;
		for(int i=2;i<=Integer.parseInt(n);i++)
		{
		    double check=(double)Math.pow(Integer.parseInt(value1),i);
		    double val=fact(i);
		    sum+=(check/val);
		}
		System.out.println(sum);
	}
	public static double fact(double n)
	{
	     double value=1;
	    for(int i=1;i<=n;i++)
	    {
	        value=value*(double)i;
	    }
	    return value;
	}
}
