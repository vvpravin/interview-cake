package introduction;

public class AppleStockBrute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] stockPrices = new int[] {10,7,5,8,11,9};
		System.out.println(getMaxProfit(stockPrices));
	}

	private static int getMaxProfit(int[] stockPrices) {
		// TODO Auto-generated method stub
		int maxProfit = Integer.MIN_VALUE;
	
		for(int i=0;i<(stockPrices.length-1);i++) {
			for(int j=i+1;j<stockPrices.length;j++) {
				int currentProfit = stockPrices[j]-stockPrices[i];
				maxProfit = Math.max(maxProfit, currentProfit);
			}
		}
		
		return maxProfit;
	}

}
