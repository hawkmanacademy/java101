
public class LeapYear {

	public static void main(String[] args) {
		int year  = Integer.parseInt(args[0]);
		
		//default leapyear flag is false
		boolean isLeapYear;
		
		//is the year divisible by 4 but not by 100?
		isLeapYear = (year % 4 == 0 ) && (year % 100 != 0);
		
		//is the year already a leapyear or divisible by 400?
		isLeapYear = isLeapYear || (year % 400 == 0);
		
		System.out.println(isLeapYear);

	}

}
