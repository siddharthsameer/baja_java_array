package test1c;

public class arrayq3 
{

	public static void main(String[] args) 
	{
		int arr[]= {1,3,5,5,8,6,3,8};
		
		
		for(int k=0;k<arr.length;k++)
		{
			for(int i=k+1;i<arr.length;i++)
			{
				if(arr[k]==arr[i])
				{
					System.out.print(arr[k] + " ");
					
				}
				
			}
		}

	}

}
