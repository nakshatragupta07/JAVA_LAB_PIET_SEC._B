//Write a program in JAVA to demonstrate the
//method and constructor overloading.


class OverloadingDemo {
    public void printMessage() {
        System.out.println("Hello!");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public OverloadingDemo() {
        System.out.println("Default constructor called");
    }

    public OverloadingDemo(int n) {
        System.out.println("Parameterized constructor called with value: " + n);
    }

    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();

        obj.printMessage();
        obj.printMessage("Welcome to Java Programming!");

        int sum1 = obj.add(2, 3);
        double sum2 = obj.add(4.5, 5.5);

        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);

        OverloadingDemo obj2 = new OverloadingDemo(10);
    }
}
