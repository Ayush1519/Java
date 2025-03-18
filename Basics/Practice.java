// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();
//         int originalNum = num;
//         int reversedNum = 0;


//         while (num != 0) {
//             int digit = num % 10;
//             reversedNum = reversedNum * 10 + digit;
//             num = num / 10;
//         }
        
//         if (originalNum == reversedNum) {
//             System.out.println(originalNum + " is a palindrome.");
//         } else {
//             System.out.println(originalNum + " is not a palindrome.");
//         }

//         scanner.close();
//     }
// }

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
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
	}
}
