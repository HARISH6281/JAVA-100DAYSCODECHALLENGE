import java.util.Scanner;
import java.util.Random;
public class Rock_paper_scissors
{
    public static String computers_choice(){
        String [] str = {"rock","paper","scissors"};
        Random rd = new Random();
        int ind = rd.nextInt(3);
        System.out.println(ind);
        String computer_choice = str[ind];
        System.out.println(computer_choice);
        return computer_choice;
    }
  public static void main (String[]args)
  {
    try (Scanner sc = new Scanner (System.in)) {
        String computer_choice = computers_choice();
        String game_start = sc.nextLine ();
        if (game_start.equals ("yes"))
          {
        String user_choice = sc.nextLine ();
        if (user_choice.equals ("rock"))
          {
            if (computer_choice.equals ("scissors"))
              {
        	System.out.println ("user won");
              }
            else if (computer_choice.equals ("paper"))
              {
        	System.out.println ("computer won");
              }
            else
              {
        	System.out.println ("tie");
              }
          }
        if (user_choice.equals ("scissors"))
          {
            if (computer_choice.equals ("paper"))
              {
        	System.out.println ("user won");
              }
            else if (computer_choice.equals ("rock"))
              {
        	System.out.println ("computer won");
              }
            else
              {
        	System.out.println ("tie");
              }
          }
        if (user_choice.equals ("paper"))
          {
            if (computer_choice.equals ("rock"))
              {
        	System.out.println ("user won");
              }
            else if (computer_choice.equals ("scissors"))
              {
        	System.out.println ("computer won");
              }
            else
              {
        	System.out.println ("tie");
              }
          }
          }
    }

  }
}  
      
        
 
