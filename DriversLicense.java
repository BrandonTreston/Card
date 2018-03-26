public class DriversLicense extends Card {
	public DriversLicense(String n, int year) {
		super(n, year);
		expirationYear = year;
	}
	public String getName() {
		return super.getName();
	}
	
	public String format() {
		System.out.println("expiration year is: " + expirationYear);
		return super.format();
		
	}
	public int getExpirationYear() {
		return expirationYear;
	}
	private int expirationYear;
}
