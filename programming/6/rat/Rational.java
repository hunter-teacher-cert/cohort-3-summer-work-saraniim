/**
 * Rational class by Team BangPi
 * Saranii Muller
 * collaborators: Kate Maschmeyer, Ashley Jufret, Nicole Cojuango
 */


/**
   class Rational
   An instance of this class will represent a rational number 
//(   p/q          s.t.           p,q                 ints     &&         q!=0), 
//numerator/den such that numerator, denominator are integers and denominator is not == 0 
   and facilitate mathematical operations with another instance of class Rational.

   Basic level (complete all):
   - toString✔️
   - default constructor✔️
   - multiply ✔️
   - divide ✔️

   Intermediate level (complete Basic methods plus these methods):
   - floatValue
   - overloaded constructor

   Advanced level (complete Basic + Intermediate + these methods):
   -

*/


public class Rational
{
  // Instance variables aka attributes for numerator and denominator
  private int _numerator;
  private int _denominator;


  // ✔️basic #2 default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  { /* YOUR ELEGANT CODE HERE */
  _numerator = 0; //only 1 equal sign = needed to assign as equal to vs == checking to be equal to 
  _denominator = 1;   
    
  }


  // Intermediate #2 overloaded constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    /* YOUR ELEGANT CODE HERE */
  }


  // ✔️Basic#1 toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString() //you dont need to make a string to have the return because the return is written as a string
  {
    /* YOUR ELEGANT CODE HERE */
// getting current numerator and denominator
    return(_numerator + "/" + _denominator);//using the "" makes the whole thing  string through concat
  }

  // Intermediate #1 floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point primitive
  public double floatValue()
  {
    return (double) _numerator / _denominator;
    /* YOUR ELEGANT CODE HERE */
  }


  // ✔️Basic #2 multiply
  // takes a Rational parameter and multiplies it by current Rational
  // does not return a value
  // modifies current object
  // does not modify input
  // need not reduce
  public void multiply( Rational r )
  {/* YOUR ELEGANT CODE HERE */ 
    //essentially this calls new #'s -- ex originally was 3/5 and wants now 6/7'
    _numerator *= r._numerator;  //multiplies equals - shorthand for _numerator = _numerator * r._numerator;
    _denominator *= r._denominator;  
      
  }


  // ✔️Basic #3 divide
  // same as multiply, except operation is division
  public void divide( Rational r )
  {
    if(r._numerator != 0) { // can't divide by 0 // ! means "not" && means and  
   _numerator *= r._denominator; 
   _denominator *= r._numerator; 
    } else {
      System.out.println("Invalid division");
    }
    
    /* YOUR ELEGANT CODE HERE */
  }

}//end class