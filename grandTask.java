import java.util.Scanner;
public class grandTask {
    public static void main(String[] args) {
        String[] stack = {"Alvin", "Brody", "Carver", "Carver", "Dorian", "Ervin", "Alvin", "Dorian", "Ervin", "Brody", "Alvin", "Dorian", "Carver", "Alvin", "Brody"};
        Scanner s = new Scanner(System.in);
        boolean repeat = false;
    
        String[] newStack = prompt(stack, false);

        do {
            if (newStack.length == 0) {
                repeat = false;
                System.out.print("\nStack is empty.");
                System.out.print("\n---------- Goodbye! ----------");
                break;
            }
            System.out.print("\nDo you want to repeat? [Y/N]: ");
            char ans = s.next().charAt(0);
            if (ans == 'Y' || ans == 'y') {
                repeat = true;
                newStack = prompt(newStack, true);
            }
            else if (ans == 'N' || ans == 'n') {
                repeat = false;
                System.out.print("\n\n---------- Goodbye! ----------");
            }
            else {
                System.out.print("Invalid input. Please enter Y/N.");
                repeat = true;
            }
        } while (repeat);
        
    }

    public static String[] deleteName(String[] arr, String name, int instance) {
        String[] newArray = new String[arr.length - instance];
        int newArrayIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean equal = name.equals(arr[i].toLowerCase());
            if (equal) continue; 
            newArray[newArrayIndex] = arr[i];
            newArrayIndex++;
        }

        System.out.printf("\nDeleting %d instances of %s...\n", instance, name);

        for (int i = 0; i < newArray.length; i++) {
            System.out.printf("newstack[%d]: %s\n", i, newArray[i]);
        }
        System.out.printf("Number of entries: %d\n", newArray.length);
        return newArray;
    }

    public static String[] prompt(String[] arr, boolean newStack) {
        //printing stack array
        System.out.println("\nArray:");
        if (newStack) {
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("newstack[%d]: %s\n", i, arr[i]);
            }
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("stack[%d]: %s\n", i, arr[i]);
            }
        }
        
        System.out.printf("Number of entries: %d\n", arr.length);

        String name;
        int instance = 0;
        Scanner s = new Scanner(System.in);
        boolean validInput = false;
        String[] newArray = null;

        do {
            System.out.print("\nDELETE WHO: ");
            name = s.next();

            for (int i = 0; i < arr.length; i++) {
                boolean equal = name.equals(arr[i].toLowerCase());
                if (equal) {
                    validInput = true;
                    instance += 1;
                }
            }

            if (validInput) {
                newArray = deleteName(arr, name, instance);
                return newArray;
            }

            System.out.printf("Sorry, the name \"%s\" is not in the Array. Please try another one.", name);

        } while (!validInput);
        return newArray;

    }

}