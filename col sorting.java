import java.util.Scanner;
class ColSorting
{
	public static void main(String args[])
	{
		Scanner q=new Scanner(System.in);
		System.out.println("enter no. of rows ");
		int r=q.nextInt();
		System.out.println("enter no. of column ");
		int c=q.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{	for(int j=0;j<c;j++)
			{	System.out.print("array element"+(i+1)+","+(j+1)+":");
		        a[i][j]=q.nextInt();
			}
		}
		for(int k=0;k<c;k++)
		{
			for(int i=0;i<r-1;i++)
				for(int j=i+1;j<r;j++)
					if(a[i][k]>a[j][k])
					{	int t=a[i][k];
						a[i][k]=a[j][k];
						a[j][k]=t;
					}
		}
		for(int e[]:a)
		{	for(int w:e)
				System.out.print(w+"\t");
			System.out.println();
		}	
	}
	
}