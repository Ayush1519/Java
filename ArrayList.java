import java.util.*;

public class Aydev{
  public static void main (String [] ar) {
    ArrayList<String> li = new ArrayList<>(); //new array list collection
    li.add("Java"); //.add is used to add anything in the arraylist
    li.add("Python"); 
    li.add("C++"); //add the elements
    System.out.println(li);
    
    li.remove(1); //used to remove an element
    li.add("C#");
    System.out.println(li);//printing the output

    List<Integer> l1 = new ArrayList<>();
        l1.add(1);//used to add the elments in the arraylist
        l1.add(2);//used to add the elments in the arraylist
        System.out.println("Integer list: " + l1);//printing the output
  }   
}
