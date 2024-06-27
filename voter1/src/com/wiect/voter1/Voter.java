package com.wiect.voter1;
import java.util.Scanner;

public class Voter {

    public static void main(String[] args) {
              
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your nationality:");
        String nationality = input.nextLine();
         
        System.out.println("Enter your age:");
        int age = input.nextInt();
        
        if (age >= 18 && nationality=="Indian") {
            System.out.println("You are eligible for voting");

        }   else
            System.out.println("You are not eligible for voting");
        

        
    }
}
