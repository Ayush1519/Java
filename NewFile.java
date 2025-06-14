import java.io.*;

class FileEx{
    public static void main(String[] args) throws IOException {
        File f = new File("Test.txt");
        if(f.createNewFile()) {
            System.out.println("File created");
        } else{
            System.out.println("File not created");
        }
    }
}