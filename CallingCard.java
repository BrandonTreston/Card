
public class CallingCard extends Card{
	public CallingCard(String n, int pin_number, int cardNumber_number) {
		super(n, -1);
		cardNumber = cardNumber_number;
		pin = pin_number;
	}
	public String getName() {
		return super.getName();
	}
	public boolean isExpired() {
		return super.isExpired(-1);
	}
	public String format() {
		System.out.println(super.getName() + "'s pin is: " + pin);
		System.out.println(super.getName() + "'s card number is: " + cardNumber);
		return super.format();
	}
	private int cardNumber;
	private int pin;

}
