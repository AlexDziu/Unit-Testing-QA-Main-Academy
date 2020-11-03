package application;

public class Calculator {

    //***************Simple methods************************

    public int add(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }


    public int multiplication(int a, int b) {
        return a * b;
    }


    public double division2(double a, double b) {
        try {
            if (b == 0) {
                System.out.println("You divide by 0");
                return b;
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        return a / b;
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    //TODO add method for x^2
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    //***************Medium methods************************

    //TODO (*) |average value| add method which calculate average value of 3 numbers
    public int averageValue(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    //TODO (*) |even or odd| add method which get 1 number as parameter and return true if it even, and false - if odd
    public boolean evenOrOddNumbers(int a) {
        return a % 2 == 0;
    }

    //TODO (*) |biggest value| add method which get 2 number as parameters and return bigger of them, or 0 if they equals
    public int biggestValue(int a, int b) {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return 0;
        }
    }

    //***************Hard methods************************

    //TODO (**) |addition with multiple parameters| add method which return sum of any quantity of parameter
    public int sumOfParameters(int... num) {
        int sum = 0;
        for (double i : num)
            sum += i;
        return sum;
    }

    //TODO (*) |divide by zero case| add method for division (check division by zero case
    // - if we try to divide by zero - return -100;
    public int divideByZeroCase(int a, int b) {
        if (b == 0) {
            return -100;
        }
        return a / b;
    }


}







