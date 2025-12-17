package tcs;

import java.util.*;



class Course {
    private String courseId;
    private String courseName;
    private List<String> enrolledStudents;
    private int durationInWeeks;

    public Course(String courseId, String courseName, List<String> enrolledStudents, int durationInWeeks) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
        this.durationInWeeks = durationInWeeks;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    @Override
    
    
    public String toString() {
        return "Course ID: " + courseId +
               "\nCourse Name: " + courseName +
               "\nStudents: " + enrolledStudents +
               "\nDuration: " + durationInWeeks + " weeks";
    }
}









public class CourseManagement {

    public static void searchByCourseId(Map<String, Course> courseMap, String courseId) {
        if (courseMap.containsKey(courseId)) {
            System.out.println("Course Details:");
            System.out.println(courseMap.get(courseId));
        } else {
            System.out.println("No course found");
        }
    }

    public static void findCoursesByStudent(Map<String, Course> courseMap, String studentName) {
        boolean found = false;
        System.out.println("Courses enrolled by " + studentName + ":");
        for (Course course : courseMap.values()) {
            if (course.getEnrolledStudents().contains(studentName)) {
                System.out.println(course.getCourseName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No course found");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Course> courseMap = new HashMap<>();
        int n = sc.nextInt(); // number of courses
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String courseId = sc.nextLine();
            String courseName = sc.nextLine();
            int numStudents = sc.nextInt();
            sc.nextLine();
            List<String> students = new ArrayList<>();
            for (int j = 0; j < numStudents; j++) {
                students.add(sc.nextLine());
            }

            int duration = sc.nextInt();
            sc.nextLine();

            Course course = new Course(courseId, courseName, students, duration);
            courseMap.put(courseId, course);
        }

        String searchStudent = sc.nextLine();
        String searchCourseId = sc.nextLine();

        findCoursesByStudent(courseMap, searchStudent);
        System.out.println();
        searchByCourseId(courseMap, searchCourseId);
    }
}




