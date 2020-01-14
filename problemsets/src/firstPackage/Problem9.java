package firstPackage;
import java.util.*;
public class Problem9 {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> lol=new ArrayList<ArrayList<Integer>>(10);
       System.out.println("enter the no: of lists");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
    	   createlist(lol);
    		   
       }
       //System.out.println(lol);
       HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
       for(int i=0;i<n;i++)
    	   map.put(i,lol.get(i).size());
       
	sortByValue(map,lol);
}
	public static void createlist(ArrayList<ArrayList<Integer>> lol)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		System.out.println("enter no: of items in the list:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			a1.add(sc.nextInt());
		lol.add(a1);
			
	}
	public static void sortByValue(HashMap<Integer, Integer> hm,ArrayList<ArrayList<Integer>> lol)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet());
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        // put data from sorted list to hashmap
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
      
        for ( Integer key : temp.keySet()) {
			System.out.print(lol.get(key));
		}



    }

}
