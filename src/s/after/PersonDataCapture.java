package s.after;

import java.util.Scanner;

public class PersonDataCapture {

    public static Person capture() {
        Scanner reader = new Scanner(System.in);

        Person person = new Person();

        System.out.println("What is your first name: ");
        person.setFirstName(reader.next());

        System.out.println("What is your last name: ");
        person.setLastName(reader.next());

        return person;
    }
}
