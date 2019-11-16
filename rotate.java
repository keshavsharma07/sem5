package arrays;
import java.util.*;
public class rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int r=sc.nextInt();
		int temp=0;
			for(int i=0;i<r;i++)
			{
				temp=arr[0];
			 for(int j=1;j<n;j++)
			 {
				arr[j-1]=arr[j]; 
			 }
			arr[n-1]=temp;
			}
				for(int i=0;i<n;i++)
				{
					System.out.print(arr[i]);
				}
}
}