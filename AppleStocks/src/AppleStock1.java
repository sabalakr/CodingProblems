/* 
File:         AppleStock1.java
Created:      2018-02-21 2:44:43 AM 
Author name:  sathesh
*/

/**
 * @author sathesh
 *
 */
public class AppleStock1 {

	
	public static int getMaxProfitBruteForce(int[] input)
	{
		int maxprofit =0;
		int profitnow=0;
		for(int i=0;i<input.length;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				
				if(input[j]>input[i])
				{
					profitnow= input[j]-input[i];
				}
				maxprofit=Math.max(profitnow, maxprofit);
			}
			
		}
		return maxprofit;
		
	}
	
	public static int getMaxProfitGreedy(int[] input)
	{
		//Greedy approaches are great because they're fast (usually just one pass through the input).
		  if (input.length < 2) {
			    throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
			}
		  
		int min=input[0],currentProfit=0,maxProfit=0;
		for(int counter=0;counter<input.length;counter++)
		{
			//Lowest price so far
			min=Math.min(min, input[counter]);
			
			//Current Profit
			currentProfit = input[counter]- min;
			
			//Max Profit
			maxProfit = Math.max(maxProfit, currentProfit);
			
		}
		return maxProfit;
		
	}
	
	public static int getMaxProfitGreedy2(int[] input)
	{
		if(input.length<2)
		{
			throw new IllegalArgumentException("Need at least two prices");
		}
		
		int minPrice = input[0];
		int currentProfit = 0;
		int maxProfit =0;
		
		for(int counter=0;counter<input.length;counter++)
		{
			int currentPrice = input[counter];
			
			minPrice = Math.min(minPrice, currentPrice);
			
			//Current Profit
			currentProfit = currentPrice - minPrice;
			
			//Max Profit 
			maxProfit = Math.max(maxProfit, currentProfit);
		}
		
		return maxProfit;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input =new int[]{10,7,5,8,11,9};
		System.out.println(getMaxProfitBruteForce(input));
		System.out.println(getMaxProfitGreedy(input));
		System.out.println(getMaxProfitGreedy2(input));

	}

}
