package com.company;

public class Application {

    public static void main(String[] args) {

        while (true) {
            float firstNumber = getFirstNumber();
            String operator = getOperator();
            float secondNumber = getSecondNumber();
            float result;
            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    System.out.println("\n");
                    System.out.println(firstNumber+ " + " + secondNumber + " = " +result);
                    System.out.println("\n");
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    System.out.println("\n");
                    System.out.println(firstNumber+ " - " + secondNumber + " = " +result);
                    System.out.println("\n");
                    break;
                case ":": case "/":
                    if (secondNumber == 0) {
                        System.out.println("\n");
                        System.out.println("You can divide by zero only in the University");
                        System.out.println("\n");
                    } else {
                        result = firstNumber / secondNumber;
                        System.out.println("\n");
                        System.out.println(firstNumber+ " / " + secondNumber + " = " +result);
                        System.out.println("\n");
                    }
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    System.out.println("\n");
                    System.out.println(firstNumber+ " * " + secondNumber + " = " +result);
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("Oops, something went wrong");
                    System.out.println("\n");
            }
        }


    }
    private static float getFirstNumber () {
        float firstNumber = 0;
        while(true) {
            System.out.print("Enter first number : ");
            String firstInput = System.console().readLine();
            checkQuit(firstInput);

            try {
                firstNumber = Float.parseFloat(firstInput);
                return firstNumber;
            } catch (NumberFormatException e) {
                System.out.println("\n");
                System.out.println("!!! Please, enter valid number !!!");
                System.out.println("\n");
            }
        }

    }
    private static String getOperator () {
        while(true) {
            System.out.print("Enter operator : ");
            String operator = System.console().readLine();
            checkQuit(operator);
            String convertedOperator = operator.trim();

            if (convertedOperator.equals("+") || convertedOperator.equals("-") || convertedOperator.equals("/") || convertedOperator.equals(":") || convertedOperator.equals("*")) {
                return convertedOperator;} else
            {
                System.out.println("\n");
                System.out.println("!!! Please, enter valid operator !!!");
                System.out.println("\n");
            }
        }

    }
    private static float getSecondNumber () {
        float secondNumber = 0;
        while(true) {
            System.out.print("Enter second number : ");
            String secondInput = System.console().readLine();
            checkQuit(secondInput);

            try {
                secondNumber = Float.parseFloat(secondInput);
                return secondNumber;
            } catch (NumberFormatException e) {
                System.out.println("\n");
                System.out.println("!!! Please, enter valid number !!!");
                System.out.println("\n");
            }
        }

    }
    private static void checkQuit (String input){
        String convertedInp = input.trim().toLowerCase();
        if (convertedInp.equals("quit")){
            System.out.println("\n");
            System.out.println("***Good luck!***");
            System.out.println("\n");
            System.exit(0);
        }
    }
}
