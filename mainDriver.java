package it.polimi.hand;

import java.util.List;

public class mainDriver {

    public static void main(String[] args) {
        DriverController driverController = new DriverController();

        driverController.insertNewReport();

        /*
        List<BookingInfoUser> list = driverController.getBookings();
        for(BookingInfoUser i: list){
            System.out.println(i.getBookingID());
            System.out.println(i.getVehicleType());
        }

         */


    }
}
