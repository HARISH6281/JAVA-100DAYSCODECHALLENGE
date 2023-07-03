import java.util.Scanner;

public class Javadraw {

    public static String draw(int choice){
        switch(choice){
            case 1 : return "drawing a butterfly";
            case 2 : return "elephant";
            case 3 : return "bear";
            case 4 : return "snake";
            default : return "no animal is chosen";
        }
    }
    public static void main(String[] args) {
        System.out.print("\nWhich animal would you like to draw?\n");
        System.out.println("Write 1 for butterfly ");
        System.out.println("Write 2 for elephant  ");
        System.out.println("Write 3 for bear      ");
        System.out.println("Write 4 for snake     ");

        try (Scanner sc = new Scanner(System.in)) {
            int choice = sc.nextInt();
            System.out.println(Javadraw.draw(choice));
            
        }
        
        
    }
}
