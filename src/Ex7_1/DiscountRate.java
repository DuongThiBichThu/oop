package Ex7_1;

public class DiscountRate {
	private static double serviceDiscountPremium;
	private static double serviceDiscountGold;
	private static double serviceDiscountSilver;
	private static double productDiscontPremium;
	private static double productDiscontGold;
	private static double productDiscontSilver;
	
	public static double getServiceDiscountRate(String type) {
		switch(type) {
		case "Premium":
			return serviceDiscountPremium;
		case "Gold":
			return serviceDiscountGold;
		case "Silver":
			return serviceDiscountSilver;
		default:
			return 0.0;
		}		
	}
	public static double getProductDiscontRate(String type) {
		 switch (type) {
         case "Premium":
             return productDiscontPremium;
         case "Gold":
             return productDiscontGold;
         case "Silver":
             return productDiscontSilver;
         default:
        	 return 0.0;
		 }
	}
}
