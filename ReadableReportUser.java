package it.polimi.hand;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ReadableReportUser {

    private String reportType, bookedLine, vehicleType, description, entryStop, exitStop, commentDriver;
    private int verificationStatus;
    private String dateReport;
    private String dateBooking;
    private String timeBooked;

    public ReadableReportUser(){}

    public ReadableReportUser(String reportType, String bookedLine, String vehicleType, String description, String entryStop,
                              String exitStop, String commentDriver, int verificationStatus, String dateReport, String dateBooking, String timeBooked) {
        this.reportType = reportType;
        this.bookedLine = bookedLine;
        this.vehicleType = vehicleType;
        this.description = description;
        this.entryStop = entryStop;
        this.exitStop = exitStop;
        this.commentDriver = commentDriver;
        this.verificationStatus = verificationStatus;
        this.dateReport = dateReport;
        this.dateBooking = dateBooking;
        this.timeBooked = timeBooked;
    }

    public String getReportType() {
        return reportType;
    }

    public String getBookedLine() {
        return bookedLine;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getDescription() {
        return description;
    }

    public String getEntryStop() {
        return entryStop;
    }

    public String getExitStop() {
        return exitStop;
    }

    public int getVerificationStatus() {
        return verificationStatus;
    }

    public String getCommentDriver() {
        return commentDriver;
    }

    public String getDateReport() {
        return dateReport;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public String getTimeBooked() {
        return timeBooked;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public void setBookedLine(String bookedLine) {
        this.bookedLine = bookedLine;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public void setVerificationStatus(int verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public void setDateReport(String dateReport) {
        this.dateReport = dateReport;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public void setTimeBooked(String timeBooked) {
        this.timeBooked = timeBooked;
    }
}
