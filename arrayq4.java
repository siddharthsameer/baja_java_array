package test1c;

public class arrayq4 
{

	public static void main(String[] args) 
	{
		int arr[]= {2,1,999,5,4,77,9};
		
		
		for(int k=0;k<arr.length;k++)
		{
			for(int i=k+1;i<arr.length;i++)
			{
				if(arr[k]>arr[i])
				{
					int t=0;
					t=arr[k];
					arr[k]=arr[i];
					arr[i]=t;
				}
			}
		}
		
		for(int y:arr)
		{
			System.out.print(y + " ");
		}

	}

}
