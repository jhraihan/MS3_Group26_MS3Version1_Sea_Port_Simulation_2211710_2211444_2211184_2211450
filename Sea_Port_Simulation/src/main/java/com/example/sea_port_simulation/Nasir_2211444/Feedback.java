package com.example.sea_port_simulation.Nasir_2211444;

import java.time.LocalDate;

public class Feedback {
    private String ClientID;
    private String ReceiverID;
    private String FeedbackType;
    private LocalDate FeedbackDate;
    private String TypeMessage;

    public Feedback(String clientID, String receiverID, String feedbackType, LocalDate feedbackDate, String typeMessage) {
        ClientID = clientID;
        ReceiverID = receiverID;
        FeedbackType = feedbackType;
        FeedbackDate = feedbackDate;
        TypeMessage = typeMessage;
    }

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String clientID) {
        ClientID = clientID;
    }

    public String getReceiverID() {
        return ReceiverID;
    }

    public void setReceiverID(String receiverID) {
        ReceiverID = receiverID;
    }

    public String getFeedbackType() {
        return FeedbackType;
    }

    public void setFeedbackType(String feedbackType) {
        FeedbackType = feedbackType;
    }

    public LocalDate getFeedbackDate() {
        return FeedbackDate;
    }

    public void setFeedbackDate(LocalDate feedbackDate) {
        FeedbackDate = feedbackDate;
    }

    public String getTypeMessage() {
        return TypeMessage;
    }

    public void setTypeMessage(String typeMessage) {
        TypeMessage = typeMessage;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "ClientID='" + ClientID + '\'' +
                ", ReceiverID='" + ReceiverID + '\'' +
                ", FeedbackType='" + FeedbackType + '\'' +
                ", FeedbackDate=" + FeedbackDate +
                ", TypeMessage='" + TypeMessage + '\'' +
                '}';
    }
}
