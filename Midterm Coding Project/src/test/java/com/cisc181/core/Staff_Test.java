package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {





Staff staff1 = new Staff("Bob", "Bobbert", "Bobbums", newDate(1964, 1, 1),
		"34 BobStreet", "(302)111-1111", "bbb@udel.edu","FRI 5PM", 1, 20000, 
		newDate(1990, 1, 1), eTitle.MR);

Staff staff2 = new Staff("Evan", "Wolfgang", "Robins", newDate(1962, 2, 3),
		"45 Chipmunk Avenue", "(302)222-2222", "ewr@udel.edu","TUES WED 3 - 5 PM", 2, 21000, 
		newDate(1990, 3, 4), eTitle.MR);

Staff staff3 = new Staff("Melissa", "Carol", "Lauren", newDate(1964, 3, 4),
		"56 Cloverfield Street", "(302)333-3333", "mcl@udel.edu","MON TUES 12 - 3 PM", 3, 25000, 
		newDate(1995, 4, 5), eTitle.MRS);

Staff staff4 = new Staff("Amanda", "MaryAnn", "Williams", newDate(1970, 4, 5),
		"67 CandyLand Drive", "(302)444-4444", "cmw@udel.edu","TUES THURS 6 - 10PM", 4, 22000, 
		newDate(1991, 5, 6), eTitle.MR);

Staff staff5 = new Staff("Rick", "Nicholas", "Rolled", newDate(1969, 5, 6),
		"78 Patriot Drive", "(302)555-5555", "bbb@udel.edu","FRI 5PM", 1, 23000, 
		newDate(1992, 7, 2), eTitle.MR));
Staff staff6 = new Staff("Rick", "Nicholas", "Rolled", newDate(1969, 5, 6),
		"78 Patriot Drive", "123123", "bbb@udel.edu","FRI 5PM", 1, 23000, 
		newDate(1992, 7, 2), eTitle.MR);
ArrayList<Staff> staffList = new ArrayList<Staff>() {{
	
	staffList.add(staff1);
	staffList.add(staff2);
	staffList.add(staff3);
	staffList.add(staff4);
	staffList.add(staff5);
}};


ArrayList<Staff> staffList2 = new ArrayList<Staff>() {{
	
	staffList.add(staff6);
	staffList.add(staff2);
	staffList.add(staff3);
	staffList.add(staff4);
	staffList.add(staff5);
}};

public static Date newDate(int yyyy, int mm, int dd) {
	Calendar clr1 = Calendar.getInstance();
	clr1.set(yyyy, mm,dd);
	return clr1.getTime();
}

 
	
	@BeforeClass
	public static void setup() throws PersonException {
		
		
	}
	
	
	
	@Test
	public void Test1() {
		
		double AvgSalary = (staffList.get(0).getSalary() + staffList.get(1).getSalary()+
		staffList.get(2).getSalary() + staffList.get(3).getSalary() + staffList.get(4).getSalary()) / 5;
		
		assertEquals(AvgSalary,22200.00,0.1);
	}
	
	@Test
	public void averageSalarytestFail() {
		String invalidNum = (staffList2.get(0).getPhone());
		assertEquals(invalidNum, "Invalid phone number", .1);
	}


}

