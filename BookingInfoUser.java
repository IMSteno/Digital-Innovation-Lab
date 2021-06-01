package it.polimi.hand;

import java.time.LocalDateTime;

public class BookingInfoUser {

    private String bookingID, entryStop, exitStop, vehicleType, bookedLine;
    private String dateBooking;
    private String timeBooked;

    public BookingInfoUser() {
    }

    public BookingInfoUser(String bookingID, String entryStop, String exitStop, String vehicleType, String bookedLine,
                           String dateBooking, String timeBooked) {
        this.bookingID = bookingID;
        this.entryStop = entryStop;
        this.exitStop = exitStop;
        this.vehicleType = vehicleType;
        this.bookedLine = bookedLine;
        this.dateBooking = dateBooking;
        this.timeBooked = timeBooked;
    }

    public String getBookingID() {
        return bookingID;
    }

    public String getEntryStop() {
        return entryStop;
    }

    public String getExitStop() {
        return exitStop;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getBookedLine() {
        return bookedLine;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public String getTimeBooked() {
        return timeBooked;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public void setEntryStop(String entryStop) {
        this.entryStop = entryStop;
    }

    public void setExitStop(String exitStop) {
        this.exitStop = exitStop;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setBookedLine(String bookedLine) {
        this.bookedLine = bookedLine;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public void setTimeBooked(String timeBooked) {
        this.timeBooked = timeBooked;
    }
}
