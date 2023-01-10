import java.util.Scanner;

public class Radius {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Radius:");

    double userRadius = sc.nextDouble();

    double areaOfCircle = Math.PI * (userRadius * userRadius);

    System.out.println("Area of circle is " + String.format ("%.2f", areaOfCircle));

    double circumferenceOfCircle = 2 * Math.PI * userRadius;

    System.out.println("Circumference of circle is " + String.format ("%.2f", circumferenceOfCircle));

    sc.close();

    }
}

