package za.ac.cput.entity;

public class Enrollment {
   private int enrollmentId;
   private Student student;
   private Course course;
   private String enrollmentDate;
   private String grade;

    private Enrollment(Enrollment enrollment) {
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public String getGrade() {
        return grade;
    }

    public static class EnrollmentBuilder {
        private int enrollmentId;
        private Student student;
        private Course course;
        private String enrollmentDate;
        private String grade;

        public EnrollmentBuilder setEnrollmentId(int enrollmentId) {
            this.enrollmentId = enrollmentId;
            return this;
        }

        public EnrollmentBuilder setStudent(Student student) {
            this.student = student;
            return this;
        }

        public EnrollmentBuilder setCourse(Course course) {
            this.course = course;
            return this;
        }

        public EnrollmentBuilder setEnrollmentDate(String enrollmentDate) {
            this.enrollmentDate = enrollmentDate;
            return this;
        }

        public EnrollmentBuilder setGrade(String grade) {
            this.grade = grade;
            return this;
        }
    }

    public Enrollment build() {
        return new Enrollment(this);
    }
}
