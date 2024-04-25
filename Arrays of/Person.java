import java.util.*;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] people = new Person[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the name for person " + (i + 1) + ":");
            String name = scanner.nextLine();
            System.out.println("Enter the age of the person:");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            people[i] = new Person(name, age);
        }
        System.out.println("People's information:");
        for (Person person : people) {
            person.displayDetails();
            System.out.println();
        }
    }
}
