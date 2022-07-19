import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("A");
    l.add("B");
    l.add("C");
    System.out.println(l);

    System.out.println(l.get(1));//test for get

    System.out.println(l.size());//tst size
    l.add(3, "Z");
    System.out.println(l);
  }
}
