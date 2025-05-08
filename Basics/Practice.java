import java.util.Scanner;
class Calculator {
    // Method to add two integers
    public int add(int a, int b) {//function
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {//function
        return a + b;
    }
}

class Shape {
    void area() {
        System.out.println("Shape");
    }
}

class Triangle extends Shape {
    void area(int h, int b) {
        System.out.println(0.5 * b * h); Scanner sc = new Scanner(System.in); // Scanner object

        int h = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();

        Triangle t1 = new Triangle();
        t1.area(h, b); // Calls Triangle's area method

        Circle c1 = new Circle();
        c1.area(r); // Calls Circle's area methodScanner sc = new Scanner(System.in); // Scanner object
        
        //Taking input
        int h = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();

        Triangle t1 = new Triangle();
        t1.area(h, b); // Calls Triangle's area method

        Circle c1 = new Circle();
        c1.area(r); // Calls Circle's area methodScanner sc = new Scanner(System.in); // Scanner object

        int h = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();

        Triangle t1 = new Triangle();
        t1.area(h, b); // Calls Triangle's area method

        Circle c1 = new Circle();
        c1.area(r); // Calls Circle's area method
    }
}

class Circle extends Shape {
    void area(int r) {
        //printing output
        System.out.println(3.14 * r * r);
    }
}
class Student {
    //instance variable
    String name;
    int rollNumber;
    double marks;
 
    //Making a constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    //Displaying details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("--------------------------");
    }
}


class MobilePhones{
    //Instance variable
    String type;
    double display_size;
    int pixel;
    int ram;
    int memory_size;

    //Constructor 
    MobilePhones(String type, double display_size, int pixel, int ram, int memory_size) {
        this.type=type;
        this.display_size=display_size;
        this.pixel=pixel;
        this.ram=ram;
        this.memory_size=memory_size;
    }
    
    //displaying 
    void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Display Size : " + display_size);
        System.out.println("Pixel: " + pixel);
        System.out.println("Ram: " + ram);
        System.out.println("Memory Size: " + memory_size);
        System.out.println("------------------------------------");
    }
}

class Student_123 {
    String name;
    int roll_no;

    Student_123(String name1, int roll_no1) {
        name = name1;
        roll_no = roll_no1;
    }


    void display() {
        System.out.println(name + " " + roll_no);
    }
}

class Student_123 {
    //Instance variable
    String name;
    int age;

    Student_123(){
        
    }
    Student_123(String name1, int age1) {
        name = name1;
        age = age1;
    }


    void display() {
        System.out.println(name + " " + age);
    }
}
class Library {
	String title;
	String author;
	int publicationyear;
	String identifier;
	boolean availability;

	Library(String title,String author,int publicationyear, String identifier,boolean availability) {
        //Constructor
		this.title=title;
		this.author=author;
		this.publicationyear=publicationyear;
		this.identifier=identifier;
		this.availability=availability;
	}
	void displayInfo() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Publication year: "+publicationyear);
		System.out.println("Identifier: "+identifier);
		System.out.println("Availability: "+availability);
	}
}

class Stu {
    //static variable is used
    static int a = 100;
    void show() {
        System.out.println("The value of a is: "+a);
        a++;
    }
    
    //Static Block
    static {
        System.out.println("Thsi is a static Block");
    }
    
    //static method
    static void displayInfo() {
        System.out.println("This  is static method");
    }
}

class Pen {
    String type;
    String color;

    Pen(String type, String color) {
        this.type = type; 
        this.color =color;
    }

    void display() {
        System.out.println("Type: "+type);
        System.out.println("Color: "+color);
    }
}


public class Main {
    public static int calculateSum(int a, int b){
        return a+b;
    }

    public static int calculateProduct(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Printing the number in reverse and checking if it is a palindrome or not
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int reversedNum = 0;


        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }
        
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }

        //writing a java program to print the greatest number in the given numbers
		int x=scanner.nextInt();
		int y=scanner.nextInt();
        int z=scanner.nextInt();
        
        if(x>y&&x>z){
            System.out.println("x is greater then both y and z");
        } else if(y>x&&y>z){
            System.out.println("y is greater then both x and z");
        } else if(z>x&&z>y){
            System.out.println("z is greater then both x and y");
        } else{
            System.out.println("Can't say");
        }  
        
        //Java program to swap two numbers
		int x=scanner.nextInt();
		int y=scanner.nextInt();
        
        x=x+y;
        y=x-y;
        x=x-y;
		
		System.out.println(x);
		System.out.println(y);

        //Java program to write reverse of a number using palindrome
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int reversedNum = 0;


        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }
        
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }

        //Java program to write fibonacci series
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        //conerting temprature from celcius to fahrenheit
        double tempratureinCelcius=scanner.nextDouble();
        
        double tempratureinFahrenheit=tempratureinCelcius*9/5+32;
        System.out.println(tempratureinFahrenheit);

        //Counting number of digits in a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int count = 0;
        num = Math.abs(num);
 
        if (num == 0) {
            count = 1; 
        } else {
            while (num > 0) {
                num /= 10; 
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
       
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        int sum=calculateSum(a,b);
        System.out.println("Sum of 2 numbers is"+sum=a+b)

        int product=calculateProduct(a,b);
        System.out.println("The product of 2 numbers is"+product=a*b);


        Student student1 = new Student("Ayush", 101, 85.5);
        Student student2 = new Student("Ayush1", 102, 90.0);

        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();
        
        MobilePhones mobile1 = new MobilePhones("Smartphone", 18.7, 87, 8, 256);
        MobilePhones mobile2 = new MobilePhones("Smartphone", 18.6, 85, 6, 128);

        System.out.println("mobile 1 Details:");
        mobile1.displayInfo();

        System.out.println("\nmobile 2 Details:");
        mobile2.displayInfo();

        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        char choice;
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Count of Positive Numbers: " + positiveCount);
        System.out.println("Count of Negative Numbers: " + negativeCount);
        System.out.println("Count of Zeros: " + zeroCount);
        
        //printing rows and columns of matrices and also printing the index  for a number
        int rows= scanner.nextInt();
        int cols= scanner.nextInt();

        int[][] numbers= new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        int x=  scanner.nextInt();

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++){
                if(numbers[i][j] == x) {
                    system.out.println("X found at the place("+ i +","+j+")");
                }
            }
        }

        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter roll_no:");
        int roll_no = sc.nextInt();

        Student_123 s1 = new Student_123(name, roll_no);
        s1.display();

         System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter age:");
        int age = sc.nextInt();

        Student_123 s1 = new Student_123(name, age);
        s1.display();

        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: " + calc.add(5, 10));       // Calls add(int, int)
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println("Sum of two doubles: " + calc.add(5.5, 10.5));    // Calls add(double, double)
        

        Scanner sc = new Scanner(System.in); 

        int h = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();

        Triangle t1 = new Triangle();
        t1.area(h, b); 

        Circle c1 = new Circle();
        c1.area(r); 

        Library l1=new Library("Down towards Earth","Ayush",2025,"axaxax",true);
		l1.displayInfo();


        Stu s1 = new Stu();
		Stu s2 = new Stu();
		s1.show();
		s2.show();
		Stu.displayInfo();

        Pen p1 = new Pen("Jel", "BLack");
        p1.display();
	}
}
