import java.util.Scanner;
import java.util.Random;
public class Rock_paper_scissors {
    public static String computers_choice(){
        String [] str = {"rock","paper","scissors"};
        Random rd = new Random();
        int ind = rd.nextInt(3);
        System.out.println(ind);
        String computer_choice = str[ind];
        System.out.println(computer_choice);
        return computer_choice;
    }
    public static void main(String[] args) {
    
            
            String user_choice = "rock";
            String computer_choice = Rock_paper_scissors.computers_choice();
            if(user_choice=="rock"){
               if(computer_choice=="scissors"){
                System.out.println("user won");
               } else if (computer_choice=="paper"){
                System.out.println("computer won");   
               }else{
                System.out.println("tie");
               }
            }
            if(user_choice=="scissors"){
               if(computer_choice=="paper"){
                System.out.println("user won");
               } else if (computer_choice=="rock"){
                System.out.println("computer won");   
               }else{
                System.out.println("tie");
               }
            }
            if(user_choice=="paper"){
               if(computer_choice=="rock"){
                System.out.println("user won");
               } else if (computer_choice=="scissors"){
                System.out.println("computer won");   
               }else{
                System.out.println("tie");
               }
            }
            
          
               
      
        
        
        
    }
}
