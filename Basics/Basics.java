import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        //Adding a scanner function in my code
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        String name = scanner.nextLine(); // Store input as String

        System.out.println(name); // Print the name
    }
}
        
        for(int i=1; i<=5; i++) {
	        int square=i*i;//doing some operations
	        System.out.println(square);
	    }
        //Using if else staement to find whether the given number is +ve or -ve or 0
        if(x>0){//condition
            System.out.println("Positive");//
        } else {
            if(x<0){
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        scanner sc = new scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int avg = a+b;
        System.out.println(avg);
        
        //taking day as input from the user
        int day=scanner.nextInt();
        
        //Using switch statement to print he day it is
        Switch(day) {
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
            break;
            case 3:System.out.println("Wednesday");
            break;
            case 4:System.out.println("Thursday");
            break;
            case 5:System.out.println("Friday");
            break;
            case 6:System.out.println("Saterday");
            break;
            case 7:System.out.println("Sunday");
            break;
            default:System.out.println("Invalid day")");//using default statement

        }
        
        System.out.println("Hello World");
        System.out.println("Welcome to my java world");//greetings

        Writng some basic codes for pure basics to be clear
        int a=2;
        int b=4;
        int sum=a+b;
        System.out.println(sum);
        int mul=a*b;
        System.out.println(mul);
        int diff=a-b;
        System.out.println(diff);
        int div=a/b;
        System.out.println(div);
        itn modulo=a%b;
        System.out.println(modulo);
        

    }
}
