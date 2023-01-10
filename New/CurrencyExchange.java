import java.util.Scanner;

public class CurrencyExchange {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter amount:");

    double dollarAmount = sc.nextDouble();

        if(dollarAmount < 1) {
            System.out.println("Invalid number!");
        }

    System.out.println("Enter 1 for Thailand" + "\nEnter 2 for Senegal" + "\nEnter 3 for Belize");

    int country = sc.nextInt();

    double thaiExchange = dollarAmount * 33.47; 

    int thailand = 1;

    double senegaleseExchange = dollarAmount * 82.274;

    int senegal = 2;

    double belizeExchange = dollarAmount * 2.02;

    int belize = 3;

    //System.out.println("Amount in Thai is " + thaiExchange + " \nAmount in Senegal is " + senegaleseExchange + " \nAmount in Belize is " + belizeExchange);

    if(country == thailand) {
        System.out.println("Thailand exchange rate is " + thaiExchange);
    }

    if(country == senegal) {
        System.out.println("Senegal exchange rate is " + senegaleseExchange);
    }
    
    if(country == belize) {
        System.out.println("Belize exchange rate is " + belizeExchange);
    }

}
    
}
