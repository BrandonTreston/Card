public class DriversLicense extends Card {
	public DriversLicense(String n, int year) {
		super(n, year);
		expirationYear = year;
	}
	public String getName() {
		return super.getName();
	}
	
	public String format() {
		System.out.println(super.getName() + "'s license expires in " + expirationYear);
		return super.format();
		
	}
	public int getExpirationYear() {
		return expirationYear;
	}
	private int expirationYear;
}
