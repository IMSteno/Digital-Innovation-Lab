package it.polimi.hand;

public class ProcessedReport {

    private String reportID, commentDriver;
    private int verificationStatus;

    public ProcessedReport(String reportID, String commentDriver, int verificationStatus) {
        this.reportID = reportID;
        this.commentDriver = commentDriver;
        this.verificationStatus = verificationStatus;
    }

    public String getReportID() {
        return reportID;
    }

    public String getCommentDriver() {
        return commentDriver;
    }

    public int isVerificationStatus() {
        return verificationStatus;
    }
}
