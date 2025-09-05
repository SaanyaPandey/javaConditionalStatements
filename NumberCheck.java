package com.javaConditionalStatements;
/*This program shows you that how can we check a number if it is +ve, -ve or zero from user-input. */
import java.util.Scanner;
public class NumberCheck {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any integer number of your choice:");
    int number = sc.nextInt();
    if(number>0){
      System.out.println("This number is positive.");
    }
    else if(number<0){
      System.out.println("This number is negative");
    }
    else{
      System.out.println("This is a ZERO.");
    }
    sc.close();
  }
}
