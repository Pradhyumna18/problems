package firstPackage;
import java.util.*;
public class Problem6 {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the No:of items:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			a.add(sc.nextInt());
      Collections.sort(a);
      System.out.println("enter k:");
      a.remove(sc.nextInt());
      System.out.println(a);
      
	}

}
