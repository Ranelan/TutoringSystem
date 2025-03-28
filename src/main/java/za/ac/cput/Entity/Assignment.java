/*
Assignment.java
Author: Ntuli Simangaliso Mazweni (230070728)
Date: 20 March 2025
 */


package za.ac.cput.Entity;


public class Assignment {
    private int assignmentId;
    private String title;
    private String description;
    private String dueDate;
    private int maxPoints;
    Course course;

    public Assignment() {
    }

    private Assignment(AssignmentBuilder assignmentBuilder){
        this.assignmentId = assignmentBuilder.assignmentId;
        this.title = assignmentBuilder.title;
        this.description = assignmentBuilder.description;
        this.dueDate = assignmentBuilder.dueDate;
        this.maxPoints = assignmentBuilder.maxPoints;
        this.course = course;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "assignmentId=" + assignmentId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", maxPoints=" + maxPoints +
                ", course=" + (course != null ? course.getCourseName() : " ") +
                '}';
    }

    public static class AssignmentBuilder {
        private int assignmentId;
        private String title;
        private String description;
        private String dueDate;
        private int maxPoints;
        Course course;


        public AssignmentBuilder() {

        }

        public AssignmentBuilder setAssignmentId(int assignmentId) {
            this.assignmentId = assignmentId;
            return this;
        }

        public AssignmentBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public AssignmentBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        public AssignmentBuilder setDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public AssignmentBuilder setMaxPoints(int maxPoints) {
            this.maxPoints = maxPoints;
            return this;
        }

        public AssignmentBuilder setCourse(Course course) {
            this.course = course;
            return this;
        }

        public Assignment build() {
            return new Assignment(this);
        }
    }
}
