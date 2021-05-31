package net.codejava;

import java.time.LocalDateTime;

public class ReadableReportDriver {

    private String reportID, reportType, description, bookedLine, entryStop, exitStop, commentDriver;
    private LocalDateTime dateTimeBooking;

    public ReadableReportDriver(String reportID, String reportType, String description, String bookedLine, String entryStop, String exitStop, /*String commentDriver,*/ LocalDateTime dateTimeBooking) {
        this.reportID = reportID;
        this.reportType = reportType;
        this.description = description;
        this.bookedLine = bookedLine;
        this.entryStop = entryStop;
        this.exitStop = exitStop;
        //this.commentDriver = null;
        this.dateTimeBooking = dateTimeBooking;
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

    public LocalDateTime getDateTimeBooking() {
        return dateTimeBooking;
    }
}
