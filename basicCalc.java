import java.util.Scanner;
public class basicCalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean repeat = false;
        menu();

        do {
            System.out.print("\nDo you want to repeat? [Y/N]: ");
            char ans = s.next().charAt(0);
            if (ans == 'Y' || ans == 'y') {
                repeat = true;
                menu();
            }
            else if (ans == 'N' || ans == 'n') {
                repeat = false;
                System.out.print("\nGoodbye!");
            }
            else {
                System.out.print("Invalid input. Please enter Y/N.");
                repeat = true;
            }
        } while (repeat);
    }
    public static void menu() {
        double num1, num2;
        Scanner s = new Scanner(System.in);
        boolean validInput = false;

        System.out.print("\nEnter 1st input: ");
        num1 = Double.parseDouble(s.next());
        System.out.print("Enter 2nd input: ");
        num2 = Double.parseDouble(s.next());

        do {
            System.out.println("\nOPERATIONS");
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Division");
            System.out.println("[5] Modulus");
            System.out.println("[6] Exponentiation");
            System.out.print("Enter operation choice: ");
            char choice = s.next().charAt(0);

            String template = "Answer is %f";
            switch(choice) {
                case '1':
                    validInput = true;
                    String result = String.format(template, add(num1, num2));
                    System.out.println(result);
                    break;
                case '2':
                    validInput = true;
                    result = String.format(template, subt(num1, num2));
                    System.out.println(result);
                    break;
                case '3':
                    validInput = true;
                    result = String.format(template, mult(num1, num2));
                    System.out.println(result);
                    break;
                case '4':
                    validInput = true;
                    result = String.format(template, divide(num1, num2));
                    System.out.println(result);
                    break;
                case '5':
                    validInput = true;
                    result = String.format(template, mod(num1, num2));
                    System.out.println(result);
                    break;
                case '6':
                    validInput = true;
                    result = String.format(template, exp(num1, num2));
                    System.out.println(result);
                    break;
                default:
                    validInput = false;
                    System.out.println("Invalid input. Please choose a valid choice.");
            } 

        } while (!validInput);

    }
    public static double add(double x, double y) {
        return x + y;
    }
    public static double subt(double x, double y) {
        return x - y;
    }
    public static double mult(double x, double y) {
        return x * y;
    }
    public static double divide(double x, double y) {
        return x / y;
    }
    public static double mod(double x, double y) {
        return x % y;
    }
    public static double exp(double x, double y) {
        return Math.pow(x, y);
    }
}
