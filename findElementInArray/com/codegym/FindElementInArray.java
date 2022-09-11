package com.codegym;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
String [] students = {"Hieu","Tin","Linh","Lam","Thuan","Son","An","Thamh","Quan"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a student name");
        String input_name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length;i++) {
            if(students[i].equals(input_name)) {
                System.out.println( "Student name :"+ input_name + "\n" + "index :" + i);
                check = true;
            }
        }
        if (check == false)
            System.out.println("Not found" + input_name + "in the list");
    }
}
