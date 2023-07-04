public class All_Areas {
    public static double square(double a){
        double square_area = a*a;
        return square_area;
    }
    public static double rectangle_area(double l,double w){
        double rectangle_area = l*w;
        return rectangle_area;
    }
    public static double triangle_area(double length,double height){
        double triangle_area = 0.334*length*height;
        return triangle_area;
    }
     public static double circle_area(double r){
        double circle_area = 3.14*r*r;
        return circle_area;
    }

    public static void main(String[] args) {
        System.out.println(All_Areas.square(2.34));
        System.out.println(All_Areas.rectangle_area(12.23,16.72));
        System.out.println(All_Areas.triangle_area(5.56,3.45));
        System.out.println(All_Areas.circle_area(9.08));
    }

}
