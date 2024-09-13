package murach.survey;

import java.io.Serializable;

public class SurveyData implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    private String howHeard;
    private String contactMethod;

    // Default constructor
    public SurveyData() {
        firstName = "";
        lastName = "";
        email = "";
        dob = "";
        howHeard = "";
        contactMethod = "";
    }

    // Parameterized constructor
    public SurveyData(String firstName, String lastName, String email, String dob, String howHeard, String contactMethod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.howHeard = howHeard;
        this.contactMethod = contactMethod;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getHowHeard() {
        return howHeard;
    }

    public void setHowHeard(String howHeard) {
        this.howHeard = howHeard;
    }

    public String getContactMethod() {
        return contactMethod;
    }

    public void setContactMethod(String contactMethod) {
        this.contactMethod = contactMethod;
    }
}
