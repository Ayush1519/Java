import java.util.Scanner;
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
    
    //
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("--------------------------");
    }
}

class MobilePhones{
    String type;
    double display_size;
    int pixel;
    int ram;
    int memory_size;

    MobilePhones(String type, double display_size, int pixel, int ram, int memory_size) {
        this.type=type;
        this.display_size=display_size;
        this.pixel=pixel;
        this.ram=ram;
        this.memory_size=memory_size;
    }

    void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Display Size : " + display_size);
        System.out.println("Pixel: " + pixel);
        System.out.println("Ram: " + ram);
        System.out.println("Memory Size: " + memory_size);
        System.out.println("------------------------------------");
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
      
	}
}
