/*
Tutor.java
Author : Lebuhang Nyanyantsi (222184353)
Date: 20 March 2025
 */

package za.ac.cput;

public class Tutor {
    private int tutorID;
    private String firstName;
    private String lastName;
    private String qualification;
    private String contactNumber;
    private String email;

    private Tutor() {
    }

    public Tutor(Tutor.Builder builder) {
        this.tutorID = builder.tutorID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.qualification = builder.qualification;
        this.contactNumber = builder.contactNumber;
        this.email = builder.email;
    }

    public int getTutorID() {
        return tutorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getQualification() {
        return qualification;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "tutorID=" + tutorID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", qualification='" + qualification + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {
        private int tutorID;
        private String firstName;
        private String lastName;
        private String qualification;
        private String contactNumber;
        private String email;

        public Builder setTutorID(int tutorID) {
            this.tutorID = tutorID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setQualification(String qualification) {
            this.qualification = qualification;
            return this;
        }

        public Builder setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Tutor build() {
            return new Tutor(this);
        }
    }
}
