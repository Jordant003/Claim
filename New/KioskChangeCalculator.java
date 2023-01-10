public class KioskChangeCalculator {

	public static void main(String[] args) {
		
		int customerMoney = 18;
		double itemPrice = 17.18;
		
		System.out.println("returnChange" + "(" + customerMoney + ", " + itemPrice + ")");
		
		getChange(customerMoney, itemPrice);
		
		
	}
	
	private static void getChange(int customerMoney, double itemPrice) {
	
		// Define variables
		
		double getChange = customerMoney - itemPrice;
		int change = (int)(Math.round(getChange*100));
	    int quarters = Math.round((int)change/25);
	    change=change%25;
	    int dimes = Math.round((int)change/10);
	    change=change%10;
	    int nickels = Math.round((int)change/5);
	    change=change%5;
	    int pennies = Math.round((int)change/1);
	    
	    // Print statements
	    System.out.println("Quarters: " + quarters);
	    System.out.println("Dimes: " + dimes);
	    System.out.println("Nickels: " + nickels);
	    System.out.println("Pennies: " + pennies);
		
	  
		
	
	
	}

}
