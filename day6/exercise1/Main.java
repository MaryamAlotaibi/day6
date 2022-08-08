import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("First number:");
            int number1 = in.nextInt();
            System.out.println("Second number:");
            int number2 = in.nextInt();

            System.out.println("Please enter your operation : ");
            String operation = in.next();

            if (operation.equals("+")) {
                System.out.println(number1 + number2);
            } else if (operation.equals("-")) {
                System.out.println(number1 - number2);
            } else if (operation.equals("*")) {
                System.out.println(number1 * number2);
            } else if (operation.equals("/")) {
                System.out.println(number1 / number2);
            } else if (operation.equals("%")) {
                    System.out.println(number1 % number2);
            } else {
                System.out.println("Wrong operation");
            }
        }

    }
