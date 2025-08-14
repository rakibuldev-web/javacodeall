/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package course;

/**
 *
 * @author  
 */
public class Course {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CourseTest c1 = new CourseTest("Object Oriented Programming", "CSE2101", 3, "Dr. Mahmud", true);
        c1.showCourseInfo();
        System.out.println();
        c1.changeTeacher("Dr. Rahman");
        System.out.println();
        if (c1.isValidCredit()) {
            System.out.println("The course credit is valid.");
        } else {
            System.out.println("Invalid course credit!");
        }
    }
    
}
