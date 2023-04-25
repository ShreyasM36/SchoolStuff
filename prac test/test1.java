public class test1{
	
	public static void main (String[] args) {
		
		int n;
		int y;
		int i = 0;
		int m;
		int k;
		System.out.println("Me llamo Darth Vader");
		
		n = IBIO.inputInt("input a number");
		
		if (n % 2 == 0)
		{
			IBIO.output("Even");
			}
		else{
			IBIO.output("Odd");
			}
			
		if (n > 0)
		{
			IBIO.output("Positive");
			}
		else{
			IBIO.output("Negative");
			for (y = 0; y > n; n++)
			{
				i++;
				}
				IBIO.output(i);
			}
		for(k=1; n > k;k++)
		{
			if(n % k == 0)
			{
				IBIO.out(k + " ");

				}
			else
			{
				IBIO.out("");
				}
			}	
		
		}
}
