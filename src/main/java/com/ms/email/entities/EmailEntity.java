package com.ms.email.entities;

import com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "emails")
public class EmailEntity implements Serializable {
    private static final long seralVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private UUID userId;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime senDateEmail;
    private StatusEmail statusEmail;

    public UUID getEmailId() {
        return emailId;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getSenDateEmail() {
        return senDateEmail;
    }

    public StatusEmail getStatusEmail() {
        return statusEmail;
    }

    public void setEmailId(UUID emailId) {
        this.emailId = emailId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSenDateEmail(LocalDateTime senDateEmail) {
        this.senDateEmail = senDateEmail;
    }

    public void setStatusEmail(StatusEmail statusEmail) {
        this.statusEmail = statusEmail;
    }
}
