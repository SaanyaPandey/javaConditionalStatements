/*This code gives you example of how you can give the grades to students by using conditional statements. */

import java.util.Scanner;

public class GradeFinding {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the CGPA you got in your Semester Exams: ");
    float CGPA = sc.nextFloat();

    if (CGPA <= 10 && CGPA >= 9) {
      System.out.println("Your grade is A. Well Done!!");
    }
    else if (CGPA < 9 && CGPA >= 8) {
      System.out.println("Your grade is B. We expect better from you next time.😊");
    }
    else if (CGPA < 8 && CGPA >= 7) {
      System.out.println("Your grade is C. Improvement could be shown.");
    }
    else if (CGPA < 7 && CGPA >= 6) {
      System.out.println("Your grade is D. WOOHOO.!! You just passed.😅");
    }
    else {
      System.out.println("Your grade is E. Failed!! Better luck next time!");
    }

    sc.close();
  }
}
