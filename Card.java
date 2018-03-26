import java.util.Calendar;
import java.util.GregorianCalendar;
public class Card {
	public Card() {
		name = "";
	}
	public Card(String n, int y) {
		name = n;
		expiration_year = y;
	}
	public String getName() {
		return name;
	}
	public boolean isExpired(int expirationYear) {
		GregorianCalendar calendar = new GregorianCalendar();
		boolean result = false;
		
		if (expirationYear == -1) {System.out.println("error");}  //add throw exception here later.
		
		if (calendar.get(Calendar.YEAR) > expirationYear) {
			result = true;
		}
		
		else {
			result = false;
		}
			return result;
	}
	
	public String format() {
		return "Card holder is " + name + "";
	}
	
	public int getExpirationYear() {
		return expiration_year;
	}
	
	String name;
	int expiration_year;
}