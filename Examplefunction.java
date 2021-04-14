import java.util.Scanner;
public class Examplefunction {
    public static void main(String[] args) {
        String name;
        Scanner s = new Scanner(System.in);
        System.out.println("Write your name");
        name = s.next();
        check(name);
    }
    
    public static void check(String user) {
        if (user.equals("Francis")) {
            System.out.println("Welcome");
        }
        else
            System.out.println("Unknown Person");
    }
}

//scanner s declaration should be: Scanner s = new Scanner(System.in);
//check function invokation misspelled; correct line: check(name);
//check function lone argument's type should be String, not int

