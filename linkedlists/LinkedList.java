import java.io.*;
import java.util.*;

//Saranii + Taylor, Ben, Marieke
/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).

Basic
-----
✔️add(string value)
✔️get(int index);
✔️toString()


Intermediate (at least add, size + one of the other two)
------------
✔️size()
add(int index,String value)
indexOf(String value);
toArray()


Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;//head is the first node in the linked list
  }

  /**
  Parameters:
  value - the new string to add to the list

  Adds a new node containing value to ONLY the front of the list.
  */
  public void add(String value){ //val
    Node front;//declares variable called front
    front = new Node(value);//create and fill box
    front.setNext(head); //makes front first node fka head
    head = front;

    // You can do the above in one line of code:
    // head = new Node(value, head);
  }

  /**
  Returns the String in the node at location index.

  */
  public String get(int index){
    Node walker = head;
    
    for (int i = 0; i < index ; i++){
      walker = walker.getNext();
    }
    return walker.getData();//returns the data in that position of walker
    
  }

  /**
  Return a string representation of the list
  */
  public String toString(){
    // Create a walker Node here that points to head

    /* FROM NODE CLASS
    public String toString(){
      return "" + data + "->";
    }
    */
    //walker is a node but has T=toString built in THUS line79 possible temp+=walker
    Node walker = head;
    // Need a String variable to store the output to return
    String temp = "";
    while(walker != null){
      // Instead of printing, concatenate on walker to output string
      temp += walker;
      walker = walker.getNext();//walks it along
    }
    //Need to return the completed string output - which is temp because of temp += walker
    return temp;
  }

  /**
  returns the number of elements in the list
  */
  public int size(){//creates size method
    Node walker = head;//sets node of walker to head
    int counter = 0; //starts at node 0
    
    while(walker != null){ //while loop as long as walker is not null
      walker = walker.getNext(); //set walker to the next node
      counter++; //increase node position by 1
    }
    return counter; //return number nodes counted
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
  //l.add(“something”) <automatically goes to the beginning based on first add method
  //ladd(3,"something”) <-- inserts into that #

  public void add(int index, String value){ //
    if (index == 0) {
      add(value);
      
    }
    else {
    //for loop to walk to the correct place in order to insert the new value
    Node walker = head;
    Node zed = new Node(value);
    
    
    for (int i = 0; i < index-1; i++){
      walker = walker.getNext();//traverses nodes
    }
      zed.setNext(walker.getNext());//point to b
      walker.setNext(zed);//need walker to point ?
      //ben do you want to test this? 
       //trying to figure out print statement to do
           
         
         
  
    
  }
//add(3,"chicken")//insert between c and d
  //point to d
  //point c to chicken
  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  //public int indexOf(String value){
    //return 0;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
  //public String[] toArray(){
    //return null;
  }



  /**
  Remove the Node at location index from the list.

  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
  }
}