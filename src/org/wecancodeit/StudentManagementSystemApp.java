package org.wecancodeit;

import java.util.Scanner;

public class StudentManagementSystemApp {

    public static void main(String[] args) {
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println("***********************************");
        }

        for (int j = 0; j < numOfStudents; j++) {
            System.out.println(students[j].showInfo());
            System.out.println("************************************");
        }

    }
}
