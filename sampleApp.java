public class SampleApp {
    public static void main(String[] args) {
        System.out.println("Hello, SonarQube!");

        int unusedVariable = 42;  // Example of a code smell (unused variable)
        System.out.println(divideNumbers(4, 0));  // Example of a potential bug (division by zero)
    }

    public static int divideNumbers(int a, int b) {
        return a / b;  // Potential bug (division by zero not handled)
    }
}
