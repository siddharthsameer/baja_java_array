package test2;

public class stringcharcount 
{



	public static void main(String[] args) 
	{
		String s= "siddharthsameer";
		int count=0;
	
		//System.out.println(s.length());
		try
		{
			do
			{
				count++;
			}while(s.charAt(count)!= ' ');
		}
		catch(Exception e)
		{
			throw new StringIndexOutOfBoundsException("common error");
		}
		finally
		{
			
		System.out.println(count);
		}		
	}

}
