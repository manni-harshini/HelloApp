public class HelloApp {
    public static void main(String[] args) {

        String name;

        if (args.length > 0) {
            name = args[0];        // user provided name
        } else {
            name = "World";       // default value
        }

        System.out.println("Hello " + name);
    }
}