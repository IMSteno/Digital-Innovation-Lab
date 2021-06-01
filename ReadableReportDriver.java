package it.polimi.hand;

import java.time.LocalDateTime;

public class ReadableReportDriver {

    private String reportID, reportType, description, bookedLine, entryStop, exitStop, commentDriver;
    private String dateBooking;
    private String timeBooked;

    public ReadableReportDriver(){}

    public ReadableReportDriver(String reportID, String reportType, String description, String bookedLine, String entryStop, String exitStop, /*String commentDriver,*/ String dateBooking, String timeBooked) {
        this.reportID = reportID;
        this.reportType = reportType;
        this.description = description;
        this.bookedLine = bookedLine;
        this.entryStop = entryStop;
        this.exitStop = exitStop;
        //this.commentDriver = commentDriver;
        this.dateBooking = dateBooking;
        this.timeBooked = timeBooked;
    }

    public String getReportID() {
        return reportID;
    }

    public String getReportType() {
        return reportType;
    }

    public String getDescription() {
        return description;
    }

    public String getBookedLine() {
        return bookedLine;
    }

    public String getEntryStop() {
        return entryStop;
    }

    public String getExitStop() {
        return exitStop;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public String getTimeBooked() {
        return timeBooked;
    }

    public String getCommentDriver() {
        return commentDriver;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBookedLine(String bookedLine) {
        this.bookedLine = bookedLine;
    }

    public void setEntryStop(String entryStop) {
        this.entryStop = entryStop;
    }

    public void setExitStop(String exitStop) {
        this.exitStop = exitStop;
    }

    public void setCommentDriver(String commentDriver) {
        this.commentDriver = commentDriver;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public void setTimeBooked(String timeBooked) {
        this.timeBooked = timeBooked;
    }
}
