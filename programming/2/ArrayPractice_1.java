/**
 * ArrayPractice by Team Room 8
 * Saranii Muller
 * collaborators: Nicole Cojuango, Parmanand Mohanlall, Greg Sciame
 */

/**
   INSTRUCTIONS:
   This file contains stubs (empty methods) for the following methods:

   1. buildIncreasingArray
   2. buildRandomArray
   3. printArray
   4. arraySum
   5. firstOccurence
   6. isSorted
   7. findMaxValue
   8. countOdds
   9. flip

   The stubs will have comments describing what they should do

   Levels:
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   Basic:
   Complete these methods:
   - buildRandomArray line 85-93 👍
   - printArray line 109 👍
   - arraySum line 147 👍
   - firstOccurence line 129
   - findMaxValue line 184

   Intermediate:
   Complete all the methods for basic and also
   - buildIncreasingArray
   - isSorted
   - countOdds

   Advanced:
   Complete all the methods
*/

import java.util.*;
import java.io.*;


public class ArrayPractice
{

  /**
     Parameters:
     size - how large the array should be
     startValue - the value of the first element
     step - the interval to the next value

     Returns:
     a new array of integers

     Examples:
     buildIncreasingArray(5,3,2) will return an array
     with the values 3,5,7,9,11 (five values, starting with 3 with a step size of 2)
  */
  public static int[] buildIncreasingArray( int size, int startValue, int step )
  {
    int[] data = new int[size];

    // loop through each element of the array and
    /* YOUR BRILLIANT CODE HERE */

    // assign the appropriate value to each one.
    /* YOUR BRILLIANT CODE HERE */

    return data;
  }


  /**
     Parameters:
     size - how many elements in the array
     maxValue - the largest possible random value to use

     Returns:
     a new array where each element is an integer between 0
     and up to but not including maxValue
  */
//buildRandomArray 
  public static int[] buildRandomArray( int size, int maxValue )//definition of a method with parameters which are in parentheses - a certain size with a maximum value
  {
    //creates an array of a certain size
    Random r = new Random();
    int[] data = new int[size]; //size here is still a variable will be defined later by someone else - maybe user input

    /* YOUR BRILLIANT CODE HERE */
    //starting condition int i = 0; 
    //i< data.length means stop at end of data array
    //i++ increment up by 1 
    //can also use: I++,i+=1,i=i+1

    //this loop builds array with random numbers
  for(int i = 0; i < data.length; i++){
    data[i] = r.nextInt(maxValue);

  
  }

    return data;
  }


  /**
     Parameters:
     data - an array of ints

     Returns:
     nothing

     prints out the array

     Note: data.length stores the length of the array
     Another Note: yes, we know William live coded this a few minutes ago.
  */
//printArray 
  public static void printArray( int[] data ){
  
System.out.print("{" + data[0]);
    for (int i = 1; i < data.length; i++) {
        System.out.print(", " + data[i]);
    }
    System.out.print("}");
  System.out.println("");
    /* YOUR BRILLIANT CODE HERE */
  }



  /**
     Parameters:
     data - an array of integers
     value - the value to search for

     Returns:
     the index (location) of the first occurence of value

     Example:
     given array data, containing 1,5,2,7,5,8,5,12,19,5
     firstOccurence(data,5) would return 1
     since the first occurence of the value 5 is at a[1]
  */
//firstOccurence - searches through the array for a specific number
  //from Group 8   July 5
  //Jerusha T., Patti E., Saranii M., Jessica A.

  //array called data, integer called value
  public static int firstOccurence(int[] data, int value)
  {
  // go through each index until you find the value, then return that index
    int i = -1; //if the value is not found it will print -1
    int currSize = data.length; //sets currSize variable to length of data? 
   // while i iS leSS than currSize and the current index iSnt the value
    while (i < currSize && data[i] != value ) //conditionals : && and - both conditions MUST be true,  || or
    {
        i++;
    }  
    return i; // change this (it is just a placeholder to "get past" the compiler)
  }


  /**
     Parameters: data - an array of ints

     Returns: an integer that is equal to the sum of all the elements in the array

     Ex: If the input array has the values 5,2,4,10 the return
     value will be 21 (5+2+4+10)

  */
//arraySum
  public static int arraySum( int[] data )
  {
    int sum = 0;
    //for(int i = 0;  - i is the number in the loop - is an iterator
    //i < data.length; - when the iterator is less than the length of the data
    //i++){      - increase the iterator by one
    //still confused on what iterator is/does (saranii only)
    //sum += data[i]; - add sum and data to get a running total same as sum = sum + data
    
    for(int i = 0; i < data.length; i++){      
    sum += data[i];
    }

    return sum; // replace this
  }

  /**
     Parameters:
     data - an array of integers

     Returns:
     true if the array is sorted, false otherwise

     That is, if each element is < the element to its right
     then the array is sorted.

     An array with values 5,6,10,15 is sorted
     An array with values 5,6,10,18,15 is not

  */
  public static boolean isSorted( int[] data )
  {
    /* YOUR BRILLIANT CODE HERE */

    return true; // replace this

  }

  /**
     Parameters:
     data - an array of integers

     Returns:
     value of the largest element in the array
  */

//findMaxValue
  public static int findMaxValue( int[] data ) {
    int count=0;  // will hold the maximum value;

    /* YOUR BRILLIANT CODE HERE */

    return count;
  }


  /**
     Parameters:
     data - an array of integers

     Returns:
     the number of odd elements in the array

     Ex: if data holds 5,6,7,8,9,10 then the return value
     will be 3 since three of the elements are odd.
  */
  public static int countOdds( int[] data ) {
    int count=0;

    /* YOUR BRILLIANT CODE HERE */

    // Note the % operator is the modulo (basically remainder) function
    // in java. Use to determine if an integer is odd.

    return count;
  }

  /**
     Parameters:
     data - an array of integers

     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter

     Postcondition:
     elements of the input array are in reverse order

     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */
  public static void flip( int[] data )
  {
    /* YOUR BRILLIANT CODE HERE */
  }


  public static void main( String[] args )
  {

    // remove the comments as you complete each routine
    // and add more lines as you add additional routines.

    int[] data = buildRandomArray(10, 20);
    // int[] data2 = buildincreasingArray(10,5,3);
    printArray(data);
    // printArray(data2);
System.out.print(arraySum(data));
    // add calls to show that the methods you write work.
  }
}