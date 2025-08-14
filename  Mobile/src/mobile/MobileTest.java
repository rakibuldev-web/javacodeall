/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobile;

/**
 *
 * @author RAKIBUL HASAN $
 */
public class MobileTest {
    private String mobileOwnerName;
    private String mobileNumber;
    private String mobileBalance;
    private String mobileOSName;
    private boolean lock; 

    // Empty constructor
    public MobileTest() {
        mobileOwnerName = "";
        mobileNumber = "";
        mobileBalance = "0";
        mobileOSName = "";
        lock = true; 
    }

    // Valued constructor
    public MobileTest(String owner, String number, String balance, String os, boolean isLocked) {
        mobileOwnerName = owner;
        mobileNumber = number;
        mobileBalance = balance;
        mobileOSName = os;
        lock = isLocked;
    }

    // Method to show mobile info
    public void showInfo() {
        if (!lock) {
            System.out.println("Owner Name: " + mobileOwnerName);
            System.out.println("Mobile Number: " + mobileNumber);
            System.out.println("Balance: " + mobileBalance + " Tk");
            System.out.println("Operating System: " + mobileOSName);
            System.out.println("Lock Status: " + (lock ? "Locked" : "Unlocked"));
        } else {
            System.out.println("Phone is locked. Cannot show information.");
        }
    }

    public void recharge(int amount) {
        if (!lock) {
            double currentBalance = Double.parseDouble(mobileBalance);
            currentBalance += amount;
            mobileBalance = String.valueOf(currentBalance);
            System.out.println("Recharge successful. New Balance: " + mobileBalance + " Tk");
        } else {
            System.out.println("Phone is locked. Cannot recharge.");
        }
    }

    public void callSomeone(int timeDuration) {
        if (!lock) {
            double currentBalance = Double.parseDouble(mobileBalance);
            double cost = timeDuration; 

            if (currentBalance >= cost) {
                currentBalance -= cost;
                mobileBalance = String.valueOf(currentBalance);
                System.out.println("Call successful. Duration: " + timeDuration + " minutes.");
                System.out.println("Remaining Balance: " + mobileBalance + " Tk");
            } else {
                System.out.println("Insufficient balance to make the call.");
            }
        } else {
            System.out.println("Phone is locked. Cannot make calls.");
        }
    }
}
