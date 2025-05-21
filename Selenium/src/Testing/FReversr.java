package Testing;

public class FReversr {

	public static void main(String[] args) {
		String S="saurabh";
		String Rev="";
		
		for (int i=S.length()-1;i>=0;i--)
		{
			 Rev =Rev+S.charAt(i);
		}
		System.out.println(Rev);
		
		
		System.out.println("-----------------------");
		String E="Engineering";
		E=E.toLowerCase();
		
		System.out.println(E);
		
		int count = 0;
		
		for (int i=0;i<=E.length()-1;i++)
		{
		    char F = E.charAt(i);
			if ( F=='e')
			{
				count++;
			}
		}
		//System.out.println();
		System.out.println(count);
		
	}

}
