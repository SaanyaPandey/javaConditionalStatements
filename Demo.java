/*Use of CONDITIONAL STATEMENTS IN JAVA. */
/*Mainly if , if-else , else if */

import java.util.Scanner;
class Demo{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //use of if-else statement
    int userAge = sc.nextInt();
    if(age > 18){
      System.out.println("You are an adult.");
    }
    else{
      System.out.println("You are a child");
    }

    //use of if statement
    boolean isSunUp = true;
    if ( isSunUp == true){
      System.out.println("Daytime");
    }

    //use of else if statement
    //let's take the example of square of a given number
    System.out.print("Select a number:");
    int userNumber = sc.nextInt();
    int compSquare = (userNumber * userNumber);
    System.out.println("Give the square of the above number.");
    int userSquare = sc.nextInt();
    if(compSquare == userSquare){
      System.out.println("WOW!! you did  a great job.");
    }
    else if(compSquare > userSquare){
      System.out.println("OOPS!! give a bigger number.");
    }
    else{
      System.out.println("UMM..Give a smaller number Dude..");
    }
  }
}