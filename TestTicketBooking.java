package com.poly.methodOverriding;

public class TestTicketBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusTicketBooking objBusTicketBooking=new BusTicketBooking();
		objBusTicketBooking.setSourceDestination("Solapur","Pune");
		objBusTicketBooking.selectBus();
		objBusTicketBooking.doBusBooking();
		System.out.println("============================================");
		TrainTicketBooking objTrainTicketBooking=new TrainTicketBooking();
		objTrainTicketBooking.setSourceDestination("Pune", "Mumbai");
		objTrainTicketBooking.selectTrain();
		objTrainTicketBooking.doTrainBooking();
		System.out.println("============================================");
		
	}

}
