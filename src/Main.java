public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Change (my name) to your name
     */
    public static void exercise1() {
        System.out.println("Exercise 1: ");
        System.out.println("Hello Andrea!"); //<--- Edit this line
    }

    /**
     * 2: Add a new println statement underneath this and put your name in it,
     * this result should look exactly the same as in exercise one if done
     * correctly!
     */
    public static void exercise2() {
        System.out.println("\nExercise 2: ");
        System.out.print("Hello");
        //Write code underneath this
        System.out.println(" Cristiano");
        //Write code underneath this
        System.out.print("Hello");
        //Write code above this
    }

    /**
     * 3: Edit this code so when it 'prints' to the console, it all appears on the same line!
     * Expected print = 'This should all appear on the same line'
     */
    public static void exercise3() {
        System.out.print("\nExercise 3: ");
        // Change the code below here
        System.out.print("This should ");
        System.out.print("all appear ");
        System.out.print("on the same line");
        // and above here

        int value = 26;
        int modulus = 3;

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "=" + value % modulus);


        double celsius = 36;
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
    }
}