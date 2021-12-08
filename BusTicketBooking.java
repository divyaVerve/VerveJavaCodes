package com.poly.methodOverriding;

public class BusTicketBooking extends TicketBooking{
	public BusTicketBooking()
	{
		System.out.println("Open application for bus ticket booking");
		System.out.println("--------------------------------------------");
	}
	
	@Override
	public void setSourceDestination(String strVal1,String strVal2)
	{
		System.out.println("MakeMyTrip");
	    System.out.println("Enter Source:"+strVal1);
		System.out.println("Enter Destination:"+strVal2);
		System.out.println("Click on search:");
	}
	public void selectBus()
	{
		System.out.println("Select Bus from available bus:");
	}

	public void doBusBooking()
	{
	   System.out.println("Booking Sucessfully");
	}
	
}
