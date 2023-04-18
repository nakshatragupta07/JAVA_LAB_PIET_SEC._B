//2.1. Write a program to create a class Student with
//data ‘name, city and age’ along with method print
//Data to display the data. Create the two objects s1 ,s2 to declare and access the values


  class Student {
    String name;
    String city;
    int age;

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}
 class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.city = "New York";
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "Bob";
        s2.city = "San Francisco";
        s2.age = 22;

        System.out.println("Student 1 data:");
        s1.printData();

        System.out.println("Student 2 data:");
        s2.printData();
    }
}

