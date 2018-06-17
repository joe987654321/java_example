package condition;

public class SwitchExample {
    public static void main(String[] args) {
        testAnimal("cat");
        testAnimal("dog");
        testAnimal("dinosaur");
        testAnimal("elephant");
        testAnimal("pigeon");
        testAnimal("eagle");
        testAnimal("monkey");
    }

    public static void testAnimal(String input) {
        System.out.println("checking " + input);
        switch(input) {
            case "cat":
                System.out.println("input is cat, meow meow");
                break;

            case "dog":
                System.out.println("input is dog, bow bow");
                break;

            case "dinosaur":
                System.out.println("dinosaur does not exist on earth now");
            case "elephant":
                System.out.println("input is a big animal");
                break;

            case "pigeon":
            case "eagle":
                System.out.println("input is a bird");
                break;

            default:
                System.out.println("unknown animal");
        }
        System.out.println("======================");
    }
}
