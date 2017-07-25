package edu.berliner;

public class EvenNumberFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int counter=1; counter<=100; counter++)
		{
			if(counter%2==0)
			{
				System.out.println(counter +" is an even number");
			}
			else
			{
				System.out.println(counter);
			}
		}
	}

}
