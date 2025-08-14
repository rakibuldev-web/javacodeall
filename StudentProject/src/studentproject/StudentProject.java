/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentproject;

/**
 *
 * 
 */
public class StudentProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        Student s1 = new Student();
        s1.setName("Rahim");
        s1.setId("12345");
        s1.setDepartment("CSE");
        s1.setCgpa(3.85f);
        s1.showInfo();

        System.out.println();
        
         
        Student s2 = new Student("Karim", "67890", "EEE", 3.65f);
        s2.showInfo();

        System.out.println();

        
        System.out.println("Name of s2: " + s2.getName());
        System.out.println("CGPA of s1: " + s1.getCgpa());
    }
    
}
