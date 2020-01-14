package firstPackage;
import java.util.*;

public class Problem1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  sc.close();
		  int i;
		  int flag=1;
		    for(i=2;i<n;i++)
		    {
		      if(n%i==0)
		      {
		        flag=0;
		        break;
		      }
		    }
		    if(flag==0)
		    System.out.println("not prime");
		    else
		    System.out.println("prime");
		    
	}




	

}
