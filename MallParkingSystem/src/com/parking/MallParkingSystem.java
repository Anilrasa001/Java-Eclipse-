package com.parking;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class MallParkingSystem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Intime (HH:MM): ");
	String inTimeString	=sc.nextLine();
	System.out.println("enter outTime (HH:MM): ");
	String	outTimeString=sc.nextLine();
	try {
		LocalTime inTime=LocalTime.parse(inTimeString);
		LocalTime outTime=LocalTime.parse(outTimeString);
		if(!inTime.isBefore(outTime))
		{
			System.out.println("Invalid input: the in time must be earlier Thanout");
			return;
		}
		Duration duriation=Duration.between(inTime,outTime);
		Long hours=duriation.toHours();
		Long minutes=duriation.toMinutes()%60;
		
		Long parkingcharges=hours*10;
		if (minutes>0)
		{
			parkingcharges+=10;
		}
		System.out.println("The total charges is+"+parkingcharges+"rupees");
		
		
	}
	catch (Exception e) {
		System.out.println("the data format is wrong");
		
	}
}
}
