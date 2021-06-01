package it.polimi.hand;

public class ReportUser {
    private String reportType, description, relatedBookingID;
    private String exitStop;

    public ReportUser(String reportType, String description, String relatedBookingID, String exitStop) {
        this.reportType = reportType;
        this.description = description;
        this.relatedBookingID = relatedBookingID;
        this.exitStop = exitStop;
    }

    public ReportUser(){}

    public String getReportType() {
        return reportType;
    }

    public String getDescription() {
        return description;
    }

    public String getRelatedBookingID() {
        return relatedBookingID;
    }

    public String getExitStop() {
        return exitStop;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRelatedBookingID(String relatedBookingID) {
        this.relatedBookingID = relatedBookingID;
    }

    public void setExitStop(String exitStop) {
        this.exitStop = exitStop;
    }
}
