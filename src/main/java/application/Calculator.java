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

    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    //***************Medium methods************************

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

    //***************Hard methods************************

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







