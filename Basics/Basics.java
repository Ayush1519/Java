import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();

        if(x>0){
            System.out.println("Positive");
        } else {
            if(x<0){
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }
        System.out.println("Hello World");
        System.out.println("Welcome to my java world");
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