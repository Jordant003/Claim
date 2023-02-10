package PhoneBook;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    static List<People> peopleList = new ArrayList<People>();
    static List<Address> addressList = new ArrayList<Address>();

    public static void main(String[] args) {

        int selection = 0;

        while (selection != 5) {
            Scanner sc = new Scanner(System.in);
      
            System.out.println("1) New user input");
            System.out.println(
                    "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
            System.out.println("2) Search directory");
            System.out.println(
                    "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
            System.out.println("3) Delete record");
            System.out.println(
                    "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
            System.out.println("4) Update directory");
            System.out.println(
                    "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
            System.out.println("5) Show records in ascending order");
            System.out.println(
                    "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
            System.out.println("6) Exit");

            selection = sc.nextInt();
            sc.nextLine();

            switch (selection) {
                case 1:
                    People enterInfoPeople = enterInfo(sc);

                    break;
                case 2:
                    searchDirectory(sc);

                    break;
                case 3:
                    deleteDirectory(sc);

                    break;

                case 4:
                    updateDirectory(sc);

                    break;

                case 5:
                    sortList();

                    break;
                case 6:
                    System.exit(1);

                    break;

            }

        }
    }

    public static People enterInfo(Scanner sc) {

        System.out.println("\n|" + "\n▼");
        System.out.println("Please enter your first name");
        String firstName = sc.nextLine();
        System.out.println("\n|" + "\n▼");
        System.out.println("Please enter your last name");
        String lastName = sc.nextLine();
        System.out.println("\n|" + "\n▼");
        System.out.println("Enter your phone number");
        String phoneNumber = sc.nextLine();
        System.out.println("\n|" + "\n▼");
        System.out.println("Enter your house number");
        Integer houseNumber = sc.nextInt();
        System.out.println("\n|" + "\n▼");
        sc.nextLine();
        System.out.println("Enter your street name");
        String streetName = sc.nextLine();
        System.out.println("\n|" + "\n▼");
        System.out.println("Enter city");
        String city = sc.nextLine();
        System.out.println("\n|" + "\n▼");
        System.out.println("Enter state");
        String state = sc.nextLine();
        System.out.println("\n|" + "\n▼");
        System.out.println("Enter zip");
        Integer zipCode = sc.nextInt();

        Address address = new Address(houseNumber, streetName, city, state, zipCode);
        People people = new People(firstName, lastName, phoneNumber, address);

        people.setAddress(address);

        peopleList.add(people);
        return people;

    }

    public static void searchDirectory(Scanner sc) {

        int selection = 0;

        System.out.println("1) Search first name");
        System.out.println(
                "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
        System.out.println("2) Search last name");
        System.out.println(
                "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
        System.out.println("3) Search full name");
        System.out.println(
                "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
        System.out.println("4) Search phone number");
        System.out.println(
                "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
        System.out.println("5) Search city");
        System.out.println(
                "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
        System.out.println("6) Search state");

        selection = sc.nextInt();
        sc.nextLine();

        boolean bool = true;

        if (selection == 1) {
            System.out.println("\n|" + "\n▼");
            System.out.println("Enter first name");
            String firstName = sc.nextLine();

            for (int i = 0; i < peopleList.size(); i++) {

                if (peopleList.get(i).getFirstName().equals(firstName)) {
                    System.out.println(peopleList.get(i));
                    bool = false;
                    break;

                }
            }

            if (bool) {
                System.out.println("Entry not found");

            }
        }

        if (selection == 2) {
            System.out.println("\n|" + "\n▼");
            System.out.println("Enter last name");
            String lastName = sc.nextLine();

            for (int i = 0; i < peopleList.size(); i++) {

                if (peopleList.get(i).getLastName().equals(lastName)) {
                    System.out.println(peopleList.get(i));
                    bool = false;
                    break;
                }

            }

            if (bool) {
                System.out.println("Entry not found");

            }
        }

        if (selection == 3) {
            System.out.println("\n|" + "\n▼");
            System.out.println("Enter full name");
            String fullName = sc.nextLine();

            for (int i = 0; i < peopleList.size(); i++) {

                if (fullName.equals(peopleList.get(i).getFirstName() + " " + peopleList.get(i).getLastName())) {
                    System.out.println(peopleList.get(i));
                    bool = false;
                    break;
                }

            }

            if (bool) {
                System.out.println("Entry not found");
            }
        }

        if (selection == 4) {
            System.out.println("\n|" + "\n▼");
            System.out.println("Enter phone number");
            String phoneNumber = sc.nextLine();

            for (int i = 0; i < peopleList.size(); i++) {

                if (peopleList.get(i).getPhoneNumber().equals(phoneNumber)) {
                    System.out.println(peopleList.get(i));
                    bool = false;
                    break;
                }

            }

            if (bool) {
                System.out.println("Entry not found");
            }
        }

        if (selection == 5) {
            System.out.println("\n|" + "\n▼");
            System.out.println("Enter city");
            String city = sc.nextLine();

            for (int i = 0; i < peopleList.size(); i++) {

                if (peopleList.get(i).getAddress().getCity().equals(city)) {
                    System.out.println(peopleList.get(i));
                    bool = false;
                    break;
                }

            }

            if (bool) {
                System.out.println("Entry not found");

            }

        }

        if (selection == 6) {
            System.out.println("\n|" + "\n▼");
            System.out.println("Enter state");
            String state = sc.nextLine();

            for (int i = 0; i < peopleList.size(); i++) {

                if (peopleList.get(i).getAddress().getState().equals(state)) {
                    System.out.println(peopleList.get(i));

                    bool = false;
                    break;

                }

                else if (bool) {
                    System.out.println("Entry not found");

                }
            }

        }
    }

    public static void deleteDirectory(Scanner sc) {

        System.out.println("\n|" + "\n▼");
        System.out.println("Enter phone number");
        String phoneNumber = sc.nextLine();

        boolean bool = true;

        for (int i = 0; i < peopleList.size(); i++) {

            if (peopleList.get(i).getPhoneNumber().equals(phoneNumber)) {
                peopleList.remove(peopleList.get(i));
                bool = false;
                break;

            }
        }

        if (bool) {
            System.out.println("Entry not found");

        }
    }

    public static void updateDirectory(Scanner sc) {

        int selection = 0;

        System.out.println("\n|" + "\n▼");
        System.out.println("Enter phone number");
        String number = sc.nextLine();

        System.out.println("Select option to update");
        System.out.println(
                "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
        System.out.println("1) Update first name");
        System.out.println(
                "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
        System.out.println("2) Update last name");
        System.out.println(
                "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
        System.out.println("3) Update phone number");
        System.out.println(
                "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
        System.out.println("4) Update house number");
        System.out.println(
                "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
        System.out.println("5) Update street name");
        System.out.println(
                "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
        System.out.println("6) Update city");
        System.out.println(
                "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
        System.out.println("7) Update state");
        System.out.println(
                "⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹⏹");
        System.out.println("8) Update zip code");
        selection = sc.nextInt();
        sc.nextLine();

        boolean bool = true;

        for (int i = 0; i < peopleList.size(); i++) {

            if (selection == 1 && peopleList.get(i).getPhoneNumber().equals(number)) {
                System.out.println("\n|" + "\n▼");
                System.out.println("Enter updated first name");
                String firstName = sc.nextLine();
                peopleList.get(i).setFirstName(firstName);
                bool = true;

            }

            else if (selection == 2 && peopleList.get(i).getPhoneNumber().equals(number)) {
                System.out.println("\n|" + "\n▼");
                System.out.println("Enter updated last name");
                String lastName = sc.nextLine();
                peopleList.get(i).setLastName(lastName);
                bool = false;

            }

            else if (selection == 3 && peopleList.get(i).getPhoneNumber().equals(number)) {
                System.out.println("\n|" + "\n▼");
                System.out.println("Enter updated phone number");
                String newNumber = sc.nextLine();
                peopleList.get(i).setPhoneNumber(newNumber);
                bool = false;

            }

            else if (selection == 4 && peopleList.get(i).getPhoneNumber().equals(number)) {
                System.out.println("\n|" + "\n▼");
                System.out.println("Enter updated house number");
                Integer houseNumber = sc.nextInt();
                sc.nextLine();
                peopleList.get(i).getAddress().setHouseNumber(houseNumber);
                bool = false;

            }

            else if (selection == 5 && peopleList.get(i).getPhoneNumber().equals(number)) {
                System.out.println("\n|" + "\n▼");
                System.out.println("Enter updated street name");
                String streetName = sc.nextLine();
                peopleList.get(i).getAddress().setStreetName(streetName);
                bool = false;

            }

            else if (selection == 6 && peopleList.get(i).getPhoneNumber().equals(number)) {
                System.out.println("\n|" + "\n▼");
                System.out.println("Enter updated city");
                String city = sc.nextLine();
                peopleList.get(i).getAddress().setCity(city);
                bool = false;

            }

            else if (selection == 7 && peopleList.get(i).getPhoneNumber().equals(number)) {
                System.out.println("\n|" + "\n▼");
                System.out.println("Enter updated state");
                String state = sc.nextLine();
                peopleList.get(i).getAddress().setState(state);
                bool = false;

            }

            else if (selection == 8 && peopleList.get(i).getPhoneNumber().equals(number)) {
                System.out.println("\n|" + "\n▼");
                System.out.println("Enter updated zip code");
                Integer zipCode = sc.nextInt();
                sc.nextLine();
                peopleList.get(i).getAddress().setZipCode(zipCode);
                bool = false;

            }

            else if (bool) {
                System.out.println("Entry not found");

            }
        }

    }

    public static void sortList() {

        System.out.println("\n|" + "\n▼");
        peopleList.stream().sorted(Comparator.comparing(People::getFirstName).thenComparing(People::getLastName))
                .forEach(System.out::println);

    }
}