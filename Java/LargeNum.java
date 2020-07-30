class LargeNum{
	
public static void main(String[] args)
{
	int num1 = 10, num2 = 15, num3 = 2;
	
	if ((num1 > num2) && (num1 > num3))
	{
		System.out.println("The large number is: "num1);
	}
	else if (num2 > num3)
	{
		System.out.println("The Large number is: " + num2);
	}
	else
	{
		System.out.print("The large number is: " + num3);
	}
			}
}