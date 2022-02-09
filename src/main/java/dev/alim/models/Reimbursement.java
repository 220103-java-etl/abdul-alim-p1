package dev.alim.models;

import java.io.File;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

public class Reimbursement{
    private int id;
    private EventType eventType;
    private String eventLocation;
    private String grade;
    private Date eventDate;
    private Double eventCost;
    private String description;
    private Timestamp createdDate;
    private Status status;
    private Double payableCost;
    private Timestamp resolvedDate;
    private File uploadFile;
//default Constructor
    public Reimbursement() {
    }
//    parameterized Constructors

    public Reimbursement(int id, EventType eventType, String eventLocation, String grade, Date eventDate, Double eventCost, String description, File uploadFile) {
        this.id = id;
        this.eventType = eventType;
        this.eventLocation = eventLocation;
        this.grade = grade;
        this.eventDate = eventDate;
        this.eventCost = eventCost;
        this.description = description;
        this.uploadFile = uploadFile;
    }

    public Reimbursement(int id, Timestamp createdDate, Status status, Double payableCost, Timestamp resolvedDate, File uploadFile) {
        this.id = id;
        this.createdDate = createdDate;
        this.status = status;
        this.payableCost = payableCost;
        this.resolvedDate = resolvedDate;
        this.uploadFile = uploadFile;
    }

    public Reimbursement(int id, EventType eventType, String eventLocation, String grade, Date eventDate, Double eventCost, String description, Timestamp createdDate, Status status, Double payableCost, Timestamp resolvedDate, File uploadFile) {
        this.id = id;
        this.eventType = eventType;
        this.eventLocation = eventLocation;
        this.grade = grade;
        this.eventDate = eventDate;
        this.eventCost = eventCost;
        this.description = description;
        this.createdDate = createdDate;
        this.status = status;
        this.payableCost = payableCost;
        this.resolvedDate = resolvedDate;
        this.uploadFile = uploadFile;
    }
//getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Double getEventCost() {
        return eventCost;
    }

    public void setEventCost(Double eventCost) {
        this.eventCost = eventCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double getPayableCost() {
        return payableCost;
    }

    public void setPayableCost(Double payableCost) {
        this.payableCost = payableCost;
    }

    public Timestamp getResolvedDate() {
        return resolvedDate;
    }

    public void setResolvedDate(Timestamp resolvedDate) {
        this.resolvedDate = resolvedDate;
    }

    public File getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(File uploadFile) {
        this.uploadFile = uploadFile;
    }

    @Override
    public String toString() {
        return "Reimbursement{" +
                "id=" + id +
                ", eventType=" + eventType +
                ", eventLocation='" + eventLocation + '\'' +
                ", grade='" + grade + '\'' +
                ", eventDate=" + eventDate +
                ", eventCost=" + eventCost +
                ", description='" + description + '\'' +
                ", createdDate=" + createdDate +
                ", status=" + status +
                ", payableCost=" + payableCost +
                ", resolvedDate=" + resolvedDate +
                ", uploadFile=" + uploadFile +
                '}';
    }
}
