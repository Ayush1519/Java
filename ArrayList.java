import java.util.*;

public class Aydev{
  public static void main (String [] ar) {
    ArrayList<String> li = new ArrayList<>(); 
    li.add("Java"); //.add is used to add anything in the arrayList
    li.add("Python"); 
    li.add("C++"); 
    System.out.println(li);
    
    li.remove(1); 
    System.out.println(li);
  }   
}
