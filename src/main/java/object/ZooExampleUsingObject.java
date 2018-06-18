package object;

import template.Zoo;

public class ZooExampleUsingObject {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(100, 1988, 5, 10);
        printZooDescription(zoo);

        zoo.numberOfAnimals = 200;
        zoo.builtYear = 1930;
        zoo.width = 20;
        zoo.height = 30;
        printZooDescription(zoo);
    }

    public static void printZooDescription(Zoo zoo) {
        System.out.println("This zoo has " + zoo.numberOfAnimals + " animals.");
        System.out.println("Built in " + zoo.builtYear + ".");
        System.out.print("The area of the zoo is " + zoo.height + " km x " + zoo.width + " km");
        System.out.println(", which is equal to " + zoo.getArea() + " km^2");
        System.out.println("====================");
    }
}
