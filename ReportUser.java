package net.codejava;

public class ReportUser {
    private String reportType, description, relatedBookingID;

    public ReportUser(String reportType, String description, String relatedBookingID) {
        this.reportType = reportType;
        this.description = description;
        this.relatedBookingID = relatedBookingID;
    }

    public String getReportType() {
        return reportType;
    }

    public String getDescription() {
        return description;
    }

    public String getRelatedBookingID() {
        return relatedBookingID;
    }
}
