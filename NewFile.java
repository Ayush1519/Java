import java.io.*;
import java.util.*;

class FileEx{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File f = new File("Test.txt");//creates new file named as Test.txt
        if(f.createNewFile()) {
            System.out.println("File created");//output
        } else{
            System.out.println("File not created");
        }
    
        FileWriter fr = new FileWriter("Test3.txt");
        fr.write("Hello!");//writing into a file
        fr.close();

        File f1 = new File("Test4.txt");
        Scanner sc =new Scanner(f1);
        if(sc.hasNextLine()) {
            String s = sc.nextLine();//taking input 
            System.out.prinln(s);//printing value
        }

        int a = sc .nextInt();//taking input 
        int b = sc .nextInt();//taking input 

        a=a+b;//to swap to numbers without using third variable
        b=a-b;//to swap to numbers without using third variable
        a=a-b;//to swap to numbers without using third variable

        System.out.println(a);//printing value
        System.out.println(b);//printing value

        int a[] = new int[2];//array
		try{//try and catch block usage
		    System.out.println("a[4]:"+a[4]);
		} catch(ArrayIndexOutOfBoundsException e) {//Expected exception
		    System.out.println(e);//printing the values
		} finally {//using finally keyword
		    a[1]= 30;
		    System.out.println("a[1]:"+a[1]);//printing value
		    System.out.println("End of the program");//printing value
		}
    }
} 
