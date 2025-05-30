class Students{
    String name;
    int age;
    
    //unparameterised constructor
    Students () {
        System.out.println("Unparameterised constructor called");
    }
    
    //parameterised constructor
    Students(String name, int age) {
        this.name=name;//name constructor
        this.age=age;
    }
    
    void displayInfo() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    
    //copy constructor
    Students (Students s2) {
        this.name =s2.name;
        this.age =s2.age;
    }
}


public class Main
{
	public static void main(String[] args) {
        //naming new things
		Students s1= new Students("Ayush", 19);
		s1.displayInfo();
		Students s2 = new Students(s1);
        //dispalying values
		s2.displayInfo();
	}
}