//Demo class area is created
class Area{
    //creating a calculateArea method with two arguments a and b;
    public static Double calculateArea(double a , double b){
        return a*b;
    }
    //creating a explainArea method with one argument language;
    public static String explainArea(String language){
        switch(language){
            case "English": return "Hi connections,Have a Great Day..!!";
            case "French": return "Salut les connexions,Bonne journée..!!";
            case "Arabic": return "marhaba atsalat ، atmana lek youma raea..!!"; 
            default :return "Language is not specified";
        }
    }
    
      public static void main(String[] args) {
        //calling calculateArea and explainArea methods and printing return values
           System.out.println(calculateArea(2.27,4.78));
           System.out.println(calculateArea(10.18,5.98)); 
           System.out.println(calculateArea(12.12,14.78));  
           System.out.println(explainArea("Arabic"));
           System.out.println(explainArea("French"));
           System.out.println(explainArea("English"));
      }
}

