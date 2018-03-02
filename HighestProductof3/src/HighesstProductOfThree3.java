/* 
File:         HighesstProductOfThree3.java
Created:      2018-02-21 2:54:00 PM 
Author name:  sathesh
*/

/**
 * @author sathesh
 *
 */
public class HighesstProductOfThree3 {
	
	
	//Greedy - We are trying to find the best possible solution for each case greedily

	public static int MaxProdcutofThree(int[] input)
	{
		if(input.length<3)
		{
			throw new IllegalArgumentException("Atleast Three numbers are required");
		}
		
		int highestProductofThree = input[0]*input[1]*input[2];
		int highestProductofTwo = input[0]*input[1];
		int lowestProductofTwo = input[0]*input[1];
		
		int highest = Math.max(input[0],input[1]);
		int lowest = Math.min(input[0], input[1]);
		
		for(int counter =2;counter<input.length;counter++)
		{
			int current = input[counter];
			
			highestProductofThree = Math.max(Math.max
								(highestProductofThree, current*highestProductofTwo),
								current*lowestProductofTwo);
			
			highestProductofTwo = Math.max(highestProductofTwo, current*highest);
			
			lowestProductofTwo = Math.min(lowestProductofTwo, current*lowest);
			
			highest = Math.max(highest, current);
			
			lowest = Math.min(lowest, current);
		}
		return highestProductofThree;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = new int[]{1,10,-5,1,-100};
		System.out.println(MaxProdcutofThree(input));
		

	}

}
