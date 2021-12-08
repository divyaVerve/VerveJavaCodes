package com.poly.methodOverriding;

public class TrainTicketBooking extends TicketBooking{
    
	public TrainTicketBooking()
	{
		System.out.println("Open application for train ticket booking");
		System.out.println("---------------------------------------------");
	}
	@Override
	public void setSourceDestination(String strVal1,String strVal2)
	{
		System.out.println("IRCTC");
		System.out.println("Enter Source:"+strVal1);
		System.out.println("Enter Destination:"+strVal2);
		System.out.println("Click on search:");
	
	}
	public void selectTrain()
	{
		System.out.println("Select Available train:");
	}
	public void doTrainBooking()
	{
	   System.out.println("Booking Sucessfully");
	}
}
