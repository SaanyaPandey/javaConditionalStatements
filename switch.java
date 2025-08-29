package javaConditionalStatements;
/*This shows the use of switch case to you. */
import java.util.Scanner;
public class switch {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your choice (any letter of english): ");
    char luckyDraw = sc.nextChar();
    switch(luckyDraw){
      case 'A': System.out.println("The college you got in your lucky draw is 'Chitkara university'");
      break;
      case 'B': System.out.println("The college you got in your lucky draw is 'Rayat BAHRA University'");
      break;
      case 'C': System.out.prinln("The college you got in your lucky draw is 'Chandigarh University'");
      break;
      case 'D': System.out.println("The college which you got in your lucky draw is 'Chandigarh Group of Colleges'");
      break;
      case 'E': System.out.println("The college which you got in your lucky draw is 'SVIET'");
      break;
      case 'F': System.out.println("The college which you got in your lucky draw is 'Thapar University'");
      break;
      case 'G': System.out.prinln("The college which you got in your lucky draw is 'Lovely Proffessional University'");
      break;
      default: System.out.println("Input invalid");
    }

  }
  
}
