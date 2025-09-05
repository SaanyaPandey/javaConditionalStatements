package com.javaConditionalStatements;
/*This program will help you to find if a year is a leap year or not with user input */
import java.util.Scanner;
public class leapYear{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any year of your choice: ");
    int year = sc.nextInt();
    if(year%4 == 0){
      System.out.println("This is a leap year.");
    }
    else{
      System.out.println("This is not a leap Year.");
    }
    sc.close();
  }
}