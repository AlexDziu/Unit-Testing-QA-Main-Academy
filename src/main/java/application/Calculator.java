package application;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("You cannot divide by 0");
            return b;
        }
        return a / b;
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public int averageValue(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public boolean evenOrOddNumbers(int a) {
        return a % 2 == 0;
    }

    public int biggestValue(int a, int b) {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return 0;
        }
    }

    public int sumOfParameters(int... num) {
        int sum = 0;
        for (double i : num)
            sum += i;
        return sum;
    }

    public int divideByZeroCase(int a, int b) {
        if (b == 0) {
            return -100;
        }
        return a / b;
    }
}







