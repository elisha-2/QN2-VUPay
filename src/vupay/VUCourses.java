package vupay;

import java.util.Scanner;

public class VUCourses {

    // Instance variables
    private String moduleCode;
    private String moduleName;
    private int tuition;

    // Constructor
    public VUCourses(String moduleCode, String moduleName, int tuition) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.tuition = tuition;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + moduleName);
        System.out.println("Module Code: " + moduleCode);
        System.out.println("Tuition: UGX " + tuition);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create course objects
        VUCourses bsF = new VUCourses("BSF", "BSc. Software Engineering", 900000);
        VUCourses bit = new VUCourses("BIT", "BSc. Information Technology", 750000);
        VUCourses bcs = new VUCourses("BCS", "BSc. Computer Science", 800000);
        VUCourses bce = new VUCourses("BCE", "BSc. Computer Engineering", 950000);

        System.out.print("Enter Module Code: ");
        String enteredCode = input.nextLine().toUpperCase();

        boolean found = false;

        if (enteredCode.equals(bsF.moduleCode)) {
            bsF.displayCourseDetails();
            found = true;
        } 
        else if (enteredCode.equals(bit.moduleCode)) {
            bit.displayCourseDetails();
            found = true;
        } 
        else if (enteredCode.equals(bcs.moduleCode)) {
            bcs.displayCourseDetails();
            found = true;
        } 
        else if (enteredCode.equals(bce.moduleCode)) {
            bce.displayCourseDetails();
            found = true;
        }

        if (!found) {
            System.out.println("Wrong Module Code details");
        }

        input.close();
    }
}