package za.ac.cput.Entity;

public class Lesson {
    private int lessonId;
    private Course course;
    private String title;
    private String description;
    private String date;
    private String startTime;
    private String endTime;

    public Lesson() {

    }
    private Lesson(Builder builder) {
        this.lessonId = builder.lessonId;
        this.course = builder.course;
        this.title = builder.title;
        this.description = builder.description;
        this.date = builder.date;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
    }


    public int getLessonId() {
        return lessonId;
    }

    public Course getCourse() {
        return course;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonId=" + lessonId +
                ", course=" + course +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }

    public static class Builder {
        private int lessonId;
        private Course course;
        private String title;
        private String description;
        private String date;
        private String startTime;
        private String endTime;

        public Builder setLessonId(int lessonId) {
            this.lessonId = lessonId;
            return this;
        }

        public Builder setCourse(Course course) {
            this.course = course;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public Lesson Build(){
            return new Lesson(this);
        }

    }
}

