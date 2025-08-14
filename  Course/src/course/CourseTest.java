/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course;

/**
 *
 * @author R
 */
public class CourseTest {
    private String courseName;
    private String courseCode;
    private int courseCredit;
    private String courseTeacher;
    private boolean isCompulsory;

    // Empty constructor
    public CourseTest() {
        courseName = "";
        courseCode = "";
        courseCredit = 0;
        courseTeacher = "";
        isCompulsory = false;
    }

    public CourseTest(String name, String code, int credit, String teacher, boolean compulsory) {
        courseName = name;
        courseCode = code;
        courseCredit = credit;
        courseTeacher = teacher;
        isCompulsory = compulsory;
    }

    public void showCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Credit: " + courseCredit);
        System.out.println("Teacher: " + courseTeacher);
        System.out.println("Course Type: " + (isCompulsory ? "Compulsory" : "Optional"));
    }

    public void changeTeacher(String newTeacher) {
        courseTeacher = newTeacher;
        System.out.println("Course teacher updated to: " + courseTeacher);
    }

    public boolean isValidCredit() {
        return courseCredit >= 1 && courseCredit <= 5;
    }
}

