/**
 * SuperArray by Team MarvelvsDC
 * Saranii Muller
* collaborators: Kate Maschmeyer, Nicole Cojuango, Ashley Ufret
 */

/**

   SKELETON
   SuperArray is a wrapper class for an array.

   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length

   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

/*
BASIC
1)SuperArray() - a basic constructor which will create a new array of size 10 and assign data to refer to it. Set the numberElements variable to 0.
2)SuperArray(int size) - create a new array of size and assign data to refer to it. Set the numberElements variable to 0. 0-
3)add(int value) -adds value to the end of the SuperArray (after the last added element)
4)isEmpty() - return true if the SuperArray is empty, false otherwise.

INTERMEDIATE
1)Write a methods grow() that will enlarge the SuperArray. It should:
2)Create a new array, 5 units larger
3)Copy the old data to the new array
4)Set the data instance variable to point to the new array

Modify these methods...
5)Modify add(int value) so that if the data array is filled it will
    a.First grow the array using the grow method you just wrote.
    b. Add the new value to the array.
6)Then add this method:
    a) get(index) - return the value at location index

ADVANCED
Write these methods:
add(index,value) which will add value at location index. You should shift the data to create an open space if you need to and you can use grow() if you need to make the array larger.
remove(index) - remove the location at index by shifting all the elements after location index and subtracting one from numberElements
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //BAsic #1 instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity

 //BASIC #2 
  public SuperArray( int size )
  {
    
    //init underlying/inner storage of specified capacity
    /* YOUR SIMPLE+SMART CODE HERE */

    //init instance vars
    /* YOUR SIMPLE+SMART CODE HERE */

  }

  //BASIC #1 
    //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
        /* YOUR SIMPLE+SMART CODE HERE */

    //init instance vars
        /* YOUR SIMPLE+SMART CODE HERE */
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  //BASIC #3
  
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    /**
       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */
    /* YOUR SIMPLE+SMART CODE HERE */

    // add item
    /* YOUR SIMPLE+SMART CODE HERE */


    // increment numberElements
    /* YOUR SIMPLE+SMART CODE HERE */

  }//end add()

// BASIC #4
  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  public int get(int index)
  {
    //return item at index
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  public String toString()
  {
    //return stringified version of this Object
    /* YOUR SIMPLE+SMART CODE HERE */
  }//end toString()


  //return Stringified version of this Object,
  // with extra debugging info
  //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    // shift items down to remove the item at index
    /* YOUR SIMPLE+SMART CODE HERE */

    // subtract fom numElements;
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  public void add(int index, int value)
  {
    // see if there's enough room
    /* YOUR SIMPLE+SMART CODE HERE */

    // shift elements toward the end of the array
    /* YOUR SIMPLE+SMART CODE HERE */

    // insert new element
    /* YOUR SIMPLE+SMART CODE HERE */

    // increment numElements
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    /* YOUR SIMPLE+SMART CODE HERE */

    // copy over all the elements from the old array to the new one
    /* YOUR SIMPLE+SMART CODE HERE */

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */
  }//end grow()

}//end class