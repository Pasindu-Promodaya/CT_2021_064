package Q_05;
// Lecturer class
class Lecturer {
    private String lecturerName;
    private String courseTeaching;

    // Constructor
    public Lecturer(String lecturerName, String courseTeaching) {
        this.lecturerName = lecturerName;
        this.courseTeaching = courseTeaching;
    }

    // Getters and Setters
    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getCourseTeaching() {
        return courseTeaching;
    }

    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }
}

// Course class
class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer; // Lecturer Object

    // Constructor
    public Course(String courseName, String courseCode, Lecturer lecturer) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.lecturer = lecturer;
    }

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}

// Student class
class Student {
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    // Constructor
    public Student(String studentName, String degreeName, String courseFollowing) {
        this.studentName = studentName;
        this.degreeName = degreeName;
        this.courseFollowing = courseFollowing;
    }

    // Getters and Setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getCourseFollowing() {
        return courseFollowing;
    }

    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }
}

// Main class
public class Q_05 {
    public static void main(String[] args) {
// Creating a Lecturer object
        Lecturer lecturer = new Lecturer("Dr. John Smith", "Object-Oriented Programming");

        // Creating a Course object and assigning the lecturer
        Course course = new Course("Object-Oriented Programming", "CS202", lecturer);

        // Creating a Student object
        Student student = new Student("Alice Johnson", "Bachelor of Information Technology", course.getCourseName());

        // Displaying Information
        System.out.println("Course Registration System");
        System.out.println("--------------------------");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Lecturer Name: " + course.getLecturer().getLecturerName());
        System.out.println("Course Taught by Lecturer: " + course.getLecturer().getCourseTeaching());

        System.out.println("\nStudent Information:");
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Degree Program: " + student.getDegreeName());
        System.out.println("Course Following: " + student.getCourseFollowing());
    }
}
