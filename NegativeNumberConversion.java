package week1.day1;

public class NegativeNumberConversion {

	public static void main(String[] args) {
		int i=-40;
		int Pos=0;
		
		if(i<0)
		{
			System.out.println("i is a negative num:"+i);			
			System.out.println("Conversion of negative number to a positive Number");
			System.out.println("***************************************************");
			
			Pos=i*(-1);
			System.out.println("The number -40 is converted to 40: Positive number is:" +Pos);
		}
		else if(i>0)
		{
			System.out.println("i is a positive number:"+i);
		}
		else
		{
			System.out.println("i is neighter positive nor Negative");
		}

	}

	}

