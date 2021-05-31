package net.codejava;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ReadableReportUser {

    private String reportType, bookedLine, vehicleType, description, entryStop, exitStop, commentDriver;
    private int verificationStatus;
    private LocalDate dateReport;
    private LocalDateTime dateTimeBooking;

    public ReadableReportUser(String reportType, String bookedLine, String vehicleType, String description, String entryStop, String exitStop, int verificationStatus, LocalDate dateReport, LocalDateTime dateTimeBooking, String commentDriver) {
        this.reportType = reportType;
        this.bookedLine = bookedLine;
        this.vehicleType = vehicleType;
        this.description = description;
        this.entryStop = entryStop;
        this.exitStop = exitStop;
        this.verificationStatus = verificationStatus;
        this.dateReport = dateReport;
        this.dateTimeBooking = dateTimeBooking;
        this.commentDriver = null;
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

    public LocalDate getDateReport() {
        return dateReport;
    }

    public LocalDateTime getDateTimeBooking() {
        return dateTimeBooking;
    }

    public String getCommentDriver() {
        return commentDriver;
    }

}
