//Author: Scelo Kevin Nyandeni 230189695

package za.ac.cput.entity;

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
    private Lesson(LessonBuilder lessonBuilder) {
        this.lessonId = lessonBuilder.lessonId;
        this.course = lessonBuilder.course;
        this.title = lessonBuilder.title;
        this.description = lessonBuilder.description;
        this.date = lessonBuilder.date;
        this.startTime = lessonBuilder.startTime;
        this.endTime = lessonBuilder.endTime;
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

        public LessonBuilder setDescription(String description) {
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

