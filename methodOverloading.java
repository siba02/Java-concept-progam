public class methodOverloading {
                                      // Method Overloading by changing the number of parameters
    public void display() {
        System.out.println("No parameters");
    }

    public void display(String message) {
        System.out.println("Message: " + message);
    }

    public void display(String message, int number) {
        System.out.println("Message: " + message + ", Number: " + number);
    }

                                       // Method Overloading by changing the data type of parameters
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

                                       // Method Overloading by changing the order of parameters
    public void show(String s, int n) {
        System.out.println("String: " + s + ", Integer: " + n);
    }

    public void show(int n, String s) {
        System.out.println("Integer: " + n + ", String: " + s);
    }

    public static void main(String[] args) {
        methodOverloading obj = new methodOverloading();

                                       // Overloading by Number of Parameters
        obj.display();
        obj.display("Hello");
        obj.display("World", 100);

                                       // Overloading by Data Type
        System.out.println("Sum (int): " + obj.add(54, 20));
        System.out.println("Sum (double): " + obj.add(9.5, 2.3));

                                       // Overloading by Order of Parameters
        obj.show("Java", 100);
        obj.show(31, "Method Overloading");
    }
}

