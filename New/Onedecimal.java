import java.util.Scanner;

public class Onedecimal {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number:");

    int num = sc.nextInt();

    double newValue = num;

    System.out.println("You entered " + num + "," + "the new value is " + newValue);
    
    sc.close();
}

}