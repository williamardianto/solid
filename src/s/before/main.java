package s.before;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome to my application");

        Person person = new Person();

        System.out.println("What is your first name: ");
        person.setFirstName(reader.next());

        System.out.println("What is your last name: ");
        person.setLastName(reader.next());

        if (person.getFirstName() == null || person.getFirstName().isEmpty()) {
            System.out.println("You did not give us a valid first name!");
        }

        if (person.getLastName() == null || person.getLastName().isEmpty()) {
            System.out.println("You did not give us a valid last name!");
        }

        System.out.println(String.format("Your username is %s %s", person.getFirstName(), person.getLastName()));

        System.out.println("End of application");
    }
}
