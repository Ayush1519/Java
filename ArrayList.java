import java.util.*;//library

public class Aydev{//class declared
  public static void main (String [] ar) {
    ArrayList<String> li = new ArrayList<>(); //new array list collection
    li.add("Java"); //.add is used to add anything in the arraylist
    li.add("Python");//.add is used to add anything in the arraylist 
    li.add("C++");
    System.out.println(li);//print statment
    
    li.remove(1); //used to remove an element
    li.add("C#");//used to add 
    System.out.println(li);//printing the output

    List<Integer> l1 = new ArrayList<>();//Collection
        l1.add(1);//used to add the elments in the arraylist
        l1.add(2);//used to add the elments in the arraylist
        System.out.println("Integer list: " + l1);//printing the output


    ArrayList<String> al = new ArrayList<>();
        al.add("Ayush");
        al.add("Ayush");

      	System.out.println("Original List : "+al);
        al.add(1, "Singh");
      	System.out.println("After Adding element at index 1 : "+ al);
      	al.remove(0);
      	System.out.println("Element removed from index 0 : "+ al);
      	al.remove("Ayush");
      	System.out.println("Element Ayush removed : "+ al);//printing the output
      	al.set(0, "Ayush");
        System.out.println("List after updation of value : "+al);

    return 0;//return statement
  }   
}
