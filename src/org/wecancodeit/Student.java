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
}
