import java.util.Scanner;

public class Dice_jack {
    public static int dice_roll(){
        int pick_number = (int)(Math.random()*6+1);
        return pick_number;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum =a+b+c;
            
            
            int picked_num1 = dice_roll();
            int picked_num2 = dice_roll();
            int picked_num3 = dice_roll();
            int picked_num = picked_num1+picked_num2+picked_num3;
            System.out.println(picked_num1);
            System.out.println(picked_num2);
            System.out.println(picked_num3);
            if(sum<picked_num || sum-picked_num<2){
                System.out.println("win");
            }else{
                System.out.println("lose");
            }
        }
    }
}
