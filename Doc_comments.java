public class Doc_comments {
    /***
     * 
     * @param args
     */
    public static void greet(){
        System.out.println("hi,good morning");
    }
    /**
     * 
     * @param food
     * @param glasses
     */
    public void ask_questions(String food,String glasses){
        System.out.println(food);
        System.out.println(glasses);
    }
    /**
     * 
     * @param age
     * @param name
     * @return
     */
    public static String wake_up(int age,String name){
        return "yes,i got up";
    }
    public static void main(String[] args) {
       Doc_comments dc = new Doc_comments();
       dc.ask_questions("idly", "five"); 

    }
}
