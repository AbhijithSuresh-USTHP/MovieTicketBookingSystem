package utility1;

import java.util.regex.Pattern;

public class customer_validation {
	public static boolean isValidEmail(String email)
	{
		String emailregex="^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		return Pattern.matches(emailregex, email);
	}
	public static boolean isValidPhone(String phone)
	{
		return phone.matches("\\d{10}");
	}
}
