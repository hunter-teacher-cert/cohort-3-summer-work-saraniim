import java.io.*;
import java.util.*;

/** Methods to write

Basic level:
------------
public static ArrayList<Integer> buildRandomList(int size, int maxval)
public static int sumOfList(ArrayList<Integer> dataList)

Intermediate level:
-------------------
public static void swapElements(ArrayList<Integer> dataList, int indexA,int indexB)
public static void removeValue(ArrayList<Integer> dataList, int valueToRemove)

Challenge level:
-------------------
public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
*/


public class AlPractice{

  /**
  Parameters:
  - size - an integer representing how many items to add to the list
  - maxval - the largest value to store in the list
  Preconditions:
  - size >= 0
  - maxVal > 0
  Returns:
  - A new ArrayList of Integers with each value being a random
    number between 0 and maxval (not including maxval).
  */
  public static ArrayList<Integer> buildRandomList(int size, int maxval){
    //constructor for new empty ArrayList called randomList with an as yet to be specified size
    ArrayList<Integer> randomList = new ArrayList<Integer> (size);
    //use Math.random to get random numbers
    //return a random list of numbers given the parameters size (size of ArrayList) and max value (e.g. 100 would give numbers 0 - 99)
    //adds a random number to array called random list
    //Math.random() * maxval is how to always generate a random number more than 1 
    //Math.random gives ANY possible decimal value between 0 and 1 and then maxval is 100 - ex Math.random is .5 *100 is 50
  //variable.adds (typecast to become integer and floors meanign removing decimals rather than rounding)then adding a random number

    //build a loop to fill all array indices
    for (int i = 0; i < size; i++)
    {
      randomList.add((int)(Math.random() * maxval));//creates numbers in array as long as loop holds true
    }
    return randomList;//returns data
  }

  /**
  Parameters:
  - dataList - an ArrayList of integer values.
  Returns:
  - The sum of all of the elements of the ArrayList.
  */
  public static int sumOfList(ArrayList<Integer> dataList){
    // list.size() <- how you get the length of the ArrayList
    // list.get(index) <- this returns the value in the ArrayList at index
    //creates variable of running total 
    int sum = 0;
    //create loop to add elements for sum
    //              dataList.size here is a method
    for (int i = 0; i < dataList.size(); i++) {
      
    }
    return 0;//placeholder to compile. Would this be returning sum?
  }

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - index1, index2 - the two locations to swap.
  Preconditions:
  - index1 and index2 are valid indecies of dataList
  Postconditions:
  - The ArrayList is modified such that
    The value that was in dataList[index1] is now in dataList[index2], and
    the value  that was in dataList[index2] is now in dataList[index1].
  - No other values should be modified.
  */
  public static void swapElements(ArrayList<Integer> dataList, int index1,int index2){

  }

  /**
  Parameters:
  - dataList - an AraryList of Integers
  - valueToRemove - the value to remove
  Postconditions:
  - The dataList is modified such that all occurances of valueToRemove are removed.
  */
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove){

  }


  /**
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Preconditions:
  - ListA and ListB have equal lengths.
  Returns:
  - A new ArrayList that contains the sum of the corresponding indecies of the two arraylists.
    e.g. sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    return null;//placeholder to compile.
  }

  /** zipLists
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Returns:
  - A new ArrayList that contains all of the elements from both ArrayLists in alternating order starting with ListA's first element.
    When one list has no more values to add, continue adding the remaining values of the longer list.
    e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    return null;//placeholder to compile.
  }




  public static void main(String[] args) {

    ArrayList<Integer> al;

    //Uncomment these to test buildRandomList
    //Creates list of 10 random numbers between 0 and 99
    al = buildRandomList(10,100);
    System.out.println(al);

    //Uncomment these to test swapElements
    //swapElements(al,2,6); // NOTE: had to include al
    //System.out.println(al);

    // Uncomment these to test removeValue
    //al.add(5);
    //al.add(10);
    //al.add(5);
    //al.add(13);
    //al.set(2,5);
    //al.set(3,5);
    //System.out.println(al); //NOTE:  this was listed as a, not al
    //removeValue(al,5);
    //System.out.println(al); //NOTE:  this was listed as a, not al

  }



}