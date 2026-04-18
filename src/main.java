// No package for simplicity

public class Main {

    public static void main(String[] args) {
        System.out.println("🚀 Java 25 Sample Project");

        var result = add(15, 10);   // using 'var'
        System.out.println("Sum = " + result);

        greet("DevOps Learner");
    }

    static int add(int a, int b) {
        return a + b;
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
