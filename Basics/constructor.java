class Students{
    String name;
    int age;
    
    Students () {
        System.out.println("Unparameterised constructor called");
    }
    
    Students(String name, int age) {
        this.name=name;
        this.age=age;
    }
    
    void displayInfo() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    
    Students (Students s2) {
        this.name =s2.name;
        this.age =s2.age;
    }
}


public class Main
{
	public static void main(String[] args) {
		Students s1= new Students("Ayush", 19);
		s1.displayInfo();
		Students s2 = new Students(s1);
		s2.displayInfo();
	}
}