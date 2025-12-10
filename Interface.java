interface Shape{
    void getShape();
}

class Rectangle implements Shape{//class rectangle built
    public void getShape(){//function
        System.out.println("This is the Rectangle class.");//printing the output
    }
} 

class Circle implements Shape{
    public void getShape(){
        System.out.println("This is the Circle class.");//printing the output
    }
} 

class Triangle implements Shape{
    public void getShape(){
        System.out.println("This is the Triangle class.");//printing the output
    }
} 
public class Main
{
	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		s1.getShape();
		
		Shape s2 = new Circle();
		s2.getShape();
		
		Shape s3 = new Triangle();
		s3.getShape();
	}
}
