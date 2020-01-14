package firstPackage;
import java.util.*;
public class Problem5 {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the No: of items needed in list:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			a.add(sc.nextInt());
		System.out.println("enter the number of rotations to be done:");
		n=sc.nextInt();
		Collections.rotate(a, n);
		
		
				System.out.println(a);
		
	}

}
