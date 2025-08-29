package javaConditionalStatements;

/*This code shows use of elseif ladder statement */

import java.util.Scanner;
public class ifElse{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number from 1 to 7: ");
    int weekDay = sc.nextInt();
    //else-if Ladder Statement
    if(weekDay == 1){
      System.out.println("First Week Day 'Monday'");
    }
    else if (weekDay == 2){
      System.out.println("Second Week Day 'Tuesday'");
    }
    else if (weekDay == 3){
      System.out.println("Third Week Day 'Wednesday'");
    }
    else if (weekDay == 4){
      System.out.println("Fourth Week Day 'Thursday'");
    }
    else if (weekDay == 5){
      System.out.println("Fifth Wekk Day'Friday'");
    }
    else if (weekDay == 6){
      System.out.println("Sixth Week Day 'Saturday'");
    }
    else if (weekDay == 7){
      System.out.println("Seventh Week Day 'Sunday'");
    }
    else{
      System.out.println("Input Invalid");
    }
  }
}
