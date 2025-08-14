/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contact;

/**
 *
 * @autho
 */
public class ContactTest {
    private String personName;
    private String personId;
    private int age;
    private String mobileNumber;
    private char gender;

    public ContactTest() {
      
    }

   
    public ContactTest(String personName, String personId, int age, String mobileNumber, char gender) {
        this.personName = personName;
        this.personId = personId;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
    }

    public void showPersonInfo() {
        System.out.println("Name: " + personName);
        System.out.println("Id Number: " + personId);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + mobileNumber);
        System.out.println("gender: " + (gender == 'M' ? "male" : "female"));
    }

  
    public void detectMobileOperator() {
        if (mobileNumber == null || mobileNumber.length() < 3) {
            System.out.println("invalid phone number");
            return;
        }

        String prefix = mobileNumber.substring(0, 3);  
        switch (prefix) {
            case "017":
            case "013":
                System.out.println("Operator: Grameenphone (GP)");
                break;
            case "018":
            case "016":
                System.out.println("Operator: Robi");
                break;
            case "019":
            case "014":
                System.out.println("Operator: Banglalink");
                break;
            case "015":
                System.out.println("Operator: Teletalk");
                break;
            default:
                System.out.println("others operotor!");
        }
    }
}

