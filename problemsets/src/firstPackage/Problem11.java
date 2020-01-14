package firstPackage;
import java.util.*;
public class Problem11 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer>[] ver=new LinkedList[10];
		System.out.println("enter your choice 1.Insertion 2.deletion 3.print 4.exit");
		int ch=sc.nextInt();
		int i=0;
		do
		{
		switch(ch)
		{
		case 1:System.out.println("enter the source and destination");
		      insert(sc.nextInt(),sc.nextInt(),ver);
		      i++;
		      break;
		case 2:System.out.println("enter the vertex to be deleted:");
		      delete(sc.nextInt(),ver);
		      break;
		case 3:print(ver,i);
		      break;
		
		}
		}while(ch!=4);

	}
public static void insert(int s,int d,LinkedList<Integer>[] ver)
{
	ver[s].addFirst(d);
	ver[d].addFirst(s);
}
public static void delete(int d,LinkedList<Integer>[] ver)
{
	ver[d].remove();
}
public static void print(LinkedList<Integer>[] ver,int vertex)
{
	 
	        for (int i = 0; i <vertex ; i++) 
	        {
	            if(ver[i].size()>0)
	            {
	                System.out.print("Vertex " + i + " is connected to: ");
	                for (int j = 0; j < ver[i].size(); j++)
	                {
	                    System.out.print(ver[i].get(j) + " ");
	                }
	                System.out.println();
	            }
            }
}
}
