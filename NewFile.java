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

        int a = sc .nextInt();
        int b = sc .nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);
    }
} 