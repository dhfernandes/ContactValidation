package uk.mixam;

import javax.validation.constraints.*;

public class Contact {

    @NotBlank(message= "Please enter your full name")
    private String fullName;

    @NotBlank(message = "Please enter an e-mail address")
    @Email(message = "Please enter a valid e-mail address")
    private String emailAddress;

    @NotBlank(message = "Please enter a valid phone number")
    private String phoneNumber;

    private String companyName;

    private String orderNumber;

    @NotBlank(message = "Please enter your message")
    private String message;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fullName='" + fullName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", companyName='" + companyName + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
