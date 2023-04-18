// Write a program to create a class Student2 along with two method
//getData(),printData() to get the value through argument
//and display the data in printData. Create the two
//objects s1 ,s2 to declare and access the values from class STtest.

 class Student2 {
    String name;
    String city;
    int age;

    public void getData(String n, String c, int a) {
        name = n;
        city = c;
        age = a;
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}
 class STtest {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.getData("Alice", "New York", 20);

        Student2 s2 = new Student2();
        s2.getData("Bob", "San Francisco", 22);

        System.out.println("Student 1 data:");
        s1.printData();

        System.out.println("Student 2 data:");
        s2.printData();
    }
}
