package com.simpli.java.work;

import java.util.Date;
import java.util.Calendar;

public class SampleUtility {

	public static void main(String[] args) {
		//Accessing Calendar object

		Calendar objCalendar = Calendar.getInstance();
		//Display date and time
		System.out.println("Date and time components");
		System.out.println("Year " +objCalendar.get(Calendar.YEAR));
		System.out.println("Month " +objCalendar.get(Calendar.MONTH));
		System.out.println("Date "+objCalendar.get(Calendar.DATE));
		
		
        System.out.println("Hour "+objCalendar.get(Calendar.HOUR));
		System.out.println("Minute "+objCalendar.get(Calendar.MINUTE));
		System.out.println("Second "+objCalendar.get(Calendar.SECOND));
		
            Date obj = objCalendar.getTime();
            System.out.println( objCalendar.getTime());
            System.out.println(" Date and  time  : "+obj);
		
	}

}
