import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
		int a= sc.nextInt();
		int b= sc.nextInt();
		int division=(a/b);
		int num = 10 / 0;
        int arr[] = new int[5];
        arr[10] = 50; //intializing the array
		System.out.println(division);
		} catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("General exception occurred.");
        }
        System.out.println("Program continues...");

		
		System.out.println("Work is done");
	}
}
