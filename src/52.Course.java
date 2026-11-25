import java.util.ArrayList;

class Course {
     // Instance variable
     private String courseName;
     private ArrayList<String> enrolledStudents;

     // Static variable
     private static int maxCapacity;

     // Constructor
     public Course(String courseName) {
         this.courseName = courseName;
         this.enrolledStudents = new ArrayList<>();
     }

     // Static method to set max capacity for all courses
     public static void setMaxCapacity(int capacity) {
         if (capacity > 0) {
             maxCapacity = capacity;
         } else {
             System.out.println("Capacity must be greater than zero.");
         }
     }

     // Method to enroll a student
     public void enrollStudent(String studentName) {
         if (enrolledStudents.size() < maxCapacity) {
             enrolledStudents.add(studentName);
             System.out.println(studentName + " enrolled in " + courseName);
         } else {
             System.out.println("Cannot enroll " + studentName + ". Course is full!");
         }
     }

     // Method to unenroll a student
     public void unenrollStudent(String studentName) {
         if (enrolledStudents.remove(studentName)) {
             System.out.println(studentName + " unenrolled from " + courseName);
         } else {
             System.out.println(studentName + " is not enrolled in " + courseName);
         }
     }

     // Method to display course info
     public void displayCourseInfo() {
         System.out.println("\nCourse Name: " + courseName);
         System.out.println("Enrolled Students: " + enrolledStudents);
         System.out.println("Current Count: " + enrolledStudents.size() + "/" + maxCapacity);
     }

     // Main method for testing
     public static void main(String[] args) {
         Course.setMaxCapacity(3); // Setting max capacity for all courses

         Course javaCourse = new Course("Java Programming");

         javaCourse.enrollStudent("Amit");
         javaCourse.enrollStudent("Rohit");
         javaCourse.enrollStudent("Neha");
         javaCourse.enrollStudent("Priya"); // This one will exceed capacity

         javaCourse.displayCourseInfo();

         javaCourse.unenrollStudent("Rohit");
         javaCourse.displayCourseInfo();
     }
 }
