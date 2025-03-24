//Author: Scelo Kevin Nyandeni 230189695

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
    private Lesson(LessonBuilder lessonbuilder) {
        this.lessonId = lessonbuilder.lessonId;
        this.course = lessonbuilder.course;
        this.title = lessonbuilder.title;
        this.description = lessonbuilder.description;
        this.date = lessonbuilder.date;
        this.startTime = lessonbuilder.startTime;
        this.endTime = lessonbuilder.endTime;
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

    public static class LessonBuilder {
        private int lessonId;
        private Course course;
        private String title;
        private String description;
        private String date;
        private String startTime;
        private String endTime;

        public LessonBuilder setLessonId(int lessonId) {
            this.lessonId = lessonId;
            return this;
        }

        public LessonBuilder setCourse(Course course) {
            this.course = course;
            return this;
        }

        public LessonBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public LessonBuilder setDate(String date) {
            this.date = date;
            return this;
        }

        public LessonBuilder setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public LessonBuilder setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public Lesson build(){
            return new Lesson(this);
        }

    }
}

