package com.javaConditionalStatements;
/*This code shows you how to check if a number is odd or even using user-input.*/
import java.util.Scanner;
public class oddEven {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number positive orr negative: ");
    int num = sc.nextInt();
    if(num%2 == 0){
      System.out.println("This is an even number.");
    }
    else{
      System.out.println("This is not an even number but an odd number.");
    }
    sc.close();
  }
}
