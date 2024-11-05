package university;

public class Course {


    private String courseName;
    private String instructor;
    private int numOfStudents;

    public Course(String courseName, String instructor, int numOfStudents) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.numOfStudents = numOfStudents;
    }

    @Override
    public String toString() {
        return courseName + "\n" + instructor + "\n" + numOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    // Setter for title
    public void setCourseName(String newCourse) {
        courseName = newCourse;
    }


    //
    public String getInstructor() {
        return instructor.toString();
    }

    public void setInstructor(String newInstructor) {
        instructor = newInstructor;
    }


    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int newNumOfStudents) {
        numOfStudents = newNumOfStudents;
    }

}
