/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentproject;

/**
 *
 * @ 
 */
public class Student {

    private String name;
    private String id;
    private String department;
    private float cgpa;

  
    public Student() {
        name = "";
        id = "";
        department = "";
        cgpa = 0.0f;
    }


    public Student(String name, String id, String department, float cgpa) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.cgpa = cgpa;
    }

    // showInfo() মেথড: সব তথ্য দেখাবে
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    // Getter Methods
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public float getCgpa() {
        return cgpa;
    }
}

}
