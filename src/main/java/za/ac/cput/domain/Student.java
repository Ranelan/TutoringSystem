package za.ac.cput.domain;

public class Student {

    private int student_id;
    private String first_name;
    private String last_name;
    private String date_of_birth;
    private String contact_number;
    private String email;

    private Student(Builder builder) {
        this.student_id = builder.student_id;
        this.first_name = builder.first_name;
        this.last_name = builder.last_name;
        this.date_of_birth = builder.date_of_birth;
        this.contact_number = builder.contact_number;
        this.email = builder.email;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getContact_number() {
        return contact_number;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", contact_number='" + contact_number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {
        private int student_id;
        private String first_name;
        private String last_name;
        private String date_of_birth;
        private String contact_number;
        private String email;

        public Builder setStudent_id(int student_id) {
            this.student_id = student_id;
            return this;
        }

        public Builder setFirst_name(String first_name) {
            this.first_name = first_name;
            return this;
        }

        public Builder setLast_name(String last_name) {
            this.last_name = last_name;
            return this;
        }

        public Builder setDate_of_birth(String date_of_birth) {
            this.date_of_birth = date_of_birth;
            return this;
        }

        public Builder setContact_number(String contact_number) {
            this.contact_number = contact_number;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Student build() {
            return new Student(this);
        }
    }

}
