import java.util.Scanner;

public class Main {
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
	}
}
