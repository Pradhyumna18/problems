package firstPackage;
import java.util.*;

public class Problem2 {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
	List<Integer> a=new ArrayList<Integer>();
    System.out.println("enter the number of items to be added");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    	a.add(sc.nextInt());
    Collections.reverse(a);
    System.out.println(a);
	}
}
