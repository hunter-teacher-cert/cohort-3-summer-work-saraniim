import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("A");
    l.add("B");
    l.add("C");
    System.out.println(l);

    System.out.println("THIS IS GET: " + l.get(1));//test for get

    System.out.println("This is size: " + l.size());//tst size
    l.add(1,"bananas");
    System.out.println("This is adding at index: " + l);
  }
}
