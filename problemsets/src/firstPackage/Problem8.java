package firstPackage;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {

		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		int n=0,m=0,n1=0,m1=0;
		System.out.println("enter matrix 'a' order");
		Scanner sc=new Scanner(System.in);
		a=insert(a,n=sc.nextInt(),m=sc.nextInt());
		System.out.println("enter matrix b order;");
		b=insert(b,m=sc.nextInt(),m1=sc.nextInt());
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
			{
				c[i][j]=0;
				for(int k=0;k<m1;k++)
					c[i][j]+=a[i][k]*b[k][j];
			}
				
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m1;j++)
				System.out.println(c[i][j]+" ");
			System.out.println("\n");
		}
		
	}
	public static int[][] insert(int a[][],int n, int m)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter matrix elements:");
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=sc.nextInt();
		return a;

	}
	

}
