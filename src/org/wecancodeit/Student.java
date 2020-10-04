package org.wecancodeit;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeLevel;
    private int id = 1000;
    private String studentId;
    private String courses = "";
    private static int costOfCourse = 600;
    private int tuitionBalance = 0;

    public Student() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter student grade level:\n1-Freshman\n2-Sophomore\n3-Junior\n4-Senior");
        this.gradeLevel = in.nextInt();

        setStudentId();

    }

    private void setStudentId() {
        id++;
        this.studentId = gradeLevel + "" + id;
    }


    public void enroll() {


        do {
            System.out.println("Enroll student in a course, Q to quit");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q".toLowerCase())) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }

        } while (true);

    }

    public void viewBalance() {
        System.out.println("Your balance is:  $" + tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance-=payment;
        System.out.println("Thank you for your payment of:$" + payment);
        viewBalance();
    }

    public String showInfo(){
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeLevel +
                "\nStudent ID: " + studentId +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
