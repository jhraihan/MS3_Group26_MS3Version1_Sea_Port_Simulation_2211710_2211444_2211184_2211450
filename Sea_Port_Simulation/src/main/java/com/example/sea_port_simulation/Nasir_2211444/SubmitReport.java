package com.example.sea_port_simulation.Nasir_2211444;

import java.time.LocalDate;

public class SubmitReport {
    private String PilotID;
    private LocalDate SubmissionDate;
    private String TypeReport;

    public SubmitReport(String pilotID, LocalDate submissionDate, String typeReport) {
        PilotID = pilotID;
        SubmissionDate = submissionDate;
        TypeReport = typeReport;
    }

    public String getPilotID() {
        return PilotID;
    }

    public void setPilotID(String pilotID) {
        PilotID = pilotID;
    }

    public LocalDate getSubmissionDate() {
        return SubmissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        SubmissionDate = submissionDate;
    }

    public String getTypeReport() {
        return TypeReport;
    }

    public void setTypeReport(String typeReport) {
        TypeReport = typeReport;
    }

    @Override
    public String toString() {
        return "SubmitReport{" +
                "PilotID='" + PilotID + '\'' +
                ", SubmissionDate=" + SubmissionDate +
                ", TypeReport='" + TypeReport + '\'' +
                '}';
    }
}
