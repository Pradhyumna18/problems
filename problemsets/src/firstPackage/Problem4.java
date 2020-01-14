package firstPackage;
import java.util.*;
public class Problem4 {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	List<Integer> a=new ArrayList<Integer>();
	while(n!=0)
	{
		a.add(n%10);
		n=n/10;
	}
	System.out.println(a);
	}

}
