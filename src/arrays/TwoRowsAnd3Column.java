package arrays;

public class TwoRowsAnd3Column {

	public static void main(String[] args)
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a.length-1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	
	}
}
