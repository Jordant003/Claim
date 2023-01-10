import java.util.Scanner;

public class AsciiValue {
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter letter:");

    char letter = sc.next().charAt(0);
    

    int ascii = (int) letter;

    System.out.println("Ascii value of letter is: " + ascii);

    sc.close();

}
}
