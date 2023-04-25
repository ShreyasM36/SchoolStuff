public class prac3
{
	public static void main(String[] args)
	{
		double sum = 0;
		int count = 0;
		double salary = 0;
		System.out.print("enter salaries end with -1");
		n = IBIO.inputDouble();

		while (sal != -1)
		{
			sal = n;
			if (salary != -1)
			{
				sum = sum + salary;
				count++;
			}
		}
		if (count > 0)
		{
			double average = sum / count;
			System.out.println("Average: " + average);
		}
		else
		{
			System.out.println("No data");
		}
	}
}
