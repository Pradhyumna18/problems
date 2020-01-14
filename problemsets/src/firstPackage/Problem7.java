package firstPackage;
import java.util.*;
public class Problem7 {

	public static void main(String[] args) {
		System.out.println("enter your choice :1.english to morse"
				+ "2.morse to english");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:HashMap<Character,Integer> a=new HashMap<>();
			a.put('a',01);a.put('b',1000);a.put('c',1010);a.put('d',100);
			a.put('e',0);a.put('f',0010);a.put('g',110);a.put('h',0000);
			a.put('i',00);a.put('j',0111);a.put('k',101);a.put('l',0100);
			a.put('m',11);a.put('n',10);a.put('o',111);a.put('p',0110);
			a.put('q',1101);a.put('r',010);a.put('s',000);a.put('t',1);
			a.put('u',001);a.put('v',0001);a.put('w',011);a.put('x',1001);
			a.put('y',1011);a.put('z',1100);
			System.out.println("enter string:");
			String s=sc.next();
			for(int i=0;i<s.length();i++)
				System.out.print(a.get(s.charAt(i))+" ");
			break;
		
		case 2:	HashMap<String,Character> hm=new HashMap<>();
				hm.put("01",'a');hm.put("1000",'b');hm.put("1010",'c');hm.put("100",'d');
				hm.put("0",'e');hm.put("0010",'f');hm.put("110",'g');hm.put("0000",'h');
				hm.put("00",'i');hm.put("0111",'j');hm.put("101",'k');hm.put("0100",'l');
				hm.put("11",'m');hm.put("10",'n');hm.put("111",'o');hm.put("0110",'p');
				hm.put("1101",'q');hm.put("010",'r');hm.put("000",'s');hm.put("1",'t');
				hm.put("001",'u');hm.put("0001",'v');hm.put("011",'w');hm.put("1001",'x');
				hm.put("1011",'y');hm.put("1100",'z');
				System.out.println("enter morse code:");
				while(sc.hasNext())
				{
					String s3=sc.next();
					if(hm.containsKey(s3))
						System.out.print(hm.get(s3));
				else
					System.out.println("invalid input");

				}
				
				break;
	   }
	}

}
