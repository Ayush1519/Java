import java.io.*;
import java.util.*;

class FileEx{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File f = new File("Test.txt");//creates new file named as Test.txt
        if(f.createNewFile()) {
            System.out.println("File created");
        } else{
            System.out.println("File not created");
        }
    
        FileWriter fr = new FileWriter("Test3.txt");
        fr.write("Hello!");//writing into a file
        fr.close();

        File f1 = new File("Test4.txt");
        Scanner sc =new Scanner(f1);
        if(sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.prinln(s);
        }

        int a = sc .nextInt();//taking input 
        int b = sc .nextInt();//taking input 

        a=a+b;//to swap to numbers without using third variable
        b=a-b;
        a=a-b;

        System.out.println(a);//printing value
        System.out.println(b);//printing value

        int a[] = new int[2];
		try{
		    System.out.println("a[4]:"+a[4]);
		} catch(ArrayIndexOutOfBoundsException e) {//Expected exception
		    System.out.println(e);
		} finally {
		    a[1]= 30;
		    System.out.println("a[1]:"+a[1]);
		    System.out.println("End of the program");//printing value
		}
    }
} 
