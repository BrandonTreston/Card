
public class IdCard extends Card{
	public IdCard(String n, int iD) {
		super(n, iD);
		iD_Number = iD;
	}
	public String getName() {
		return super.getName();
	}
	public boolean isExpired() {
		return super.isExpired(-1);
	}
	public String format() {
		System.out.println("ID number is: " + iD_Number);
		return super.format();
		
	}
	private int iD_Number;

}
