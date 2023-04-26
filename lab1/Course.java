
public abstract class Course {
    private String courseNumber;
    private String courseName;
    public Course(String courseNumber)
    {
        this.courseNumber = courseNumber;
    }
    public String getCourseNumber() { return courseNumber; }
}
