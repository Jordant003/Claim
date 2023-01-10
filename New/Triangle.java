import java.util.Scanner;

public class Triangle {
public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter base:");

    double userBase = sc.nextDouble();

    System.out.println("Enter height:");

    double userHeight = sc.nextDouble();

    double areaofTriangle = .5d * userBase * userHeight;

    System.out.println("Area of triangle is " + String.format("%.2f", areaofTriangle));

    sc.close();


}
    
}
