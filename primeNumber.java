package week1.day1;

public class primeNumber {

	public static void main(String[] args) {
		
		int num=3;
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Num is a prime number");
		}
		else
		{
			System.out.println("Num is not a prime number");
		}
		

	}

}