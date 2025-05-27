
//Holds POJO for data representation

package model;

import java.util.Date;

public class Garnishments {
    private int caseId;
    private String employeeName;
    private double amount;
    private String status;
    private Date courtOrderDate;
    private String createdBy;

    // Getters and Setters
    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCourtOrderDate() {
        return courtOrderDate;
    }

    public void setCourtOrderDate(Date courtOrderDate) {
        this.courtOrderDate = courtOrderDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
