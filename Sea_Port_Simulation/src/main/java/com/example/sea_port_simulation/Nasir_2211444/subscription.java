package com.example.sea_port_simulation.Nasir_2211444;

import java.time.LocalDate;

public class subscription {
    private String ClientID;
    private String PlanType;
    private LocalDate StartDate;
    private LocalDate EndDate;
    private String PaymentMethod;

    public subscription(String clientID, String planType, LocalDate startDate, LocalDate endDate, String paymentMethod) {
        ClientID = clientID;
        PlanType = planType;
        StartDate = startDate;
        EndDate = endDate;
        PaymentMethod = paymentMethod;
    }

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String clientID) {
        ClientID = clientID;
    }

    public String getPlanType() {
        return PlanType;
    }

    public void setPlanType(String planType) {
        PlanType = planType;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "subscription{" +
                "ClientID='" + ClientID + '\'' +
                ", PlanType='" + PlanType + '\'' +
                ", StartDate=" + StartDate +
                ", EndDate=" + EndDate +
                ", PaymentMethod='" + PaymentMethod + '\'' +
                '}';
    }
}
