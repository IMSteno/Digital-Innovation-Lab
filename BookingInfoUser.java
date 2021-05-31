package net.codejava;

import java.time.LocalDateTime;

public class BookingInfoUser {

    private String bookingID, entryStop, exitStop, vehicleType, bookedLine;
    private LocalDateTime dateTime;

    public BookingInfoUser(String bookingID, String entryStop, String exitStop, String vehicleType, String bookedLine, LocalDateTime dateTime) {
        this.bookingID = bookingID;
        this.entryStop = entryStop;
        this.exitStop = exitStop;
        this.vehicleType = vehicleType;
        this.bookedLine = bookedLine;
        this.dateTime = dateTime;
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

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
