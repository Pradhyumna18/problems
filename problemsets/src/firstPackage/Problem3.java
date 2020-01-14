package firstPackage;
import java.util.*;
public class Problem3 {

	public static void main(String[] args) {
List<Integer> a=new ArrayList<Integer>();
System.out.println("enter no: of items needed in first list:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
add(n,a);
System.out.println("enter the no: of items needed in second list:");
n=sc.nextInt();
List<Integer> b=new ArrayList<Integer>();
add(n,b);
a.addAll(b);
Collections.sort(a);
System.out.println(a);
	

	}
	public static void add(int n,List<Integer> c)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  list items:");
		for(int i=0;i<n;i++)
			c.add(sc.nextInt());
	}

}
