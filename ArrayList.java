import java.util.*;

public class Aydev{
  public static void main (String [] ar) {
    ArrayList<String> li = new ArrayList<>(); 
    li.add("Java"); //.add is used to add anything in the arraylist
    li.add("Python"); 
    li.add("C++"); 
    System.out.println(li);
    
    li.remove(1); 
    li.add("C#");
    System.out.println(li);

    List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        System.out.println("Integer list: " + l1);
  }   
}
