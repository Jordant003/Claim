import java.util.Scanner;

public class Leapyear {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter 4 digit year:");

int year = sc.nextInt();

if(year % 4 == 0) {

    if(year % 100 == 0){

        if(year % 400 == 0){

            System.out.println("The year is a leap year (it has 366 days)");
        } else {
            
            System.out.println("Its not a leap year");

        }

    } else {
        System.out.println("Its a leap year");
    }

} else {
    System.out.println("Its not");


        }
    }
    
}



