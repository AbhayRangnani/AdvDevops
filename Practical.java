import static java.lang.Math.pow;
import java.util.*;

class Practical
{

static double sum(int x, int n)
{
	double i, total = 1.0;
	for (i = 1; i <= n; i++)
		total = total +
				(Math.pow(x, i) / i);

	return total;
}

public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);  
	System.out.print("Enter the base of the series:  ");  
	int x= sc.nextInt();
	System.out.print("Enter the number of terms:  ");  
	int n= sc.nextInt();
	System.out.printf("%.2f", sum(x, n));
}
}


