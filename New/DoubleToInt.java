import java.util.Scanner;

public class DoubleToInt {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter double:");

    double dblNum = sc.nextDouble();

    int num = (int) Math.round(dblNum);

    System.out.println("You entered " + dblNum + "," + "the new value is " + num);

    sc.close();
}
    
}
