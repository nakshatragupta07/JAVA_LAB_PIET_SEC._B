//Write a program in JAVA to demonstrate Mobile phone object of
//various dimensions using parameterized constructor.

class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

 class MobilePhoneDemo {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S21", 999.99);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 12", 1099.99);

        System.out.println("Details of phone1:");
        phone1.displayDetails();

        System.out.println("\nDetails of phone2:");
        phone2.displayDetails();
    }
}
