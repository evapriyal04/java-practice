/*Design a Course class.

Instance variables: courseName, enrolled Students.

Static variable: maxCapacity, the maximum number of students for any course.

Instance methods: enrollStudent(String studentName), unenrollStudent(String studentName).

Static method: setMaxCapacity(int capacity), to set the maximum capacity for

 courses. */
class Course {
    String courseName;
    String[] enrolledStudents;
    static int maxCapacity=100;
    int enrollments;

    static void setmaxCapacity(int maxCapacity){
        Course.maxCapacity=maxCapacity;
    }

    Course(String courseName){
        this.courseName=courseName;
        this.enrollments=0;
        this.enrolledStudents=new String[maxCapacity];
    }
    void enrollStudent(String studentName){
        enrolledStudents[enrollments]=studentName;
        enrollments++;

    }
    void unenrollStudent(String studentName){
        System.out.println("Student removed");
        enrollments--;
    }



}
