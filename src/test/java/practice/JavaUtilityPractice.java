package practice;

import genericUtility.JavaUtility;

public class JavaUtilityPractice {

	public static void main(String[] args) {

		JavaUtility jutil = new JavaUtility();
		String val = jutil.getCalendarDetails("dd-MM-YY");
		System.out.println(val);
		String val2 = jutil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
		System.out.println(val2);
		int num1 = jutil.generateRandomNumber(10);
		System.out.println(num1);
		int num2 = jutil.generateRandomNumber(25);
		System.out.println(num2);
		int num3 = jutil.generateRandomNumber(10000000);
		System.out.println(num3);
		
	}

}
