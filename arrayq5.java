package test1c;

public class arrayq5 
{

	public static void main(String[] args) 
	{
		int i=123456;
		int i1 =0;
		
		for(int k =0;k<6;k++)
		{
		i1= (i1*10)+(i%10);
		i=i/10;
		}
		
		System.out.print(i1);
		

	}

}
