package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner task = new Scanner(System.in);

        System.out.println("Enter marks for subject1");
        int x = task.nextInt();

        System.out.println("Enter marks for subject2");
        int y = task.nextInt();

        System.out.println("Enter marks for subject3");
        int z = task.nextInt();

        System.out.println("Enter marks for subject4");
        int n = task.nextInt();

        System.out.println("Enter marks for subject5");
        int m = task.nextInt();

        int average = (x + y + z + n + m)/5;
        System.out.println("average obtained : "+average);

        char grade = 'g';
        if (average > 90) {
            grade = 'A';
        }
        else if ( average> 80) {
            grade = 'B';
        }
        else if ( average> 70) {
            grade = 'C';
        }
        else if ( average> 60) {
            grade = 'D';
        }
        else if ( average> 50) {
            grade = 'E';
        }

        switch(grade){
            case 'A':
                System.out.println(grade);
                break;

            case 'B':
                System.out.println(grade);
                break;

                case 'C':
                System.out.println(grade);
                break;

                case 'D':
                System.out.println(grade);
                break;

            case 'E':
                System.out.println(grade);
                break;
            default:
                System.out.println("Failed");

        }

    }
}


