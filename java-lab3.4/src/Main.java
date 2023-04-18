//Write a program in JAVA to create a class Bird also declares the different
//parameterized constructor to display the name of Birds.


class Bird {
     public static void main(String[] args) {
         Bird bird1 = new Bird();
         Bird bird2 = new Bird("Pigeon");
         Bird bird3 = new Bird("Sparrow", true);

         bird1.printName();
         bird2.printName();
         bird3.printName();
     }
    String name;

    public Bird() {
        this.name = "Unknown";
    }

    public Bird(String name) {
        this.name = name;
    }

    public Bird(String name, boolean isDomestic) {
        if (isDomestic) {
            this.name = "Domestic " + name;
        } else {
            this.name = "Wild " + name;
        }
    }

    public void printName() {
        System.out.println("The name of the bird is: " + name);
    }
}


