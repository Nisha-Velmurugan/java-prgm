public class OddOrEven {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            if (number % 2 == 0) {
                System.out.println(number + " is Even.");
            } else {
                System.out.println(number + " is Odd.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}
